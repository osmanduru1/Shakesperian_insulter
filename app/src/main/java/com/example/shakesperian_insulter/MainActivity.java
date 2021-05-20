package com.example.shakesperian_insulter;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    Button new_shakespearean_insult;
    TextView Shakespeare;
    public List<String> myList1 = new ArrayList<>();

    {
        myList1.add("Away I say, thou");
        myList1.add("Bathe thyself, thou");
        myList1.add("Eat a crocodile, thou");
        myList1.add("Fie upon thee, thou");
        myList1.add("Get thee gone, thou");
        myList1.add("Grow unsightly warts, thou");
        myList1.add("Hear this pox alert, thou");
        myList1.add("I’ll see thee hanged, thou");
        myList1.add("Swim with leeches, thou");
        myList1.add("Thy mother wears armour, thou");
        myList1.add("Why, how now putz, thou");
        myList1.add("Wipe thy ugly face, thou");
        myList1.add("Sorrow on thee, thou");
        myList1.add("My finger in thine eye, thou");
        myList1.add("Methinks you stink, thou");
    }

    public List<String> myList2 = new ArrayList<>();

    {
        myList2.add("bootless");
        myList2.add("bawdy");
        myList2.add("brazen");
        myList2.add("churlish");
        myList2.add("distempered");
        myList2.add("frothy");
        myList2.add("greasy");
        myList2.add("grizzled");
        myList2.add("haughty");
        myList2.add("hideous");
        myList2.add("impertinent");
        myList2.add("loathsome");
        myList2.add("mewling");
        myList2.add("peevish");
        myList2.add("pernicious");
        myList2.add("prating");
        myList2.add("queasy");
        myList2.add("rank");
        myList2.add("reeky");
        myList2.add("roguish");
        myList2.add("saucy");
    }
    public List<String> myList3 = new ArrayList<>();
    {
        myList3.add("boil-brained");
        myList3.add("clay-brained");
        myList3.add("dizzy-eyed");
        myList3.add("dog-hearted");
        myList3.add("empty-headed");
        myList3.add("evil-eyed");
        myList3.add("eye-offending");
        myList3.add("fat-kidneyed");
        myList3.add("horn-mad");
        myList3.add("idle-headed");
        myList3.add("lean-witted");
        myList3.add("lily-livered");
        myList3.add("motley-minded");
        myList3.add("muddy-headed");
        myList3.add("onion-eyed");
        myList3.add("pale-hearted");
        myList3.add("rug-headed");
        myList3.add("shag-eared");
        myList3.add("sour-faced");
        myList3.add("weak-hinged");
        myList3.add("yellow-hearted");
    }
    public List<String> myList4 = new ArrayList<>();
    {
        myList4.add("canker blossom");
        myList4.add("dogfish");
        myList4.add("eggshell");
        myList4.add("fish brain");
        myList4.add("fragment");
        myList4.add("gull catcher");
        myList4.add("hedge pig");
        myList4.add("jack-a-nape");
        myList4.add("maggot pie");
        myList4.add("malignancy");
        myList4.add("minimus");
        myList4.add("moldwarp");
        myList4.add("nutshell");
        myList4.add("pantaloon");
        myList4.add("plague sore");
        myList4.add("remnant");
        myList4.add("rudesby");
        myList4.add("ruffian");
        myList4.add("scantling");
        myList4.add("toad");
        myList4.add("waterfly");
    }

    public int min = 0;
    public int max1 = 14;
    public int max2=20;
    public int max3=20;
    public int max4=20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new_shakespearean_insult = findViewById(R.id.button);
        Shakespeare = findViewById(R.id.textView);

        new_shakespearean_insult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pointer1 = (int) randnum(0,14);
                int pointer2 = (int) randnum(0,20);
                int pointer3 = (int) randnum(0,20);
                int pointer4 = (int) randnum(0,20);
                Shakespeare.setText(myList1.get(pointer1) + " " + myList2.get(pointer2) + " " + myList3.get(pointer3) + " " + myList4.get(pointer4));
            }
        });

    }
    public int randnum(int min, int max){
        double osman = (Math.random() * (max - min));
        int rand = (int) Math.round(osman);
        return rand;
    }


}
