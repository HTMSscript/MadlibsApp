package com.example.madlibsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_title;
    private Button btn_next;

    private EditText et_noun1;
    private EditText et_adj1;
    private EditText et_properNoun1;
    private EditText et_properNoun2;
    private EditText et_noun2;
    private EditText et_verb1;
    private EditText et_place1;
    private EditText et_pluralNoun1;
    private EditText et_adj2;
    private EditText et_noun3;
    private EditText et_noun4;
    private EditText et_pluralNoun2;
    private EditText et_adj3;
    private EditText et_verb2;
    private EditText et_verb3;
    private EditText et_adj4;
    private Button btn_back;
    private Button btn_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_title = findViewById(R.id.tv_title);
        btn_next = findViewById(R.id.btn_next);
        et_noun1 = findViewById(R.id.et_noun1);
        et_adj1 = findViewById(R.id.et_adj1);
        et_properNoun1 = findViewById(R.id.et_propernoun1);
        et_properNoun2 = findViewById(R.id.et_propernoun2);
        et_noun2 = findViewById(R.id.et_noun2);
        et_verb1 = findViewById(R.id.et_verb1);
        et_place1 = findViewById(R.id.et_place1);
        et_pluralNoun1 = findViewById(R.id.et_pluralnoun1);



        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main2);
                et_adj2 = findViewById(R.id.et_adj2);
                et_noun3 = findViewById(R.id.et_noun3);
                et_noun4 = findViewById(R.id.et_noun4);
                et_pluralNoun2 = findViewById(R.id.et_pluralnoun2);
                et_adj3 = findViewById(R.id.et_adj3);
                et_verb2 = findViewById(R.id.et_verb2);
                et_verb3 = findViewById(R.id.et_verb3);
                et_adj4 = findViewById(R.id.et_adj4);
                btn_back = findViewById(R.id.btn_back);
                btn_go = findViewById(R.id.btn_go);

            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });

    }
}