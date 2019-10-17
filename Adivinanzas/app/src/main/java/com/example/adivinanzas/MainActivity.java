package com.example.adivinanzas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView tvAdivinanza;
    private EditText etRespuesta;
    private List<Adivinanza> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<Adivinanza>();

        list.add(new Adivinanza(1,"Oro parece plata no és","Platano"));
        list.add(new Adivinanza(2,"Que es el arte","Morirte de frio"));
        list.add(new Adivinanza(3,"Que animal camina a 4 patas de dia, 2 a medio dia y 3 de noche","El hombre"));

    }

    public void comprobar(View view)
    {



    }



    public void salir(View view) {
        finish();
    }

}
