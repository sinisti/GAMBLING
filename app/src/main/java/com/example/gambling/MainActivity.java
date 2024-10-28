package com.example.gambling;
import static java.lang.Math.random;
import android.os.Bundle;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
    private TextView Kostka1;
    private int random1 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Kostka1 = findViewById(R.id.Kostka1);
        random1 = (int)(Math.random() * 6 + 1);

        Kostka1.setText(Integer.toString(random1));
    }
}