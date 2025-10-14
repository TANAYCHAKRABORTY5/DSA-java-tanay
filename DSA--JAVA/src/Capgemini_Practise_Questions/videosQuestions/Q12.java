package Capgemini_Practise_Questions.videosQuestions;


class InvalidDayException extends Exception {
    public InvalidDayException (String str){
        super(str);
    }

}
class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String str) {
        super(str);
    }
}

class SalaryData{
    String name;
    int daysInMonth;
    double salary;

    SalaryData(String name,int daysInMonth,double salary){
        this.name = name;
        this.daysInMonth= daysInMonth;
        this.salary = salary;
    }


}

class Validator{
    public static String validateSalaryData(SalaryData s) throws Exception{
        int days = s.daysInMonth;
        double salary = s.salary;

        if(days != 28 && days!= 30 && days!=31){
            throw new InvalidDayException("Invalid Days");
        }
        if (salary < 0 || salary > 1000000) {
            throw new InvalidSalaryException("Invalid Salary");
        }

        return "Valid data";
    }

    public static double getTotalSalary(SalaryData s){
        try {
            String result = validateSalaryData(s);
            if(result.equals("Valid Data")){
                return s.daysInMonth * s.salary;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return 0.0;
    }
}



public class Q12 {
    public static void main(String[] args) {
        SalaryData s1 = new SalaryData("Tanay", 30, 2000);
        SalaryData s2 = new SalaryData("XYZ", 29, 2000);
        SalaryData s3 = new SalaryData("ABC", 31, 20000000);

        System.out.println("Total Salary s1: " + Validator.getTotalSalary(s1));
        System.out.println("Total Salary s2: " + Validator.getTotalSalary(s2));
        System.out.println("Total Salary s3: " + Validator.getTotalSalary(s3));


    }
}
