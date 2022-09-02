package jdbc;

import java.sql.Connection;

public class DMain07 {
    public static void main(String[] args) {

        //DBWork objesini oluştur.
        DBWork07 db = new DBWork07();

        //Connection methodunu çağır.
        Connection con = db.connect_to_db("techproed","postgres","142536ZeK.");

        //Yeni table oluşturma methodunu çağır.
        db.createTable(con,"employees");  //TABLE ADI



    }

}
