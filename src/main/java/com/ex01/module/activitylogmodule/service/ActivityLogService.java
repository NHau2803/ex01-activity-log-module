package com.ex01.module.activitylogmodule.service;

import com.ex01.module.activitylogmodule.model.ActivityLogModel;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ActivityLogService {
    Page<ActivityLogModel> search(int pageStart, int pageSize);
    ActivityLogModel add(ActivityLogModel request);
    ActivityLogModel update(ActivityLogModel request);
    boolean delete(String id);
}
