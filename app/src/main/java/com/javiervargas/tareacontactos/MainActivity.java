package com.javiervargas.tareacontactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private EditText edtNombre,edtNacimiento,txtTeléfono,txtEmail,edtDescripción;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSiguiente = (Button) findViewById(R.id.btnSiguiente);

        edtNombre = (EditText) findViewById(R.id.edtNombre);
        edtNacimiento = (EditText) findViewById(R.id.edtNacimiento);
        txtTeléfono = (EditText) findViewById(R.id.txtTeléfono);
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        edtDescripción = (EditText) findViewById(R.id.edtDescripción);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ConfirmacionContacto.class);
                intent.putExtra("Nombre",edtNombre.getText().toString());
                intent.putExtra("Nacimiento",edtNacimiento.getText().toString());
                intent.putExtra("Teléfono",txtTeléfono.getText().toString());
                intent.putExtra("Email",txtEmail.getText().toString());
                intent.putExtra("Descripción",edtDescripción.getText().toString());
                startActivity(intent);
            }
        });

    }
}
