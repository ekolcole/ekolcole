package com.example.receiptapp;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView petsa,d1,d2,d3,d4,d5, q1,q2,q3,q4,q5, p1,p2,p3,p4,p5, a1,a2,a3,a4,a5, mopalit, id, kahera, total, nadawat, sukli;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        d1=(TextView) findViewById(R.id.desc1);
        d2=(TextView) findViewById(R.id.desc2);
        d3=(TextView) findViewById(R.id.desc3);
        d4=(TextView) findViewById(R.id.desc4);
        d5=(TextView) findViewById(R.id.desc5);
        q1=(TextView) findViewById(R.id.quan1);
        q2=(TextView) findViewById(R.id.quan2);
        q3=(TextView) findViewById(R.id.quan3);
        q4=(TextView) findViewById(R.id.quan4);
        q5=(TextView) findViewById(R.id.quan5);
        p1=(TextView) findViewById(R.id.prc1);
        p2=(TextView) findViewById(R.id.prc2);
        p3=(TextView) findViewById(R.id.prc3);
        p4=(TextView) findViewById(R.id.prc4);
        p5=(TextView) findViewById(R.id.prc5);
        a1=(TextView) findViewById(R.id.amnt1);
        a2=(TextView) findViewById(R.id.amnt2);
        a3=(TextView) findViewById(R.id.amnt3);
        a4=(TextView) findViewById(R.id.amnt4);
        a5=(TextView) findViewById(R.id.amnt5);
        mopalit=(TextView) findViewById(R.id.cust);
        id=(TextView) findViewById(R.id.idcash);
        kahera=(TextView) findViewById(R.id.cashier);
        total=(TextView) findViewById(R.id.total);
        sukli=(TextView) findViewById(R.id.change);
        petsa=(TextView) findViewById(R.id.date3);
        nadawat = (TextView) findViewById(R.id.recieved) ;

        String getd1=getIntent().getExtras().getString("D1");
        String getd2=getIntent().getExtras().getString("D2");
        String getd3=getIntent().getExtras().getString("D3");
        String getd4=getIntent().getExtras().getString("D4");
        String getd5=getIntent().getExtras().getString("D5");
        String getq1=getIntent().getExtras().getString("Q1");
        String getq2=getIntent().getExtras().getString("Q2");
        String getq3=getIntent().getExtras().getString("Q3");
        String getq4=getIntent().getExtras().getString("Q4");
        String getq5=getIntent().getExtras().getString("Q5");
        double getp1=getIntent().getExtras().getDouble("P1");
        double getp2=getIntent().getExtras().getDouble("P2");
        double getp3=getIntent().getExtras().getDouble("P3");
        double getp4=getIntent().getExtras().getDouble("P4");
        double getp5=getIntent().getExtras().getDouble("P5");
        String geta1=getIntent().getExtras().getString("A1");
        String geta2=getIntent().getExtras().getString("A2");
        String geta3=getIntent().getExtras().getString("A3");
        String geta4=getIntent().getExtras().getString("A4");
        String geta5=getIntent().getExtras().getString("A5");
        String getmopalit=getIntent().getExtras().getString("customerName");
        String getid=getIntent().getExtras().getString("CID");
        String getkahera=getIntent().getExtras().getString("CName");
        double gettotal=getIntent().getExtras().getDouble("total");
        double getnadawat=getIntent().getExtras().getDouble("rAmount");
        String getpetsa=getIntent().getExtras().getString("date2");


        petsa.setText(getpetsa);
        mopalit.setText(getmopalit);
        kahera.setText(getkahera);
        id.setText(getid);
        total.setText(String.format("Total:   %.2f", gettotal));
        nadawat.setText("Recieved:   "+getnadawat);
        sukli.setText("Change:   "+(getnadawat-gettotal));


        if(getd1 != null){
            d1.setText(getd1);
            q1.setText(getq1);
            p1.setText(""+getp1);
            a1.setText(geta1);
        }
        if(getd2 != null){
            d2.setText(getd2);
            q2.setText(getq2);
            p2.setText(""+getp2);
            a2.setText(geta2);
        }
        if(getd3 != null){
            d3.setText(getd3);
            q3.setText(getq3);
            p3.setText(""+getp3);
            a3.setText(geta3);
        }
        if(getd4 != null){
            d4.setText(getd4);
            q4.setText(getq4);
            p4.setText(""+getp4);
            a4.setText(geta4);
        }
        if(getd5 != null){
            d5.setText(getd5);
            q5.setText(getq5);
            p5.setText(""+getp5);
            a5.setText(geta5);
        }

    }
}