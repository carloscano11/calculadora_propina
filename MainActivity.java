package com.proyecto.menucuentas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void siguiente1 (View view){
        Intent siguiente1 = new Intent (this, cuenta1.class);
        startActivity(siguiente1);
    }
    public void siguiente2 (View view){
        Intent siguiente2 = new Intent (this, cuenta2.class);
        startActivity(siguiente2);

    }
    public void siguiente3 (View view){
        Intent siguiente3 = new Intent (this, cuenta3.class);
        startActivity(siguiente3);
    }
    public void siguientecalculadora (View view){
        Intent siguientecalculadora = new Intent (this, calculadora.class);
        startActivity(siguientecalculadora);
    }
}
