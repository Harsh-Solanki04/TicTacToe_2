package com.example.tictactoe_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
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

        findViewById(R.id.start3x3Button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startMainActivity2(view);
            }
        });
        findViewById(R.id.start4x4Button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startMainActivity3(view);
            }
        });
        findViewById(R.id.start5x5Button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startMainActivity4(view);
            }
        });


    /*
    private void loadGameFragment(){
        FragmentManager fm=getSupportFragmentManager();
        Fragment gameFragment =fm.findFragmentById(R.id.fragmentContainerView);
        if(gameFragment==null){
            fm.beginTransaction().add(R.id.fragmentContainerView,b1).commit();
        }

     */

        /*
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainerView,gameFragment);
        transaction.addToBackStack(null);
        transaction.commit();
         */
    }
    public void startMainActivity2(View view){
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
    public void startMainActivity3(View view){
        Intent intent=new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void startMainActivity4(View view){
        Intent intent=new Intent(this, MainActivity4.class);
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