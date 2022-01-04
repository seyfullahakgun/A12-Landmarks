package com.example.landmarks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.example.landmarks.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    ArrayList<Landmarks> landmarksArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarksArrayList = new ArrayList<>();

        // Data
        Landmarks assos = new Landmarks("Assos Antik Kenti", "Behramkale", R.drawable.assos);
        Landmarks abide = new Landmarks("Sehitler Abidesi", "Gelibolu", R.drawable.abide);
        Landmarks bridge = new Landmarks("Canakkale 1919 Koprusu", "Lapseki", R.drawable.bridge);
        Landmarks ida = new Landmarks("Kaz Daglari", "Bayramic", R.drawable.ida);
        Landmarks troy = new Landmarks("Truva Antik Kenti", "Ezine", R.drawable.troy);

        landmarksArrayList.add(assos);
        landmarksArrayList.add(abide);
        landmarksArrayList.add(bridge);
        landmarksArrayList.add(ida);
        landmarksArrayList.add(troy);
        
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerLandmarkAdapter landmarkAdapter = new RecyclerLandmarkAdapter(landmarksArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);

    }
}