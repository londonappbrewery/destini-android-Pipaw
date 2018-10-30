package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mTextView;
    Button mButtonTop;
    Button mButtonDown;
    int watcher = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView = findViewById(R.id.storyTextView);
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonDown  = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(watcher == 1 || watcher == 2){
                    mTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonDown.setText(R.string.T3_Ans2);
                    watcher = 5;
                }
                else if(watcher == 5){
                    mTextView.setText(R.string.T6_End);
                    mButtonTop.setVisibility(View.INVISIBLE);
                    mButtonDown.setVisibility(View.INVISIBLE);
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(watcher == 1){
                    mTextView.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonDown.setText(R.string.T2_Ans2);
                    watcher = 2;
                }
                else if(watcher == 2){
                    mTextView.setText(R.string.T4_End);
                    mButtonTop.setVisibility(View.INVISIBLE);
                    mButtonDown.setVisibility(View.INVISIBLE);
                }
                //for left side
                else if(watcher == 5){
                    mTextView.setText(R.string.T5_End);
                    mButtonTop.setVisibility(View.INVISIBLE);
                    mButtonDown.setVisibility(View.INVISIBLE);
                }

            }
        });
    }

}
