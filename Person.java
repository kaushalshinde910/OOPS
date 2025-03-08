// Encapsulation
//Question: Create a class Person with private attributes name and age. Use getters and setters to access and modify the values of the attributes.
//Encapsulation

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("kaushal");
        person.setAge(24);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
