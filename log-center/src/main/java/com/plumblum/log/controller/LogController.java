package com.plumblum.log.controller;
import com.plumblum.log.service.LogService;
import com.plumblum.model.common.Page;
import com.plumblum.model.log.Log;
import com.plumblum.model.log.constants.LogModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @Auther: cpb
 * @Date: 2019/1/9 10:48
 * @Description:
 */
@RestController
public class LogController {
    @Autowired
    private LogService logService;

    @PostMapping("/logs-anon/internal")
    public void save(@RequestBody Log log) {
        logService.save(log);
    }


    /**
     * 日志模块<br>
     * 2018.07.29作废
     */
    @Deprecated
    @PreAuthorize("hasAuthority('log:query')")
    @GetMapping("/logs-modules")
    public Map<String, String> logModule() {
        return LogModule.MODULES;
    }

    /**
     * 日志查询
     *
     * @param params
     * @return
     */
    @PreAuthorize("hasAuthority('log:query')")
    @GetMapping("/logs")
    public Page<Log> findLogs(@RequestParam Map<String, Object> params) {
        return logService.findLogs(params);
    }

}
