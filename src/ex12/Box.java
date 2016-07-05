package ex12;

import java.io.UnsupportedEncodingException;

public class Box implements Decoratable {
    private String str;

    public Box(String str) {
        this.str = str;
    }

    @Override
    public void decorate() {
        String deco = "+";
        String enc = "SHIFT_JIS";
        int strBytes = 0;
        try {
            strBytes = str.getBytes(enc).length;
        } catch (UnsupportedEncodingException e) {
            strBytes = 0;
            e.printStackTrace();
        }
        for (int i = 0; i < strBytes; i++) {
            deco += "-";
        }
        deco += "+";
        System.out.println(deco);
        System.out.println("|" + str + "|");
        System.out.println(deco);
    }
}
