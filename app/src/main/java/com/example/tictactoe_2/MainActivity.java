package com.example.tictactoe_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //board_1 b1=new board_1();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startMainActivity2(View view){
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }


        /*
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    FragmentManager fragmentManager=getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragmentContainerView,b1)
                            .setReorderingAllowed(true)
                            .addToBackStack(null)
                            .commit();
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }


        });


    }
         */

}