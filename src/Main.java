import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ComplaintManager manager = new ComplaintManager();

        while (true) {
            System.out.println("\n=== Hostel Complaint System ===");
            System.out.println("1. Add Complaint");
            System.out.println("2. View Complaints");
            System.out.println("3. Resolve Complaint");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter complaint: ");
                    String desc = sc.nextLine();
                    manager.addComplaint(desc);
                    break;

                case 2:
                    manager.viewComplaints();
                    break;

                case 3:
                    System.out.print("Enter complaint ID: ");
                    int id = sc.nextInt();
                    manager.updateStatus(id);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}