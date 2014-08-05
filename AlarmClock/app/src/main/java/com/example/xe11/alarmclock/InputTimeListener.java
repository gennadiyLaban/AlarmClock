package com.example.xe11.alarmclock;

import android.view.KeyEvent;
import android.widget.TextView;

import static android.widget.TextView.OnEditorActionListener;

/**
 * Created by xe11 on 05.08.2014.
 */
public class InputTimeListener implements OnEditorActionListener{
    public InputTimeListener() {


    }


    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        return false;
    }
}
