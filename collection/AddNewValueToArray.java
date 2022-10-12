package collection;

public class AddNewValueToArray {
    public static void main(String[] args) {
        String[] employees = {"Ros",
                "Alona",
                "Sasha",
                "Dima",
                "Grubyi"
        };
        String[] secemployees = new String[employees.length+1];
        for (int i = 0; i < employees.length; i++) {
            secemployees[i]=employees[i];
        }
secemployees[secemployees.length-1] = "Ivan";
        employees = secemployees;



        for (String name : employees) {
            System.out.println(name);
        }
    }
}
