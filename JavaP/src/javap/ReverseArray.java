package javap;
public class ReverseArray {
    public static void main(String args[]){
  String str[]={"Hello"};
  String rev="";
  for(int i=0;i<=str[0].length()-1;i++){
      rev=str[0].charAt(i)+rev;
  }
        System.out.println(rev);       
    }
}
