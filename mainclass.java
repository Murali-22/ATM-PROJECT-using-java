package atmmachine;

import java.util.Scanner;

public class Mainclass {
	public static void main(String[] args) {
		AtmOperationInterf op=new AtmOperationImpl();
		int atmnumber=12345;
		int atmpin=123;
		System.out.println("Welcome to the JAVA ATM MACHINE");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Atm Number:");
			int atmNumber=sc.nextInt();
			System.out.println("Enter Atm Pin:");
			int pin=sc.nextInt();
			if((atmnumber==atmNumber)&&(atmpin==pin))
			{
				while(true)
				{
					
				System.out.println("1.VIEW BALANCE \n 2.WITHDRAW AMOUNT \n 3.DEPOSIT AMOUNT \n 4.VIEW MINISTATEMENT\n 5.EXIT");
				System.out.println("Enter choice: ");
				int ch=sc.nextInt();
				if(ch==1)
				{
					op.viewBalance();
					}
				else if(ch==2)
				{
					System.out.println("Enter amount to withdraw ");
					double withdrawAmount=sc.nextDouble();
					op.withdrawAmount(withdrawAmount);
				} 
				else if(ch==3)
					{
						System.out.println("Enter amount to Deposit: ");
						double depositAmount=sc.nextDouble();
						op.depositAmount(depositAmount);
					}
					else if(ch==4)
					{
						op.viewMiniStatement();
						}
					else if(ch==5)
					{
						System.out.println("Collect your ATM card \n Thank you for using ATM MACHINE!!! ");
						System.exit(0);
						}
					else
					{
							System.out.println("Please enter correct choice ");
					}
				}
				}
			
			else {
				System.out.println("Incorrect ATM Number4 or Pin");
				System.exit(0);
			}
		}
	}}