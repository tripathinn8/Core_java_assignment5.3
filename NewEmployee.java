import java.util.*;
public class NewEmployee {
	int empId;
	String empName;
	int total_leaves=9;
	double total_salary;
	
	void calculate_balance_leaves(int no_of_leaves)
	{
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
	
	System.out.print("The salary is credited");}

}
