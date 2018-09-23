package com.example.yossi.listviewlesson_finalexamplestudents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout l1 ;

    TextView tvName, tvId, tvAvg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l1 = findViewById(R.id.l1);

        LayoutInflater layoutInflater = getLayoutInflater();
        View v = layoutInflater.inflate(R.layout.custom_layout,l1,false);

        tvName = v.findViewById(R.id.tvName);
        tvId = v.findViewById(R.id.tvId);
        tvAvg = v.findViewById(R.id.tvAvg);

        tvName.setText("Yossi");
        tvId.setText("1234");
        tvAvg.setText("60.6");

        l1.addView(v);




    }
}
