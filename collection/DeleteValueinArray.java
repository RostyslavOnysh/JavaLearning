package collection;

public class DeleteValueinArray {
    public static void main(String[] args) {
        String[] employees = {
                "Ros",
                "Alona",
                "Sasha",
                "Dima",
                "Grubyi"
        };
        String[] secemployees = new String[employees.length + 1];
        for (int i = 0; i < employees.length; i++) {
            secemployees[i] = employees[i];
        }


        secemployees[secemployees.length - 1] = "Ivan";
        employees = secemployees;
        employees[1] = null;
        String[] newNames = new String[employees.length - 1];
        for (int i = 0,j = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                newNames[j] = employees[i];
              j++;
            }
        }
        employees = newNames;
        for (String name : employees) {
            System.out.println(name);
        }
    }
}
