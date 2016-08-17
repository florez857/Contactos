package com.example.pc.contactos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class ListaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        abogadoFragment fragmento=(abogadoFragment) getSupportFragmentManager().findFragmentById(R.id.lawyers_container);

        if (fragmento == null) {
            fragmento = abogadoFragment.newInstance();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.lawyers_container,fragmento)
                    .commit();
        }

    }
}
