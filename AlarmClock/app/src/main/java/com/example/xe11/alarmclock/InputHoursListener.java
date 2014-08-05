package com.example.xe11.alarmclock;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.widget.TextView.OnEditorActionListener;

/**
 * Created by xe11 on 05.08.2014.
 */
public class InputHoursListener implements View.OnKeyListener{
    private EditText editText = null;
    private int countKey = 0;


    public InputHoursListener(EditText text) {
        this.editText = text;
    }

    public boolean isNumeric() {
        boolean validate = false;
        String editString = editText.getText().toString();
        validate = editString.matches("^[0-9]+$");

        return validate;
    }

    public boolean isValidate() {
        boolean validate = false;
        if(Integer.parseInt(editText.getText().toString()) < 24)
            validate = true;

        return validate;
    }

    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        boolean validate = false;
        if(event.getAction() == KeyEvent.ACTION_DOWN) {
            if(!isNumeric()) {
                return false;
            }
            if(isValidate()) {
                validate = true;
            }
        }

        return validate;
    }
}
