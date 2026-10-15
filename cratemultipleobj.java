class StudentDetails {
    String name;

    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails();
        StudentDetails s2 = new StudentDetails();

        s1.name = "Rahul";
        s2.name = "Amit";

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
