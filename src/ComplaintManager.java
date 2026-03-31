import java.util.ArrayList;

class ComplaintManager {
    ArrayList<Complaint> complaints = new ArrayList<>();
    int count = 1;

    void addComplaint(String desc, String priority, String category) {
        Complaint c = new Complaint(count++, desc, priority, category);
        complaints.add(c);
        System.out.println("Complaint added successfully!");
    }

    void viewComplaints() {
        if (complaints.isEmpty()) {
            System.out.println("No complaints found.");
            return;
        }

        System.out.println("\nID | Description | Category | Priority | Status");
        for (Complaint c : complaints) {
            c.display();
        }
    }

    void updateStatus(int id) {
        for (Complaint c : complaints) {
            if (c.id == id) {
                c.status = "Resolved";
                System.out.println("Complaint resolved!");
                return;
            }
        }
        System.out.println("Complaint not found.");
    }

    void searchComplaint(int id) {
        for (Complaint c : complaints) {
            if (c.id == id) {
                System.out.println("\nComplaint Found:");
                c.display();
                return;
            }
        }
        System.out.println("Complaint not found.");
    }

    void showStats() {
        int total = complaints.size();
        int resolved = 0;

        for (Complaint c : complaints) {
            if (c.status.equals("Resolved")) {
                resolved++;
            }
        }

        int pending = total - resolved;

        System.out.println("\n--- Statistics ---");
        System.out.println("Total Complaints: " + total);
        System.out.println("Resolved: " + resolved);
        System.out.println("Pending: " + pending);
    }
}