import java.util.Queue;
import java.util.LinkedList;
class Scratch {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("ezzou",21));
        queue.add(new Person("Ayoub",24));
        queue.add(new Person("Kamal",11));
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
    }
}
class  Person {
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age ;

    }
}