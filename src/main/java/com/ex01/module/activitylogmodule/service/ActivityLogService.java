package com.ex01.module.activitylogmodule.service;

import com.ex01.module.activitylogmodule.dto.ActivityLogCreateDTO;
import com.ex01.module.activitylogmodule.dto.ActivityLogDTO;
import com.ex01.module.activitylogmodule.model.ActivityLogModel;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ActivityLogService {
    Page<ActivityLogModel> search(int pageStart, int pageSize);
    ActivityLogCreateDTO add(ActivityLogCreateDTO request);
    ActivityLogDTO update(ActivityLogDTO request);
    boolean delete(String id);
}
