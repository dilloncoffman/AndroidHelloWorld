package edu.temple.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewToChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewToChange = findViewById(R.id.textViewToChange);

        findViewById(R.id.clickButton)
                .setOnClickListener(new View.OnClickListener() {
                    // Change text with id of textViewToChange on click
                    @Override
                    public void onClick(View v) {
                        textViewToChange.setText("You have clicked the button");
                    }
                });
    }
}
