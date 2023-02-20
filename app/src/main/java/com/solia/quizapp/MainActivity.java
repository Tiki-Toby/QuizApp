package com.solia.quizapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wellcome_screen);

        textView = findViewById(R.id.welcome_text);
        editText = findViewById(R.id.input_name_field);
        button = findViewById(R.id.confirm_button);

        button.setOnClickListener(v -> textView.setText("Welcome " + editText.getText()));
    }
}
