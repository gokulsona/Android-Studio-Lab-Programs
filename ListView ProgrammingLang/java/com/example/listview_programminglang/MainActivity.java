package com.example.listview_programminglang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    String Language[] = {"C", "Java", "Python"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.listview);
        ArrayAdapter<String> arr = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, Language);
        listview.setAdapter(arr);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            if ( position == 0 ) {
                //Intent intent = new Intent(getApplicationContext(), ClassName.class);
                Intent intent = new Intent(getApplicationContext(), Clanguage.class);
                startActivity(intent);
            } else if ( position == 1) {
                Intent intent = new Intent(getApplicationContext(), Javalanguage.class);
                startActivity(intent);

            } else if ( position == 2 ) {
                Intent intent = new Intent(getApplicationContext(), Pythonlanguage.class);
                startActivity(intent);
            } else{
                Toast.makeText(MainActivity.this, "", Toast.LENGTH_LONG).show();//Nothing to show
            }
            }
        });
    }
}