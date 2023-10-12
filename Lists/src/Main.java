import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        System.out.print("How many employees will be registered? ");
        Integer i = sc.nextInt();
        sc.nextLine();
        Employee person = new Employee();
        for (int x = 0; x < i; x++) {
            System.out.println("Employee #" + (x + 1) + ":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            person = new Employee(id, name, salary);
            list.add(person);
            System.out.println();
        }
        System.out.print("Enter the employee id that will have salary increase: ");
        Integer id = sc.nextInt();
        Integer pos = position(list, id);
        if (pos == null){
            System.out.println("This ID does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            Double percentage = sc.nextDouble();
            list.get(pos).increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee run : list) {
            System.out.println(run);
        }
    }
    static Integer position(List<Employee>list, int id){
        for(int i=0; i<list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}


//
//        System.out.println(list.size());
//
//        for(String person : list){
//            System.out.println(person);
//        }
//        System.out.println("-------------------------------");
//        list.removeIf(x -> x.charAt(0) == 'M');
//        for(String person : list){
//            System.out.println(person);
//        }
//        System.out.println("-------------------------------");
//        System.out.println("Index of Marco: " + list.indexOf("Marco"));
//        System.out.println("-------------------------------");
//        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
//        for(String person: result){
//            System.out.println(person);
//        }
//        System.out.println("-------------------------------");
//        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
//        System.out.println(name);
//    }
//}