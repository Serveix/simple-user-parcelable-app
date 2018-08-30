package com.mistareastecmi.eli.myuserapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mistareastecmi.eli.myuserapp.models.User;

public class MainActivity extends AppCompatActivity {

    EditText mNames;
    EditText mLastnames;
    EditText mAge;
    Button mGoBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNames      = (EditText)findViewById(R.id.names);
        mLastnames  = (EditText)findViewById(R.id.names);
        mAge        = (EditText)findViewById(R.id.names);
        mGoBtn      = (Button)findViewById(R.id.goBtn);
    }

    public void goStudent(View v){
        // Se crea la instancia del usuario parcelable
        User user = new User(mNames.getText().toString(), mLastnames.getText().toString(),
                                Integer.parseInt(mAge.getText().toString()));

        // Se crea el intent para abrir la segunda activity
        Intent intent = new Intent(getBaseContext(), DisplayActivity.class);

        // Se le pasa informacion parcelable del usuario a la segunda activity
        intent.putExtra("user",user);

        // Se abre la segunda activity
        startActivity(intent);
    }
}
