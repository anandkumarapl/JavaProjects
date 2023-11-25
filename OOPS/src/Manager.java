public class Manager extends Employee{
    String Department;
    Employee secretry;
    public Manager(String C, int c, String n, String a, int age,Employee sec,String d) {
        super(C, c, n, a, age);
        Department=d;
        secretry=sec;
    }
    public String toString(){
    return super.toString()+"Department="+Department+"secretry"+secretry;
}
    public static void main(String args[]){
        Employee e1=new Employee("India",91,"Joseph Bhardwaj","Purapar",30);
        System.out.println(e1);
         Manager e=new Manager("India",91,"Joseph Bhardwaj","Purapar",30,e1,"mbda");
         System.out.println(e);
    }
}
