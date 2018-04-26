package com.example.root.datareceivefromactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondScreen extends Activity {


    private EditText input_Edtv;
    private Button goback_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        goback_btn= (Button)findViewById(R.id.goback_btn);
        input_Edtv=(EditText)findViewById(R.id.input_Edtv);

    }



    public void sendBack(View view) {
        Intent i=new Intent();
        String info=input_Edtv.getText().toString();
        i.putExtra("info",info);
        setResult(RESULT_OK,i);
    }
}
