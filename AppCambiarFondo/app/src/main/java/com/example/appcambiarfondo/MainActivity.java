package com.example.appcambiarfondo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cambiarFondo (View view)
    {

        int color;
        View contenedor = view.getRootView(); /* Elemento contenedor raíz */
        color = Color.parseColor("#80CBC4"); /*En caso de que el color sea éste*/
        contenedor.setBackgroundColor(color); /*Cambia el color de fondo */

    }

}
