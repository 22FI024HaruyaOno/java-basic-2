public class ClassD {
    String name = "クラスD";
    public static void main(String[] args) {
        ClassD Class_D = new ClassD();
        Class_D.showName();
    }
    public ClassD() {
        InnerClassD iClassD = new InnerClassD();
        iClassD.State();
    }
    public void showName() {
        System.out.println(name);
    }
    /**
     * InnerClassD
     */
    public class InnerClassD {
        public void State() {
            System.out.println("インナークラスだよ!");
        }
    }
}