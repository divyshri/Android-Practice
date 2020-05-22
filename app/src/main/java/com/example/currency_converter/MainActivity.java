package com.example.currency_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void buttonClicked(View V){
        EditText dollar = (EditText) findViewById(R.id.dollorAmount);
        double val = Double.parseDouble(dollar.getText().toString());
        val = val * 71;
        Log.i("Entered Amount",String.valueOf(val));
        Toast.makeText(this, String.valueOf(val) + " Rs", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
