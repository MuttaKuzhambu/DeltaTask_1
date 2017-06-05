package com.example.android.deltatask;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.deltatask.R;

import static android.R.attr.id;
import static java.lang.reflect.Array.getInt;

public class MainActivity extends AppCompatActivity {
    int r=0,g=0,b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void IncRed(View view){
        r=r+10;
        if(r>255){
            r=0;
        }
        TextView redValue=(TextView) findViewById(R.id.redValue);
        redValue.setText(String.valueOf(r));
        backgroundColor(r,g,b);
    }
    public void IncGreen(View view){
        g=g+10;
        if(g>255){
            g=0;
        }
        TextView greenValue=(TextView) findViewById(R.id.greenValue);
        greenValue.setText(String.valueOf(g));
        backgroundColor(r,g,b);
    }
    public void IncBlue(View view){
        b=b+10;
        if(b>255){
            b=0;
        }
        TextView blueValue=(TextView) findViewById(R.id.blueValue);
        blueValue.setText(String.valueOf(b));
        backgroundColor(r,g,b);
    }
    public void backgroundColor(int r,int g,int b){
        Color c=new Color();
        c.red(r);
        c.green(g);
        c.blue(b);
        LinearLayout background=(LinearLayout) findViewById(R.id.background);
        background.setBackgroundColor(Color.rgb(r,g,b));
    }
    public void reset(View view)
    {
        r=0;g=0;b=0;
        backgroundColor(r,g,b);
    }


}
