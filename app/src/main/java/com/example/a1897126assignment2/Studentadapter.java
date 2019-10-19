package com.example.a1897126assignment2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


    public abstract class Studentadapter extends RecyclerView.Adapter<Studentviewholder>{
        private LayoutInflater mInflater;
        private List<Student> mData = new ArrayList<>();

        public Studentadapter(Context context) {
            this.mInflater = LayoutInflater.from(context);


        }

        @NonNull
        @Override
        public Studentviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = mInflater.inflate(R.layout.activity_studentviewholder, parent, false);
            return new Studentviewholder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull Studentviewholder holder, int position) {

            List<Student>students = (List<Student>) Studentdata.getInstance();


            holder.tvid.setText(students.get(position).id);
            holder.tvName.setText(students.get(position).name);

        }

    }
