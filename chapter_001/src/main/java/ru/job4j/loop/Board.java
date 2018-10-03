package ru.job4j.loop;
/**
 * Counter.
 * @author Maksim Zheltov (mvzheltov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int indexHeght = 1; indexHeght <= height; indexHeght++) {
            for (int indexWidht = 1; indexWidht <= width; indexWidht++) {
                if ((indexHeght + indexWidht) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
