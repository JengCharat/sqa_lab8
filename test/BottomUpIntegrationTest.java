
package sqa.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import sqa.main.*;

class BottomUpIntegrationTest {

    @Test
    void testTemperatureConverter_FtoC() {
        TemperatureConverter tc = new TemperatureConverter();
        double result = tc.convert(212, "fahrenheit", "celsius");
        assertEquals(100.0, result, 0.001);
    }

    @Test
    void testTemperatureConverter_CtoF() {
        TemperatureConverter tc = new TemperatureConverter();
        double result = tc.convert(0, "celsius", "fahrenheit");
        assertEquals(32.0, result, 0.001);
    }

    @Test
    void testMassConverter_CupToGram() {
        MassConverter mc = new MassConverter();
        double result = mc.convert(1, "cup", "gram");
        assertEquals(125.0, result, 0.001);
    }

    @Test
    void testMassConverter_TablespoonToGram() {
        MassConverter mc = new MassConverter();
        double result = mc.convert(2, "tablespoon", "gram");
        assertEquals(16.0, result, 0.001);
    }

    @Test
    void testLiquidConverter_CupToMl() {
        LiquidVolumeConverter lc = new LiquidVolumeConverter();
        double result = lc.convert(1, "cup", "ml");
        assertEquals(250.0, result, 0.001);
    }

    @Test
    void testLiquidConverter_TeaspoonToMl() {
        LiquidVolumeConverter lc = new LiquidVolumeConverter();
        double result = lc.convert(3, "teaspoon", "ml");
        assertEquals(15.0, result, 0.001);
    }

    @Test
    void testCookingCalculator_Temperature() {
        CookingConversionCalculator calc = new CookingConversionCalculator();
        double result = calc.convert(212, "temperature", "fahrenheit", "celsius");
        assertEquals(100.0, result, 0.001);
    }

    @Test
    void testCookingCalculator_Mass() {
        CookingConversionCalculator calc = new CookingConversionCalculator();
        double result = calc.convert(1, "mass", "cup", "gram");
        assertEquals(125.0, result, 0.001);
    }

    @Test
    void testCookingCalculator_Liquid() {
        CookingConversionCalculator calc = new CookingConversionCalculator();
        double result = calc.convert(1, "liquid", "cup", "ml");
        assertEquals(250.0, result, 0.001);
    }
}
