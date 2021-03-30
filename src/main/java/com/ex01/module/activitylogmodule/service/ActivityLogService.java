package com.ex01.module.activitylogmodule.service;

import com.ex01.module.activitylogmodule.model.ActivityLogModel;

public interface ActivityLogService {
    ActivityLogModel add(ActivityLogModel request);
    ActivityLogModel update(ActivityLogModel request);
    boolean delete(String id);
}
