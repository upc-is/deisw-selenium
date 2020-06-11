package pe.edu.upc.selenium.test;

import org.junit.jupiter.api.Test;
import pe.edu.upc.selenium.Guru;

import static org.junit.jupiter.api.Assertions.*;

class GuruTest {

    @Test
    void comprar() {
        Guru guru = new Guru();
        String expected = "$900.00";
        String actual = guru.comprar();

        assertEquals(expected, actual);
    }
}