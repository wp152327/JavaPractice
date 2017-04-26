package org.dimigo.inheritance

public class Korean extends Person {
  public Korean(String name) {
    super(name);
  }
  
  public void sayHello() {
    System.out.println("Hello in Korean!");
  }
  
  public void sayBye() {
    System.out.println("Bye in Korean!");
  }
  
  public String toString() {
    return "I'm Korean " + name;
  }
}
