package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;
    private TextView greetingTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView headingTextView = findViewById(R.id.headingTextView);
        TextView instructionsTextView = findViewById(R.id.instructionsTextView);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        greetingTextView = findViewById(R.id.greetingTextView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();

                String greeting = "Hello, " + name + "!";
                greetingTextView.setText(greeting);
            }
        });


    }
}
