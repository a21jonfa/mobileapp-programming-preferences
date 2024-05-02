package com.example.project;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    SharedPreferences.Editor preferencesEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button = findViewById(R.id.secondButton);
        EditText editText = findViewById(R.id.editTextText);
        preferencesEditor = getSharedPreferences("EditText", MODE_PRIVATE).edit();

        button.setOnClickListener(v -> {
            preferencesEditor.putString("EditText", editText.getText().toString());
            preferencesEditor.apply();
            finish();
        });
    }
}