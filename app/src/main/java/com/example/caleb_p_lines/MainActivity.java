package com.example.caleb_p_lines;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        Button calcBtn = (Button) findViewById(R.id.calcBtn);
        calcBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                TextView slopeView = (TextView) findViewById(R.id.slope);
                TextView yView = (TextView) findViewById(R.id.y_axis);

                double slope =((getY2()-getY1())/(getX2()-getX1()));
                double b = (getY1()-(slope*getX1()));
                slopeView.setText("m=" + slope +" ");
                yView.setText("b=" + b + "");


            }
        });
    }
    private double getX1(){
        EditText X1 = (EditText) findViewById(R.id.X1);
        return Double.parseDouble(X1.getText().toString());
    }
    private double getX2(){
        EditText X2 = (EditText) findViewById(R.id.X2);
        return Double.parseDouble(X2.getText().toString());
    }
    private double getY1(){
        EditText Y1 = (EditText) findViewById(R.id.Y1);
        return Double.parseDouble(Y1.getText().toString());
    }
    private double getY2(){
        EditText Y2 = (EditText) findViewById(R.id.Y2);
        return Double.parseDouble(Y2.getText().toString());
    }

}
