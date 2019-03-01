package com.example.mini_project_1_randall_larsen;



import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class quiz extends AppCompatActivity {

    private static final String[] WORDS ={"Sombrero","Agua","Zapato", "Mesa", "Papel"};


    private static final String[] ANS_array_1 ={    "Sombrero", "Pantalones",   "Calor",    "Sombrero",     "Zapato"};
    private static final String[] ANS_array_2 ={    "Hat",      "Aqua",         "Zapato",   "Zapato",       "Pantalones"};
    private static final String[] ANS_array_3 ={    "Uno",      "Aire",         "Aire",     "Mesa",         "Mesa"};
    private static final String[] ANS_array_4 ={    "Mesa",     "Mesa",         "Mesa",     "Calor",        "Papel"};

    private static  int index = 0;
    private static  String  pass = "true";

    public MediaPlayer media_word ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);



        Intent forwardIntent = getIntent();
        String extra = forwardIntent.getStringExtra("animal");

        Bundle bundle = new Bundle();
        bundle.putString("edttext", extra);

        // set Fragmentclass Arguments
        quiz_frag_top frag1 = new quiz_frag_top();
        frag1.setArguments(bundle);

        main_frag frag2 = new main_frag();
        frag2.setArguments(bundle);




       ImageView img = (ImageView) findViewById(R.id.imageView);
        Button button_1 = (Button) findViewById(R.id.ans_1button);
        Button button_2 = (Button) findViewById(R.id.ans_2button);
        Button button_3 = (Button) findViewById(R.id.ans_3button);
        Button button_4 = (Button) findViewById(R.id.ans_4button);





        if (extra.equals(WORDS[0])) {
            img.setImageResource(R.drawable.hat);
            index = 0;
            media_word = MediaPlayer.create(this,R.raw.sombrero);

        }
        if (extra.equals(WORDS[1])) {
            img.setImageResource(R.drawable.water);
            index = 1;
            media_word = MediaPlayer.create(this,R.raw.agua);
        }
        if (extra.equals(WORDS[2])) {
            img.setImageResource(R.drawable.shoes);
            index = 2;
            media_word = MediaPlayer.create(this,R.raw.zapatos);
        }
        if (extra.equals(WORDS[3])) {
            img.setImageResource(R.drawable.table);
            index = 3;
            media_word = MediaPlayer.create(this,R.raw.mesa);
        }
        if (extra.equals(WORDS[4])) {
            img.setImageResource(R.drawable.paper);
            index = 4;
            media_word = MediaPlayer.create(this,R.raw.papel);
        }


        button_1.setText(ANS_array_1[index]);
        button_2.setText(ANS_array_2[index]);
        button_3.setText(ANS_array_3[index]);
        button_4.setText(ANS_array_4[index]);
    }

    public void ans_1(View view) {
        media_word.stop();
        if(index == 0){
            pass = "true";
        }
        else {
            pass = "false";
        }
        Intent backIntent = new Intent();
        backIntent.putExtra("family", pass);
        setResult(RESULT_OK, backIntent);
        finish();
    }

    public void ans_2(View view) {
        media_word.stop();
        if(index == 1 || index == 2){
            pass = "true";
        }
        else {
            pass = "false";
        }
        Intent backIntent = new Intent();
        backIntent.putExtra("family", pass);
        setResult(RESULT_OK, backIntent);
        finish();
    }

    public void ans_3(View view) {
        media_word.stop();
        if(index == 3){
            pass = "true";
        }
        else {
            pass = "false";
        }
        Intent backIntent = new Intent();
        backIntent.putExtra("family", pass);
        setResult(RESULT_OK, backIntent);
        finish();
    }

    public void ans_4(View view) {
        media_word.stop();
        if(index == 4){
            pass = "true";
        }
        else {
            pass = "false";
        }
        Intent backIntent = new Intent();
        backIntent.putExtra("family", pass);
        setResult(RESULT_OK, backIntent);
        finish();
    }
    public void play(View view) {
        media_word.start();
    }




    public void myclick (View view){

     /* //  EditText anstxt = (EditText) findViewById(R.id.myans);
        String ans;
        String anstxt = "delete me";
        //Returning the answer back to the calling activity
        Intent backIntent = new Intent();
        //ans = anstxt.getText().toString();
        ans = anstxt.toString();

       /* if(ans.equals( ANS_array[index]) == true){
            pass = "true";

        }
        else {
            pass = "false";
        }


        backIntent.putExtra("family", pass);
        setResult(RESULT_OK, backIntent);
        finish();*/
    }


}