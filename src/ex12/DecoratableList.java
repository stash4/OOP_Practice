package ex12;

import java.util.ArrayList;

public class DecoratableList {
    public static void main(String[] args) {
        ArrayList<Decoratable> decoList = new ArrayList<Decoratable>();
        Star star1 = new Star("Javaでｼﾞｬﾊﾞｼﾞｬﾊﾞ");
        Box box1 = new Box("Javaでｼﾞｬﾊﾞｼﾞｬﾊﾞ");
        List list1 = new List("Javaでｼﾞｬﾊﾞｼﾞｬﾊﾞ", 3);
        FreeStyle freeStyle1 = new FreeStyle("Javaでｼﾞｬﾊﾞｼﾞｬﾊﾞ");
        decoList.add(star1);
        decoList.add(box1);
        decoList.add(list1);
        decoList.add(freeStyle1);
        for (Decoratable deco : decoList) {
            deco.decorate();
        }
    }
}
