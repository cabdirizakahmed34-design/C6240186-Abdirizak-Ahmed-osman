class Student {
    // Encapsulation (Private fields)
    private int studentId;
    private String name;
    private int age;
    private String department;
    private double gpa;

    // Static constant shared among all students
    public static final String UNIVERSITY_NAME = "Jamhuuriya University";

    // Constructor
    public Student(int studentId, String name, int age, String department, double gpa) {
        this.studentId = studentId;
        this.name = name;

        // Validate age
        if (age >= 16 && age <= 100) {
            this.age = age;
        } else {
            this.age = 18; // Default age
        }

        this.department = department;

        // Validate GPA
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            this.gpa = 0.0; // Default GPA
        }
    }

    // Getters and Setters
    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age >= 16 && age <= 100) this.age = age;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public double getGPA() { return gpa; }
    public void setGPA(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) this.gpa = gpa;
    }

    // Determine whether student passed
    public boolean hasPassed() {
        return gpa >= 2.0;
    }

    // Display student information
    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("GPA: " + gpa);
        System.out.println("University: " + UNIVERSITY_NAME);
        System.out.println("Passed: " + hasPassed());
    }
}