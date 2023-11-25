package packages;

import Package.Package1;

public class Package2 {
    String Address;
    int age;
    Package1 pac;

    public Package2(String Address,int age,Package1 pac) {
    this.Address=Address;
    this.age=age;
    this.pac=pac;
    }

    @Override
    public String toString() {
        return "Package2{" + "Address=" + Address + ", age=" + age + ", pac=" + pac + '}';
    }

   
    public static void main(String args[]){
        
        Package1 s=new Package1("annad",12,32,33);
        System.out.println(s);
        Package2 p=new Package2("Ashapur",23,s);
        System.out.println(p);
        
    }
}
