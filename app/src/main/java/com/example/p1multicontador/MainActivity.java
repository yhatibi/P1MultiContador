package com.example.p1multicontador;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int contadorUno;
    TextView contadorDeClicsUno;
    Button augmentarElContadorUno;
    Button resetElContadorUno;

    int contadorDos;
    TextView contadorDeClicsDos;
    Button augmentarElContadorDos;
    Button resetElContadorDos;

    int contadorTres;
    TextView contadorDeClicsTres;
    Button augmentarElContadorTres;
    Button resetElContadorTres;

    int contadorCuatro;
    TextView contadorDeClicsCuatro;
    Button augmentarElContadorCuatro;
    Button resetElContadorCuatro;

    int contadorTotal;
    TextView contadorDeClicsTotal;
    Button resetElContadorTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contadorDeClicsUno = findViewById(R.id.contadorDeClicsUno);
        augmentarElContadorUno = findViewById(R.id.augmentarElContadorUno);
        resetElContadorUno = findViewById(R.id.resetElContadorUno);

        contadorDeClicsDos = findViewById(R.id.contadorDeClicsDos);
        augmentarElContadorDos = findViewById(R.id.augmentarElContadorDos);
        resetElContadorDos = findViewById(R.id.resetElContadorDos);

        contadorDeClicsTres = findViewById(R.id.contadorDeClicsTres);
        augmentarElContadorTres = findViewById(R.id.augmentarElContadorTres);
        resetElContadorTres = findViewById(R.id.resetElContadorTres);

        contadorDeClicsCuatro = findViewById(R.id.contadorDeClicsCuatro);
        augmentarElContadorCuatro = findViewById(R.id.augmentarElContadorCuatro);
        resetElContadorCuatro = findViewById(R.id.resetElContadorCuatro);

        contadorDeClicsTotal = findViewById(R.id.contadorDeClicsTotal);
        resetElContadorTotal = findViewById(R.id.resetElContadorTotal);

        resetElContadorTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contadorTotal = 0;
                contadorDeClicsTotal.setText("La suma de los contadores es: " + contadorTotal);

                contadorUno = 0;
                contadorDos = 0;
                contadorTres = 0;
                contadorCuatro = 0;

                contadorDeClicsUno.setText("Has clicado " + contadorUno + " veces");
                contadorDeClicsDos.setText("Has clicado " + contadorDos + " veces");
                contadorDeClicsTres.setText("Has clicado " + contadorTres + " veces");
                contadorDeClicsCuatro.setText("Has clicado " + contadorCuatro + " veces");

            }


        });


        augmentarElContadorUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contadorUno++;
                contadorDeClicsUno.setText("Has clicado " + contadorUno + " veces");

                contadorTotal++;
                contadorDeClicsTotal.setText("La suma de los contadores es: " + contadorTotal);

            }


        });

        resetElContadorUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contadorTotal = contadorTotal - contadorUno;
                contadorDeClicsTotal.setText("La suma de los contadores es: " + contadorTotal);

                contadorUno = 0;
                contadorDeClicsUno.setText("Has clicado " + contadorUno + " veces");

            }


        });

        augmentarElContadorDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contadorDos++;
                contadorDeClicsDos.setText("Has clicado " + contadorDos + " veces");

                contadorTotal++;
                contadorDeClicsTotal.setText("La suma de los contadores es: " + contadorTotal);

            }


        });

        resetElContadorDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contadorTotal = contadorTotal - contadorDos;
                contadorDeClicsTotal.setText("La suma de los contadores es: " + contadorTotal);

                contadorDos = 0;
                contadorDeClicsDos.setText("Has clicado " + contadorDos + " veces");

            }


        });

        augmentarElContadorTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contadorTres++;
                contadorDeClicsTres.setText("Has clicado " + contadorTres + " veces");

                contadorTotal++;
                contadorDeClicsTotal.setText("La suma de los contadores es: " + contadorTotal);

            }


        });

        resetElContadorTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contadorTotal = contadorTotal - contadorTres;
                contadorDeClicsTotal.setText("La suma de los contadores es: " + contadorTotal);

                contadorTres = 0;
                contadorDeClicsTres.setText("Has clicado " + contadorTres + " veces");

            }


        });

        augmentarElContadorCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contadorCuatro++;
                contadorDeClicsCuatro.setText("Has clicado " + contadorCuatro + " veces");

                contadorTotal++;
                contadorDeClicsTotal.setText("La suma de los contadores es: " + contadorTotal);

            }


        });

        resetElContadorCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contadorTotal = contadorTotal - contadorCuatro;
                contadorDeClicsTotal.setText("La suma de los contadores es: " + contadorTotal);

                contadorCuatro = 0;
                contadorDeClicsCuatro.setText("Has clicado " + contadorCuatro + " veces");

            }


        });
    }
}