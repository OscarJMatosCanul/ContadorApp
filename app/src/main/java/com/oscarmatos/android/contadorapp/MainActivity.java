package com.oscarmatos.android.contadorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private final String Key_Conteo ="conteo";
    private int conteo;
    EditText mCampoContador;
    Button mBotonContar;
    Button mBotonLimpiar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCampoContador=(EditText)findViewById(R.id.campo_Conteo);
        mBotonContar=(Button)findViewById(R.id.boton_Contar);
        mBotonLimpiar=(Button)findViewById(R.id.boton_Reiniciar);

        if(savedInstanceState==null) {
            conteo = 0;
        }else{
            conteo=savedInstanceState.getInt(Key_Conteo);
        }

        mCampoContador.setText(Integer.toString(conteo));

        mBotonContar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                conteo++;
                mCampoContador.setText(Integer.toString(conteo));
            }
        });

        mBotonLimpiar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mCampoContador.setText("0.0");
                conteo=0;
            }
    });
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(Key_Conteo,conteo);
    }

}
