package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetById {
    public static String getQuizs() {
        try {
            String output = 
                    "<center>\n<table class=\" shadow-lg table table-striped table-hover \" border='1'>\n";
            output += "<tr><th>QNO </th><th>QUESTION </th><th>OPTION1 </th><th>OPTION2 </th><th>OPTION3 </th><th>OPTION4 </th><th>CORRECTOPTION </th></tr>\n";
            PreparedStatement ps = DbConnect.connect().prepareStatement("SELECT * FROM quiz WHERE QNO = 1");
                        ResultSet rs = ps.executeQuery();
            int count = 1;
            while (rs.next()) {
                String QNO = "" + rs.getObject("QNO");
                String QUESTION = "" + rs.getObject("QUESTION");
                String OPTION1 = "" + rs.getObject("OPTION1");
                String OPTION2 = "" + rs.getObject("OPTION2");
                String OPTION3 = "" + rs.getObject("OPTION3");
                String OPTION4 = "" + rs.getObject("OPTION4");
                String CORRECTOPTION = "" + rs.getObject("CORRECTOPTION");
                output += "<tr><td>" + count + " </td><td>" + QUESTION + " </td><td>" + OPTION1 + " </td><td>" + OPTION2 + " </td><td>" + OPTION3 + " </td><td>" + OPTION4 + " </td><td>" + CORRECTOPTION + " </td></tr>\n";

                count++;
            }
            output += "</table>\n</center>\n";
            return output;

        } catch (Exception ex) {
            System.out.println(ex);
            return "";
        }}
}
