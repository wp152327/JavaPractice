
package org.dimigo.inheritance

public class Japanese extends Person {
  public Japanese(String name) {
    super(name);
  }
  
  public void sayHello() {
    System.out.println("Hello in Japanese!");
  }
  
  public void sayBye() {
    System.out.println("Bye in Japanese!");
  }
  
  public String toString() {
    return "I'm Japanese " + super.getName();
  }
}
