import java.io.*;
import java.util.Scanner;

class Emply
{
  public static void main(String[] args)
  {
    input();

  }
  public static void input()
  {
    int id;
    double da,hra,pf,gross,hf,net,bp;
    String nam;

    System.out.println("ENTER YOUR NAME");
    Scanner n=new Scanner(System.in);
    nam=n.next();
    System.out.println("ENTER YOUR ID");
    id=n.nextInt();
    System.out.println("ENTER YOUR BASIC PAY");
    bp=n.nextInt();
    da=(0.85*bp);
    hra=(0.1*bp);
    pf=(0.12*bp);
    gross=(da+hra+pf);
    net=gross-bp;
    System.out.println("\n=============EMPLOYEE PAYROLE=============\n");
    System.out.println("EMPLOYEE NAME:"+nam+"\t EMPLOYEE ID:"+id);
    System.out.println("EMPLOYEE BASIC PAY:"+bp);
    System.out.println("EMPLOYEE DA:"+da);
    System.out.println("EMPLOYEE HRA:"+hra);
    System.out.println("EMPLOYEE PF:"+pf);
    System.out.println("EMPLOYEE GROSS:"+gross);
    System.out.println("EMPLOYEE NET:"+net);


  }

}
