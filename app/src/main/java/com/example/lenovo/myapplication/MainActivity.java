package com.example.lenovo.myapplication;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Set;

public class MainActivity extends AppCompatActivity {
    int i;
    int op=0;
    int first=0;
    double in;
    double out;
    String input="";
    String output="";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnkf = (Button) findViewById(R.id.btnkf);
        Button btnsquare = (Button) findViewById(R.id.btnsquare);
        Button btndown = (Button) findViewById(R.id.btndown);
        Button btndelete = (Button) findViewById(R.id.btndelete);
        Button btnclean = (Button) findViewById(R.id.btnclean);
        Button btnbac = (Button) findViewById(R.id.btnbac);
        Button btndivide = (Button) findViewById(R.id.btndivide);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);
        Button btnplus = (Button) findViewById(R.id.btnplus);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btnminus = (Button) findViewById(R.id.btnminus);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btnadd = (Button) findViewById(R.id.btnadd);
        Button btnsigh = (Button) findViewById(R.id.btnsigh);
        Button btn0 = (Button) findViewById(R.id.btn0);
        Button btnpoint = (Button) findViewById(R.id.btnpoint);
        Button btnequal = (Button) findViewById(R.id.btnequal);
        final TextView textView = (TextView) findViewById(R.id.text1);

        btnclean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output="";
                input="";
                op=0;
                textView.setText("0");
            }
        });
        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op==0){
                input="";
                textView.setText("0");}
                else
                    output="";
                    textView.setText("0");
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a;
                in=Double.parseDouble(input);
                out=Double.parseDouble(output);
                if (op==0){}
                if (op == 1){
                   a = in+out;
                   input=""+doubleTran(a);
                }
                if (op==2){
                    a=in-out;
                    input=""+doubleTran(a);
                }
                if (op==3){
                    a=in*out;
                    input=""+doubleTran(a);
                }
                if (op==4){
                    a=in/out;
                    input=""+doubleTran(a);
                }
                textView.setText(input);
                output="";
                op=5;

            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a;
                    if (op == 1){
                         a = in+out;
                         input=""+doubleTran(a);
                     }
                    if (op==2){
                        a=in-out;
                        input=""+doubleTran(a);
                    }
                    if (op==3){
                        a=in*out;
                        input=""+doubleTran(a);
                    }
                    if (op==4){
                        a=in/out;
                        input=""+doubleTran(a);
                    }
                op=1;
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a;
                if (op == 1){
                    a = in+out;
                    input=""+doubleTran(a);
                }
                if (op==2){
                    a=in-out;
                    input=""+doubleTran(a);
                    op=2;
                }
                if (op==3){
                    a=in*out;
                    input=""+doubleTran(a);
                    op=2;
                }
                if (op==4) {
                    a = in / out;
                    input = "" + doubleTran(a);
                    op=2;
                }
                op=2;
                }
         });

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a;
                if (op == 1){
                    a = in+out;
                    input=""+doubleTran(a);
                }
                if (op==2){
                    a=in-out;
                    input=""+doubleTran(a);
                }
                if (op==3){
                    a=in*out;
                    input=""+doubleTran(a);
                }
                if (op==4){
                    a=in/out;
                    input=""+doubleTran(a);
                }
                op=3;
            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a;
                if (op == 1){
                    a = in+out;
                    input=""+doubleTran(a);
                }
                if (op==2){
                    a=in-out;
                    input=""+doubleTran(a);
                }
                if (op==3){
                    a=in*out;
                    input=""+doubleTran(a);
                }
                if (op==4){
                    a=in/out;
                    input=""+doubleTran(a);
                }
                op=4;
            }
        });
        btnbac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == 0){
                    if (input.equals("")){}
                    else input = input.substring(0,input.length()-1);
                         textView.setText(input);
                }
                if (op != 0&&op!=5){
                    if (output.equals("")){}
                     else output = output.substring(0,output.length()-1);
                          textView.setText(output);
                }
            }
        });
        btnsigh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a;double c;double b;double d;
                if(op==0){
                    a =Double.parseDouble(input);
                    b =a*(-1);
                    input="" + doubleTran(b);
                    textView.setText(input); }
                else {
                    c = Double.parseDouble(output);
                    d = c*(-1);
                    output = "" + doubleTran(d);
                    textView.setText(output); }
            }
        });
        btnkf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a;double b;double c;double d;
                if (op == 0) {
                    a = Double.parseDouble(input);
                    b = Math.sqrt(a);
                    input = "" + doubleTran(b);
                    textView.setText(input);
                }
                if (op!=0) {
                    c = Double.parseDouble(output);
                    d = Math.sqrt(c);
                    output = "" + doubleTran(d);
                    textView.setText(output);
            }   }
            });
        btnsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a;double b;double c;double d;
                if (op==0){
                    a = Double.parseDouble(input);
                    b = a*a;
                    input = ""+doubleTran(b);
                    textView.setText(input);
                }
                if (op!=0){
                     c = Double.parseDouble(output);
                     d = c*c;
                     output = ""+doubleTran(d);
                     textView.setText(output);}
            }
        });
        btndown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a;double b;double c;double d;
                if(op == 0){
                    a = Double.parseDouble(input);
                    b = 1/a;
                    input = ""+doubleTran(b);
                    textView.setText(input);
                }
                if (op != 0){
                    c = Double.parseDouble(output);
                    d = 1/c;
                    output = ""+doubleTran(d);
                    textView.setText(output);
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=1;
                if(op==0){
                textView.setText(input+="7");
                }
                else
                    textView.setText(output+="7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=1;
                if (op == 0) {
                    textView.setText(input += "8");
                }
                else
                    textView.setText(output += "8");
                }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=1;
                if (op == 0) {
                    textView.setText(input += "9");
                }
                else
                    textView.setText(output += "9");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=1;
                if (op == 0) {
                    textView.setText(input += "1");
                }
                else
                    textView.setText(output += "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=1;
                if (op == 0) {
                    textView.setText(input += "2");
                }
                else
                    textView.setText(output += "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=1;
                if (op == 0) {
                    textView.setText(input += "3");
                }
                else
                    textView.setText(output += "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=1;
                if (op == 0) {
                    textView.setText(input += "4");
                }
                else
                    textView.setText(output += "4");
                }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=1;
                if (op == 0) {
                    textView.setText(input += "5");
                }
                else
                    textView.setText(output += "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=1;
                if (op == 0) {
                    textView.setText(input += "6");
                }
                else
                    textView.setText(output += "6");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first==0){
                    textView.setText("0");
                }
                else   if (op == 0) {
                    textView.setText(input += "0");
                }
                else
                    textView.setText(output += "0");
            }
        });
        btnpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=1;
                if(op==0) {
                    if (input.contains(".")) {}
                    else if (input == "") {
                        textView.setText(input="0."); }
                            else
                                textView.setText(input += ".");
                }
                if (op!=0){
                    if (output.contains(".")) {}
                    else if (input == "") {
                        textView.setText(output="0."); }
                    else
                        textView.setText(output += ".");
                    }
            }
        });
    }
    public static String doubleTran(double num) {
        if (Math.round(num) - num == 0) {
            return String.valueOf((long) num);
                }
         return String.valueOf(num);
    }
}

