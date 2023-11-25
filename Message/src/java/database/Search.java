package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Search {
    public static String getList(String messagefrom) {
        try {
            String output = "<center><table class='table table-striped table-hover'>\n";
            PreparedStatement ps = DbConnect.connect().prepareStatement("select * from message where msgfrom=?");
            ps.setString(1, messagefrom);
            ResultSet rs = ps.executeQuery();
            int count = 0;
            output += "<tr><th>sno</th><th>message</th><th>msgfrom</th><th>msgto</th></tr>\n";
            while (rs.next()) {
                count++;
                String sno = "" + rs.getObject("sno");
                String message = "" + rs.getObject("message");
                String msgfrom = "" + rs.getObject("msgfrom");
                String msgto = "" + rs.getObject("msgto");
                output += "<tr><td>" + count + "</td><td>" + message + "</td><td>" + msgfrom + "</td><td>" + msgto + "</td></td></tr>\n";
            }
            output += "</table></center>\n";
            return output;
        } catch (Exception ex) {
            System.err.println(ex);
            return "";
        }}}