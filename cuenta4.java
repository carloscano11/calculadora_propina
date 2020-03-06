package com.proyecto.menucuentas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cuenta4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta1);
    }
    public void anterior (View view) {
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
    public void avance (View view) {
        Intent avance = new Intent(this, calculadora.class);
        startActivity(avance);
    }
}
