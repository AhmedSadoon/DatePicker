package com.example.datepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import android.widget.Toast;

public class DateSettings implements DatePickerDialog.OnDateSetListener {

    Context context;

    public DateSettings(Context context){
        this.context=context;
    }


    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

        Toast.makeText(context,"Selected "+dayOfMonth+"/"+month+"/"+year,Toast.LENGTH_SHORT).show();


    }
}
