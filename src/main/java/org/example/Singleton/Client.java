package org.example.Singleton;

public class Client {
    public static void main(String[] args) {
//        DBConn db1= new DBConn();
//        DBConn db2= new DBConn();
//        System.out.println("db1 " + db1);
//        System.out.print("db2 " + db2); SAME ADDRESS OUTPUTT



//        DBConn db1= DBConn.getInstance();
//        DBConn db2= DBConn.getInstance();
//        System.out.println("db1 " + db1);
//        System.out.print("db2 " + db2); // ADDRESS WILL BE SAME FOR BOTH DB1 AND DB2

//        DBConn db1= DBConn.SingleThread();
//        DBConn db2= DBConn.SingleThread();
//        System.out.println("db1 " + db1);
//        System.out.print("db2 " + db2);


        DBConn db1= DBConn.MultiThread();
        DBConn db2= DBConn.MultiThread();
        System.out.println("db1 " + db1);
        System.out.print("db2 " + db2);

    }
}
