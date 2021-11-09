package com.example.micalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button info,cero,uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,suma,resta,multiplicacion,division,igual,cancelar,punto;
    TextView resultado;
    double num1,num2,result;

    String operador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        info = (Button) findViewById(R.id.btInfo);
        cancelar =(Button) findViewById(R.id.btnCancelar);

        uno = (Button) findViewById(R.id.btn1);
        dos = (Button) findViewById(R.id.btn2);
        tres = (Button) findViewById(R.id.btn3);
        cuatro = (Button) findViewById(R.id.btn4);
        cinco = (Button) findViewById(R.id.btn5);
        seis = (Button) findViewById(R.id.btn6);
        siete = (Button) findViewById(R.id.btn7);
        ocho = (Button) findViewById(R.id.btn8);
        nueve = (Button) findViewById(R.id.btn9);
        cero = (Button) findViewById(R.id.btn0);
        punto = (Button) findViewById(R.id.btnPunto);

        suma  = (Button) findViewById(R.id.btnMas);
        resta  = (Button) findViewById(R.id.btnMenos);
        multiplicacion  = (Button) findViewById(R.id.btnMultiplicar);
        division  = (Button) findViewById(R.id.btnDividir);
        igual  = (Button) findViewById(R.id.btnIgual);

        resultado =(TextView) findViewById(R.id.resultado);

        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText().toString() + "0");
            }
        });

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultado.setText(resultado.getText().toString() + "1");
            }
        });

        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText().toString() + "2");
            }
        });

        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText().toString() + "3");
            }
        });

        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText().toString() + "4");
            }
        });

        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText().toString() + "5");
            }
        });

        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText().toString() + "6");
            }
        });

        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText().toString() + "7");
            }
        });

        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText().toString() + "8");
            }
        });

        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText().toString() + "9");
            }
        });

        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText().toString() + ".");
            }
        });

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "+";
                num1 = Double.parseDouble(resultado.getText().toString());
                resultado.setText("");
            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "-";
                num1 = Double.parseDouble(resultado.getText().toString());
                resultado.setText("");
            }
        });

        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "*";
                num1 = Double.parseDouble(resultado.getText().toString());
                resultado.setText("");
            }
        });


        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "/";
                num1 = Double.parseDouble(resultado.getText().toString());
                resultado.setText("");
            }
        });

        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = 0;
                num2 = 0;
                resultado.setText("");
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2 = Double.parseDouble(resultado.getText().toString());
                if(operador.equals("+")){
                    resultado.setText("");
                    result = num1 + num2;
                }
                if(operador.equals("-")){
                    resultado.setText("");
                    result = num1 - num2;
                }
                if(operador.equals("*")){
                    resultado.setText("");
                    result = num1 * num2;
                }
                if(operador.equals("/")){
                    resultado.setText("");
                    if(num2 != 0){
                        result = num1 / num2;
                    }else {
                        resultado.setText("Error");
                    }
                }
                resultado.setText(String.valueOf(result));
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);

            }
        });
    }
}