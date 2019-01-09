package com.plumblum.log.service.impl;

import com.plumblum.commons.utils.PageUtil;
import com.plumblum.log.dao.LogDao;
import com.plumblum.log.service.LogService;
import com.plumblum.model.common.Page;
import com.plumblum.model.log.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Auther: cpb
 * @Date: 2019/1/9 10:32
 * @Description:
 */
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogDao logDao;

    @Override
    @Async
    public void save(Log log) {
        if (log.getCreateTime() == null) {
            log.setCreateTime(new Date());
        }
        if (log.getFlag() == null) {
            log.setFlag(Boolean.TRUE);
        }

        logDao.save(log);
    }

    @Override
    public Page<Log> findLogs(Map<String, Object> params) {
        int total = logDao.count(params);
        List<Log> list = Collections.emptyList();
        if (total > 0) {
            PageUtil.pageParamConver(params, true);

            list = logDao.findData(params);
        }
        return new Page<>(total, list);
    }
}
