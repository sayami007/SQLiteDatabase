package application.unicef.com.sqlitedatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Bibesh on 11/22/16.
 */

public class DbAdapter {
    public DbHelper helper;
    public Context ctx;
    public SQLiteDatabase db;

    public DbAdapter(Context ctx) {
        helper = new DbHelper(ctx);
        db = helper.getWritableDatabase();
    }

    public void insert(ContentValues cv) {
        db.insert(DbConstant.DB_TABLE, null, cv);
    }

    public Cursor getData() {
        String[] col = new String[]{"Student_name"};
        return db.query(DbConstant.DB_TABLE, col, null, null, null, null, null);
    }

}
