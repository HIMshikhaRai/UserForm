package com.example.himshikha.userform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    DatabaseReference mRootRef;

    EditText radius,perimeter,area,concavity,concave_points;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Firebase.setAndroidContext(this);

        radius = (EditText)findViewById(R.id.radius);
        perimeter = (EditText)findViewById(R.id.perimeter);
        area = (EditText)findViewById(R.id.area);
        concavity = (EditText)findViewById(R.id.concavity);
        concave_points = (EditText)findViewById(R.id.concave_points);

        save = (Button)findViewById(R.id.button);
        

        mRootRef = FirebaseDatabase.getInstance().getReference().child("Users");

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

//        public void SaveData(){
//            String Radius = radius.getText().toString().trim();
//            String Perimeter = perimeter.getText().toString().trim();
//            String Area = area.getText().toString().trim();
//            String Concavity = concavity.getText().toString().trim();
//            String Concave_points = concave_points.getText().toString().trim();
//        }

    }
}
