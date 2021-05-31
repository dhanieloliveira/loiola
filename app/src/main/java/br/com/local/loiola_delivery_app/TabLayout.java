package br.com.local.loiola_delivery_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

public class TabLayout extends AppCompatActivity {
    com.google.android.material.tabs.TabLayout tabLayout;
    ViewPager2 pager2;
    FragmentoAdaptador adaptador;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        tabLayout = findViewById(R.id.tab_layout);
        pager2 = findViewById(R.id.view_pager2);

        FragmentManager fm = getSupportFragmentManager();
        adaptador = new FragmentoAdaptador(fm, getLifecycle());
        pager2.setAdapter(adaptador);

        tabLayout.addTab(tabLayout.newTab().setText("Informações"));
        tabLayout.addTab(tabLayout.newTab().setText("Sobre Nóis"));
        tabLayout.addTab(tabLayout.newTab().setText("São Paulo Campeão"));

        tabLayout.addOnTabSelectedListener(new com.google.android.material.tabs.TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(com.google.android.material.tabs.TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(com.google.android.material.tabs.TabLayout.Tab tab) {

            }
        });

        }
    }