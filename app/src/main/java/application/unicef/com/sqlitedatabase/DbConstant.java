package application.unicef.com.sqlitedatabase;

import android.renderscript.ScriptIntrinsicYuvToRGB;

/**
 * Created by Bibesh on 11/21/16.
 */

public class DbConstant {

    public static int VERSION_CODE=1;
    public static String DB_NAME="student";
    public static String DB_TABLE="student_table";
    public static String columnName="Student_name";
    public static String CREATE_QUERY="CREATE TABLE "+DB_TABLE+"("+columnName+" varchar(255)); ";
    public static String DELETE_QUERY="DROP TABLE IF EXISTS "+DB_NAME;
}
