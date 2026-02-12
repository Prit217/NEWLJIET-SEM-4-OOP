
class ob_cast1 {

    void show1() {
        System.out.println("parent class");
    }
}

class ob_cast extends ob_cast1 {

    void show2() {
        System.out.println("child class");
    }

    public static void main(String[] args) {
        ob_cast c = new ob_cast();
        c.show2();
        ob_cast1 p = new ob_cast();
        p.show1();

        ob_cast cc = (ob_cast) p;
        cc.show1();

    }
}
