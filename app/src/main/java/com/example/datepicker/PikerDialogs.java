package com.example.datepicker;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

import java.util.Calendar;
import java.util.Date;

public class PikerDialogs extends DialogFragment {

    public Dialog onCreateDialog(Bundle savedInstanceState){

        DateSettings dateSettings=new DateSettings(getActivity());
        Calendar calendar=Calendar.getInstance();
        int year=calendar.get(Calendar.YEAR);
        int Month=calendar.get(Calendar.MONTH);
        int Day=calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dialog;

        dialog=new DatePickerDialog(getActivity(), dateSettings,year,Month,Day);


        return dialog;
    }

}
