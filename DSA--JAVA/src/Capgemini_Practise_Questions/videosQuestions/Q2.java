package Capgemini_Practise_Questions.videosQuestions;


class SpeedInvalidException extends Exception{
    public SpeedInvalidException(String msg){
        super(msg);
    }
}

class CarSpeed{
    String speed;
}

class CarSpeedImplementation{
    public String setCarSpeed(CarSpeed sp,int spd){
        try {
            if(spd < 30 || spd > 60){
                throw new SpeedInvalidException("Exception in Speed Validation");
            }else{
                sp.speed = "valid";
            }
        } catch (Exception e) {
            sp.speed = e.getMessage();
        }

        return sp.speed;

    }
}



public class Q2 {

    public static void main(String[] args) {
        CarSpeed s = new CarSpeed();
        CarSpeedImplementation car = new CarSpeedImplementation();

        System.out.println(car.setCarSpeed(s,25));
        System.out.println(car.setCarSpeed(s,50));
        System.out.println(car.setCarSpeed(s,100));
    }
}
