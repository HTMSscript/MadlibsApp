package com.example.madlibsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvTitle;
    private ImageView ivMagicOrb;
    private Button btnNext;
    private EditText etNoun1;
    private EditText etAdj1;
    private EditText etProperNoun1;
    private EditText etProperNoun2;
    private EditText etNoun2;
    private EditText etVerb1;
    private EditText etPlace1;
    private EditText etPluralNoun1;
    private EditText etAdj2;
    private EditText etNoun3;
    private EditText etNoun4;
    private EditText etPluralNoun2;
    private EditText etAdj3;
    private EditText etVerb2;
    private EditText etVerb3;
    private EditText etAdj4;
    private Button btnBack;
    private Button btnGo;
    private TextView tvStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitle = findViewById(R.id.tv_title);
        ivMagicOrb = findViewById(R.id.iv_magicorb);
        btnNext = findViewById(R.id.btn_next);
        etNoun1 = findViewById(R.id.et_noun1);
        etAdj1 = findViewById(R.id.et_adj1);
        etProperNoun1 = findViewById(R.id.et_propernoun1);
        etProperNoun2 = findViewById(R.id.et_propernoun2);
        etNoun2 = findViewById(R.id.et_noun2);
        etVerb1 = findViewById(R.id.et_verb1);
        etPlace1 = findViewById(R.id.et_place1);
        etPluralNoun1 = findViewById(R.id.et_pluralnoun1);



        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main2);
                etAdj2 = findViewById(R.id.et_adj2);
                etNoun3 = findViewById(R.id.et_noun3);
                etNoun4 = findViewById(R.id.et_noun4);
                etPluralNoun2 = findViewById(R.id.et_pluralnoun2);
                etAdj3 = findViewById(R.id.et_adj3);
                etVerb2 = findViewById(R.id.et_verb2);
                etVerb3 = findViewById(R.id.et_verb3);
                etAdj4 = findViewById(R.id.et_adj4);
                btnBack = findViewById(R.id.btn_back);
                btnGo = findViewById(R.id.btn_go);

            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });

        String story = "Once upon a time in a "+ etNoun1 + ", there were two " + etAdj1 + " friends named " + etProperNoun1 + " and " + etProperNoun2 + ". One day, " + etProperNoun1
                + " discovered a peculiar " + etNoun2 + " that had magical powers. It could " + etVerb1 + " anything they desired! Excited about their newfound ability, " + etProperNoun1
                + " and " + etProperNoun2 + " embarked on a wild journey to " + etPlace1 + ". Along the way, they encountered hilarious obstacles like " +etPluralNoun1 + " and even a mischievous "
                + etAdj2 + etNoun3 + " who played pranks on them. At the peak of their adventure, " +etProperNoun1 + " and " + etProperNoun2 + " arrived at a hidden cave in " + etPlace1
                + ". Inside, they uncovered a surprising secret—a talking " + etNoun4 + " that revealed the answer to their quest. Armed with the knowledge they gained, " + etProperNoun1 + " and "
                + etProperNoun2 + " devised a crazy plan involving " + etPluralNoun2 + " to outsmart their adversaries. They had to work together and face their " + etAdj3
                + " fears. Through their sheer determination, " + etProperNoun1 + " and " + etProperNoun2 + " managed to " + etVerb2 + " the magic " + etNoun2
                + " and achieve their ultimate goal. They celebrated their triumph with a grand " + etVerb3 + " and learned the importance of friendship and perseverance. "
                + "In the end, the wacky adventure taught them that even in the most " + etAdj4 + " situations, they could find joy and excitement. They realized that the greatest treasures "
                + "are not always found in objects but in the memories they create along the way.";

        while (etAdj4.getText().toString().equals("")) {
            btnGo.setVisibility(View.INVISIBLE);
        }

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_story);
                tvStory = findViewById(R.id.tv_story);
                tvStory.setText(story);

            }
        });

    }
}