package com.example.a1897126assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



    public class Studentviewholder extends RecyclerView.ViewHolder {

        public TextView tvName, tvid;

        public Studentviewholder(View itemView) {
            super(itemView);
            tvid = itemView.findViewById(R.id.tv2);
            tvName = itemView.findViewById(R.id.tv1);

    }
}
