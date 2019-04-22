package com.darren.architect_day05;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.butterknife.annotations.BindView;

public class LoginActivity extends AppCompatActivity {
    @BindView(R.id.tv1)
    TextView textView3;

    @BindView(R.id.tv2)
    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ButterKnife.bind(this)


    }
}
