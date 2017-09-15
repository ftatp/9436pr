package com.example.edwin.traveling.System;

/**
 * Created by Edwin on 2017-09-15.
 */

import java.util.ArrayList;
import java.util.Objects;

public class APIGetter extends Thread {
    public static final int ADJ_PLACE=1;
    public static final int ADJ_FESTIVAL=2;
    public static final int OVERVIEW=3;

    private int mode_dataType;
    private Object result;
    private ArrayList<Object> parameter;

    public APIGetter(int dataType){
        mode_dataType = dataType;
        parameter = new ArrayList<Object>();
    }

    public void addParam(Object parm){
        parameter.add(parm);
    }

    public void resetParam(){
        parameter.removeAll(null);
    }

    public Object getResult(){
        return result;
    }

    @Override
    public void run(){
        switch(mode_dataType){
            case ADJ_FESTIVAL:
                result = TourAPIData.getInstance().getAdjacencyFestival((float) parameter.get(0), (float) parameter.get(1));
                break;
            case ADJ_PLACE:
                result = TourAPIData.getInstance().getAdjacencyPlace((float) parameter.get(0), (float) parameter.get(1));
                break;
            case OVERVIEW:
                result = TourAPIData.getInstance().getOverview((String) parameter.get(0));
                break;
        }
    }
}