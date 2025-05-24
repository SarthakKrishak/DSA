class basics_01 {
    public static void main(String[] args) {
        Student sarthak;
        sarthak = new Student();

        sarthak.rollno = 20;
        sarthak.name = "Sarthak";
        sarthak.marks = 90;
            System.out.println(sarthak.rollno);
            System.out.println(sarthak.name);
            System.out.println(sarthak.marks);
    }
}


class Student {
    int rollno;
    String name;
    float marks = 80;
}