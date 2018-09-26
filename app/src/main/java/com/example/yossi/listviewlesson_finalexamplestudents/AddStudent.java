package com.example.yossi.listviewlesson_finalexamplestudents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AddStudent extends AppCompatActivity implements View.OnClickListener {

    EditText etName,etId, etMat, etEng, etCpu;
    Button btnAdd,btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        etName = findViewById(R.id.etName);
        etId = findViewById(R.id.etId);

        etCpu = findViewById(R.id.etCpu);
        etMat = findViewById(R.id.etMat);
        etEng = findViewById(R.id.etEng);

        btnAdd = findViewById(R.id.btnAdd);
        btnCancel = findViewById(R.id.btnCancel);
        btnAdd.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v == btnAdd)
        {
            if(etName.getText().toString().length() > 0 && etId.getText().toString().length()> 0 && etMat.getText().toString().length() > 0 && etEng.getText().toString().length() > 0 && etCpu.getText().toString().length() > 0 )
            {
                Intent intent = new Intent();

                intent.putExtra("name", etName.getText().toString());
                intent.putExtra("id", etId.getText().toString());
                intent.putExtra("mat",etMat.getText().toString());
                intent.putExtra("eng",etEng.getText().toString());
                intent.putExtra("cpu",etCpu.getText().toString());
                setResult(RESULT_OK,intent);
                finish();
            }
            else
            {
                Toast.makeText(this," אנא מלא את כל הנתונים", Toast.LENGTH_LONG).show();

            }

        }
        else if(v == btnCancel)
        {
            setResult(RESULT_CANCELED,null);
            finish();
        }


    }


}
