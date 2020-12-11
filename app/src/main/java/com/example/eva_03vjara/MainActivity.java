package com.example.eva_03vjara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText edit, edit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit = (EditText)findViewById(R.id.et1);
        edit2 = (EditText)findViewById(R.id.et2);
    }

    public void Menu(View v)
    {
        String user = edit.getText().toString().trim();
        String pass = edit2.getText().toString().trim();

        if(user.equals("Android")||user.equals("android"))
        {
            if(pass.equals("123"))
            {
                Intent i = new Intent(this, Menu_act.class);
                startActivity(i);
                return;
            }
        }


        Toast.makeText(this, "Datos no validos", Toast.LENGTH_LONG).show();


    }
}