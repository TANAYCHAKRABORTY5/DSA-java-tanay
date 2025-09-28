package Capgemini_Practise_Questions.videosQuestions;





class InvalidCodeException extends Exception{
    public InvalidCodeException(String msg){
        super(msg);
    }
}

class Repository{
    static String getCountryName (String countryCode) throws InvalidCodeException{

        int code = Integer.parseInt(countryCode);
        if(code >=70 && code <=90){
            return "India";
        }else if(code == 908){
            return "US";
        }else if(code == 11){
            return "Dial somewhere outside of USA";
        }else{
            throw new InvalidCodeException("No country with the given code found");
        }


    }
}

class RepositoryImplementation{
    public static String getCountry(String countryCode) throws InvalidCodeException{
        if(countryCode.length() > 3 || countryCode.length() <2){
            throw new InvalidCodeException("Invalid code detail found");
        }

        return Repository.getCountryName(countryCode);
    }
}


public class Q5 {
    public static void main(String[] args) {
        try {
            System.out.println(RepositoryImplementation.getCountry("75"));   // India
            System.out.println(RepositoryImplementation.getCountry("908"));  // US
            System.out.println(RepositoryImplementation.getCountry("011"));  // Dial somewhere outside of USA
            System.out.println(RepositoryImplementation.getCountry("1234")); // Exception: Invalid code detail found
        } catch (InvalidCodeException e) {
            System.out.println(e.getMessage());
        }
    }
}
