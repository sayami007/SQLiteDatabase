package application.unicef.com.sqlitedatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText text1;
    Button b1, b2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.save);
        b2 = (Button) findViewById(R.id.show);
        text1 = (EditText) findViewById(R.id.editText);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        textView = (TextView) findViewById(R.id.textView);
    }

    @Override
    public void onClick(View view) {
        if (view == b1)
            Toast.makeText(getApplicationContext(), "SDf", Toast.LENGTH_LONG).show();
        else if (view == b2)
            Toast.makeText(getApplicationContext(), "Button 2 ", Toast.LENGTH_LONG).show();
    }
}
