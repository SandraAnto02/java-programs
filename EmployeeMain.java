import java.util.Scanner;

class Employee
{
	int id;
	String name;
	double sal;
    
    Employee(int id,String name,double sal)
    {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
}
public class EmployeeMain{
    static int length = 10;
    static Employee employees[] = new Employee[20];

    public static int doesEmployeeExist(int id)
    {
        for(int i=0;i<length;i++)
        {
            if (employees[i].id == id)
            {
                return i;
            }
        }
        return -1;
    }
    public static void create(String name,double salary)
    {
        int next_id = employees[length-1].id+1;
        employees[length] = new Employee(next_id,name,salary);
        System.out.println("Created Employee");
        display(length);
        length++;
    }
    public static void update(int id,String name,double salary)
    {
        int n = doesEmployeeExist(id);
        if(n==-1)
        {
            System.out.println("Employee details doesn't exists");
        }
        else
        {
            employees[n].name = name;
            employees[n].sal= salary;
            System.out.println("Updated Employee details are:");
            display(n);
        }
    }
    public static void search(int id)
    {
        int n = doesEmployeeExist(id);
        if(n==-1)
        {
            System.out.println("Employee details does not exists");
        }
        else
        {
            display(n);
        }
        
    }
    public static void display()
    {
        for(int i=0;i<length;i++)
        {
            display(i);
        }
    }
    public static void delete(int id)
    {
        int n = doesEmployeeExist(id);
        if(n==-1)
        {
            System.out.println("Employee details doesnt exists");
        }
        else
        {
            System.out.println("Deleted Employee");
            display(n);
            for(int i=n;i<length-1;i++)
            {
                employees[i] = employees[i+1];
                
            }
            length--;
        }

        
    }
    public static void display(int n)
    {
        System.out.println("Employee id : "+employees[n].id);
        System.out.println("Employee Name : "+employees[n].name);
        System.out.println("Employee salary : "+employees[n].sal);
        System.out.println();

    }
	public static void main(String args[])
	{
        
		Scanner sc = new Scanner(System.in);
        System.out.println("***** Employee Record *****");
        
        // initializing 10 employee data
        employees[0] = new Employee(101,"Monica",20000.0);
  		employees[1] = new Employee(102,"Helen",10000.0);
		employees[2] = new Employee(103,"Mary",25000.0);
		employees[3] = new Employee(104,"Xavi",15000.0);
		employees[4] = new Employee(105,"Veronica",15600.0);
		employees[5] = new Employee(106,"Antony",20090.0);
		employees[6] = new Employee(107,"Metilda",21050.0);
		employees[7] = new Employee(108,"Gokul",30000.0);
		employees[8] = new Employee(109,"Sathya",50670.0);
		employees[9] = new Employee(110,"Aditya",56000.0);
        
        int flag = 1;
        do {
            int id;
            String name;
            double sal;
            System.out.println("Enter 1 to create Employee details");
            System.out.println("Enter 2 to update Employee details");
            System.out.println("Enter 3 to search Employee details");
            System.out.println("Enter 4 to display all the Employee details");
            System.out.println("Enter 5 to delete Employee details");
            System.out.println("Enter 6 to exit");
            System.out.println("Enter your option: ");

        
            int num = sc.nextInt();
            switch(num)
            {
                case 1 : 
                    System.out.println("Enter Employee Name: ");
                    name = sc.next();
                    System.out.println("Enter Employee Salary: ");
                    sal = sc.nextDouble();
                    create(name,sal);
                    break;
                case 2 :
                    System.out.println("Enter Employee Id :");
                    id = sc.nextInt();
                    System.out.println("Enter Employee Name : ");
                    name = sc.next();
                    System.out.println("Enter Employee Salary : ");
                    sal = sc.nextDouble();
                    update(id,name,sal);
                    break;
                case 3 :
                    System.out.println("Enter Employee Id :");
                    id = sc.nextInt();
                    search(id);
                    break;
                case 4 :
                    display();
                    break;
                case 5 :
                    System.out.println("Enter Employee Id :");
                    id = sc.nextInt();
                    delete(id);
                    break;
                case 6 :
                    flag=0;
                    break;

                default:
                    System.out.println("Invalid number");
            }
        }while(flag==1);

        

		
	}
}