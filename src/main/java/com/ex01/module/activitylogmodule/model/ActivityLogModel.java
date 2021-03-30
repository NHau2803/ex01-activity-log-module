package com.ex01.module.activitylogmodule.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "log")
public class ActivityLogModel {
    @Id
    private String id;
    private long actionAt;
    private String actionBy;
    private String operator;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getActionAt() {
        return actionAt;
    }

    public void setActionAt(long actionAt) {
        this.actionAt = actionAt;
    }

    public String getActionBy() {
        return actionBy;
    }

    public void setActionBy(String actionBy) {
        this.actionBy = actionBy;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
