
package components;

import database.DbConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectBoxes {
    public static String getNewReceiptId()
    {
        try
        {
            PreparedStatement ps=DbConnect.connect().prepareStatement("select max(reciptno) from purchase");
            ResultSet rs=ps.executeQuery();
            rs.next();
            String s="" + rs.getObject(1);
            return s;
        }
        catch(Exception ex)
        {
            //Some Changes
            System.out.println(ex);
            return "-1";
        }
    }
public static String getProductsList(String selector,String name)
{
    try
    {
        String output="<select name='" + name + "'>\n";
        
            PreparedStatement ps=DbConnect.connect().prepareStatement("select*from products order by productname");
            ResultSet rs=ps.executeQuery();
             while(rs.next())
                {
                String productid="" + rs.getObject("productid");
                String productname=""+rs.getObject("productname");
                if(productid.equals(selector))
                    output+="<option selected value='" + productid + "'>" + productname + "</option>\n";
                else
              output+="<option value='" + productid + "'>" + productname + "</option>\n";
                }
             output+="</select>\n";
             return output;
    }
    
    catch(Exception ex)
    {
        System.out.println(ex);
        return "";
    }
}
}