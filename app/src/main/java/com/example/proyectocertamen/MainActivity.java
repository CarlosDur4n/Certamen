package com.example.proyectocertamen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Primer commit
    EditText peso, estatura;
    TextView resultadoIMC;
    Button calcular;
    ArrayList<String> genero = new ArrayList<>();
    ArrayAdapter gAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        peso = findViewById(R.id.txtPeso);
        estatura = findViewById(R.id.txtEstatura);
        resultadoIMC = findViewById(R.id.lblResultado);
        calcular = findViewById(R.id.btnCalcular);
    }
    public void calcularIMC (View view) {
        String peso1 = peso.getText().toString();
        String estatura1 = estatura.getText().toString();
        if(peso1.isEmpty() || estatura1.isEmpty()) {
            Toast.makeText(this, "No pueden haber campos vacios", Toast.LENGTH_SHORT).show();
        }else {
            double DatoEstatura = Double.parseDouble(estatura1)/100.0;
            double DatoPeso = Double.parseDouble(peso1)/100.0;
            double imc;
            imc = peso1/();
            imc = estatura1/();
            peso.setText("");
            estatura.setText("");
        }
    }
}

//LINK PROYECTO GITHUB

//