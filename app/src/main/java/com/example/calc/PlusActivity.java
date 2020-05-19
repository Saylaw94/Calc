package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PlusActivity extends AppCompatActivity {
    EditText a, b;
    Button submit;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus);

        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        t = findViewById(R.id.t);
        submit = findViewById(R.id.submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = a.getText().toString();
                int i = Integer.parseInt(s);

                String s1 = b.getText().toString();
                int i1 = Integer.parseInt(s1);

                int sum = i + i1;

                String tv = Integer.toString(sum);
                t.setText(tv);
            }
        });
    }
}
