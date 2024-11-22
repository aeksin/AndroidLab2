package com.example.androidlab2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<AnimalInfo> animals = new ArrayList<AnimalInfo>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);
        AnimalAdapter animalAdapter = new AnimalAdapter(this, animals);
        recyclerView.setAdapter(animalAdapter);
    }

    private void setInitialData() {
        animals.add(new AnimalInfo("Собака", 10f, 0.6f, R.drawable.dog));
        animals.add(new AnimalInfo("Кошка", 4f, 0.24f, R.drawable.cat));
        animals.add(new AnimalInfo("Слон", 5000f, 3f, R.drawable.elephant));
        animals.add(new AnimalInfo("Жираф", 1000f, 4.5f, R.drawable.giraffe));
        animals.add(new AnimalInfo("Капибара", 45f, 0.5f, R.drawable.capybara));
        animals.add(new AnimalInfo("Лягушка", 0.1f, 0.05f, R.drawable.frog));
        animals.add(new AnimalInfo("Квокка", 2.5f, 0.4f, R.drawable.quokka));
        animals.add(new AnimalInfo("Олень", 100f, 1.2f, R.drawable.deer));
        animals.add(new AnimalInfo("Курица", 2f, 0.35f, R.drawable.chicken));
        animals.add(new AnimalInfo("Голубь", 0.5f, 0.2f, R.drawable.pigeon));
        animals.add(new AnimalInfo("Корова", 1.5f, 700f, R.drawable.cow));
        animals.add(new AnimalInfo("Лошадь", 500f, 4f, R.drawable.horse));
        animals.add(new AnimalInfo("Кролик", 3f, 0.3f, R.drawable.bunny));
        animals.add(new AnimalInfo("Бобр", 20f, 0.4f, R.drawable.bobr));
    }
}