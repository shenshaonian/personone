package one;

import org.junit.Test;


enum SS {
    GREEN, YELLOW, RED
}

public class Hosee {

    @Test
    public void testColor() {
        System.out.println(color);
        change();
        System.out.println(color);

    }

    SS color = SS.GREEN;

    public void change() {
        switch (color) {
            case RED:
                color = SS.YELLOW;
                break;
            case YELLOW:
                color = SS.GREEN;
                break;
            case GREEN:
                color = SS.RED;
                break;
            default:
                break;
        }
    }
}
