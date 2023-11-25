package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Utilities {
    public static String getTodoList() {
        try {
            String output = "<center>\n<table class=\" shadow-lg table table-striped table-hover \" border='1'>\n";
            output += "<tr><th>sno </th><th>message </th><th>msgfrom </th><th>msgto </th></tr>\n";
            PreparedStatement ps = DbConnect.connect().prepareStatement("select * from message");
                        ResultSet rs = ps.executeQuery();
            int count = 1;
            while (rs.next()) {
                String message = "" + rs.getObject("message");
                String msgfrom = "" + rs.getObject("msgfrom");
                String msgto = "" + rs.getObject("msgto");
           
                output += "<tr><td>" + count + " </td><td>" + message + " </td><td>" + msgfrom + " </td><td>" + msgto + " </td></tr>\n";

                count++;
            }
            output += "</table>\n</center>\n";
            return output;

        } catch (Exception ex) {
            System.out.println(ex);
            return "";
        }}
}