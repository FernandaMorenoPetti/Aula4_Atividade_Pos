import org.junit.Test;
import static org.junit.Assert.*;

public class ConversorCartaTest {

    @Test
    public void testConverteAsParaInt() {
        assertEquals(1, ConversorCarta.converteCartaParaInt("A"));
        assertEquals(1, ConversorCarta.converteCartaParaInt("a"));
    }

    @Test
    public void testConverteNumerosParaInt() {
        assertEquals(2, ConversorCarta.converteCartaParaInt("2"));
        assertEquals(3, ConversorCarta.converteCartaParaInt("3"));
    }

    @Test
    public void testConverteCartasFaceParaInt() {
        assertEquals(11, ConversorCarta.converteCartaParaInt("J"));
        assertEquals(12, ConversorCarta.converteCartaParaInt("Q"));
        assertEquals(13, ConversorCarta.converteCartaParaInt("K"));
    }
}

public class ConversorCarta {
    public static int converteCartaParaInt(String carta) {
        switch (carta.toLowerCase()) {
            case "a":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            case "j":
                return 11;
            case "q":
                return 12;
            case "k":
                return 13;
            default:
                return -1;
        }
    }
}
