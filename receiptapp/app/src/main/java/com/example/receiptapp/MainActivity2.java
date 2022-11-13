package com.example.receiptapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView cashier, id, customer,q1,q2,q3,q4,q5, q6,q7,q8, date, d1,d2,d3,d4,d5,d6,d7,d8, a1,a2,a3,a4,a5,a6,a7,a8, p1,p2,p3,p4,p5,p6,p7,p8, ttl;
    EditText received;
    Button print;
    double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        received = (EditText) findViewById(R.id.recieved);
        cashier=(TextView) findViewById(R.id.cashier);
        id=(TextView) findViewById(R.id.id);
        customer=(TextView) findViewById(R.id.ngalan);
        date=(TextView) findViewById(R.id.petsa2);
        ttl=(TextView) findViewById(R.id.total);
        print = (Button)findViewById(R.id.print);
        q1=(TextView) findViewById(R.id.q1);
        q2=(TextView) findViewById(R.id.q2);
        q3=(TextView) findViewById(R.id.q3);
        q4=(TextView) findViewById(R.id.q66);
        q5=(TextView) findViewById(R.id.q7);
        q6=(TextView) findViewById(R.id.q6);
        q7=(TextView) findViewById(R.id.q4);
        q8=(TextView) findViewById(R.id.q5);
        d1=(TextView) findViewById(R.id.des1);
        d2=(TextView) findViewById(R.id.des2);
        d3=(TextView) findViewById(R.id.des3);
        d4=(TextView) findViewById(R.id.des4);
        d5=(TextView) findViewById(R.id.des5);
        d6=(TextView) findViewById(R.id.des6);
        d7=(TextView) findViewById(R.id.des7);
        d8=(TextView) findViewById(R.id.des8);
        p1=(TextView) findViewById(R.id.p1);
        p2=(TextView) findViewById(R.id.p2);
        p3=(TextView) findViewById(R.id.p3);
        p4=(TextView) findViewById(R.id.p4);
        p5=(TextView) findViewById(R.id.p5);
        p6=(TextView) findViewById(R.id.p6);
        p7=(TextView) findViewById(R.id.p7);
        p8=(TextView) findViewById(R.id.p8);
        a1=(TextView) findViewById(R.id.a1);
        a2=(TextView) findViewById(R.id.a2);
        a3=(TextView) findViewById(R.id.a3);
        a4=(TextView) findViewById(R.id.a4);
        a5=(TextView) findViewById(R.id.a5);
        a6=(TextView) findViewById(R.id.a6);
        a7=(TextView) findViewById(R.id.a7);
        a8=(TextView) findViewById(R.id.a8);

        double pr1=780.00, pr2=540.00, pr3=540.00, pr4=360.00, pr5=180.00, pr6=280.00, pr7=192.00, pr8=420.00;

        String getMopalit=getIntent().getExtras().getString("Mopalit");
        String getId=getIntent().getExtras().getString("Id");
        String getKahera=getIntent().getExtras().getString("Kahera");
        String getPetsa=getIntent().getExtras().getString("Petsa");
        String getq1=getIntent().getExtras().getString("Q1");
        String getq2=getIntent().getExtras().getString("Q2");
        String getq3=getIntent().getExtras().getString("Q3");
        String getq4=getIntent().getExtras().getString("Q4");
        String getq5=getIntent().getExtras().getString("Q5");
        String getq6=getIntent().getExtras().getString("Q6");
        String getq7=getIntent().getExtras().getString("Q7");
        String getq8=getIntent().getExtras().getString("Q8");
        String getrb1=getIntent().getExtras().getString("R1");
        String getrb2=getIntent().getExtras().getString("R2");
        String getrb3=getIntent().getExtras().getString("R3");
        String getrb4=getIntent().getExtras().getString("R4");
        String getrb5=getIntent().getExtras().getString("R5");
        String getrb6=getIntent().getExtras().getString("R6");
        String getrb7=getIntent().getExtras().getString("R7");
        String getrb8=getIntent().getExtras().getString("R8");

        customer.setText(getMopalit);
        id.setText(getId);
        cashier.setText(getKahera);
        date.setText(getPetsa);
        id.setText(getId);
        if(getrb1 != null){
            q1.setText(getq1);
            d1.setText(getrb1);
            p1.setText(""+pr1);
            a1.setText(String.format("%.2f",Double.parseDouble(getq1)*pr1));
            total = total + Double.parseDouble(getq1)*pr1;

        }
        if(getrb2 != null){
            q2.setText(getq2);
            d2.setText(getrb2);
            p2.setText(""+pr2);
            a2.setText(String.format("%.2f",Double.parseDouble(getq2)*pr2));
            total = total + Double.parseDouble(getq2)*pr2;

        }
        if(getrb3 != null){
            q3.setText(getq3);
            d3.setText(getrb3);
            p3.setText(""+pr3);
            a3.setText(String.format("%.2f",Double.parseDouble(getq3)*pr3));
            total = total + Double.parseDouble(getq3)*pr3;

        }
        if(getrb4 != null){
            q4.setText(getq4);
            d4.setText(getrb4);
            p4.setText(""+pr4);
            a4.setText(String.format("%.2f",Double.parseDouble(getq4)*pr4));
            total = total + Double.parseDouble(getq4)*pr4;

        }
        if(getrb5 != null){
            q5.setText(getq5);
            d5.setText(getrb5);
            p5.setText(""+pr5);
            a5.setText(String.format("%.2f",Double.parseDouble(getq5)*pr5));
            total = total + Double.parseDouble(getq5)*pr5;



        }
        if(getrb6 != null){
            q6.setText(getq6);
            d6.setText(getrb6);
            p6.setText(""+pr6);
            a6.setText(String.format("%.2f",Double.parseDouble(getq6)*pr6));
            total = total + Double.parseDouble(getq6)*pr6;

        }
        if(getrb7 != null){
            q7.setText(getq7);
            d7.setText(getrb7);
            p7.setText(""+pr7);
            a7.setText(String.format("%.2f",Double.parseDouble(getq7)*pr7));
            total = total + Double.parseDouble(getq7)*pr7;

        }
        if(getrb8 != null){
            q8.setText(getq8);
            d8.setText(getrb8);
            p8.setText(""+pr8);
            a8.setText(String.format("%.2f",Double.parseDouble(getq8)*pr8));
            total = total + Double.parseDouble(getq8)*pr8;

        }

        ttl.setText(String.format("%.2f",total)+"    ");





        print.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent =new Intent(MainActivity2.this,MainActivity3.class);

                    if(!d1.getText().toString().matches("")){
                        intent.putExtra("D1", d1.getText().toString());
                        intent.putExtra("Q1", q1.getText().toString());
                        intent.putExtra("P1", pr1);
                        intent.putExtra("A1", a1.getText().toString());
                    }
                if(!d2.getText().toString().matches("")){
                    intent.putExtra("D2", d2.getText().toString());
                    intent.putExtra("Q2", q2.getText().toString());
                    intent.putExtra("P2", pr2);
                    intent.putExtra("A2", a2.getText().toString());

                }
                if(!d3.getText().toString().matches("")){
                    intent.putExtra("D3", d3.getText().toString());
                    intent.putExtra("Q3", q3.getText().toString());
                    intent.putExtra("P3", pr3);
                    intent.putExtra("A3", a3.getText().toString());

                }
                if(!d4.getText().toString().matches("")){
                    intent.putExtra("D4", d4.getText().toString());
                    intent.putExtra("Q4", q4.getText().toString());
                    intent.putExtra("P4", pr4);
                    intent.putExtra("A4", a4.getText().toString());

                }
                if(!d5.getText().toString().matches("")){
                    intent.putExtra("D5", d5.getText().toString());
                    intent.putExtra("Q5", q5.getText().toString());
                    intent.putExtra("P5", pr5);
                    intent.putExtra("A5", a5.getText().toString());

                }
                intent.putExtra("customerName", customer.getText().toString());
                intent.putExtra("total", total);
                intent.putExtra("rAmount",Double.parseDouble(received.getText().toString()));
                intent.putExtra("CName", cashier.getText().toString());
                intent.putExtra("CID", id.getText().toString());
                intent.putExtra("date2", getPetsa);
                System.out.println("petsa: "+getPetsa);
                    startActivity(intent);

          }
        });
        }
    }