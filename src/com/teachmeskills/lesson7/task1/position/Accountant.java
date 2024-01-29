package com.teachmeskills.lesson7.task1;

import com.teachmeskills.lesson7.task1.getInfo.IGetInfo;

public class Accountant implements IGetInfo {

    //This class is used to describe an accountant and
    //describe methods for displaying information about the accountant

    String positionName = "accountant";
    int positionCode = 3;
    @Override
    public void getInfo() {
        System.out.println("Position name: " + positionName +
                "\nPosition code: " + positionCode);
    }
}
