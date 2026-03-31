class Complaint {
    int id;
    String description;
    String status;

    Complaint(int id, String description) {
        this.id = id;
        this.description = description;
        this.status = "Pending";
    }

    void display() {
        System.out.println(id + " | " + description + " | " + status);
    }
}