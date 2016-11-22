package application.unicef.com.sqlitedatabase;

import android.renderscript.ScriptIntrinsicYuvToRGB;

/**
 * Created by Bibesh on 11/21/16.
 */

public class DbConstant {

    public int VERSION_CODE=1;
    public String DB_NAME="student";
    public String DB_TABLE="student_table";
    public String CREATE_QUERY="CREATE TABLE "+DB_TABLE+" person varchar(255)";
    public String DELETE_QUERY="DROP TABLE IF EXISTS "+DB_NAME;

}
