package com.example.a1897126assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1, ed2;
    Button b1;
    RecyclerView rvStudents;
    private Studentadapter sAdapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvStudents = findViewById(R.id.rv);
        layoutManager = new LinearLayoutManager(this);
        rvStudents.setLayoutManager(layoutManager);

        sAdapter = new Studentadapter(getApplicationContext()) {
            @Override
            public int getItemCount() {
                return 0;
            }
        };
        rvStudents.setAdapter(sAdapter);

        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        b1 = findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().equals("admin") && ed2.getText().toString().equals("123")) {

                    Intent i = new Intent(MainActivity.this,Studentviewholder.class);
                    startActivity(i);

                }
            }

        });
    }
}