package com.example.pc.contactos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class abogadoFragment extends Fragment {



    public abogadoFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static abogadoFragment newInstance() {
        abogadoFragment fragment = new abogadoFragment();

        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_abogado, container, false);
    }


    //este metodo procesa el resulto de un proceso que es enviado por otro intent

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }
}
