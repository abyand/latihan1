package com.example.admin1.latihan3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText input1;
    private EditText input2;
    private Button tambah;
    private Button kurang;
    private Button kali;
    private Button bagi;
    private Button samadengan;
    private TextView simbol1;
    private TextView hasil;
    private Button hapus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText)findViewById(R.id.input1);
        input2 = (EditText)findViewById(R.id.input2);
        tambah = (Button)findViewById(R.id.tambah);
        kurang = (Button)findViewById(R.id.kurang);
        kali = (Button)findViewById(R.id.kali);
        bagi = (Button)findViewById(R.id.bagi);
        samadengan = (Button)findViewById(R.id.samadengan);
        simbol1 = (TextView)findViewById(R.id.simbol1);
        hasil = (TextView)findViewById(R.id.hasil);
        hapus = (Button)findViewById(R.id.hapus);

        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText("hasil");
                input1.setText("");
                input2.setText("");
                simbol1.setText("");
            }
        });

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simbol1.setText("+");
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simbol1.setText("-");
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                simbol1.setText("*");
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simbol1.setText("/");
            }
        });

        samadengan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai1 = input1.getText().toString();
                String nilai2 = input2.getText().toString();
                String oper = simbol1.getText().toString();

                Double nilai = 0.0;
                if (input1.equals("") || input2.equals("")){

                }
                else {

                    Double a1 = Double.parseDouble(nilai1);
                    Double a2 = Double.parseDouble(nilai2);

                    if (oper.equals("+")) {
                        nilai = a1 + a2;


                    } else if (oper.equals("-")) {
                        nilai = a1 - a2;

                    } else if (oper.equals("*")) {
                        nilai = a1 * a2;

                    } else if (oper.equals("/")) {
                        nilai = a1 / a2;

                    }
                }
                hasil.setText("Hasil : " + nilai);


            }
        });

    }
}
