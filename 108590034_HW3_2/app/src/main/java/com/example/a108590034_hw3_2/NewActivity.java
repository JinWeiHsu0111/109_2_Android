package com.example.a108590034_hw3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new2);
        mShowCount = (TextView) findViewById(R.id.Show_count);
        Bundle bundle = getIntent().getExtras();
        Integer count = bundle.getInt("Count");
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(count));
    }

}