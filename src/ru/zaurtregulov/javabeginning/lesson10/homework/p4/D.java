package ru.zaurtregulov.javabeginning.lesson10.homework.p4;

import ru.zaurtregulov.javabeginning.lesson10.homework.p1.A;
import ru.zaurtregulov.javabeginning.lesson10.homework.p1.p2.B;
import ru.zaurtregulov.javabeginning.lesson10.homework.p1.p2.p3.C;
import ru.zaurtregulov.javabeginning.lesson10.homework.p4.p5.E;

import static ru.zaurtregulov.javabeginning.lesson10.homework.p1.p2.B.*;


public class D {
    public static void main(String[] args) {

        A objectClassA = new A();
        System.out.println(objectClassA.stringOne);

        B objectClassB = new B();
        objectClassB.showBoolean();

        C objectClassC=new C();
        objectClassC.showMessage();

        E objectClassE = new E();
        System.out.println(objectClassE.xyz);

        System.out.println(aBoolean);





    }

}
