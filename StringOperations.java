package com.meghana;

class Operations{
    void add(Object a, char b){
        System.out.println("Object a and object b is:");
    }

}


public class StringOperations {
    public static void main(String[] args){

        String s1="Meghana";
        String s2="Anusha";
        String s3= new String("Lakshmi");
        int a=100;
        int b=200;
        int c=100;
        System.out.println(" a and b :" + (a==c));
        System.out.println(" a==b ::"+ (a==b));
        System.out.println(" a==c::"+ (a==c));
        System.out.println("s1==s2"+(s1==s2));
        Operations o1=new Operations();
        o1.add("Meghana",'k');
        System.out.println(" s1 equals s2 "+(s1.equals(s2)));
        System.out.println(" s1 equals s3 "+(s2.equals(s3)));


    }

}
