class A {
  String s1 = "I am class A";
}

class B extends A {
  String s2 = "I am class B";

  B(){
    System.out.println(s1);
  }
}

class C extends B {
  C() {
    System.out.println(s2);
  }
}

class inheritance {
  public static void main(String[] args){
    B b1 = new B();
    C c1 = new C();

  }
}

