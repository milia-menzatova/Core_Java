package com.casting;

public class TypeCastingPrimitiveDataType {
    public static void main(String[] args) {
        //Upcasting - smaller --> larger value
        //int --> long
        int intvalue = 1000;
        long longvalue = intvalue; // automatically

        System.out.println(longvalue);

        //float --> double

        float floatvalue = 12.78f;
        double doublevalue = floatvalue; //automatically
        System.out.println(doublevalue);

        //Downcasting - larger -- smaler value
        //long --> int

        long longval = 100000;
       // int intval = longval; //manual
        int intval = (int)longval;
        System.out.println(intval);

        //double --float
        double doubleval = 345.44;
        //float floatval = doubleval; // manual
        float floatval = (float)doubleval;
        System.out.println(floatval);

    }
}
