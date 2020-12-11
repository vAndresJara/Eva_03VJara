package com.example.eva_03vjara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;

import java.util.UUID;

import Clases.Clientes;


public class Firebase_act extends AppCompatActivity {

    EditText edNombre, edDestino, edPromo;
    Button button;
    FirebaseDatabase firebase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase_act);

        edNombre = (EditText)findViewById(R.id.et3);
        edDestino = (EditText)findViewById(R.id.et4);
        edPromo = (EditText)findViewById(R.id.et5);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!edNombre.equals(""))
                {

                    Clientes c = new Clientes();
                    c.setId(UUID.randomUUID().toString());
                    c.setNombre(edNombre.getText().toString());
                    c.setDestino(edDestino.getText().toString());
                    c.setPromocion(edPromo.getText().toString());

                    databaseReference.child("Clientes").child(c.getId()).setValue(c);

                    Toast.makeText(getBaseContext(),"Se ha guardado", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getBaseContext(),"No se ha guardado", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void InicializarFireBase()
    {
        FirebaseApp.initializeApp(this);
        firebase = FirebaseDatabase.getInstance();
        databaseReference = firebase.getReference();
    }

    public void Listado(View v)
    {
        Intent i = new Intent(this, listClientes_act.class);
        startActivity(i);
    }

}