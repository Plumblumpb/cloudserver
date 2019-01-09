package com.plumblum.log.service;

import com.plumblum.model.common.Page;
import com.plumblum.model.log.Log;

import java.util.Map;

/**
 * @Auther: cpb
 * @Date: 2019/1/9 10:31
 * @Description:
 */
public interface LogService {
    /**
     * 保存日志
     *
     * @param log
     */
    void save(Log log);

    Page<Log> findLogs(Map<String, Object> params);
}
