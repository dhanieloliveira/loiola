package br.com.local.loiola_delivery_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FacaPedidos_Activity extends AppCompatActivity {



    Button btnPizzaG;


    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.faca_pedidos_layout);

        btnPizzaG = findViewById(R.id.btnPizzaG);

        btnPizzaG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), RecyclerPizza_Activity.class));
            }
        });






    }
}