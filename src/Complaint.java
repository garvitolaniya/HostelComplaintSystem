class Complaint {
    int id;
    String description;
    String status;
    String priority;
    String category;

    Complaint(int id, String description, String priority, String category) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.category = category;
        this.status = "Pending";
    }

    void display() {
        System.out.println(id + " | " + description + " | " + category + " | " + priority + " | " + status);
    }
}