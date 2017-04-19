package oop.dimigo.org

public class FamilyMember {
  private static int memberCnt = 0;
  private String memberName;
  
  public FamilyMember(String memberName) {
    this.memberName = memberName;
  }
  
  public void getMemberName(){
    return memberName;
  }
  
  public static void printMemberCnt() {
    System.out.println("ㄱㅏㅈㅗㄱ ㅊㅗㅇ ㅇㅣㄴㅇㅜㅓㄴㅅㅜ : " + memberCnt + "ㅁㅕㅇ");
  }
}
