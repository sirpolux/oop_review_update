package AccessControl;

import Alphabets.A;

public class ProtectedMemberAccess extends A {
    ProtectedMemberAccess(String a){
        super(a);
    }

    public static void main(String[] args) {
        ProtectedMemberAccess a = new ProtectedMemberAccess("Sample text");
        A a2 = new A("Sample text");
        System.out.println(a.alphabet);
    }

}
