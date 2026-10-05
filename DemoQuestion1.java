public class DemoQuestion1 {
    public static void main(String[] args) {

        // Four Student objects
        Student s1 = new Student(101, "ahmed", 18, "IT", 3.5);
        Student s2 = new Student(102, "Abdirizak", 18, "Networking", 4.00);
        Student s3 = new Student(103, "Omar", 21, "Computer Science", 1.7);
        Student s4 = new Student(104, "xasan", 19, "Cyber Security", 4.00);

        // Display information
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        s4.displayInfo();
    }
}