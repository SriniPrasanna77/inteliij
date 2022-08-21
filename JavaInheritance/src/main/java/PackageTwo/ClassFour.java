package PackageTwo;

import PackageOne.ClassTwo;

import java.time.LocalDate;

public class ClassFour extends ClassTwo {

    String gender;

    public ClassFour(String pName, LocalDate pDOB, String sex) {
        super(pName, pDOB);
        gender = sex;
    }


    @Override
    public void showData() {
        super.showData();
        System.out.println(gender);
    }

    public static void main(String[] args) {
        ClassFour c4 = new ClassFour("Skandha",LocalDate.now(),"Male");
        c4.showData();
    }
}
