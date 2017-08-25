import java.util.*;
public class TemporaryEmp extends PermanentEmp{

	void calculate_balance_leaves(int no_of_leaves)
	{
		System.out.println();
		total_leaves=total_leaves-no_of_leaves;
	}
	boolean avail_leave(int no_of_leaves, char type_of_leave)
	{
		if (total_leaves >= no_of_leaves)
		{
		System.out.print("Leave granted");
		calculate_balance_leaves(no_of_leaves);
		return true;
		}
	else 
	{
		System.out.print("Not enough leaves");
		return false;
	}
	}
	void calculate_salary()
	{
		Scanner digi= new Scanner(System.in);
		System.out.println("Enter the basic and hra");
		basic=digi.nextInt();
		hra=digi.nextInt();
		pfa=0.5*basic;
		total_salary=basic+hra-pfa;
		System.out.println("The salay is: "+total_salary);
	}
	public static void main(String args[])
	{
		TemporaryEmp obj1=new TemporaryEmp();
		obj1.print_leave_details();
		obj1.avail_leave(10, 'C');
		System.out.println();
		obj1.calculate_salary();
	}
}
