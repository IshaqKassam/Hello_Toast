package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        String value = mShowCount.getText().toString();
        if(value.equals("0")){
            Toast alreadyZero = Toast.makeText(this, "already 0", Toast.LENGTH_SHORT);
            alreadyZero.show();
        }
        else{
            int reset = 0;
            mShowCount.setText(Integer.toString(reset));
            mCount = 0;
        }
    }

    public void countUp(View view) {
        ++mCount;
        if(mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}