package com.pixellato.sofa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeText(View view){
        int sum = calculateSum(2, 2);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Changed Text to Sum = "+ sum);
    }

    public static int calculateSum(int a, int b){
        return (a + b);
    }
}
