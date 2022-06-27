class Main {
    public static void main (String[] args){
        add addc = new add();
        sub subc = new sub();
        mul mulc = new mul();
        div divc = new div();
        System.out.println("Add Answer Is "+addc.addf());
        System.out.println("Sub Answer Is "+subc.subf());
        System.out.println("Mul Answer Is "+mulc.mulf());
        System.out.println("Div Answer Is "+divc.divf());
    }
}
class add {
    int addf() {
        int a = 5;
        int b = 7;
        return a+b;
    }
}
class sub {
    int subf() {
        int a = 5;
        int b = 7;
        return a-b;
    }
}
class mul {
    int mulf() {
        int a = 5;
        int b = 7;
        return a*b;
    }
}
class div {
    float divf() {
        float a = 5;
        float b = 7;
        return a/b;
    }
}