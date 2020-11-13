package Loops;

public class Fibonnacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a=0;
 int b=1;
 int fin;
 int prev = 0;
 int num=10;
 
 for(int i=0;i<num;i++)
 {
	 System.out.println(a);
	 prev = a+b;
	 a=b;
	 b=prev;
	 
 }
	}

}

