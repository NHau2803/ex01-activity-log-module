package com.ex01.module.activitylogmodule.repository;

import com.ex01.module.activitylogmodule.model.ActivityLogModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityLogRepository extends MongoRepository<ActivityLogModel, String> {

}
