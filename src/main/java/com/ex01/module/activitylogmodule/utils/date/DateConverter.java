package com.ex01.module.activitylogmodule.utils.date;

import java.text.ParseException;

public interface DateConverter {
    String toDateTimeString(long timestamp);
    String toDateString(long timestamp);
    long toTimestamp(String time) throws ParseException;
}
