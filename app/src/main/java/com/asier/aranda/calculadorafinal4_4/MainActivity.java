package com.asier.aranda.calculadorafinal4_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;



import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //ID's
    public Button suma, resta, multiplicacion, division, C, DEL, igual;
    public Button _1, _2, _3, _4, _5, _6, _7, _8, _9, punto;
    public ImageButton __9;

    public TextView resultado;

    public Switch switchTheme;

    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion = "";
    float valor = 0.0f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        suma = findViewById(R.id.suma);
        resta = findViewById(R.id.resta);
        multiplicacion = findViewById(R.id.multiplicacion);
        division = findViewById(R.id.division);
        C = findViewById(R.id.C);
        DEL = findViewById(R.id.DEL);
        igual = findViewById(R.id.igual);
        _1 = findViewById(R.id._1);
        _2 = findViewById(R.id._2);
        _3 = findViewById(R.id._3);
        _4 = findViewById(R.id._4);
        _5 = findViewById(R.id._5);
        _6 = findViewById(R.id._6);
        _7 = findViewById(R.id._7);
        _8 = findViewById(R.id._8);
        _9 = findViewById(R.id._9);
        __9 = findViewById(R.id.imageButton);
        punto = findViewById(R.id.punto);
        resultado = findViewById(R.id.resultado);

        switchTheme=findViewById(R.id.switchDark);

    }
    public void changeTheme(View view){
        if(switchTheme.isChecked()){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            recreate();
        }else
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            recreate();
    }

    public void escribir0(View view) {
        valor = Float.parseFloat(resultado.getText().toString());
        if (valor == 0.0f) {
            resultado.setText("0");
        } else {
            resultado.setText(resultado.getText() + "0");
        }
    }

    public void escribir1(View view) {
        valor = Float.parseFloat(resultado.getText().toString());
        if (valor == 0.0f) {
            resultado.setText("1");
        } else {
            resultado.setText(resultado.getText() + "1");
        }
    }

    public void escribir2(View view) {
        valor = Float.parseFloat(resultado.getText().toString());
        if (valor == 0.0f) {
            resultado.setText("2");
        } else {
            resultado.setText(resultado.getText() + "2");
        }
    }

    public void escribir3(View view) {
        valor = Float.parseFloat(resultado.getText().toString());
        if (valor == 0.0f) {
            resultado.setText("3");
        } else {
            resultado.setText(resultado.getText() + "3");
        }
    }

    public void escribir4(View view) {
        valor = Float.parseFloat(resultado.getText().toString());
        if (valor == 0.0f) {
            resultado.setText("4");
        } else {
            resultado.setText(resultado.getText() + "4");
        }
    }

    public void escribir5(View view) {
        valor = Float.parseFloat(resultado.getText().toString());
        if (valor == 0.0f) {
            resultado.setText("5");
        } else {
            resultado.setText(resultado.getText() + "5");
        }
    }

    public void escribir6(View view) {
        valor = Float.parseFloat(resultado.getText().toString());
        if (valor == 0.0f) {
            resultado.setText("6");
        } else {
            resultado.setText(resultado.getText() + "6");
        }
    }

    public void escribir7(View view) {
        valor = Float.parseFloat(resultado.getText().toString());
        if (valor == 0.0f) {
            resultado.setText("7");
        } else {
            resultado.setText(resultado.getText() + "7");
        }
    }

    public void escribir8(View view) {
        valor = Float.parseFloat(resultado.getText().toString());
        if (valor == 0.0f) {
            resultado.setText("8");
        } else {
            resultado.setText(resultado.getText() + "8");
        }
    }

    public void escribir9(View view) {
        valor = Float.parseFloat(resultado.getText().toString());
        if (valor == 0.0f) {
            resultado.setText("9");
        } else {
            resultado.setText(resultado.getText() + "9");
        }
    }

    public void EscribirPunto(View view) {
        if (!String.valueOf(resultado.getText()).contains("."))
            resultado.setText(resultado.getText() + ".");

    }

    public void limpiarC(View view) {
        resultado.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        valor = 0.0f;
        operacion = "";

    }

    public void eliminar(View view) {
        String cadena = String.valueOf(resultado.getText());
        if (cadena.equals("0")) {
            resultado.setText("0");
        } else
            cadena = cadena.substring(0, cadena.length() - 1);
        resultado.setText(cadena);
    }

    public void OperacionDividir(View view) {
        numero1 = Float.parseFloat(String.valueOf(resultado.getText()));
        operacion = "/";
        resultado.setText("0");

    }

    public void OperacionMultiplicar(View view) {
        numero1 = Float.parseFloat(String.valueOf(resultado.getText()));
        operacion = "*";
        resultado.setText("0");

    }

    public void OperacionSuma(View view) {
        numero1 = Float.parseFloat(String.valueOf(resultado.getText()));
        operacion = "+";
        resultado.setText("0");

    }

    public void OperacionResta(View view) {
        numero1 = Float.parseFloat(String.valueOf(resultado.getText()));
        operacion = "-";
        resultado.setText("0");

    }

    public void MostrarResultado(View view) {
        numero2 = Float.parseFloat(String.valueOf(resultado.getText()));
        float result;
        result = 0.0f;

        if (operacion.equals("/")) {
            if (numero2 != 0) {
                result = numero1 / numero2;
                resultado.setText("" + result);
            } else {
                resultado.setText("0");
                Toast.makeText(this, "OPERACION NO VALIDA", Toast.LENGTH_LONG).show();
            }
        } else if (operacion.equals("*")) {
            result = numero1 * numero2;
            resultado.setText(""+result);
        } else if (operacion.equals("+")) {
            result = numero1 + numero2;
            resultado.setText("" + result);
        } else if (operacion.equals("-")) {
            result = numero1 - numero2;
            resultado.setText("" + result);
        }
        //resultado.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
        valor = 0.0f;
        result = 0.0f;
    }


}