package com.pgmail.martsulg.testapplication.Classes.Class17;

/**
 * Created by lenovo on 11.09.2017.
 */

public class UseCase2 {

    private Rest rest;

    public UseCase2() {

        rest = new Rest(new OkHttp(), new Gson());
    }

    public String getRestData(){

        return "";
    }
}
