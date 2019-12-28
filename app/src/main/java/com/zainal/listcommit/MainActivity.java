package com.zainal.listcommit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Collection;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Pahlawan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_pahlawan);
        recyclerView.setHasFixedSize(true);

        list.addAll(getListPahlawan());
        showRecyclerView();


    }


     ArrayList<Pahlawan> getListPahlawan() {
        String[] dataName = getResources().getStringArray(R.array.data_name);
        String[] dataDescription = getResources().getStringArray(R.array.data_description);
        String[] dataPhoto = getResources().getStringArray(R.array.data_photo);

         ArrayList<Pahlawan> listpahlawan = new ArrayList<>();
         for (int i = 0; i < dataName.length; i++) {
             Pahlawan pahlawan = new Pahlawan();
             pahlawan.setName(dataName[i]);
             pahlawan.setDiscription(dataDescription[i]);
             pahlawan.setPhoto(dataPhoto[i]);

             listpahlawan.add(pahlawan);
         }

        return listpahlawan;

    }
    private void showRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdapterPahlawan adapterPahlawan = new AdapterPahlawan(list);
        recyclerView.setAdapter(adapterPahlawan);
    }




}
