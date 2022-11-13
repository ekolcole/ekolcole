package com.example.receiptapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText cashier, id, customer, q1, q2, q3, q4, q5,q6, q7, q8;
    TextView date;
    Button proceed;
    CheckBox rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8;
    String selected1, selected2, selected3, selected4, selected5, selected6, selected7, selected8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
    cashier = (EditText) findViewById(R.id.cashier);
        id = (EditText) findViewById(R.id.id);
        customer = (EditText) findViewById(R.id.customer);
        q1 = (EditText) findViewById(R.id.q1);
        q2 = (EditText) findViewById(R.id.q2);
        q3 = (EditText) findViewById(R.id.q3);
        q4 = (EditText) findViewById(R.id.q4);
        q5 = (EditText) findViewById(R.id.q5);
        q6 = (EditText) findViewById(R.id.q6);
        q7 = (EditText) findViewById(R.id.q7);
        q8 = (EditText) findViewById(R.id.q8);
        proceed = (Button) findViewById(R.id.padayon);
        rb1 = (CheckBox) findViewById(R.id.rb1);
        rb2 = (CheckBox) findViewById(R.id.rb2);
        rb3 = (CheckBox) findViewById(R.id.rb3);
        rb4 = (CheckBox) findViewById(R.id.rb4);
        rb5 = (CheckBox) findViewById(R.id.rb5);
        rb6 = (CheckBox) findViewById(R.id.rb6);
        rb7 = (CheckBox) findViewById(R.id.rb7);
        rb8 = (CheckBox) findViewById(R.id.rb8);

        //calendar
        Calendar now = Calendar.getInstance();
        String nowDate = DateFormat.getDateInstance(DateFormat.FULL).format(now.getTime());
        date = (TextView) findViewById(R.id.date);
        date.setText(nowDate);

                proceed.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent= new Intent(MainActivity.this, MainActivity2.class);
                        if(!rb1.isChecked() && !rb2.isChecked() &&!rb3.isChecked() &&!rb4.isChecked() &&!rb5.isChecked() &&!rb6.isChecked() &&!rb7.isChecked() &&!rb8.isChecked()) {

                            Toast.makeText(MainActivity.this, "Click one or more!", Toast.LENGTH_SHORT).show();
                        }
                        else{

                            if (rb1.isChecked()) {
                                intent.putExtra("R1", rb1.getText().toString());
                                intent.putExtra("Q1", q1.getText().toString());
                                System.out.println("get");
                            }
                            if (rb2.isChecked()) {
                                intent.putExtra("R2", rb2.getText().toString());
                                intent.putExtra("Q2", q2.getText().toString());
                            }
                            if (rb3.isChecked()) {
                                intent.putExtra("R3", rb3.getText().toString());
                                intent.putExtra("Q3", q3.getText().toString());
                            }
                            if (rb4.isChecked()) {
                                intent.putExtra("R4", rb4.getText().toString());
                                intent.putExtra("Q4", q4.getText().toString());
                            }
                            if (rb5.isChecked()) {
                                intent.putExtra("R5", rb5.getText().toString());
                                intent.putExtra("Q5", q5.getText().toString());
                            }
                            if (rb6.isChecked()) {
                                intent.putExtra("R6", rb6.getText().toString());
                                intent.putExtra("Q6", q6.getText().toString());
                            }
                            if (rb7.isChecked()) {
                                intent.putExtra("R7", rb7.getText().toString());
                                intent.putExtra("Q7", q7.getText().toString());
                            }
                            if (rb8.isChecked()) {
                                intent.putExtra("R8", rb8.getText().toString());
                                intent.putExtra("Q8", q8.getText().toString());
                            }
                        }


                        intent.putExtra("Mopalit", customer.getText().toString());
                        intent.putExtra("Petsa", nowDate);
                        intent.putExtra("Kahera", cashier.getText().toString());
                        intent.putExtra("Id", id.getText().toString());
                        startActivity(intent);
                            }
                        });



            }
        }
