package com.gl.navigationapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.gl.navigationapplication.com.gl.navigationapplication.model.Person;

import java.util.ArrayList;

public class DeveloperFragment extends Fragment {

    private static String FRAGMENT = "DeveloperFragment";
    private TextView mDeveloperTextView;
    private EmployeeInfo employeeInfo= new EmployeeInfo();
    ArrayList<Person> personList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        personList = employeeInfo.addEmployee();
        personList.forEach(person -> Log.i("DeveloperFragment","Person Info Details "+person));
        return inflater.inflate(R.layout.fragment_developer, container, false);
    }

    @Override
    public void onDestroy() {
        personList.clear();
        super.onDestroy();
    }
}
