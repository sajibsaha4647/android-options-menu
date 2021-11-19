package com.example.myoptionsmew;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {



        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_layout, menu);

        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.menuid){
            if(item != null){
                Toast.makeText(MainActivity.this,"you selected setting",Toast.LENGTH_LONG).show();
            }
        }else if(item.getItemId() == R.id.shareid){
            if(item != null){
                Toast.makeText(MainActivity.this,"you selected share",Toast.LENGTH_LONG).show();
            }
        }else if(item.getItemId() == R.id.feedbackid){
            if(item != null){
                Toast.makeText(MainActivity.this,"you selected feedback",Toast.LENGTH_LONG).show();
            }
        }else if(item.getItemId() == R.id.aboutid){
            if(item != null){
                Toast.makeText(MainActivity.this,"you selected about",Toast.LENGTH_LONG).show();
            }
        }
        return super.onOptionsItemSelected(item);
    }
}