package PackageOne;

import java.time.LocalDate;

public class ClassTwo {
    public ClassOne c1;

    public ClassTwo(String pName, LocalDate pDOB) {
        c1 = new ClassOne(pName,pDOB);
    }

    public void showData() {
        System.out.println(c1.getName()+"; " + c1.getId()+ "; "+ c1.getBirthDate());
        System.out.println(c1.Id);
    }

//    public static void main(String[] args) {
//        ClassTwo c2 = new ClassTwo("SriniPrasanna",LocalDate.now());
////        System.out.println(c2.c1.getName()+"; " + c2.c1.getId()+ "; "+ c2.c1.getBirthDate());
//        c2.showData();
//    }
}
