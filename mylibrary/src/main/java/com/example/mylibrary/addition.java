package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class addition extends AppCompatActivity {

    EditText ed1,ed2;
    Button btn,btn2;
    Double v1,v2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
        BindViews();
        AllClickListener();
    }

    private void BindViews() {
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        btn = findViewById(R.id.btn_sum);
        btn2 = findViewById(R.id.btn_finish);
    }

    private void AllClickListener() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().isEmpty() || ed2.getText().toString().isEmpty()){
                    Toast.makeText(addition.this, "Please input some value", Toast.LENGTH_SHORT).show();
                }
                else {
                    v1 = Double.valueOf(ed1.getText().toString());
                    v2 = Double.valueOf(ed2.getText().toString());
                    result = v1 + v2;
                    Toast.makeText(addition.this, "result" + result, Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(addition.this, "result" + result, Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}