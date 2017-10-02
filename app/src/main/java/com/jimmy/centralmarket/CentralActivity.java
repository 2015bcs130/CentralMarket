package com.jimmy.centralmarket;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class CentralActivity extends AppCompatActivity {
    String[] items={"fruits","clothes","shoes","fish"};

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=CentralActivity.this;


        int configuration=getResources().getConfiguration().orientation;
        if(configuration== Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.potrait);
            ListView listView= (ListView) findViewById(R.id.list);

            ListAdapter adapter=new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,items);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                RelativeLayout rel1= (RelativeLayout) findViewById(R.id.fruitsmain);
                RelativeLayout rel2= (RelativeLayout) findViewById(R.id.clothesmain);
                RelativeLayout rel3 = (RelativeLayout) findViewById(R.id.fish);
                RelativeLayout rel4 = (RelativeLayout) findViewById(R.id.shoes);


                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String user_chose=String.valueOf(parent.getItemAtPosition(position));
                    switch (user_chose){
                        case "fruits":

                            rel1.setVisibility(View.VISIBLE);
                            rel2.setVisibility(View.INVISIBLE);
                            rel3.setVisibility(view.INVISIBLE);
                            rel4.setVisibility(view.INVISIBLE);

                            break;
                        case "clothes":

                            rel1.setVisibility(View.INVISIBLE);
                            rel2.setVisibility(View.VISIBLE);
                            rel3.setVisibility(view.INVISIBLE);
                            rel4.setVisibility(view.INVISIBLE);
                            break;
                        case "fish":

                            rel1.setVisibility(View.INVISIBLE);
                            rel2.setVisibility(View.INVISIBLE);
                            rel3.setVisibility(view.VISIBLE);
                            rel4.setVisibility(view.INVISIBLE);
                            break;
                        case "shoes":

                            rel1.setVisibility(View.INVISIBLE);
                            rel2.setVisibility(View.INVISIBLE);
                            rel3.setVisibility(view.INVISIBLE);
                            rel4.setVisibility(view.VISIBLE);
                            break;

                    }
                }
            });

        }
        else if(configuration== Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.landscape);
            ListView listView= (ListView) findViewById(R.id.list);

            ListAdapter adapter=new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,items);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                RelativeLayout rel1= (RelativeLayout) findViewById(R.id.fruitsmain);
                RelativeLayout rel2= (RelativeLayout) findViewById(R.id.clothesmain);
                RelativeLayout rel3 = (RelativeLayout) findViewById(R.id.fish);
                RelativeLayout rel4 = (RelativeLayout) findViewById(R.id.shoes);


                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String user_chose=String.valueOf(parent.getItemAtPosition(position));
                    switch (user_chose){
                        case "fruits":

                            rel1.setVisibility(View.VISIBLE);
                            rel2.setVisibility(View.INVISIBLE);
                            rel3.setVisibility(view.INVISIBLE);
                            rel4.setVisibility(view.INVISIBLE);

                            break;
                        case "clothes":

                            rel1.setVisibility(View.INVISIBLE);
                            rel2.setVisibility(View.VISIBLE);
                            rel3.setVisibility(view.INVISIBLE);
                            rel4.setVisibility(view.INVISIBLE);
                            break;
                        case "fish":

                            rel1.setVisibility(View.INVISIBLE);
                            rel2.setVisibility(View.INVISIBLE);
                            rel3.setVisibility(view.VISIBLE);
                            rel4.setVisibility(view.INVISIBLE);
                            break;
                        case "shoes":

                            rel1.setVisibility(View.INVISIBLE);
                            rel2.setVisibility(View.INVISIBLE);
                            rel3.setVisibility(view.INVISIBLE);
                            rel4.setVisibility(view.VISIBLE);
                            break;

                    }
                }
            });
        }
    }
}
