

import java.util.Scanner;

class Videos {
    String title;
    boolean[] flag = new boolean[3];
    float rating;

    public void checkedOut(String s) {
        if (flag[0] == true) {
            System.out.println("Video: " + s + " is being checked out.");
        }
    }

    public void returned(String s) {
        if (flag[1] == true) {
            System.out.println("Video: " + s + " is being returned.");
        }
    }

    public void receivingRating(String s) {
        if (flag[2] == true) {
            System.out.println("Video: " + s + " is receiving a rating.");
        }
    }
}


class VideoStore{
    Videos obj[] = new Videos[10];
    public void calculateAverageRating() {
        float sum = 0;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            if (obj[i] != null && obj[i].flag[0] == false) {
                sum += obj[i].rating;
                count++;
            }
        }

        if (count > 0) {
            float averageRating = sum / count;
            System.out.println("Average Rating: " + averageRating);
        } else {
            System.out.println("No videos available for calculating average rating.");
        }
    }


    public void addVideo(String s) {
        for (int i = 0; i < 10; i++) {
            if (obj[i] == null) {
                obj[i] = new Videos();
                obj[i].title = s;
                obj[i].flag[0] = false;
                obj[i].flag[1] = false;
                obj[i].flag[2] = false;
                obj[i].rating = 5;
                break;
            }
        }
    }

    public void checkOut(String s) {
        for (int i = 0; i < 10; i++) {
            if (obj[i] != null && obj[i].title.equals(s)) {
                obj[i].flag[0] = true;
                obj[i].checkedOut(s);
                break;
            }
        }
    }

    public void returnVideo(String s) {
        for (int i = 0; i < 10; i++) {
            if (obj[i] != null && obj[i].title.equals(s)) {
                obj[i].flag[1] = true;
                obj[i].flag[0] = false;
                obj[i].returned(s);
                break;
            }
        }
    }

    public void receiveRating(String s, float r) {
        for (int i = 0; i < 10; i++) {
            if (obj[i] != null && obj[i].title.equals(s)) {
                obj[i].flag[2] = true;
                obj[i].rating = (float) ((obj[i].rating + r) / 2.0);
                obj[i].receivingRating(s);
                break;
            }
        }
    }

    public void listInventory() {
        for (int i = 0; i < 10; i++) {
            if (obj[i] != null && obj[i].flag[0] == false) {
                System.out.println("Video Title: " + obj[i].title);
                System.out.println("Video Rating: " + obj[i].rating);
            }
        }
    }
}


public class movie_2java {
    public static void main(String[] args) {
        int choice;
        VideoStore v = new VideoStore();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("=========MAIN MENU=========");
            System.out.println("1. Add a video");
            System.out.println("2. Check out a video");
            System.out.println("3. Return a video");
            System.out.println("4. Rate a video");
            System.out.println("5. View Inventory");
            System.out.println("6. Exit and close");
            System.out.println("============================");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            String title;

            switch (choice) {
                case 1:
                    System.out.println("Enter the title of the video:");
                    title = sc.nextLine();
                    v.addVideo(title);
                    break;
                case 2:
                    System.out.println("Enter the title of the video:");
                    title = sc.nextLine();
                    v.checkOut(title);
                    break;
                case 3:
                    System.out.println("Enter the title of the video:");
                    title = sc.nextLine();
                    v.returnVideo(title);
                    break;
                case 4:
                    System.out.println("Enter the title of the video:");
                    title = sc.nextLine();
                    System.out.println("Enter your rating:");
                    int r = sc.nextInt();
                    v.receiveRating(title, r);
                    break;
                case 5:
                    v.listInventory();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Wrong Input..Try Again.");
            }
        } while (choice != 6);

        sc.close();
}
}
