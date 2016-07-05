package ex12;

public class List implements Decoratable {
    private String str;
    private int n;

    public List(String str, int n) {
        this.str = str;
        this.n = n;
    }

    @Override
    public void decorate() {
        for (int i = 0; i < n; i++) {
            System.out.println("・" + str + "!");
        }
    }
}
