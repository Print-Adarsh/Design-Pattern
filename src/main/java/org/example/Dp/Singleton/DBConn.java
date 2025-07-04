package org.example.Dp.Singleton;

public class DBConn {
    private static DBConn INSTANCE = null;
     String url;
     String username;
    String pwd;

    public DBConn() {

    }
    public static DBConn getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DBConn();
        }
        return INSTANCE;
    }

    // SINGLE THREAD
    public static DBConn SingleThread()
    {
        if(INSTANCE == null){
            return INSTANCE = new DBConn();
        }
        return INSTANCE;
    }

    //multithread
    public static DBConn MultiThread(){
        if(INSTANCE == null){
            synchronized (DBConn.class) {
                if(INSTANCE == null){
                    INSTANCE = new DBConn();
                }
            }
        }
        return INSTANCE;
    }
}
