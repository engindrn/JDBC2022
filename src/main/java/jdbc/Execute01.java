package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1.ADIM: Driver a kaydol
        Class.forName("org.postgresql.Driver");

        //2.ADIM:Database e bağlan                     //jdbc API adresi//               //database ismi//
       Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/techproed","postgres","142536ZeK.");
        //getConection method u Connection data type döndürdüğü için bunu Connection data tipinde bir variable koyduk


        //3. Adım: Statement oluştur. Bunun için yukarda oluşturduğumuz connectionu kullanacağız
        Statement st= con.createStatement();    //bununla query lerimizi çalıştırıyoruz

        //4. Adım: Query çalıştır.



        //1.Örnek: "workers" adında bir table oluşturup "worker_id,worker_name, worker_salary" sütunlarını ekleyin.

      // st.execute("CREATE TABLE workers(worker_id VARCHAR(50), worker_name VARCHAR(50), worker_salary INT)");
        // method içine uzun bişey yazılması tavsiye edilemz bu yüzden sql mesajımızı String bir variable atayacağız

        String sql1 = "CREATE TABLE workers(worker_id VARCHAR(50), worker_name VARCHAR(50), worker_salary INT)";
        boolean result =  st.execute(sql1);    //execute methodu boolean sonuç döner. denemek için boolean bir variable koyduk
        System.out.println(result);//False return yapar, çünkü data çağrılmadı. sadece sql de table oluşturuldu

        //her çalıştırmada yeniden table oluşturmaya çalışacağı için hata verir pgAdminden tabloyu sil drop yap


        //2.Örnek: Table'a worker_address sütunu ekleyerek alter yapın.
        String sql2 = "ALTER TABLE workers ADD worker_address VARCHAR(80)";
        st.execute(sql2);


        //3.Örnek: Drop workers table
        String sql3 = "DROP TABLE workers";
        st.execute(sql3);


        //5. Adım: Bağlantı ve Statement'ı kapat. API ile bağlantı gitti
        con.close();
        st.close();
    }
}
