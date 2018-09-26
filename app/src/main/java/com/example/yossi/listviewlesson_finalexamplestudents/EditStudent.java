package com.example.yossi.listviewlesson_finalexamplestudents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EditStudent extends AppCompatActivity implements View.OnClickListener {

    TextView tvName, tvId,tvAvg;
    EditText etMat, etEng, etCpu;
    Button btnSave,btnCancel;

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

        btnSave = findViewById(R.id.btnSave);
        btnCancel = findViewById(R.id.btnCancel);

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


        if(v == btnSave)
        {
            if(etMat.getText().toString().length() > 0 && etEng.getText().toString().length() > 0 && etCpu.getText().toString().length() > 0 )
            {
                Intent intent = new Intent();
                intent.putExtra("mat",etMat.getText().toString());
                intent.putExtra("eng",etEng.getText().toString());
                intent.putExtra("cpu",etCpu.getText().toString());
                setResult(RESULT_OK,intent);
                finish();
            }
            else
            {
                Toast.makeText(this," אנא מלא את כל הציונים", Toast.LENGTH_LONG).show();

            }

        }
        else if(v == btnCancel)
        {
            setResult(RESULT_CANCELED,null);
            finish();
        }


    }
}
