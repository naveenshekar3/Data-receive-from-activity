package com.example.root.datareceivefromactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {


    private TextView output_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output_tv=(TextView)findViewById(R.id.output_tv);
    }



    public void goNext(View view) {
        Intent intent=new Intent(MainActivity.this,SecondScreen.class);
        startActivityForResult(intent,105);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==105)
        {
            if (resultCode==RESULT_OK)
            {
                Toast.makeText(this, data.getStringExtra("info"), Toast.LENGTH_SHORT).show();
            }
        }
    }
}
