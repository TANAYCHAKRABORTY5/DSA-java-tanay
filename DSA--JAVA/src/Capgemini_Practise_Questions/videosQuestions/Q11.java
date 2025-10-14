package Capgemini_Practise_Questions.videosQuestions;



class Person1{
    String name;
    String dateOfBirth;
    String email;

    public Person1(String name,String dateOfBirth, String email){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }


    public Person1() {

    }
}


class InvalidDateException extends  Exception{
    public InvalidDateException(String str){
        super(str);
    }
}

class InvalidEmailException extends  Exception{
    public InvalidEmailException(String str){
        super(str);
    }

}




class Implementations{
    public String validator(Person1 details) throws Exception{
        //dd-mm--yyyy
        String dob = details.dateOfBirth;

        String[] parts = dob.split("-");
        if(parts.length == 3){

            int year = Integer.parseInt(parts[2]);
            if(year >= 2000){
                throw new InvalidDateException("date year must be less than 2000");
            }
        }else{
            throw new InvalidDateException("Invalid date formate");
        }

        if(!details.email.endsWith("@doselect.com")){
            throw new InvalidEmailException("Email error");
        }

        return "Valid Details";
    }

    public String submitDetails(Person1 details) {
        try {
            String result = validator(details);
            if (result.equals("valid details")) {
                return "details submitted successfully";
            }

        }catch (InvalidDateException | InvalidEmailException e){
            return "invalid details";

        }catch (Exception e) {
            return "other exception";
        }

        return "other exception";
    }
}



public class Q11 {

    public static void main(String[] args) {
        Person1 p1 = new Person1("John", "15-08-1999", "john@doselect.com");
        Person1 p2 = new Person1("Alice", "10-05-2005", "alice@gmail.com");

        Implementations impl = new Implementations();

        System.out.println(impl.submitDetails(p1));
        System.out.println(impl.submitDetails(p2));
    }
}
