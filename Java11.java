//INCAPSULATION
//using of get elemnt .
//class ATM {
//    private int TotalBalance = 10000;
//
//    public void getTotalBalance() {
//        System.out.println("Total Balance: " + TotalBalance);
//    }
//
//    public void setTotalBalance(int amount) {
//        if (amount > 0) {
//            TotalBalance += amount;
//            System.out.println("Amount " + TotalBalance + " is now Balance");
//        }
//    }
//    public void setBalance(int amount) {
//        if(amount<=TotalBalance) {
//            TotalBalance -= amount;
//            System.out.println("Amount " + TotalBalance + " is now Balance");
//        }
//
//
//    }
//}
//public class Java11 {
//    public static void main(String[] args) {
//        ATM atm = new ATM();
//        atm.getTotalBalance();
//        atm.setTotalBalance(1000);
//       atm.setBalance(1000);
//    }
//}
//YOUTUBE CHANNEL CONCEPT
//import java.util.Scanner;
//
//class YouTube {
//    private String CorrectPassword = "1234";
//    private String channelName;
//    private int subscriberCount;
//
//    // Constructor
//    public YouTube(String channelName) {
//        this.channelName = channelName;
//        this.subscriberCount = 0;
//    }
//
//    // Password checking method
//    public boolean login(String password) {
//        if (password.equals(CorrectPassword)) {
//            System.out.println("Login Successful!");
//            return true;
//        } else {
//            System.out.println("Wrong Password! Access Denied.");
//            return false;
//        }
//    }
//
//    public String getName() {
//        System.out.println("YouTube Channel Name: " + channelName);
//        return channelName;
//    }
//
//    public int getSubscriberCount() {
//        System.out.println("YouTube Subscriber Count: " + subscriberCount);
//        return subscriberCount;
//    }
//
//    public void setSubscriberCount(int subscriberCount) {
//        this.subscriberCount = subscriberCount;
//        System.out.println("Updated Subscriber Count: " + subscriberCount);
//        checkPrize();
//    }
//
//    public void setUnSubscriberCount(int count) {
//        if (count > 0) {
//            this.subscriberCount -= count;
//            if (subscriberCount < 0) {
//                subscriberCount = 0;
//            }
//            System.out.println("Subscribers Removed! New Count: " + subscriberCount);
//        } else {
//            System.out.println("Invalid number!");
//        }
//        checkPrize();
//    }
//
//
//    public void increaseSubscriberCount() {
//        this.subscriberCount += 1;
//        System.out.println("Updated Subscriber Count: " + subscriberCount);
//        checkPrize();
//    }
//
//    public void decreaseSubscriberCount() {
//        this.subscriberCount -= 1;
//        if (subscriberCount < 0) subscriberCount = 0;
//
//        System.out.println("Updated Subscriber Count: " + subscriberCount);
//        checkPrize();
//    }
//
//    // Prize based on subscriber count
//    public void checkPrize() {
//        if (subscriberCount >= 10000000) {
//            System.out.println("Prize: 🟦 **Diamond Play Button**");
//        } else if (subscriberCount >= 1000000) {
//            System.out.println("Prize: 🟨 **Gold Play Button**");
//        } else if (subscriberCount >= 100000) {
//            System.out.println("Prize: ⚪ **Silver Play Button**");
//        } else {
//            System.out.println("Prize: No prize yet. Keep growing!");
//        }
//    }
//}
//
//public class Java11 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        // Take channel name from user
//        System.out.print("Enter YouTube Channel Name: ");
//        String name = sc.nextLine();
//
//        YouTube yt = new YouTube(name);
//
//        // Password check
//        System.out.print("Enter Password: ");
//        String pass = sc.nextLine();
//
//        if (!yt.login(pass)) {
//            return; // Stop program if password wrong
//        }
//
//        // Show Channel Name
//        yt.getName();
//
//        // Set subscriber count
//        System.out.print("Enter Subscriber Count: ");
//        int sub = sc.nextInt();
//        yt.setSubscriberCount(sub);
//
//        // Remove subscribers
//        System.out.print("Enter Subscribers to Remove: ");
//        int remove = sc.nextInt();
//        yt.setUnSubscriberCount(remove);
//
//        // Show final result
//        yt.getSubscriberCount();
//
//        yt.increaseSubscriberCount();
//        yt.decreaseSubscriberCount();
//    }
//}
//COMPLETE YOUTUBE FUNCTION.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class YouTube {
    private String correctPassword = "1234";
    private String channelName;
    private String description = "";
    private int subscriberCount;
    private int likes;
    private int dislikes;

    // Videos: list of video names and views
    private ArrayList<String> videos;
    private HashMap<String, Integer> videoViews;

    // Comments (global list)
    private ArrayList<String> comments;

    // Constructor
    public YouTube(String channelName) {
        this.channelName = channelName;
        this.subscriberCount = 0;
        this.likes = 0;
        this.dislikes = 0;
        this.videos = new ArrayList<>();
        this.videoViews = new HashMap<>();
        this.comments = new ArrayList<>();
    }

    /* ---------- Authentication ---------- */
    public boolean login(String password) {
        return password.equals(correctPassword);
    }

    public void changePassword(String oldPass, String newPass) {
        if (oldPass.equals(correctPassword)) {
            correctPassword = newPass;
            System.out.println("Password changed successfully.");
        } else {
            System.out.println("Old password is incorrect. Password NOT changed.");
        }
    }

    /* ---------- Channel Info ---------- */
    public void setDescription(String desc) {
        this.description = desc;
        System.out.println("Channel description updated.");
    }

    public void showInfo() {
        System.out.println("\n--- Channel Info ---");
        System.out.println("Name: " + channelName);
        System.out.println("Description: " + (description.isEmpty() ? "No description set." : description));
        System.out.println("Subscribers: " + subscriberCount);
        System.out.println("Likes: " + likes + " | Dislikes: " + dislikes);
        System.out.println("Videos: " + videos.size());
        System.out.println("--------------------\n");
    }

    /* ---------- Subscribers ---------- */
    public void setSubscriberCount(int count) {
        if (count >= 0) {
            subscriberCount = count;
            System.out.println("Updated Subscriber Count: " + subscriberCount);
            checkPrize();
        } else {
            System.out.println("Subscriber count cannot be negative.");
        }
    }

    public void increaseSubscriberCount(int amount) {
        if (amount > 0) {
            subscriberCount += amount;
            System.out.println("Added " + amount + " subscribers. New count: " + subscriberCount);
            checkPrize();
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void decreaseSubscriberCount(int amount) {
        if (amount > 0) {
            subscriberCount -= amount;
            if (subscriberCount < 0) subscriberCount = 0;
            System.out.println(amount + " subscribers removed. New count: " + subscriberCount);
            checkPrize();
        } else {
            System.out.println("Invalid amount.");
        }
    }

    /* ---------- Likes / Dislikes ---------- */
    public void like() {
        likes++;
        System.out.println("You liked the channel. Likes: " + likes);
    }

    public void dislike() {
        dislikes++;
        System.out.println("You disliked the channel. Dislikes: " + dislikes);
    }

    /* ---------- Videos ---------- */
    public void uploadVideo(String title, int views) {
        if (title == null || title.trim().isEmpty()) {
            System.out.println("Invalid title.");
            return;
        }
        videos.add(title);
        videoViews.put(title, Math.max(0, views));
        System.out.println("Uploaded video: \"" + title + "\" with " + Math.max(0, views) + " views.");
    }

    public void removeVideo(String title) {
        if (videos.remove(title)) {
            videoViews.remove(title);
            System.out.println("Removed video: \"" + title + "\"");
        } else {
            System.out.println("Video not found.");
        }
    }

    public void listVideos() {
        if (videos.isEmpty()) {
            System.out.println("No videos uploaded yet.");
            return;
        }
        System.out.println("\n--- Videos ---");
        for (int i = 0; i < videos.size(); i++) {
            String t = videos.get(i);
            int v = videoViews.getOrDefault(t, 0);
            System.out.println((i + 1) + ". " + t + " (Views: " + v + ")");
        }
        System.out.println("--------------\n");
    }

    public void addViewsToVideo(String title, int addViews) {
        if (!videoViews.containsKey(title)) {
            System.out.println("Video not found.");
            return;
        }
        if (addViews <= 0) {
            System.out.println("Enter positive views to add.");
            return;
        }
        int newV = videoViews.get(title) + addViews;
        videoViews.put(title, newV);
        System.out.println("Added " + addViews + " views to \"" + title + "\". Total views: " + newV);
    }

    /* ---------- Comments ---------- */
    public void addComment(String comment) {
        if (comment == null || comment.trim().isEmpty()) {
            System.out.println("Cannot add empty comment.");
            return;
        }
        comments.add(comment);
        System.out.println("Comment added.");
    }

    public void showComments() {
        if (comments.isEmpty()) {
            System.out.println("No comments yet.");
            return;
        }
        System.out.println("\n--- Comments ---");
        for (int i = 0; i < comments.size(); i++) {
            System.out.println((i + 1) + ". " + comments.get(i));
        }
        System.out.println("----------------\n");
    }

    /* ---------- Earnings ---------- */
    // Example: ₹1 per 1000 views
    public double calculateEarnings(double rupeesPerThousand) {
        long totalViews = 0;
        for (int v : videoViews.values()) totalViews += v;
        return (totalViews / 1000.0) * rupeesPerThousand;
    }

    /* ---------- Prize System & ASCII Play Button ---------- */
    public void checkPrize() {
        if (subscriberCount >= 10000000) {
            System.out.println("Prize: Diamond Play Button (1 Crore+ subscribers)");
            showPlayButtonAscii("DIAMOND");
        } else if (subscriberCount >= 1000000) {
            System.out.println("Prize: Gold Play Button (10 Lakh+ subscribers)");
            showPlayButtonAscii("GOLD");
        } else if (subscriberCount >= 100000) {
            System.out.println("Prize: Silver Play Button (1 Lakh+ subscribers)");
            showPlayButtonAscii("SILVER");
        } else if (subscriberCount >= 10000) {
            System.out.println("Milestone: Bronze Play Button eligibility (10k+ subscribers)");
            showPlayButtonAscii("BRONZE");
        } else {
            System.out.println("Prize: No prize yet. Keep growing!");
        }
    }

    private void showPlayButtonAscii(String type) {
        System.out.println();
        switch (type) {
            case "DIAMOND":
                System.out.println("  /\\  /\\  /\\  ");
                System.out.println(" /  \\/  \\/  \\ ");
                System.out.println("/ DIAMOND    \\");
                System.out.println("\\  PLAY BTN  /");
                System.out.println(" \\__________/ ");
                break;
            case "GOLD":
                System.out.println("  _________  ");
                System.out.println(" /  GOLD   \\ ");
                System.out.println("|  PLAY BTN |");
                System.out.println(" \\_________/ ");
                break;
            case "SILVER":
                System.out.println("  _________  ");
                System.out.println(" / SILVER  \\ ");
                System.out.println("| PLAY BTN |");
                System.out.println(" \\_______/ ");
                break;
            case "BRONZE":
                System.out.println("  _______  ");
                System.out.println(" /BRONZE\\ ");
                System.out.println("|PLAY BTN| ");
                System.out.println(" \\_____/  ");
                break;
            default:
                System.out.println("[Play Button]");
        }
        System.out.println();
    }
}

/* ---------- Main Program (Menu) ---------- */
public class Java11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter YouTube Channel Name: ");
        String name = sc.nextLine();
        YouTube yt = new YouTube(name);

        // Login with 3 attempts
        int attempts = 0;
        boolean authenticated = false;
        while (attempts < 3) {
            System.out.print("Enter Password: ");
            String pass = sc.nextLine();
            if (yt.login(pass)) {
                System.out.println("Login Successful!");
                authenticated = true;
                break;
            } else {
                attempts++;
                System.out.println("Wrong Password! Attempts left: " + (3 - attempts));
            }
        }
        if (!authenticated) {
            System.out.println("Too many wrong attempts. Access locked.");
            sc.close();
            return;
        }

        // Menu-driven operations
        while (true) {
            System.out.println("\n==== YOUTUBE SIMULATOR MENU ====");
            System.out.println("1. Show Channel Info");
            System.out.println("2. Set / Update Description");
            System.out.println("3. Set Subscriber Count");
            System.out.println("4. Add Subscribers");
            System.out.println("5. Remove Subscribers");
            System.out.println("6. Like");
            System.out.println("7. Dislike");
            System.out.println("8. Upload Video");
            System.out.println("9. Remove Video");
            System.out.println("10. List Videos");
            System.out.println("11. Add Views to Video");
            System.out.println("12. Add Comment");
            System.out.println("13. Show Comments");
            System.out.println("14. Show Prize / Check Prize");
            System.out.println("15. Calculate Earnings (₹ per 1000 views)");
            System.out.println("16. Change Password");
            System.out.println("17. Exit");
            System.out.print("Choose an option (1-17): ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter number 1-17.");
                continue;
            }

            switch (choice) {
                case 1:
                    yt.showInfo();
                    break;
                case 2:
                    System.out.print("Enter new channel description: ");
                    String desc = sc.nextLine();
                    yt.setDescription(desc);
                    break;
                case 3:
                    System.out.print("Enter subscriber count: ");
                    try {
                        int c = Integer.parseInt(sc.nextLine().trim());
                        yt.setSubscriberCount(c);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number.");
                    }
                    break;
                case 4:
                    System.out.print("Add how many subscribers? ");
                    try {
                        int a = Integer.parseInt(sc.nextLine().trim());
                        yt.increaseSubscriberCount(a);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number.");
                    }
                    break;
                case 5:
                    System.out.print("Remove how many subscribers? ");
                    try {
                        int r = Integer.parseInt(sc.nextLine().trim());
                        yt.decreaseSubscriberCount(r);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number.");
                    }
                    break;
                case 6:
                    yt.like();
                    break;
                case 7:
                    yt.dislike();
                    break;
                case 8:
                    System.out.print("Enter video title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter initial views (0 if none): ");
                    int views = 0;
                    try {
                        views = Integer.parseInt(sc.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number, defaulting to 0 views.");
                    }
                    yt.uploadVideo(title, views);
                    break;
                case 9:
                    System.out.print("Enter video title to remove: ");
                    String rem = sc.nextLine();
                    yt.removeVideo(rem);
                    break;
                case 10:
                    yt.listVideos();
                    break;
                case 11:
                    System.out.print("Enter video title to add views to: ");
                    String vt = sc.nextLine();
                    System.out.print("Enter views to add: ");
                    try {
                        int av = Integer.parseInt(sc.nextLine().trim());
                        yt.addViewsToVideo(vt, av);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number.");
                    }
                    break;
                case 12:
                    System.out.print("Enter comment: ");
                    String cm = sc.nextLine();
                    yt.addComment(cm);
                    break;
                case 13:
                    yt.showComments();
                    break;
                case 14:
                    yt.checkPrize();
                    break;
                case 15:
                    System.out.print("Enter rupees earned per 1000 views (e.g., enter 1 for ₹1 per 1000): ");
                    try {
                        double rpm = Double.parseDouble(sc.nextLine().trim());
                        double earnings = yt.calculateEarnings(rpm);
                        System.out.printf("Estimated Earnings: ₹%.2f (based on all video views)\n", earnings);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number.");
                    }
                    break;
                case 16:
                    System.out.print("Enter old password: ");
                    String oldP = sc.nextLine();
                    System.out.print("Enter new password: ");
                    String newP = sc.nextLine();
                    yt.changePassword(oldP, newP);
                    break;
                case 17:
                    System.out.println("Exiting. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Choose a valid option (1-17).");
            }
        }
    }
}