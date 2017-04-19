package oop.dimigo.org

public class PiggyBank {
  private static int balance = 0;
  
  public static void putMoney(FamilyMember member, int amount) {
    System.out.println(member.getMemberName + " : " + Integer.parseInt(amount) + "won input");
    balance += amount;
  }
  
  public static void printBalance(){
    System.out.println("total amount : " + balance);
  }
}
