import java.util.*;

class Driver{
    int id;
    String status;
    Driver(int id,String status){
        this.id = id;
        this.status = status;
    }
}
public class DriverUber {
    public static void main(String[] args) {
        List<Driver> ls = new ArrayList<>(
                Arrays.asList(new Driver(1,"busy"),
                        new Driver(2,"busy"),
                        new Driver(3,"rejected"),
                        new Driver(4,"free"),
                        new Driver(5,"busy"),
                        new Driver(6,"rejected"))
        );
        // id: String:
        Set<Integer> mpp = new HashSet<>();

        for(Driver driver : ls){
            if(driver.status.equals("rejected") || driver.status.equals("busy")){
                mpp.add(driver.id);
            }
        }

        allocateDrivers(ls,mpp);
    }

    public static void  allocateDrivers(List<Driver> ls,Set<Integer> mpp){
        Random rand = new Random();
        while(true){
            System.out.println("Checking for any available drivers");
            boolean foundDriver = false;
            for(Driver driver : ls){
                if(driver.status.equals("free") && !mpp.contains(driver.id)){
                    System.out.println("Your Driver is found... Driver id is: "+ driver.id);
                    foundDriver = true;
                }
            }
            if(!foundDriver){
                System.out.println("Driver not found Checking again in 2min ..........");
            }

            try{
                Thread.sleep(2000);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }



            for(Driver d : ls){
                if(d.status.equals("busy")){
                    if(rand.nextBoolean()){
                        d.status = "free";
                        System.out.println("🚖 Driver " + d.id + " is now available!");

                    }
                }
            }

        }
    }
}
