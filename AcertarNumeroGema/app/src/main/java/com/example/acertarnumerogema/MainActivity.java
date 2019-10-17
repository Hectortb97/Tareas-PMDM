package com.example.acertarnumerogema;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etNumero;
    private int num;
    private int nFallos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.wtf("Hola","Estoy en onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumero = (EditText) findViewById(R.id.etNumero);
        Object obj = null;
        obj.toString();
    }

    public void generarNumero(View v) {

        // Borra nº anterior del EditText si no está vacío
        if (!etNumero.getText().toString().isEmpty()){
            etNumero.setText("");
        }
        // Cuando se genera un nuevo número, se inicializa a 0 el nº de fallos
        nFallos=0;
        // Genera un nuevo número entero entre 1 y 1000
        num = (int) (Math.random() * 1001);
        // Convierte el número a string
        String numero = String.valueOf(num);
        // Muestra una notificación con el nº generado
        Toast mensaje = Toast.makeText(this, numero, Toast.LENGTH_LONG);
        mensaje.show();
    }

    public void comprobar(View v) {

        final int nIntentos=5; // nº de intentos fallidos máximos hasta mostrar el número generado
        // Si no hay ningún número escrito, muestra una notificación
        if (etNumero.getText().toString().isEmpty()){
            Toast notificacion = Toast.makeText(this, "Debes escribir un número", Toast.LENGTH_LONG);
            notificacion.show();
        } else {
                // Asigna el contenido del editText a la cadena valorLeido
                String valorLeido = etNumero.getText().toString();
                // Convierte la cadena calorLeido a entero
                int valor = Integer.parseInt(valorLeido);
                // Compara el nº leído con el generado (num)
                if (valor == num) {
                    // El nº se ha acertado
                    Toast mensaje = Toast.makeText(this, "¡Muy bien! Es el número mostrado.", Toast.LENGTH_LONG);
                    mensaje.show();
                } else {
                        // El nº se ha fallado. Se incrementa en 1 el nº de fallos
                        nFallos++;
                        if (nFallos<5) {
                            Toast notificacion = Toast.makeText(this, "Lo siento, pero no es el número mostrado. Fallos: " + String.valueOf(nFallos), Toast.LENGTH_LONG);
                            notificacion.show();
                        } else {
                            // Hay 5 fallos, por tanto muestra el nº en la parte superior
                            Toast notificacion = Toast.makeText(this, "Has superado el nº de fallos. El nº era el "+num, Toast.LENGTH_LONG);
                            notificacion.setGravity(Gravity.TOP, 0, 150);
                            notificacion.show();
                            }
                }
        }
    }

    public void salir(View v) {
        finish();
    }

}
