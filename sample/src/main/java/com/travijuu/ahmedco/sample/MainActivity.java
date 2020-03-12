package com.travijuu.ahmedco.sample;

import android.app.Activity;
import android.os.Bundle;

import com.travijuu.ahmedco.library.NumberPicker;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumberPicker numberPicker = (NumberPicker) findViewById(R.id.number_picker_default);
        numberPicker.setMax(10);
        numberPicker.setMin(0);

        // numberPicker.setUnit(2);
        // numberPicker.setValue(10);


    }
}
