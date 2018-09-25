package com.example.yossi.listviewlesson_finalexamplestudents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditStudent extends AppCompatActivity implements View.OnClickListener {

    TextView tvName, tvId,tvAvg;
    EditText etMat, etEng, etCpu;
    Button btnSave,btnCalc,btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_student);

         tvName = findViewById(R.id.tvName);
         tvId = findViewById(R.id.tvId);
         tvAvg = findViewById(R.id.tvAvg);

        etCpu = findViewById(R.id.etCpu);
        etMat = findViewById(R.id.etMat);
        etEng = findViewById(R.id.etEng);

        btnCalc = findViewById(R.id.btnCalc);
        btnSave = findViewById(R.id.btnSave);
        btnCancel = findViewById(R.id.btnCancel);

        btnCalc.setOnClickListener(this);
        btnSave.setOnClickListener(this);
        btnCancel.setOnClickListener(this);

        Intent intent = getIntent();
        if(intent.getExtras()!=null)
        {
            String name = intent.getExtras().getString("name");
            String id = intent.getExtras().getString("id");
            int mat = intent.getExtras().getInt("mat");
            int eng = intent.getExtras().getInt("eng");
            int cpu = intent.getExtras().getInt("cpu");
            double avg = intent.getExtras().getDouble("avg");


            tvName.setText(name);
            tvId.setText(id);
            tvAvg.setText(String.valueOf(avg));
            etMat.setText(String.valueOf(mat));
            etEng.setText(String.valueOf(eng));
            etCpu.setText(String.valueOf(cpu));

        }






    }

    @Override
    public void onClick(View v) {



    }
}
