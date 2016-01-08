package model.backend;
import android.content.Context;

public final class BackendFactory {
    static Backend instance = null;
    public static String mode = "lists";

    public final static Backend getInstance(Context context) {
        if (mode == "lists") {
            if (instance == null)
                instance = new model.datasource.DatabaseList();
            return instance;
        }
        /*
        if (mode == "sql") {
            if (instance == null)
                instance = new model.datasource.DatabaseSqlite(context);
            return instance;
        }
        if (mode == "Service") {
            if (instance == null)
                instance = new model.datasource.DatabeseService();
            return instance;
        }
        */
        else {
            return null;
        }

    }
}