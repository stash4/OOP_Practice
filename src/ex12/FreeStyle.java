package ex12;

import java.io.UnsupportedEncodingException;

public class FreeStyle implements Decoratable {
    private String str;

    public FreeStyle(String str) {
        this.str = str;
    }

    @Override
    public void decorate() {
        String decoTop = "＿";
        String decoBottom = "￣";
        for (int i = 0; i < (this.strBytes() + 2) / 2; i++) {
            decoTop += "人";
            decoBottom += "Y^";
        }
        decoTop += "＿";
        decoBottom += "￣";
        System.out.println(decoTop);
        System.out.println("＞ " + str + " ＜");
        System.out.println(decoBottom);
    }

    public int strBytes() {
        String enc = "SHIFT_JIS";
        int bytes = 0;
        try {
            bytes = str.getBytes(enc).length;
        } catch (UnsupportedEncodingException e) {
            bytes = 0;
            e.printStackTrace();
        }
        return bytes;
    }

    public static void main(String[] args) {
        FreeStyle fs = new FreeStyle("Javaでｼﾞｬﾊﾞｼﾞｬﾊﾞ");
        fs.decorate();
    }
}
