package br.com.local.loiola_delivery_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerPizza_Activity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[],s3[];
    int images [] = {R.drawable.mussarela, R.drawable.marguerita, R.drawable.quatroqueijos,
    R.drawable.bacon, R.drawable.calabresa, R.drawable.baiana,
    R.drawable.americana, R.drawable.bauru, R.drawable.portuguesa,
    R.drawable.peperoni, R.drawable.lombo, R.drawable.peru, R.drawable.nordestina,
    R.drawable.atum, R.drawable.camarao, R.drawable.escarola, R.drawable.brocolis,
    R.drawable.palmito, R.drawable.frangocatupiry, R.drawable.pizzamodadacasa};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_pizza);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.NomePizzas);
        s2 = getResources().getStringArray(R.array.DescricaoPizzas);
        s3 = getResources().getStringArray(R.array.ValoresPizzas);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, s3, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}