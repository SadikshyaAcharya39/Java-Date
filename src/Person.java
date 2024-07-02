public class Person {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return  age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Sadikshya Acharya");
        person.setAge(3);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
