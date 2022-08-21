package PackageTwo;

import PackageOne.ClassTwo;

import java.time.LocalDate;

public class ClassThree {
    ClassTwo c2;

    public ClassThree(String pName, LocalDate pDOB) {
        c2 = new ClassTwo(pName,pDOB);
    }

    public static void main(String[] args) {
        ClassThree c3 = new ClassThree("SriniPrasannaP",LocalDate.now());
//        System.out.println(c2.c1.getName()+"; " + c2.c1.getId()+ "; "+ c2.c1.getBirthDate());
        c3.c2.showData();

        ClassThree c4 = new ClassThree("SriniPrasannaP123",LocalDate.now());
        c4.c2.showData();
    }
}
