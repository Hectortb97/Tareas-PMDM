package com.example.adivinanzas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView tvAdivinanza;
    private EditText etRespuesta;
    private List<Adivinanza> list = new ArrayList<Adivinanza>();
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add(new Adivinanza(1,"Oro parece plata no és","Platano"));
        list.add(new Adivinanza(2,"Que es el arte","Morirte de frio"));
        list.add(new Adivinanza(3,"Que animal camina a 4 patas de dia, 2 a medio dia y 3 de noche","El hombre"));

    }

    public void adivinanza(View view){

        int idR = (int) (Math.random() * 3) + 1;

        for(Adivinanza adivinanza : list)
        {

            if(adivinanza.getId() == idR)
            {
               tvAdivinanza = (TextView)findViewById(R.id.tVAdivinanza);
               tvAdivinanza.setText(adivinanza.getAdivinanza());
                id = adivinanza.getId();
            }


        }

    }

    public void comprobar(View view)
    {

        etRespuesta = (EditText) findViewById(R.id.eTRespuesta);

        for(Adivinanza adivinanza : list)
        {

            if(adivinanza.getId() == id)
            {

                if(adivinanza.getRespuesta().equalsIgnoreCase(etRespuesta.getText().toString()))
                {
                    Toast mensajeC = Toast.makeText(this, "¡CORRECTO!", Toast.LENGTH_LONG);
                    mensajeC.show();
                }
                else
                {
                    Toast mensajeI = Toast.makeText(this, "INCORRECTO LA RESPUESTA ES: " + (adivinanza.getRespuesta()), Toast.LENGTH_LONG);
                    mensajeI.show();
                }
            }


        }

    }



    public void salir(View view) {
        finish();
    }

}
