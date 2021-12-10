package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class addition extends AppCompatActivity {

    EditText ed1,ed2;
    Button btn;
    Double v1,v2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        btn = findViewById(R.id.btn_sum);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.valueOf(ed1.getText().toString());
                v2 = Double.valueOf(ed2.getText().toString());
                if(v1 == null && v2 == null){
                    Toast.makeText(addition.this, "Please input some value", Toast.LENGTH_SHORT).show();
                }
                else {
                    result = v1 + v2;
                    Toast.makeText(addition.this, "result" + result, Toast.LENGTH_SHORT).show();
                }
                finish();
            }
        });
    }
}