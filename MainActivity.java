package invictus.it.solutions.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button plusOneButton;
    private TextView counter;
    private int current_count = 0;
    private Button plusFiveButton;
    private Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        plusOneButton = findViewById(R.id.plus_one_button);
        counter = findViewById(R.id.display_counter_text);
        counter.setText(current_count+"");
        plusFiveButton = findViewById(R.id.plus_five);
        reset = findViewById(R.id.reset);

        plusOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_count++;
                counter.setText(current_count+"");
            }
        });




        plusFiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_count+= 5;
                counter.setText(current_count+"");
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_count = 0;
                counter.setText(current_count+"");
            }
        });

    }


}
