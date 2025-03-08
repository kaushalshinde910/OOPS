class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("kaushal", 24);

        student1.display();
        student2.display();
    }
}
