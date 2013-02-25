package com.example.helloworld;
 
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
 
public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.Button01);
        button.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Hello World", Toast.LENGTH_SHORT).show();
            //HI THERE!!!
           }
         });        
    }
}