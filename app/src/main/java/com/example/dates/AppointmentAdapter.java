package com.example.dates;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AppointmentAdapter extends ArrayAdapter<Appointment> {
    public AppointmentAdapter(Context context, ArrayList<Appointment> appointments) {
        super(context, 0, appointments);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_main, parent, false);
        }

        Appointment appointment = getItem(position);

        TextView nameTextView = convertView.findViewById(R.id.name);
        nameTextView.setText(appointment.getNombre());

        TextView idTextView = convertView.findViewById(R.id.identifier);
        idTextView.setText(String.valueOf(appointment.getIdentificacion()));

        TextView doctorTextView = convertView.findViewById(R.id.doctor);
        doctorTextView.setText(appointment.getDoctor());

        TextView specialtyTextView = convertView.findViewById(R.id.speciality);
        specialtyTextView.setText(appointment.getEspecialidad());

        TextView dateTextView = convertView.findViewById(R.id.date);
        dateTextView.setText(appointment.getFecha());

        TextView timeTextView = convertView.findViewById(R.id.hour);
        timeTextView.setText(appointment.getHora());

        return convertView;
    }
}

