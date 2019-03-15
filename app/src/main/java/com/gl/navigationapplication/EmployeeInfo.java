package com.gl.navigationapplication;

import android.app.Application;
import android.util.Log;

import com.gl.navigationapplication.com.gl.navigationapplication.model.Person;

import java.util.ArrayList;

public class EmployeeInfo extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ArrayList<Person> personArrayList = addEmployee();
        Log.i("","Person Array List"+personArrayList.get(1));
    }

    /**
     *
     * @return List Of Person
     */
    public ArrayList<Person> addEmployee(){
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Ragini","Jain","Nagpur","B.E"));
        personList.add(new Person("Swati","Mumbai","Khobragade","MCA"));
        personList.add(new Person("Komal","Pune","Nistane","MTEch"));
        return personList;
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }


}
