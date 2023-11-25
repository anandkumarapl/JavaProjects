package database;

import databasepackage.DbConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class getbooking {
    public static String getbookinglist() {
        try {
            String output = "<center>\n<table class=\" shadow-lg table table-striped table-hover \" border='1'>\n";
            output += "<tr><th>SNo </th><th>MOBILENO </th><th>BOOKINGDATE </th><th>OTP </th></tr>\n";
            PreparedStatement ps = DbConnect.connect().prepareStatement("select   sno,mobileno,sysdate,otp from booking order by sno desc");
                        ResultSet rs = ps.executeQuery();
            int count = 1;
            while (rs.next()) {
                String sno = "" + rs.getObject("sno");
                String mobileno = "" + rs.getObject("mobileno");
                String bookingdate = "" + rs.getObject("bookingdate");
                String otp = "" + rs.getObject("otp");
                output += "<tr><td>" + count + " </td><td>" + mobileno + " </td><td>" + bookingdate + " </td><td>" + otp + " </td><center><i class=\"fa fa-edit  fa-solid\"></i></center></a></td></tr>\n";

                count++;
            }
            output += "</table>\n</center>\n";
            return output;

        } catch (Exception ex) {
            System.out.println(ex);
            return "";
        }}
}