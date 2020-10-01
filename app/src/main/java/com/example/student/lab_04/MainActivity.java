package com.example.student.lab_04;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = getApplicationContext();

        int duration =Toast.LENGTH_LONG;

// comment done for hacktoberfest

	int duration1 =Toast.LENGTH_LONG;
	int duration2=Toast.LENGTH_LONG;




        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.custom_layout_toast));

        TextView text = (TextView) layout.findViewById(R.id.textImage);
        text.setText("This is a custom toast");

        Toast toast = new Toast(context);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();


    }
}
