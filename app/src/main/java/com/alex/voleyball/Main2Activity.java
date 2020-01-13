package com.alex.voleyball;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class Main2Activity extends AppCompatActivity {
    TextView TextA, TextB; int a=0, b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextA=findViewById(R.id.textView);TextB=findViewById(R.id.textView2);TextA.setText(" "+a);TextB.setText(" "+b);
    }
    public void App(View view) { if(a<99){ a++;}else{a=0;}if(a<10){TextA.setText(" "+a);}else{TextA.setText(""+a);}}
    public void Bpp(View view) {if(b<99){ b++;}else{b=0;} if(b<10){TextB.setText(" "+b);}else{TextB.setText(""+b);} }
    public void restart(View view) { a=0;b=0; TextA.setText(" "+a); TextB.setText(" "+b); }
}
