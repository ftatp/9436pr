package com.example.edwin.traveling.System.System;

/**
 * Created by Edwin on 2017-09-16.
 */

public class TravelPlace {
    private int type;

    //Constant for type
    public static final int TOUR=12;
    public static final int CULTURE=14;
    public static final int FESTIVAL=15;
    public static final int REPORTS=28;
    public static final int FOOD=39;

    private String ID;
    private String name;
    private float pos_X;
    private float pos_Y;

    public TravelPlace(String ID, int type, String name, float pos_x, float pos_y){
        this.type = type;
        this.ID = ID;
        this.name = name;
        this.pos_X = pos_x;
        this.pos_Y = pos_y;
    }

}
