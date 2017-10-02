package com.jimmy.centralmarket;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ItemDescription extends AppCompatActivity {
    private static final String TAG = "ItemDetailActivity";
    FragmentManager fm;
    FragmentTransaction ft;
    private Context context;
    String userschoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_description);
        context=ItemDescription.this;

        userschoice =getIntent().getStringExtra("choice");
        Log.d(TAG, "onCreate: users choice"+userschoice);

        fm=getSupportFragmentManager();
        ft=fm.beginTransaction();

        if(userschoice.equals("fruits")){
            Fragment f =new FruitsFragment();
            ft.replace(R.id.itmd,f);
            ft.commit();
        }
        if(userschoice.equals("clothes")){
            Fragment f =new ClothesFragment();
            ft.replace(R.id.itmd,f);
            ft.commit();
        } if(userschoice.equals("fish")){
            Fragment f=new FishFragment();
            ft.replace(R.id.itmd,f);
            ft.commit();
        } if(userschoice.equals("shoes")){
            Fragment f=new ShoesFragment();
            ft.replace(R.id.itmd,f);
            ft.commit();
        }

    }
}