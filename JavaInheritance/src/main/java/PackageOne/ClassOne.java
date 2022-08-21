package PackageOne;

import java.time.LocalDate;

class ClassOne {

    protected static int Id;
    public String name;
    public LocalDate birthDate;

    public static int getId() {
        return Id;
    }

    public static void setId() {

        if (Id == 0) {
            Id = 1;
        } else {
            Id += 1;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public ClassOne(String pName, LocalDate pDOB) {
        this.setName(pName);
        this.setBirthDate(pDOB);
        this.setId();
    }

//    public static void main(String[] args) {
//        ClassOne c1 = new ClassOne("Srini", LocalDate.now());
//        System.out.println(c1.getName()+"; " + c1.getId()+ "; "+c1.getBirthDate());
//
//        ClassOne c2 = new ClassOne("Prasanna", LocalDate.now());
//        System.out.println(c2.getName()+"; " + c2.getId()+ "; "+c2.getBirthDate());
//
////        System.out.println(c1.Id);
//    }
}
