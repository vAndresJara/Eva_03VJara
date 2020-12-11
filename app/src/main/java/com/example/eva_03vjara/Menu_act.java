package com.example.eva_03vjara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.ArrayList;

public class Menu_act extends AppCompatActivity {

    private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_act);

        videoView = (VideoView)findViewById(R.id.vd);


        String ruta = "android.resource://"+ getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(ruta);
        videoView.setVideoURI(uri);


        MediaController media = new MediaController(this);
        videoView.setMediaController(media);
    }

    public void FireBase(View v)
    {
        Intent f = new Intent(this, Firebase_act.class);
        startActivity(f);
    }

    public void Promociones(View v)
    {
        ArrayList<String> Cliente =  new ArrayList<>();

        Cliente.add("Ramiro");
        Cliente.add("Rosa");
        Cliente.add("Robert");


        Intent i = new Intent(this, Promociones_act.class);
        i.putExtra("listaCliente", Cliente);

        startActivity(i);
    }
}