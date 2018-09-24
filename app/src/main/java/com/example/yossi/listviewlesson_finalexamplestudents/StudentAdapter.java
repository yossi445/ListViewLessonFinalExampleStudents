package com.example.yossi.listviewlesson_finalexamplestudents;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class StudentAdapter extends ArrayAdapter<Student>{

    Context context;
    List<Student> studentsList;


    public StudentAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<Student> studentsList) {
        super(context, resource, textViewResourceId, studentsList);

        this.context = context;
        this.studentsList = studentsList;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater layoutInflater = ((Activity)context).getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.custom_layout,parent,false);

        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvId = view.findViewById(R.id.tvId);
        TextView tvAvg = view.findViewById(R.id.tvAvg);

        Student temp = studentsList.get(position);

        tvName.setText(temp.getName());
        tvId.setText(temp.getId());
        tvAvg.setText(String.valueOf(temp.getAvg()));


        return view;

    }
}
