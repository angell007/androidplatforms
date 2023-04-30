package com.example.dates;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Appointment> items = new ArrayList<>();

        Button btnSave = (Button) findViewById(R.id.button);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {

            EditText nombre = (EditText) findViewById(R.id.name); // Obtener el valor del campo nombre
            EditText identificacion = (EditText) findViewById(R.id.identifier); // Obtener el valor del campo identificacion
            EditText doctor = (EditText)  findViewById(R.id.doctor);// Obtener el valor del campo doctor
            EditText especialidad = (EditText) findViewById(R.id.speciality); // Obtener el valor del campo especialidad
            EditText fecha = (EditText) findViewById(R.id.date); // Obtener el valor del campo fecha
            EditText hora = (EditText) findViewById(R.id.hour); // Obtener el valor del campo hora

            Appointment item = new Appointment(nombre.getText().toString(), identificacion.getText().toString(), doctor.getText().toString(), especialidad.getText().toString(), fecha.getText().toString(), hora.getText().toString());
            items.add(item);


                ArrayAdapter<Appointment> adapter = new ArrayAdapter<Appointment>(MainActivity.this, android.R.layout.simple_list_item_1, items){

                    @Override
                    public View getView(int position, View convertView, ViewGroup parent) {
                        View view = super.getView(position, convertView, parent);
                        TextView textView = view.findViewById(android.R.id.text1);

                        Appointment item = items.get(position);
                        String text = item.getNombre() + " - " + item.getIdentificacion() + " - " + item.getDoctor() + " - " + item.getEspecialidad() + " - " + item.getFecha() + " - " + item.getHora();

                        textView.setText(text);

                        return view;
                    }
                };

                ListView listView = findViewById(R.id.ListCustom);
                listView.setAdapter(adapter);

        }
        });
    }
}