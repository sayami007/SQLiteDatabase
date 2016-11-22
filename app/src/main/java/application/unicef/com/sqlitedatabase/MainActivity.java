package application.unicef.com.sqlitedatabase;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
        if (view == b1) {
            String[] values = {"Bibesh"};
            ContentValues cv = new ContentValues();
            for (int i = 0; i < values.length; i++) {
                cv.put(DbConstant.columnName, values[i]);
                DbAdapter adap = new DbAdapter(this);
                adap.insert(cv);
                Toast.makeText(getApplicationContext(), "DONE", Toast.LENGTH_LONG).show();
            }
        } else if (view == b2) {
            DbAdapter adapter = new DbAdapter(this);
            Cursor c = adapter.getData();
            String[] studentName = new String[c.getCount()];
            int i=0;
            while(c.moveToNext()){
                studentName[i]=c.getString(c.getColumnIndex(DbConstant.columnName));
                i++;
            }
            for(int j=0;j<studentName.length;j++){
                Log.v("Name",studentName[j]);
            }
        }
    }
}
