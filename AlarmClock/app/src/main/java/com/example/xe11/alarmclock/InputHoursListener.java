package com.example.xe11.alarmclock;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import static android.widget.TextView.OnEditorActionListener;

/**
 * Created by xe11 on 05.08.2014.
 */
public class InputHoursListener implements TextWatcher{
    private EditText editText = null;
    private int countKey = 0;


    public InputHoursListener(EditText text) {
        this.editText = text;
    }


    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        int hours = 0;
        if(s.length() != 0)
            hours = Integer.parseInt(s.toString());
        else
            return;

        if(hours < 0 || hours >= 24 ){
            editText.setText("00");
        }
    }
}
