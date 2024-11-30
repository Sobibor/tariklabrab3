package com.example.tariklabrab3;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Установка системных отступов
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Связываем элементы интерфейса
        TextView textView = findViewById(R.id.textView);
        Button buttonShowCapital = findViewById(R.id.buttonShowCapital);
        Button buttonShowTown = findViewById(R.id.buttonShowTown);

        // Создаем объекты городов
        Capital capital = new Capital("Москва", 13_149_000, "Россия");
        Town town = new Town("Мегион", 52_887, true);

        // Обработчики кнопок
        buttonShowCapital.setOnClickListener(v -> {
            textView.setText("Столица: " + capital.getName() + "\n"
                    + "Население: " + capital.getPopulation() + "\n"
                    + "Страна: " + capital.getCountry());
        });

        buttonShowTown.setOnClickListener(v -> {
            textView.setText("Город: " + town.getName() + "\n"
                    + "Население: " + town.getPopulation() + "\n"
                    + "Наличие колледжа: " + (town.isHasUniversity() ? "Да" : "Нет"));
        });
    }
}
