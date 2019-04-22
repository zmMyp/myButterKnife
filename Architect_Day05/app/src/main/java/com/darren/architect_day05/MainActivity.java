package com.darren.architect_day05;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.butterknife.ButterKnife;
import com.butterknife.Unbinder;
import com.butterknife.annotations.BindView;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tv1)
    TextView textView1;

    @BindView(R.id.tv2)
    TextView textView2;

    @BindView(R.id.tv2)
    TextView textView3;

    private Unbinder mUnbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUnbinder = ButterKnife.bind(this);
        // MainActivity_ViewBinding viewBinding = new MainActivity_ViewBinding(this);

        textView1.setText("textView1");

        textView2.setText("textView2");
    }

    @Override
    protected void onDestroy() {
        mUnbinder.unbind();
        super.onDestroy();
    }
}
