package com.teachmeskills.lesson7.task1;

import com.teachmeskills.lesson7.task1.getInfo.IGetInfo;

public class Worker implements IGetInfo {

    //This class is used to describe a worker and
    //describe methods for displaying information about the worker

    String positionName = "worker";
    int positionCode = 1;
    @Override
    public void getInfo() {
        System.out.println("Position name: " + positionName +
                "\nPosition code: " + positionCode);
    }
}
