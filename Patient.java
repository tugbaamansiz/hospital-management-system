public class Patient {
    public Patient next;
    private int id;
    private String name;
    private int severity;
    private int age;

    //Constructor
    public Patient(int id, String name, int severity, int age) {
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.age = age;
        this.next = next;
    }

    //Getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSeverity() {
        return severity;
    }
    public void setSeverity(int severity) {
        this.severity = severity;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Patient getNext() {
        return next;
    }
    public void setNext(Patient next) {
        this.next = next;
    }
    //Print patient information

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Severity: " + severity + "/10 " + ", Age: " + age;
    }
}
