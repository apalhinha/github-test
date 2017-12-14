package info.trustzone.githubtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Comment 1
    // A second comment that will disappear
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        TextView textView = findViewById(R.id.textView);
        //textView.setText( "Bye");
        startActivity(intent);
    }
}
