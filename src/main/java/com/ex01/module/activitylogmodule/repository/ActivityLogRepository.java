package com.ex01.module.activitylogmodule.repository;

import com.ex01.module.activitylogmodule.model.ActivityLogModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActivityLogRepository extends MongoRepository<ActivityLogModel, String> {

}
