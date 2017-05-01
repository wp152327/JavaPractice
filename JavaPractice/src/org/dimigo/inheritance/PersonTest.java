package org.dimigo.inheritance;

public class PersonTest {
  public static void main(String args[]) {
    Person p = new Person("Tom");
    System.out.println(p);
    
    Korean k = new Korean("JeonYunMin");
    System.out.println(k);
    
    Japanese j = new Japanese("HisyishiJo");
    System.out.println(j);
    
    Chinese c = new Chinese("SijinPing");
    System.out.println(c);
  }
}
