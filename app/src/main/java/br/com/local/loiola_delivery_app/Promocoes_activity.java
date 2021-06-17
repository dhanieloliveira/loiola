package br.com.local.loiola_delivery_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Promocoes_activity extends AppCompatActivity {

    Button btnPromoções;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promocoes);

        btnPromoções = findViewById(R.id.btnPromoções);

        btnPromoções.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(), Promocoes_activity.class));
            }
        });
    }
}