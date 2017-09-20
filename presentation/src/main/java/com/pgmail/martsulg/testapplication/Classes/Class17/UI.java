package com.pgmail.martsulg.testapplication.Classes.Class17;

import com.pgmail.martsulg.testapplication.main.TetsApplication;

import javax.inject.Inject;

/**
 * Created by lenovo on 11.09.2017.
 */

public class UI {

    @Inject  //для дагера
    UseCase1 useCase1;

    @Inject
    public UI(){

        TetsApplication.appComponent.inject(this);

    }
public void testUseCase1(){

    useCase1.getRestData();

}

}
