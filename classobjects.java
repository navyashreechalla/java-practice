class CSG {
    String name;
    void setName(String name) {
        this.name = name;
    }
}

public class classobjects {
    public static void main(String[] args) {
        CSG student1 = new CSG();
        student1.setName("Navya");
        System.out.println(student1.name);

    }
}