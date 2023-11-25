public class Employee extends People{
    String Country;
    int code;
    public Employee(String C,int c,String n, String a, int age) {
        super(n, a, age);
        Country=C;
        code=c;
    }
    public String toString(){
        return super.toString()+","+"Country="+Country+","+"code="+code+"";
    }
    public static void main(String args[]){
        Employee e=new Employee("India",91,"Anand","Paigamberpur",23);
        System.out.println(e);
        People p=new People("Joseph Bhardwaj","Bhagwanpur",30);
        System.out.println(p);
        
    }
}
