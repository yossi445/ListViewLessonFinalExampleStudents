package com.example.yossi.listviewlesson_finalexamplestudents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView lv;
    ArrayList<Student> studentsList;
    StudentAdapter adapter;
    Student lastSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lv = findViewById(R.id.lv);

        Student[] students = new Student[6];
        students[0] = new Student("דני שובבני", "11111",67,100,87);
        students[1] = new Student(" הארי פוטר", "22222",87,77,84);
        students[2] = new Student("חיים חיימון", "33333",100,66,87);
        students[3] = new Student("שרית כהן", "44444",86,48,58);
        students[4] = new Student("דנה לוי", "55555",23,92,88);
        students[5] = new Student("רפי רפול", "66666",89,0,76);

        studentsList = new ArrayList<Student>();
        for (int i = 0; i <students.length  ; i++) {
            studentsList.add(students[i]);

        }

        adapter = new StudentAdapter(MainActivity.this,0,0,studentsList);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(this);






    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        lastSelected = adapter.getItem(position);
        Intent intent = new Intent(this,EditStudent.class);

        intent.putExtra("name",lastSelected.getName());
        intent.putExtra("id",lastSelected.getId());
        intent.putExtra("mat",lastSelected.getMat());
        intent.putExtra("eng",lastSelected.getEng());
        intent.putExtra("cpu",lastSelected.getCpu());
        intent.putExtra("avg",lastSelected.getAvg());


        startActivityForResult(intent,0);

    }
}
