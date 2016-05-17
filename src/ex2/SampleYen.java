package ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class SampleYen extends JFrame {
    private SamplePanel sp;

    public static void main(String args[]) {
        SampleYen sm = new SampleYen();
    }

    public SampleYen() {
        super("Sample円");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        sp = new SamplePanel();
        add(sp, BorderLayout.CENTER);
        setVisible(true);
    }

    public class SamplePanel extends JPanel {
        private ArrayList<Yen> yenlist
                = new ArrayList<Yen>();

        public SamplePanel() {
            addMouseListener(new SampleMouseListener());
        }

        public void paint(Graphics g) {
            super.paint(g);
            Iterator<Yen> it = yenlist.iterator();
            while (it.hasNext()) {
                Yen c = it.next();
                c.draw(g);
            }
        }

        public class SampleMouseListener extends MouseAdapter {
            public void mousePressed(MouseEvent e) {
                yenlist.add(new Yen(e.getX(), e.getY()));
                repaint();
            }
        }
    }
}
