package com.ex01.module.activitylogmodule.utils.domain;

import java.util.List;

public class PageResult<T> {

    private List<T> content;
    private long timeTaken;
    private long pageCurrent;
    private long size;

}
