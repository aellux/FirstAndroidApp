package com.example.helloworld;
// First android app tutorial
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick (View view){
        TextView txtHello = findViewById(R.id.txtMessage); //Creates access to the text message in the middle of the app
        EditText edtTxtName = findViewById(R.id.edtTxtName);
        txtHello.setText("Hello " + edtTxtName.getText().toString() + "!"); //Sets the text to from Hello world to Hello after clicking the button/ Gets the user input and converts to string to be able to use
        // You can click on design, on the right of xml file and change the type of user input: password, plaintext etc
        // When you click on the text, you can change the text -> hint so the user can see the outline of suggested input ex. Enter Name
    }
}