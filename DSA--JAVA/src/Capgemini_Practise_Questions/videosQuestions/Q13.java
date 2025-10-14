package Capgemini_Practise_Questions.videosQuestions;

class Rating{
    int imdbRating;
    int nominee;

    Rating(int imdbRating,int nominee){
        this.imdbRating = imdbRating;
        this.nominee= nominee;
    }
}

class Validator1 {
    public  String canBeConsideredForTheAward  (Rating rating) throws Exception {
        int imdbRating = rating.imdbRating;
        int nominee = rating.nominee;

        if(imdbRating < 7){
            throw  new MovieRatingException("Movie not eligible for award");
        }

        if(nominee <4){
            throw new MovieRatingException("Minimum 4 nominee required");
        }

        return "Considered for the award";

    }

    public String sendInvite(Rating rating){
        try{
//            int nominee =rating.nominee;
            String considered = canBeConsideredForTheAward(rating);
            return "Actors and Directors Invited";

        }catch (MovieRatingException e){
            return "Not invited";
        }catch (Exception e){
            return "Other exception";
        }

    }

}

class MovieRatingException extends  Exception{
    public MovieRatingException(String msg){
        super(msg);
    }
}


public class Q13 {
    public static void main(String[] args) {
        Validator1 validator = new Validator1();

        Rating r1 = new Rating(8, 5); // eligible
        Rating r2 = new Rating(6, 5); // imdb < 7
        Rating r3 = new Rating(8, 2); // nominee < 4

        System.out.println(validator.sendInvite(r1)); // Actors and Directors Invited
        System.out.println(validator.sendInvite(r2)); // Not invited
        System.out.println(validator.sendInvite(r3)); // Not invited
    }
}
