
package components;

import database.DbConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Utilities {
public static String getProductList()
{
try
{
    String output="<table class='table table-striped table-hover'>\n";
    PreparedStatement ps=DbConnect.connect().prepareStatement("select PRODUCTNAME  ,PRICE	,DESCRIPTION,	DISCOUNT,	UNITOFMEASUREMENT,	PRODUCTCATEGORY  from products order by productid desc");
    output+="<tr><th>Product Name</th><th>Price</th><th>Description</th><th>Discount</th><th>Unitofmeasurement</th><th>Productcategory</th></tr>";
    ResultSet rs=ps.executeQuery();
    while(rs.next())
    {
         
        String productname="" + rs.getObject("productname");
        String price=""+rs.getObject("price");
        String description="" +rs.getObject("description");
        String discount=""+rs.getObject("discount");
        String unitofmeasurement=""+rs.getObject("unitofmeasurement");
        String productcategory=""+rs.getObject("productcategory");
        output+="<tr><td>" + productname + "</td><td>"+price +"</td><td>"+description+"</td><td>"+discount+"</td><td>"+unitofmeasurement+"</td><td>"+productcategory+"</td></tr>";
   
    }
    output+="</table>\n";
    return output;
}
catch(Exception ex)
{
    System.out.println(ex);
    return "";
}
}
}