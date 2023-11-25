
package AbstractClass;
public abstract class TaxableProduct {
    public abstract int getQuantity();
    public abstract double getTax();
    public abstract String getDescription();
}
abstract class Dhroti extends TaxableProduct{
private int quantity;
 Dhroti(int quantity){
    this.quantity=quantity;
}

    @Override
    public String toString() {
        return "Dhroti{" + "quantity=" + quantity + '}';
    }
public int getQuantity(){
    return quantity;
} 
public static void main(String args[]){
    
}
}
