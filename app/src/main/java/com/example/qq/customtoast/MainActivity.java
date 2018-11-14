package com.example.qq.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.but1);

        LayoutInflater inflater = getLayoutInflater();
        final View viewLayout = inflater.inflate(R.layout.custom_toast,
                (ViewGroup) findViewById(R.id.relativeLayout1));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER,0,0);
                toast.setView(viewLayout);
                toast.show();
            }
        });
    }
}
