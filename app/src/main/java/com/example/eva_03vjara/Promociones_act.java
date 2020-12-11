package com.example.eva_03vjara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class Promociones_act extends AppCompatActivity {

    private Spinner spin1;
    private TextView text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promociones_act);

        spin1 = (Spinner)findViewById(R.id.spinCl);

        ArrayList<String> listaCliente = (ArrayList<String>) getIntent().getSerializableExtra("listaCliente");
        ArrayAdapter<String> ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaCliente);
        spin1.setAdapter(ad);
    }

    public void Promo(View v)
    {



    }
}