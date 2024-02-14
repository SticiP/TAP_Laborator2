package Laborator2_final;

import java.util.Random;

class BaseClass {
    int baseValue;

    //Constructor 1
    BaseClass() 
    {
        Random random = new Random();
        this.baseValue = random.nextInt(100);
        System.out.println("BaseClass constructor with no parameters");
    }

    //Constructor 2
    BaseClass(int value) 
    {
        this.baseValue = value;
        System.out.println("BaseClass constructor with one parameter: " + value);
    }

    //Constructor 3
    BaseClass(int value1, int value2) 
    {
        this(value1 + value2);
        System.out.println("BaseClass constructor with two parameters: " + value1 + ", " + value2);
    }

    //Metoda 1
    int get_baseValue() 
    {
        System.out.println("BaseClass method1");
        return this.baseValue;
    }

    //Metoda 2
    void change_baseValue(int value)
    {
        System.out.println("BaseClass method2");
        this.baseValue = value;
    }
}

class DerivedClass extends BaseClass {
    int derivedValue;

    //Constructor 1
    DerivedClass() 
    {
        Random random = new Random();
        this.baseValue = random.nextInt(100);
        this.derivedValue = random.nextInt(100);
        System.out.println("DerivedClass constructor with no parameters");
    }

    //Constructor 2
    DerivedClass(int value) 
    {
        super(value);
        this.derivedValue = value;
        System.out.println("DerivedClass constructor with no parameters");
    }

    //Constructor 3
    DerivedClass(int baseValue, int derivedValue) {
        super(baseValue);
        this.derivedValue = derivedValue;
        System.out.println("DerivedClass constructor with two parameters: " + baseValue + ", " + derivedValue);
    }

    //Metoda 1
    int get_derivedValue() 
    {
        System.out.println("DerivedClass method1");
        return this.derivedValue;
    }

    //Metoda 2
    void change_derivedValue(int value)
    {
        System.out.println("DerivedClass method2");
        this.derivedValue = value;
    }

    //Metoda 3
    int operation()
    {
        System.out.println("DerivedClass method3");
        return this.get_baseValue() + this.get_derivedValue();
    }
}

public class Main {
    public static void main(String[] args) {
        DerivedClass dc = new DerivedClass();
        System.out.println("Dc base value: " + dc.get_baseValue());
        System.out.println("Dc derived value: " + dc.get_derivedValue());
        System.out.println("Dc operation: " + dc.operation());
    }
}
