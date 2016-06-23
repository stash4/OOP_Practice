package ex10;

public class TA extends Student {
    private String subject;
    private String extension;

    public static void main(String[] args) {
        TA t1 = new TA("999", "Java太郎", "東京都足立区", "09087654321", "Processing", "1234");

        System.out.println("学籍番号：" + t1.getStudentNumber());

        System.out.println("名前：" + t1.getName());
        System.out.println("名前を\"Java二郎\"に変更");
        t1.setName("Java二郎");
        System.out.println("名前：" + t1.getName());

        System.out.println("住所：" + t1.getAddress());
        System.out.println("住所を\"東京都千代田区\"に変更");
        t1.setAddress("東京都千代田区");
        System.out.println("住所：" + t1.getAddress());

        System.out.println("電話番号：" + t1.getTel());
        System.out.println("電話番号を\"09012345678\"に変更");
        t1.setTel("09012345678");
        System.out.println("電話番号：" + t1.getTel());

        System.out.println("担当科目：" + t1.getTel());
        System.out.println("担当科目を\"OOP\"に変更");
        t1.setTel("OOP");
        System.out.println("担当科目：" + t1.getTel());

        System.out.println("内線番号：" + t1.getTel());
        System.out.println("内線番号を\"4321\"に変更");
        t1.setTel("4321");
        System.out.println("内線番号：" + t1.getTel());

        System.out.println(t1);
    }

    public TA(String studentNumber, String name, String address, String tel, String subject, String extension) {
        super(studentNumber, name, address, tel);
        this.subject = subject;
        this.extension = extension;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "a TA(" + getStudentNumber() + ", " + getName() + ", " + getAddress() + ", " + getTel() + ", " + subject + ", " + extension + ")";
    }
}
