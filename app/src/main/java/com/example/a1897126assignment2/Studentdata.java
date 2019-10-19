package com.example.a1897126assignment2;

import java.util.ArrayList;
import java.util.List;

public  class Studentdata  {

        private static Studentdata instance = null;
        private List<Student>students  = new ArrayList<>();

        private Studentdata() {
            Student student = new Student();
            student.id = 1;
            student.name = "aman";
            student.Password="1";

            student.id = 2;
            student.name = "sahil";
            student.Password="2";

            student.id = 3;
            student.name = "vishal";
            student.Password="3";

            student.id = 4;
            student.name = "vis";
            student.Password="4";

            student.id = 5;
            student.name = "vivek";
            student.Password="5";

            student.id = 6;
            student.name = "aman1";
            student.Password="6";

            student.id = 7;
            student.name = "sahil2";
            student.Password="7";

            student.id = 8;
            student.name = "vishal";
            student.Password="8";

            student.id = 9;
            student.name = "vis12";
            student.Password="9";

            student.id = 10;
            student.name = "vivek2";
            student.Password="10";
        }


    public static Studentdata getInstance() {
        if (instance == null) {
            instance = new Studentdata() ;

        }
        return instance;

        }
    }

