package com.example.seventhque;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.opions_menu,menu);
        return super.onCreateOptionsMenu(menu);
        
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch(item.getItemId())
        {
            case R.id.item1: 
                Toast.makeText(this, "selected"+item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
                
            case R.id.item2:
                Toast.makeText(this, "selected"+item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
                
        }
        return super.onOptionsItemSelected(item);
    }
}
