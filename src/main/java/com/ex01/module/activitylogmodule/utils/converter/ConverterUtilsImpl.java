package com.ex01.module.activitylogmodule.utils.converter;

import org.springframework.stereotype.Service;

@Service
public class ConverterUtilsImpl implements ConverterUtils{

    @Override
    public int stringToInt(String text) {
        try {
            int result = Integer.parseInt(text);
        }catch (Exception e){
            return -1;
        }
        return -1;
    }
}
