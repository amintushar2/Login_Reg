package com.example.amintushar.login_reg;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Sign_up extends AppCompatActivity {

    static  final String MY_PREF = "Name_Pref";
    Button signup;
    TextView logpage;
    EditText  personame,email, password, confirmpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signup = findViewById(R.id.signup2);
        logpage = findViewById(R.id.login);
//        personame=findViewById(R.id.personName);
//        email=findViewById(R.id.regemail);
//        password=findViewById(R.id.pass);
//        confirmpassword=findViewById(R.id.compass);


        logpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sign_up.this,Login_activity.class);
                startActivity(intent);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                String personname= personame.getText().toString();
//                String emailid = email.getText().toString();
//                String password1 = password.getText().toString();
//                String comPass = confirmpassword.getText().toString();
                Intent intent = new Intent(Sign_up.this, Login_activity.class);
                    startActivity(intent);


                          }
        });
    }


}