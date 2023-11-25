public class Result {
int rollno,physics,chemistry,maths;
String name;

    public Result(int r,int p,int c,int m,String n) {
        this.rollno=r;
        this.physics=p;
        this.chemistry=c;
        this.maths=m;
        this.name=n;
    }
    public String toString(){
        if(physics<40 || chemistry<40 || maths<40)
            return String.format("rollno=%s,physics=%s,chemistry=%s,maths=%s,name=%s,result=%s",rollno,physics,chemistry,maths,name,"fail");
    else{
     return String.format("rollno=%s,physics=%s,chemistry=%s,maths=%s,name=%s,result=%s",rollno,physics,chemistry,maths,name,"Pass");
}
    }
    public static void main(String args[]){
          Result r=new Result(1,50,50,60,"anand"); 
          System.out.print(r);
        }
    }
