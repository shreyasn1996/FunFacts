package com.example.shreyas.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    public  static  final String TAG= FunFactsActivity.class.getSimpleName();
    private FactBook factBook= new FactBook();
    private ColorWheel colorWheel= new ColorWheel();
    // Declare our view variable
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Assign the views from the layout file to corresponding variables
        factTextView = (TextView) findViewById(R.id.factTextView);
        showFactButton=(Button) findViewById(R.id.showFactButton);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View  view){
                String fact = factBook.getFact();
                factTextView.setText(fact);
                int color =colorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
               showFactButton.setTextColor(color);

            }

        };
        showFactButton.setOnClickListener(listener);
        //Toast.makeText(this, "Yay!! Our Activity was created!", Toast.LENGTH_LONG).show();
        Log.d(TAG,"We're logging from the onCreate() method!");

    }
}
