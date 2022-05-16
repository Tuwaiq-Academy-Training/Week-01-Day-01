package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
    //    System.out.println("Hello World");

        // There is two data types in java
        // 1- primitive datatype
        // 2- reference datatype

        // primitive datatype
        // int byte short long || float double || char || boolean

//        int age =2147483647;
//        long price = 9223372036854775807L;
//        short grade= 15;
//        byte byteNumber= 20;
//        System.out.println(Byte.MAX_VALUE);
//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Long.MAX_VALUE);
//
//        float floatNumber = 15.5F;
//        double doubleNumber = 8.8;
//        System.out.println(Float.MAX_VALUE);
//        System.out.println(Double.MAX_VALUE);
//
//        char gender = '\t';
//        System.out.println(gender);
//
//        boolean isPlaying = true;
//        System.out.println(isPlaying);


        // reference datatype
       // String name= "saleh";


        // Types of operation in java :
        // 1- Arithmetic operation
        // 2- Comparison operation
        // 3- Logical operation

        // Arithmetic operation
        // + - / * %
//        System.out.println(5+10);
//        System.out.println(10-2);

        // Comparison operation
        // > < <= >= == !=
//        System.out.println(5>2);
//        System.out.println(10==9);
//        System.out.println(0!=1);

        // Logical operation
        // && || !
//        System.out.println(true && false && true && true && true);
//        System.out.println(5>2 && 2>1);
//        System.out.println(true || false || false );
//        System.out.println(!true);
//        System.out.println(!(5>2));


        // 3 pillar of programming
        // 1- Sequence
        // 2- Selection
        // 3- Iteration

        // Sequence
        //       System.out.println(name1);
        //        String  name1= "saleh";

        // Selection
        // if switch else

//       String role= "admin";
//        if(role=="admin"){
//            System.out.println("Welcome admin");
//        } else if(role=="superUser") {
//            System.out.println("Welcome superUser");
//        }else {
//            System.out.println("Welcome user");
//        }

//        switch (role){
//            case "admin":
//                System.out.println("Welcome admin");
//                break;
//            case "superUser":
//                System.out.println("Welcome superUser");
//                break;
//            default:
//                System.out.println("Welcome user");
//        }


        // Iteration
        // for while do-while

        // i++
        // i = i +1


//        for (int i= 0 ; i<5 ; i++ ){
//            System.out.println(i);
//        }
//
//        for (int i= 1 ; i<20 ; i= i * 2 ){
//            System.out.println(i);
//        }

//        for (int i= 1 ; i<20 ; i= i - 2 ){
//            System.out.println(i);
//        }

//        for (int i= 1 ; i<20 ; ){
//            System.out.println(i);
//        }



//        int i= 0;
//        while (i >10){
//            System.out.println(i);
//            i++;
//        }

//        int i2= 0;
//        do {
//            System.out.println(i2);
//            i2++;
//        }while (i2>10);



//        for (int i = 0;i <10 ; i++){
//            System.out.println(i);
//            if(i==2){
//                break;
//            }
//        }
//
//        for (int i = 0;i <10 ; i++){
//            if(i==2){
//                continue;
//            }
//
//            System.out.println(i);
//        }


        // Methods
//        System.out.println(5+6);
//        System.out.println(sum(5,6));
//        sayHelloMessage("Ali");


//        int name = 10;
//        String balance = "saleh";
//
//        checkBalance(name,balance);

        // Rules on naming in java
        //  int saleh= 15;


        // Arrays
//        String color1="red";
//        String color2="blue";
//        String color3="green";
//
//
//        String user1="saleh";
//        String user2="ali";
//        String user3="khalid";
//
//        String users[] = new String[3];
//
//        users[0]="saleh";
//        users[1]="ali";
//        users[2]="khalid";
//
//        System.out.println(users);
//
//        for (int i = 0; i < users.length; i++) {
//            System.out.println(users[i]);
//        }
//
//        System.out.println(Arrays.toString(users));
//

        // String userList[] = new String[0];
        // ArrayList <String> userList= new ArrayList<String>();
        // delete userList
        // String userList[] = new String[1];
        // userList[0]="saleh";
        // userList.add("saleh");
        // delete userList
        // String userList[] = new String[2];
        // userList[0]="saleh";
        // userList[0]="ali";
        //  userList.add("ali");

//        String colors[] =new String[3];
//        colors[0]="red";
//        colors[1]="blue";
//        colors[2]="black";
//   String colors[]= {"red","blue","black"};






    }

   public static  int sum(int number1,int number2){
        return number1+number2;
   }
   public static  double div(int number1,int number2){
        return number1/number2;
    }
    public static  String goodByeMessage(int number1,int number2){
        return "GoodBye";
    }
    public static void sayHelloMessage(String name){
        if(name!="Saleh"){
            return;
        }

       System.out.println("Welcome "+name);


   }
   public static void checkBalance(String name,int balance){
        if( balance > 100){
            System.out.println(name+ " your balance is more than 100");
        }else {
            System.out.println(name+ " your balance is less than 100");
        }
    }

}
