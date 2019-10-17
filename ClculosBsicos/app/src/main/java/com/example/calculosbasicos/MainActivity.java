package com.example.calculosbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    TextView resultado;
    EditText num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.etn1);
        num2 = (EditText)findViewById(R.id.etn2);

        resultado = (TextView)findViewById(R.id.tvresul);

    }

    public void Sumar(View view) {

        float n1 = Float.parseFloat(num1.getText().toString());
        float n2 = Float.parseFloat(num2.getText().toString());

        float res = n1+n2;
        resultado.setText(String.valueOf(res));

    }

    public void Restar(View view) {

        float n1 = Float.parseFloat(num1.getText().toString());
        float n2 = Float.parseFloat(num2.getText().toString());

        float res = n1-n2;
        resultado.setText(String.valueOf(res));

    }

    public void Multiplicar(View view) {

        float n1 = Float.parseFloat(num1.getText().toString());
        float n2 = Float.parseFloat(num2.getText().toString());

        float res = n1*n2;
        resultado.setText(String.valueOf(res));

    }

    public void Dividir(View view) {

        float n1 = Float.parseFloat(num1.getText().toString());
        float n2 = Float.parseFloat(num2.getText().toString());

        float res = n1/n2;
        resultado.setText(String.valueOf(res));

    }


    public void Borrar(View view) {

        resultado.setText(String.valueOf(0));
        num1.setText(String.valueOf(""));
        num2.setText(String.valueOf(""));

    }

}
