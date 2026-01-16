package com.keyword;

public class KeywordThis {
    /*
    Types of variables
    1). Instance variables - related to the Object
    2). Local variables - related to the methods

    this keyword - pointing to the current class object

     */
    //variables

    int x, y; // Instance variables

   // KeywordThis(int a, int b){ //Local variables
     //   x=a;
       // y=b;
    //}

    KeywordThis(int x, int y){
        this.x=x;                                 //output will be o, o (without keyword this)
        this.y=y;

    }




    //methods
    void display(){
        System.out.println(x + "test");
        System.out.println(y);
    }


    public static void main(String[] args) {
        KeywordThis key = new KeywordThis(200, 100);
        key.display();
    }

}
