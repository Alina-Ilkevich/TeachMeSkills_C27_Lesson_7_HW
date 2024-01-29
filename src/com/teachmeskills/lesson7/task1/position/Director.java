package com.teachmeskills.lesson7.task1;

import com.teachmeskills.lesson7.task1.getInfo.IGetInfo;

public class Director implements IGetInfo {
    //This class is used to describe a director and
    //describe methods for displaying information about the director
    String positionName = "director";
    int positionCode = 2;
    @Override
    public void getInfo() {
        System.out.println("Position name: " + positionName +
                "\nPosition code: " + positionCode);
    }
}
