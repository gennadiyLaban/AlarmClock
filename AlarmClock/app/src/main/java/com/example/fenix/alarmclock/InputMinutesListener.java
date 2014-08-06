package com.example.fenix.alarmclock;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/**
 * Created by xe11 on 06.08.2014.
 */
public class InputMinutesListener implements TextWatcher {
    EditText editText = null;

    public InputMinutesListener(EditText text) {
        editText = text;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        int minutes = 0;
        if(s.length() != 0)
            minutes = Integer.parseInt(s.toString());
        else
            return;

        if(minutes < 0 || minutes >= 60 ){
            editText.setText("00");
        }
    }
}
