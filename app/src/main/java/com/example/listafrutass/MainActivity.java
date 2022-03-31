package com.example.listafrutass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerFrutas = null;
    private TextView textViewDetalhes = null;
    private Button buttonBuscar = null;
    private int frutaSelecionada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referenciando as views
        spinnerFrutas = findViewById(R.id.spinner);
        textViewDetalhes = findViewById(R.id.textView);
        buttonBuscar = findViewById(R.id.button);

        //Buscando a lista de frutas da classe ExpertFruta e colocando esta no spinner
        ExpertFruta expertFruta = new ExpertFruta();
        List<String> listText = expertFruta.get();

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, expertFruta.getFrutas(MainActivity.this));//setting the country_array to spinner
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFrutas.setAdapter(spinnerAdapter);

        spinnerFrutas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
                frutaSelecionada = position;

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                textViewDetalhes.setText("Nada selecionado");
            }
        });

        buttonBuscar.setOnClickListener(view -> textViewDetalhes.setText("" +listText.get(frutaSelecionada)));

    }
}