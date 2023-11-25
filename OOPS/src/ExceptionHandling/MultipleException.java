package ExceptionHandling;
public class MultipleException {
public static void main(String args[]){
    try{
        int n=10;
 n=n/n;
 int [] a={};
 a[5]=10;

    }
    catch(NullPointerException ex){
        System.out.println("found a null value");
    }
    catch(ArithmeticException ex){
        System.out.println(ex);
        
    }
    catch(ArrayIndexOutOfBoundsException ex){
        System.out.println(ex);
        
    }
    catch(Exception ex){
        System.out.println("Unknown error");
    }
}    
}
