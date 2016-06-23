package ex10;

public class Student {
    private String studentNumber;
    private String name;
    private String address;
    private String tel;

    public static void main(String[] args) {
        Student s1 = new Student("999", "Java太郎", "東京都足立区", "09087654321");

        System.out.println("学籍番号：" + s1.getStudentNumber());

        System.out.println("名前：" + s1.getName());
        System.out.println("名前を\"Java二郎\"に変更");
        s1.setName("Java二郎");
        System.out.println("名前：" + s1.getName());

        System.out.println("住所：" + s1.getAddress());
        System.out.println("住所を\"東京都千代田区\"に変更");
        s1.setAddress("東京都千代田区");
        System.out.println("住所：" + s1.getAddress());

        System.out.println("電話番号：" + s1.getTel());
        System.out.println("電話番号を\"09012345678\"に変更");
        s1.setTel("09012345678");
        System.out.println("電話番号：" + s1.getTel());

        System.out.println(s1);
    }

    public Student(String studentNumber, String name, String address, String tel) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.address = address;
        this.tel = tel;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String toString() {
        return "a Student(" + studentNumber + ", " + name + ", " + address + ", " + tel + ")";
    }
}
