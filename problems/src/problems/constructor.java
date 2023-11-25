/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;
class User
{
  public int id;
  public String upwd;
  public User() // Non-parameterized constructor
  {
    id=444;
    upwd="12345";
  }
  public User(int x,String y)// Parameterized constructor
  {
   id=x;
   upwd=y;
  }
  public void display()
  {
   System.out.println(id+" "+upwd);
  }
}
class main15
{
  public static void main(String[] args)
  {
     User u1=new User();
     u1.display();
     User u2=new User();
     u2.display();
     User u3=new User(555,"Vivek");
u3.display();
     User u4=new User(777,"Jhon");
     u4.display();
  }
}