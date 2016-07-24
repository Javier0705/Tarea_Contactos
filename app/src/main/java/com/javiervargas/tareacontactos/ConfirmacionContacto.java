package com.javiervargas.tareacontactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmacionContacto extends AppCompatActivity {

    TextView txtvNombreConfirm2,txtvNacimientoConfirm2,txtvTeléfonoConfirm2,txtvEmailConfirm2,txtvDescripConfirm2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion_contacto);

        Button btnEditarDatos = (Button) findViewById(R.id.btnEditarDatos);

        TextView txtvNombreConfirm2 = (TextView) findViewById(R.id.txtvNombreConfirm2);
        TextView txtvNacimientoConfirm2 = (TextView) findViewById(R.id.txtvNacimientoConfirm2);
        TextView txtvTeléfonoConfirm2 = (TextView) findViewById(R.id.txtvTeléfonoConfirm2);
        TextView txtvEmailConfirm2 = (TextView) findViewById(R.id.txtvEmailConfirm2);
        TextView txtvDescripConfirm2 = (TextView) findViewById(R.id.txtvDescripConfirm2);

        Bundle extras = getIntent().getExtras();
        String datoNombre = (String) extras.get("Nombre");
        String datoNacimiento = (String) extras.get("Nacimiento");
        String datoTeléfono = (String) extras.get("Teléfono");
        String datoEmail = (String) extras.get("Email");
        String datoDescripción = (String) extras.get("Descripción");

        txtvNombreConfirm2.setText(datoNombre);
        txtvNacimientoConfirm2.setText(datoNacimiento);
        txtvTeléfonoConfirm2.setText(datoTeléfono);
        txtvEmailConfirm2.setText(datoEmail);
        txtvDescripConfirm2.setText(datoDescripción);

        btnEditarDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfirmacionContacto.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

}
