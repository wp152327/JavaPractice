
package org.dimigo.inheritance;

public class Chinese extends Person {
  public Chinese(String name) {
    super(name);
  }
  
  public void sayHello() {
    System.out.println("Hello in Chinese!");
  }
  
  public void sayBye() {
    System.out.println("Bye in Chinese!");
  }
  
  public String toString() {
    return "I'm Chinese " + super.getName();
  }
}
