package guru.qa;

import static java.lang.String.format;
import static java.lang.String.valueOf;
import static java.lang.System.out;
/*0) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой

1) поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)

2) попробовать вычисления комбинаций типов данных (int и double)*/
public class Main {
    static byte varByte = Byte.MAX_VALUE;
    static short varShort = Short.MAX_VALUE;
    static int varInt = Integer.MAX_VALUE;
    static long varLong = Long.MAX_VALUE;
    static char varChar = Character.MAX_VALUE;
    static float varFloat = Float.MAX_VALUE;
    static double varDouble = Double.MAX_VALUE;;
    // Максимальное \ минимальное значение
    public static void maxAmount(){
        out.println("Максимальное и минимальное значения типа");
        out.println(format("Byte: max = %s min = %s", varByte, Byte.MIN_VALUE));
        out.println(format("Short: max = %s min = %s", varShort, Short.MIN_VALUE));
        out.println(format("Integer: max = %s min = %s", varInt, Integer.MIN_VALUE));
        out.println(format("Long: max = %s min = %s", varLong, Long.MIN_VALUE));
        out.println(format("Character: max = %s min = %s", varChar, Character.MIN_VALUE));
        out.println(format("Float: max = %s min = %s", varFloat, Float.MIN_VALUE));
        out.println(format("Double: max = %s min = %s \n", varDouble, Double.MIN_VALUE));

    }
    // Арифметика
    // Переполнение +
    public static void addLimit() {
        out.println("Переполнение при сложении");
        out.println(format("Add Byte:  %s+%s = %s ", Byte.MAX_VALUE,1,(Byte.MAX_VALUE+1)));
        out.println(format("Add Short: %s+%s = %s ", varShort,1,(varShort+1)));
        out.println(format("Add Integer: %s+%s = %s ", varInt,1,(varInt+1)));
        out.println(format("Add Long: %s+%s = %s ", varLong,1,(varLong+1)));
        out.println(format("Add Char: %s+%s = %s ", varChar,1,(varChar+1)));
        out.println(format("Add Float: %s+%s = %s ", varFloat,1,(varFloat+1)));
        out.println(format("Add Double: %s+%s = %s \n", varDouble,1,(varDouble+1)));
    }
    // Переполнение -
    public static void subLimit() {
        out.println("Переполнение при вычитании");
        out.println(format("Sub Byte: %s-%s = %s ", Byte.MIN_VALUE,1,(Byte.MIN_VALUE-1)));
        out.println(format("Sub Short: %s-%s = %s ", Short.MIN_VALUE,1,(Short.MIN_VALUE-1)));
        out.println(format("Sub Integer: %s-%s = %s ", Integer.MIN_VALUE,1,(Integer.MIN_VALUE-1)));
        out.println(format("Sub Long: %s-%s = %s ", Long.MIN_VALUE,1,(Long.MIN_VALUE-1)));
        out.println(format("Sub Char: %s-%s = %s ", Character.MIN_VALUE,1,(Character.MIN_VALUE-1)));
        out.println(format("Sub Float: %s-%s = %s ", Float.MIN_VALUE,1,(Float.MIN_VALUE-1)));
        out.println(format("Sub Double: %s-%s = %s \n", Double.MIN_VALUE,1,(Double.MIN_VALUE-1)));
    }
    // Деление
    public static void divide() {
        out.println("Деление");
        out.println(format("Divide Byte: %s/%s = %s ", Byte.MAX_VALUE,2,(Byte.MAX_VALUE/2)));
        out.println(format("Divide Short: %s/%s = %s ", varShort,2,(varShort/2)));
        out.println(format("Divide Integer: %s/%s = %s ", varInt,2,(varInt/2)));
        out.println(format("Divide Long: %s/%s = %s ", varLong,2,(varLong/2)));
        out.println(format("Divide Char: %s/%s = %s ", varChar,2,(varChar/2)));
        out.println(format("Divide Float: %s/%s = %s ", varFloat,2,(varFloat/2)));
        out.println(format("Divide Double: %s/%s = %s \n", varDouble,2,(varDouble/2)));
    }
    // Умножение
    public static void multiply() {
        out.println("Умножение");
        out.println(format("Multuply Byte: %s*%s = %s ", Byte.MAX_VALUE,2,(Byte.MAX_VALUE*2)));
        out.println(format("Multiply Short: %s*%s = %s ", varShort,2,(varShort*2)));
        out.println(format("Multiply Integer: %s*%s = %s ", varInt,2,(varInt*2)));
        out.println(format("Multiply Long: %s*%s = %s ", varLong,2,(varLong*2)));
        out.println(format("Multiply Char: %s*%s = %s ", varChar,2,(varChar*2)));
        out.println(format("Multiply Float: %s*%s = %s ", varFloat,2,(varFloat*2)));
        out.println(format("Multiply Double: %s*%s = %s \n", varDouble,2,(varDouble*2)));
    }

