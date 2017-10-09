package com.oscarmatos.android.contadorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mCampoContador;
    Button mBotonContar;
    Button mBotonLimpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCampoContador=(EditText) findViewById(R.id.campo_Conteo);
        mBotonContar=(Button)findViewById(R.id.boton_Contar);
        mBotonLimpiar=(Button)findViewById(R.id.boton_Reiniciar);

        mBotonContar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
             String s = mCampoContador.getText().toString();
                double cont = Double.parseDouble(s);
                cont++;
                s=String.valueOf(cont);
                mCampoContador.setText(s);
            }
        });

        mBotonLimpiar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mCampoContador.setText("0.0");
            }
    });
    }
}
