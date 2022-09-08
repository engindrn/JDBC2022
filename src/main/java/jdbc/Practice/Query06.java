package jdbc.Practice;

import static jdbc.Practice.DatabaseUtilty06.*;

public class Query06 {
    public static void main(String[] args) {

        createConnection();                 //hazır connection methodumuzu çağırdık tüm bağlantı işlemlerimizi yaptık

        String query= "select * from ogrenciler";

        System.out.println("sutun isimleri :"+getColumnNames(query));   //methodumuzu çağırdık parametremizi girdik

        System.out.println("Okul No: "+getColumnData(query,"okul_no"));
        System.out.println("Ogrenci ismi : "+getColumnData(query,"ogrenci_ismi"));
        System.out.println("Sınıf : "+getColumnData(query,"sinif"));
        System.out.println("Cinsiyet : "+getColumnData(query,"cinsiyet"));
    }
}
