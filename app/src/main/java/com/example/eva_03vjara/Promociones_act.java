package com.example.eva_03vjara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import Clases.Clientes;

public class Promociones_act extends AppCompatActivity {

    private Spinner spin1;
    private TextView text1, text2;
    private EditText editText1, editText2;
    private int envio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promociones_act);

        spin1 = (Spinner)findViewById(R.id.spinCl);
        text1 = (TextView)findViewById(R.id.tvPromo1);
        text2 = (TextView)findViewById(R.id.tvPromo2);
        editText1 = (EditText)findViewById(R.id.etPromo);
        editText2 = (EditText)findViewById(R.id.etDestino);

        ArrayList<String> listaCliente = (ArrayList<String>) getIntent().getSerializableExtra("listaCliente");
        ArrayAdapter<String> ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaCliente);
        spin1.setAdapter(ad);
    }

    public void calPromo(View v)
    {
        Clientes c = new Clientes();
        String cliente = spin1.getSelectedItem().toString();
        int envio = Integer.parseInt(editText2.getText().toString());
        int resultado;

        if(editText1.equals("Pizzas promo") || editText1.equals("Master pizza") || editText1.equals("Pizza max") )
        {
            //Se gestiona pizza
            if(editText1.equals("Pizzas promo"))
            {
                resultado = 5990 + envio;
                text1.setText("Estimado " + cliente + "el valor final promoción y envio es: ");
                text2.setText(resultado);
            }
        }
        else
        {
            Toast.makeText(this,"Promoción no valida", Toast.LENGTH_LONG).show();
        }

    }
}