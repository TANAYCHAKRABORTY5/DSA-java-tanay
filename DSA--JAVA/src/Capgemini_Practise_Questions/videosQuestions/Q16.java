package Capgemini_Practise_Questions.videosQuestions;

class Candidate{
    String name;
    int totalRating;
    int totalContest;

    Candidate(String name,int totalRating,int totalContest){
        this.name=name;
        this.totalRating = totalRating;
        this.totalContest = totalContest;
    }
}

class Validator2  {
    public String eligible(Candidate details) throws CriteriaMismatch{
        if(details.totalRating < 1000){
            throw new CriteriaMismatch("minimum 1000 total rating is required");
        }

        if(details.totalContest < 10){
            throw new CriteriaMismatch("minimum 10 contest participation is required");
        }
        return "eligible candidate";
    }

    public String sendInvite(Candidate details) throws  Exception{
        try{
            eligible(details);
            return "Invitation send";

        }catch (CriteriaMismatch e){
            return "candidate is not eligible";
        }catch (Exception e){
            return " Other exception";
        }

//        return "Invitation send";
    }
}

class CriteriaMismatch extends Exception{
    CriteriaMismatch(String msg){
        super(msg);
    }
}



public class Q16 {
    public static void main(String[] args) {
        Validator2 v = new Validator2();

        Candidate c1 = new Candidate("Tanay", 1200, 15);
        Candidate c2 = new Candidate("Ravi", 800, 12);
        Candidate c3 = new Candidate("Ankit", 1100, 5);


        try {
            System.out.println(v.sendInvite(c1)); // Invitation send
            System.out.println(v.sendInvite(c2)); // candidate is not eligible
            System.out.println(v.sendInvite(c3)); // candidate is not eligible
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
