package com.example.AdressMapsActivity;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AddContato extends Activity {
    EditText txtNome;
    EditText txtTelefone;
    EditText txtEmail;
    EditText txtEndereco;

    ContatoHelper dbHelper;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addContato);

        txtNome = (EditText) findViewById(R.id.txtNome);
        txtTelefone = (EditText) findViewById(R.id.txtTelefone);
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtEndereco = (EditText) findViewById(R.id.txtEndereco);
    }

    

}
