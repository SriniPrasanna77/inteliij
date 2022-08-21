package Immutability;

public class Worker {

    static int Id;
    public Person person;
    public String dept;

    public void genId() {
        if (Id > 0) {
            ++Id;
        } else {
            Id = 1;
        }
    }
    public Worker(String name, String gender, String department) {
        this.genId();
        this.person = Person.createPerson(name,gender);
        this.dept = department;
    }

    public static void main(String[] args) {
        Worker w = new Worker("Srini", "Male", "IT");
        System.out.println(w.Id+"; "+w.person.displayPerson()+"; "+w.dept);

        Worker w2 = new Worker("Prasanna", "Male", "HR");
        System.out.println(w2.Id+"; "+w2.person.displayPerson()+"; "+w2.dept);
    }
}
