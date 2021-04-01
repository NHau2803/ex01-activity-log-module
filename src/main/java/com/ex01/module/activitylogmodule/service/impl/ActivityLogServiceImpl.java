package com.ex01.module.activitylogmodule.service.impl;

import com.ex01.module.activitylogmodule.model.ActivityLogModel;
import com.ex01.module.activitylogmodule.repository.ActivityLogRepository;
import com.ex01.module.activitylogmodule.service.ActivityLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ActivityLogServiceImpl implements ActivityLogService {

    @Autowired
    private ActivityLogRepository activityLogRepository;

    private Logger logger = LoggerFactory.getLogger(ActivityLogServiceImpl.class);

    @Override
    public Page<ActivityLogModel> search(int pageStart, int pageSize) {
        Pageable pageable = PageRequest.of(pageStart - 1, pageSize);
        return activityLogRepository.findAll(pageable);
    }

    @Override
    public ActivityLogModel add(ActivityLogModel request) {
        ActivityLogModel activityLogModel = activityLogRepository.save(request);
        logger.info("ActivityLogRepository: add success!");
        return activityLogModel;
    }

    @Override
    public ActivityLogModel update(ActivityLogModel request) {
        String id = request.getId();
        ActivityLogModel activityLogUpdate = activityLogRepository.findById(request.getId()).orElse(null);
        if (activityLogUpdate == null) {
            logger.error("ActivityLogService: {} not found.", id);
            return null;
        }
        activityLogRepository.save(activityLogUpdate);
        activityLogUpdate = request;
        logger.info("ActivityLogService: update success!");
        return activityLogUpdate;
    }

    @Override
    public boolean delete(String id) {
        ActivityLogModel activityLogModel = activityLogRepository.findById(id).orElse(null);
        if (activityLogModel == null) {
            logger.error("ActivityLogService: {} not found.", id);
            return false;
        }
        activityLogRepository.deleteById(id);
        logger.info("ActivityLogService: delete success!");
        return true;
    }
}
