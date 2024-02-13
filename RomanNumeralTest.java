

public class RomanNumeralTest {

    @Test
    public void testRomanToIntBasic() {
        RomanNumeral romanConverter = new RomanNumeral();

        int result = romanConverter.romanToInt("VII");
        assertEquals(7, result, "Conversion of 'VII' should be 7");
    }

    private void assertEquals(int i, int result, String string) {
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    public void testRomanToIntComplex() {
        RomanNumeral romanConverter = new RomanNumeral();

        int result = romanConverter.romanToInt("XIV");
        assertEquals(14, result, "Conversion of 'XIV' should be 14");
    }
}