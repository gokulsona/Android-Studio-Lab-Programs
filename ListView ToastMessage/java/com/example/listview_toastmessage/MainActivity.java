package com.example.listview_toastmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listview;

    String names[] = {"Jhon", "Sam", "Jacob", "Mercy"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.listview);
        ArrayAdapter<String> arr;
        arr =new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, names);
        listview.setAdapter(arr);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if ( position == 0 )
                {
                    Toast.makeText(MainActivity.this, "Hello "+names[0], Toast.LENGTH_SHORT).show();
                } else if ( position == 1 ) {
                    Toast.makeText(MainActivity.this, "Hello "+names[1], Toast.LENGTH_SHORT).show();
                } else if ( position == 2 ) {
                    Toast.makeText(MainActivity.this, "Hello "+names[2], Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this, "Hello "+names[3], Toast.LENGTH_SHORT).show();
            }
        });
    }
}