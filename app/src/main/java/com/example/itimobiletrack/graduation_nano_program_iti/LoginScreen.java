package com.example.itimobiletrack.graduation_nano_program_iti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginScreen extends AppCompatActivity {


      private EditText mUsername, mPassword;
      private Button   mLogin   ,  mRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

         mRegister= (Button) findViewById(R.id.xRegisterButton);
         mUsername= (EditText) findViewById(R.id.xUsernameEditText);
         mPassword= (EditText) findViewById(R.id.xPasswordEditText);
         mLogin= (Button) findViewById(R.id.xLoginButton);


        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginScreen.this,RegisterScreen.class));
            }
        });


        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mUsername.getText().toString().equals("community")){
                    startActivity(new Intent(LoginScreen.this,HomeScreenForCommunity.class));
                }
                else if(mUsername.getText().toString().equals("restaurant"))
                    startActivity(new Intent(LoginScreen.this,RestaurantProfile.class));
                    }

        });







    }
}
