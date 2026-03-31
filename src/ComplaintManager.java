import java.util.ArrayList;

class ComplaintManager {
    ArrayList<Complaint> complaints = new ArrayList<>();
    int count = 1;

    void addComplaint(String desc) {
        Complaint c = new Complaint(count++, desc);
        complaints.add(c);
        System.out.println("Complaint added successfully!");
    }

    void viewComplaints() {
        if (complaints.isEmpty()) {
            System.out.println("No complaints found.");
            return;
        }

        System.out.println("\nID | Description | Status");
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
}