package com.ex01.module.activitylogmodule.service.impl;

import com.ex01.module.activitylogmodule.dto.ActivityLogCreateDTO;
import com.ex01.module.activitylogmodule.dto.ActivityLogDTO;
import com.ex01.module.activitylogmodule.model.ActivityLogModel;
import com.ex01.module.activitylogmodule.repository.ActivityLogRepository;
import com.ex01.module.activitylogmodule.service.ActivityLogService;
import com.ex01.module.activitylogmodule.utils.date.DateConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.text.ParseException;

@Service
public class ActivityLogServiceImpl implements ActivityLogService {

    @Autowired
    private ActivityLogRepository activityLogRepository;
    @Autowired
    private DateConverter dateConverter;

    private Logger logger = LoggerFactory.getLogger(ActivityLogServiceImpl.class);

    @Override
    public Page<ActivityLogModel> search(int pageStart, int pageSize) {
        Pageable pageable = PageRequest.of(pageStart - 1, pageSize);
        return activityLogRepository.findAll(pageable);
    }

    @Override
    public ActivityLogCreateDTO add(ActivityLogCreateDTO request) {
        ActivityLogModel activityLogModel = new ActivityLogModel();
        try {
            activityLogModel.setActionAt(dateConverter.toTimestamp(request.getActionAt()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        activityLogModel.setActionBy(request.getActionBy());
        activityLogModel.setOperator(request.getOperator());

        activityLogRepository.save(activityLogModel);
        logger.info("ActivityLogRepository: add success!");

        return request;
    }

    @Override
    public ActivityLogDTO update(ActivityLogDTO request) {
        String id = request.getId();
        ActivityLogModel activityLogUpdate = activityLogRepository.findById(request.getId()).orElse(null);
        if (activityLogUpdate == null) {
            logger.error("ActivityLogService: {} not found.", id);
            return null;
        }
        try {
            activityLogUpdate.setActionAt(
                    dateConverter.toTimestamp(request.getActionAt())
            );
        } catch (ParseException e) {
            e.printStackTrace();
        }
        activityLogUpdate.setActionBy(request.getActionBy());
        activityLogUpdate.setOperator(request.getOperator());

        activityLogRepository.save(activityLogUpdate);
        logger.info("ActivityLogService: update success!");
        return request;
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