    // Остаток
    public static void dividePercent() {
        out.println("Деление с остатком");
        out.println(format("Full Byte: %s %s %s = %s ", Byte.MAX_VALUE,'%',5,(Byte.MAX_VALUE%5)));
        out.println(format("Full Byte: %s %s %s = %s ", varShort,'%',5,(varShort%5)));
        out.println(format("Full Byte: %s %s %s = %s ", varInt,'%',5,(varInt%5)));
        out.println(format("Full Byte: %s %s %s = %s ", varLong,'%',5,(varLong%5)));
        out.println(format("Full Byte: %s %s %s = %s ", varChar,'%',5,(varChar%5)));
        out.println(format("Full Byte: %s %s %s = %s ", varFloat,'%',5,(varFloat%5)));
        out.println(format("Full Byte: %s %s %s = %s \n", varDouble,'%',5,(varDouble%5)));
    }

    // Сравнение < > <= >= != ==
    public static void eQualities() {
        out.println("Операции сравнения");
        out.println(format("%s < %s is %s",varByte,varByte-1,(varByte < (varByte - 1))));
        out.println(format("%s > %s is %s",varByte,varByte-1,(varByte > (varByte - 1))));
        out.println(format("%s <= %s is %s",varByte,varByte-1,(varByte <= (varByte - 1))));
        out.println(format("%s >= %s is %s",varByte,varByte-1,(varByte >= (varByte - 1))));
        out.println(format("%s != %s is %s",varByte,varByte-1,(varByte != (varByte - 1))));
        out.println(format("%s = %s is %s \n",varByte,varByte-1,(varByte == (varByte - 1))));
    }
    // Логические &&(&)  ||(|) , !
    public static void logic() {
        out.println("Логические операции");
        out.println("3 > 4 & \"Дед\" != \"Мороз\" is " + (3 > 4 & "Дед" != "Мороз"));
        out.println("3 > 4 && \"Дед\" != \"Мороз\" is " + (3 > 4 && "Дед" != "Мороз"));
        out.println("3 > 4 || \"Дед\" != \"Мороз\" is " + (3 > 4 || "Дед" != "Мороз"));
        out.println("3 > 4 | \"Дед\" != \"Мороз\" is" + (3 > 4 | "Дед" != "Мороз"));
        out.println("!(3 > 4 | \"Дед\" != \"Мороз\") is " + (!(3 > 4 | "Дед" != "Мороз")));
        out.println("\n");

    }


    //Int + Float
    public static void intAddDouble(){
        out.println("Сложение Int и Флоат");
        out.println(format("Add Int+Float: %s + %s = %s ", varInt,varFloat,(varInt+varFloat)));
    }
    public static void main(String[] args) {
        maxAmount();
        addLimit();
        subLimit();
        divide();
        multiply();
        dividePercent();
        eQualities();
        logic();
        intAddDouble();
    }

}