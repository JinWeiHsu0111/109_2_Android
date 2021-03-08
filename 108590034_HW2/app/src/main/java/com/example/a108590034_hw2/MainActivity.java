package com.example.a108590034_hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private int Count;
    private TextView ShowCount;
    private Button Zero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShowCount = (TextView) findViewById(R.id.Number_cnt);
        Zero = (Button) findViewById(R.id.button_zero);
        Zero.setEnabled(false);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, "Hello Toast.", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        Count++;
        if(ShowCount != null){
            ShowCount.setText(Integer.toString(Count));
        }
        Zero.setEnabled(true);
        Zero.setBackgroundColor(Color.parseColor("#1ADFB8"));
    }

    public void setZero(View view) {
        Count = 0;
        Zero.setEnabled(false);
        Zero.setBackgroundColor(Color.parseColor("#4D4E4E"));
        if(ShowCount != null){
            ShowCount.setText(Integer.toString(Count));
        }
    }

}