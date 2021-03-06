package com.example.template;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.template.fragments.FragmentOne;
import com.example.template.fragments.FragmentThree;
import com.example.template.fragments.FragmentTwo;
import com.example.template.handlers.FragmentHandler;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mBottomNavigationView;
    private FragmentHandler mFragmentHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupBottomNavBar();
    }

    private void setupBottomNavBar(){
        mBottomNavigationView = findViewById(R.id.bottom_navigation);
        mFragmentHandler = new FragmentHandler(this);
        setOnBottomMenuItemClick();
        mBottomNavigationView.setSelectedItemId(R.id.bottom_navigation_1);
    }

    private void setOnBottomMenuItemClick() {
        //Opsætning af menu --> Hvad skal der ske når man klikker på de forskellige
        mBottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.bottom_navigation_1:
                                mFragmentHandler.startTransactionWithBackStack(new FragmentOne());
                                break;
                            case R.id.bottom_navigation_2:
                                mFragmentHandler.startTransactionWithBackStack(new FragmentTwo());
                                break;
                            case R.id.bottom_navigation_3:
                                mFragmentHandler.startTransactionWithBackStack(new FragmentThree());
                        }
                        return true;
                    }
                });
    }

}
