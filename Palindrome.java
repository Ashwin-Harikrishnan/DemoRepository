package Loops;

public class PalindromeFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num = 1211;
	int rev=0;
	int org=num;
	int rem;
	for(;num!=0;num /=10) {
	
		rem = num%10;
		rev = rev*10+rem;
		
}
	
	if(org==rev)
	{
		System.out.println("Yes this number is a palindrome");
	}
	else
	{
		System.out.println("No this is not a palindrome");
	}
	}

}
