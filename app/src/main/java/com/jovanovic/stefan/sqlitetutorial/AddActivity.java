package com.jovanovic.stefan.sqlitetutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    EditText pid_input, preid_input,doc_input, name_input,address_input,contact_input,nic_input;
    Button add_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        pid_input = findViewById(R.id.pid_input);
        preid_input = findViewById(R.id.preid_input);
        doc_input = findViewById(R.id.doc_input);
        name_input = findViewById(R.id.name_input);
        address_input = findViewById(R.id.address_input);
        contact_input = findViewById(R.id.contact_input);
        nic_input = findViewById(R.id.nic_input);
        add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(AddActivity.this);
                myDB.addMedi(pid_input.getText().toString().trim(),
                        preid_input.getText().toString().trim(),doc_input.getText().toString().trim(),
                        name_input.getText().toString().trim(),address_input.getText().toString().trim(),
                        address_input.getText().toString().trim(),
                        Integer.valueOf(nic_input.getText().toString().trim()));
            }
        });
    }
}
