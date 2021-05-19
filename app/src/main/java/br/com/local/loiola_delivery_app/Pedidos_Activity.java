package br.com.local.loiola_delivery_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pedidos_Activity extends AppCompatActivity {

    Button btnFacaPedidos, btnMeusPedidos, btnInformacoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pedidos_layout);

        btnFacaPedidos = findViewById(R.id.btnfazerpedido);
        btnMeusPedidos = findViewById(R.id.btnMeusPedidos);
        btnInformacoes = findViewById(R.id.btnInformacoes);


        btnMeusPedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MeusPedidos_Activity.class));
            }
        });

        btnFacaPedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), FacaPedidos_Activity.class));
            }
        });

        btnInformacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Informacoes_Activity.class));
            }
        });

    }
}