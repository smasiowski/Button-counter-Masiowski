package com.introtoandroid.button_counter_masiowski;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * AUTHOR: Sarah Masiowski
 * ASSIGNMENT: Button Counter App   [for more info: see README]
 * DUE DATE: February 2nd
 */

public class MainActivity extends AppCompatActivity {

    // VARIABLE DECLARATIONS
    Button increment_button;
    Button decrement_button;
    Button clear_button;
    TextView counter;
    int counterValue = 0;


    // ONCREATE----------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        increment_button = (Button)findViewById(R.id.increment_button);
        decrement_button = (Button)findViewById(R.id.decrement_button);
        clear_button = (Button)findViewById(R.id.clear_button);
        counter = (TextView)findViewById(R.id.counter);

    }

    /**
    public void increment(View v){
        counterValue ++;
        counter.setText(Integer.toString(counterValue));

    }

    public void decrement(View v){
        counterValue --;
        counter.setText(Integer.toString(counterValue));

    }

    public void clear(View v){
        counterValue = 0;
        counter.setText(Integer.toString(counterValue));

    }
*/

    // ONCLICK-----------------------------------------------------------------
    public void onClick(View view) {

        if (view == increment_button){
            counterValue++;
            counter.setText(Integer.toString(counterValue));
        }

        else if (view == decrement_button){
            counterValue--;
            counter.setText(Integer.toString(counterValue));
        }

        else if (view == clear_button){
            counterValue = 0;
            counter.setText(Integer.toString(counterValue));
        }
    }



}
