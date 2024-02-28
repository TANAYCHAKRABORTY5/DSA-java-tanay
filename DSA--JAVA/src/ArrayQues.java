import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employ {
    private final String Empname;
    private final int Emno;
    private final String Joindate;
    private final char Dcode;
    private final String Dept;
    private final int Basic;
    private final int HRA;
    private final int IT;

    Employ(int emno, String empname, String joindate, char dcode, String dept, int basic, int hra, int it) {
        Empname = empname;
        Emno = emno;
        Joindate = joindate;
        Dcode = dcode;
        Dept = dept;
        Basic = basic;
        HRA = hra;
        IT = it;
    }

    public char getDcode() {
        return Dcode;
    }

    public int getBasic() {
        return Basic;
    }

    public int getHRA() {
        return HRA;
    }

    public int getIT() {
        return IT;
    }

    public int getEmno() {
        return Emno;
    }

    public String getEmpname() {
        return Empname;
    }

    public String getDept() {
        return Dept;
    }

    public String getJoindate() {
        return Joindate;
    }
}

public class ArrayQues {

    public static int calculateSalary(int basic, int hra, int it, int da) {
        return basic + hra + da - it;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Employ[] allEmp = {
                new Employ(1001, "tanay", "01/04/2009", 'e', "R&D", 20000, 8000, 3000),
                new Employ(1002, "tanay", "23/08/2012", 'c', "PM", 30000, 12000, 9000),
                new Employ(1003, "tanay", "12/11/2008", 'k', "Acct", 10000, 8000, 1000),
                new Employ(1004, "Chaht", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000),
                new Employ(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000),
                new Employ(1006, "anshuman", "1/1/2000", 'e', "Manufacturing", 23000, 9000, 4400),
                new Employ(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000)
        };

        Map<Character, Integer> empMap = new HashMap<>();
        empMap.put('e', 20000);
        empMap.put('c', 32000);
        empMap.put('k', 12000);
        empMap.put('r', 15000);
        empMap.put('m', 40000);

        Map<Character, String> tt = new HashMap<>();
        tt.put('e', "Tanay");
        tt.put('c', "Consultant");
        tt.put('k', "Clerk");
        tt.put('r', "Receptionist");
        tt.put('m', "Manager");

        System.out.println("Enter Emp No :- ");
        int empno = in.nextInt();

        Employ curr = findEmployee(allEmp, empno);

        if (curr != null) {
            int DaValue = empMap.get(curr.getDcode());
            int salary = calculateSalary(curr.getBasic(), curr.getHRA(), curr.getIT(), DaValue);

            System.out.println("EmpNo " + curr.getEmno());
            System.out.println("EmpName " + curr.getEmpname());
            System.out.println("Department " + curr.getDept());
            System.out.println("Designation " + tt.get(curr.getDcode()));
            System.out.println("Salary " + salary + "\n\n\n");

            System.out.println("Tanay Chakraborty 21bcs5063");
        } else {
            System.out.println("There is no employee with EmpNo " + empno);
        }
    }

    private static Employ findEmployee(Employ[] allEmp, int empno) {
        for (Employ employ : allEmp) {
            if (empno == employ.getEmno()) {
                return employ;
            }
        }
        return null;
    }
}
