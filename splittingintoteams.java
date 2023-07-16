package Jayasrijavapractice;
import java.util.Scanner;
public class splittingintoteams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          int numberofstudents=sc.nextInt();
          int numberofteams=sc.nextInt();
          int team=numberofstudents/numberofteams;
          int helpers=numberofstudents%numberofteams;
          System.out.println("The number of students in each team is "+team+" and left out is "+helpers);
          sc.close();
	}

}
