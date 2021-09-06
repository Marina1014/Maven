package kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", romTallConvert.toRoman(1));
    }
}
