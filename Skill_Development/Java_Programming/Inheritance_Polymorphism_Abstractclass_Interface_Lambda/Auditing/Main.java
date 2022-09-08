import java.util.ArrayList; 
import java.util.HashMap; 
import java.util.Map; 
import java.util.Scanner; 
import java.util.Map. Entry;

public class Main {
    private static Map <string, Double> employeeMap = new HashMap<>();
    //Getter & Setter public Map<String, Double> get Employeemap() {
    return employeeMap;
    public void setEmployeeMap (Map<String, Double> employeeMap) {
    this.employeeMap = employeeMap;
    //Method public void addEmployeeDetails(String employeeName, double salary)
    {
        employeeMap.put(employeeName, salary);
        public static EmployeeAudit findEmployee()
        Employee Audit emp=X ->{
            ArrayList<String> s = new ArrayList<>(); 
            for(Entry<string, Double> entry: employeeMap.entryset())
            {
                if(entry.getValue()<=x) {
                    s.add(entry.getKey();
                }
            }
        }
        return s;
    };
    return emp;
}

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in); 
        boolean flag = true; 
        while(flag){
            System.out.println("1. Add Employee Details"); 
            System.out.println("2. Find Employee Details"); 
            System.out.println("3. Exit");
            
            System.out.println("Enter the choice"); 
            int choice = sc.nextInt(); 
            switch(choice)
            {
            case 1: System.out.println("Enter the Employee name"); 
            String name = sc.next(); 
            System.out.println("Enter the Employee Salary"); 
            double sal = sc.nextDouble(); 
            Main ob = new Main(); 
            ob.addEmployeeDetails(name, sal); 
            break;
            
            case 2: System.out.println("Enter the salary to be searched");
            double sall = sc.nextDouble(); 
            Employee Audit empaudit = findEmployee(); 
            ArrayList<String> list = empaudit.fetchEmployeeDetails(sall); 
            if(list.isEmpty())
                System.out.println("No Employee Found"); 
            else {
                System.out.println("Employee List"); 
                for(int i=0; i<list.size(); i++){
                    System.out.println(list.get(i));
                }
            }
            break;
            
            case 3: System.out.println("Let's complete the session"); 
            flag = false; 
            break;
            }
        }
    }
}
