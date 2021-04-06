package com.ex01.module.activitylogmodule.dto;

import org.springframework.data.annotation.Id;

public class ActivityLogDTO {

    @Id
    private String id;
    private String actionAt;
    private String actionBy;
    private String operator;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getActionAt() {
        return actionAt;
    }

    public void setActionAt(String actionAt) {
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
