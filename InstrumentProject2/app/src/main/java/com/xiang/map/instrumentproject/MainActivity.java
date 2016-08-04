package com.xiang.map.instrumentproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Button bnt;
    MyCustomView custom_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et= (EditText) findViewById(R.id.et);
        bnt= (Button) findViewById(R.id.bnt);
        custom_view = (MyCustomView) findViewById(R.id.custom_view);
        bnt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                et.setText("80");
                custom_view.setSocre(Integer.valueOf(et.getText().toString()));
            }
        });
    }
}
