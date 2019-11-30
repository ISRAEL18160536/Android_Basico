package com.example.ooo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button boton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton1 = (Button) findViewById(R.id.inicio);
        Button boton2 = (Button) findViewById(R.id.sigue);
        Button boton3 = (Button) findViewById(R.id.aceptar);
        boton4=(Button)findViewById(R.id.borrar);
        final TextView texto1=(TextView) findViewById(R.id.textView);
        final TextView texto2=(TextView) findViewById(R.id.etiqueta2);
        final TextView texto3=(TextView) findViewById(R.id.textView2);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            texto1.setText("QIERES SABER ALGO INTERESANTE????'");
            }
        });
         boton2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 texto2.setText("El material más resistente creado por la naturaleza es la tela de Araña.");
             }
         });
         boton3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 texto3.setText("AHORA sabes algo nuevo para plAticarlo con tus amigos");
             }
         });
         boton4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 texto1.setText("");
                 texto2.setText("");
                 texto3.setText("");
             }
         });
    }

}
