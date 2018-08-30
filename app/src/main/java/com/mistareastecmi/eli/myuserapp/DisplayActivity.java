package com.mistareastecmi.eli.myuserapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mistareastecmi.eli.myuserapp.models.User;

import org.w3c.dom.Text;

public class DisplayActivity extends AppCompatActivity {

    TextView mNames;
    TextView mLastnames;
    TextView mAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        User user = getIntent().getParcelableExtra("user");

        mNames = (TextView)findViewById(R.id.names);
        mLastnames = (TextView)findViewById(R.id.lastnames);
        mAge = (TextView)findViewById(R.id.age);

        if(user != null){
            mNames.setText("Nombres: " + user.names);
            mLastnames.setText("Apellidos:" + user.lastnames);
            mAge.setText("Edad:" + Integer.toString(user.age));
        }
    }
}
