package kds.ru;

public class SimpleJavaDataTypesAndOperators {
// Examples (begin)
    // Примитивные типы данных
    byte aByte; // 8 bit -128 ... 127
    short aShort = 100; // 16 bit -32768 ... 32767
    int aInt = 1_100_000; // 32 bit -2 ^ 31 ... (2 ^ 31) -1   самый используемый
    long aLong = 100L; // 64 bit -2 ^ 63 ... (2 ^ 63) -1

    float aFloat = 0.0F; // 32 bit
    double aDouble = 0.0; // 64 bit   самый используемый (если просто хранить, но не использовать арифметику)

    char aChar = 'k';
    boolean aBoolean = false;

    // Ссылочный тип данных
    String aString = "hello, qa.guru!";

    public static void main(String[] args) {
        // + -- сложение
        // - -- вычитание
        // * -- умножение
        // / -- целочисленное деление
        // % -- остаток от деления
        // инкремент ++
        // декремент --

        // >
        // <
        // >=
        // <=
        // ==
        // !=

        // =
        // +=
        // -=

        // && (&)
        // || (|)
        // !
// Examples (End)

        byte vB = 127,
             bB = 10,
             nB = -127;
        short vS = 30_000,
             bS = -30_000,
             nS = 10;
        int  vI = 2_000_5000,
             bI = 128;
        long vL = 50_000_000_000L;

        float vF = 0.005F;
        double vD = 0.3,
               bD = 34.5;

        char vC = 'K',
             bC = 'd';
        boolean vBoo, vBooT = true;


        System.out.println("Примеры работы с примитивными типами и операторами:\n"+
                "Byte: vB+nB =" + (vB+nB) +"\n" +
                "Byte (переполнение): vB-nB =" + (vB-nB) +"\n" +
                "Short&Byte vS-nS+nB =" + (vS-nS+nB) +"\n" +
                "Int&Short&Double: bI*nS/vD =" + (bI*nS/vD) +"\n" +
                "Int: bI++=" + (bI++) +"\n" +
                "Int: bI%vD=" + (bI%vD) +"\n" +
                "Char: vC =" + (vC) +"\n" +
                "Char+double: vC+vD =" + (vC+vD) +"\n" +
                "Char+Char: vC+bC =" + (vC+bC) +"\n" +
                "Boolean: " + (vBoo = false) +"\n" +
                "Boolean&Boolean: " + (vBoo != vBooT) +"\n" +
                "Long+>+Boolean: vL>vD&&(vBoo) =" + (vL>vD&&(vBoo)) +"\n" +
                "Other expressions 1: (((bD*vD) > 0) & (vBoo!=vBooT)) =" + (((bD*vD) > 0) & (vBoo!=vBooT)) +"\n" +
                "Other expressions 2: (bI +=4)=" + (bI +=4) +"\n" +
                "Other expressions 3: (bB*bS-vI*vF) >0 =" + ((bB*bS-vI*vF) >0) +"\n" +
                "The END"
        );
    }


}
