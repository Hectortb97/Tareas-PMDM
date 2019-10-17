package com.example.acertarnmero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText num;
    private TextView mostrarm;
    private int numero;
    private int contador = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero = (int) (Math.random() * 1000) + 1;

        num = (EditText)findViewById(R.id.etN);

        Toast mensaje = Toast.makeText(this, "El numero es "+numero, Toast.LENGTH_LONG);
        mensaje.show();
    }


    public void Comprobar(View view)
    {

        int numI = Integer.parseInt(num.getText().toString());

        if(numI == numero)
        {
            Toast.makeText(MainActivity.this, "Correcto", Toast.LENGTH_LONG).show();
        }
        else{

        switch (contador)
        {
            case 1:
                Toast men1 = Toast.makeText(MainActivity.this, "Fallo 1", Toast.LENGTH_LONG);
                men1.setGravity(Gravity.CENTER_VERTICAL, 300, -300);
                men1.show();
                contador++;
                break;
            case 2:
                Toast men2 = Toast.makeText(MainActivity.this, "Fallo 2", Toast.LENGTH_LONG);
                men2.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                men2.show();
                contador++;
                break;
            case 3:
                Toast men3 = Toast.makeText(MainActivity.this, "Fallo 3", Toast.LENGTH_LONG);
                men3.setGravity(Gravity.LEFT, 0, 0);
                men3.show();
                contador++;
                break;
            case 4:
                Toast men4 = Toast.makeText(MainActivity.this, "Fallo 4", Toast.LENGTH_LONG);
                men4.setGravity(Gravity.RIGHT, 0, 0);
                men4.show();
                contador++;
                break;
            case 5:
                Toast men5 = Toast.makeText(MainActivity.this, "Fallo 5 el numero era "+numero, Toast.LENGTH_LONG);
                men5.setGravity(Gravity.BOTTOM, 300, 100);
                men5.show();
                mostrarm.setText(Integer.valueOf(numero));
                contador++;
                break;

        }
        if(contador==6)
        {
            contador = 0;
        }

    }


    }

    public void generarNumero(View view)
    {

        numero = (int) (Math.random() * 1000) + 1;
        Toast mensaje = Toast.makeText(this, "El numero es "+numero, Toast.LENGTH_LONG);
        mensaje.show();

    }

}
