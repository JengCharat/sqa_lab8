
package sqa.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import sqa.main.*;

// ใช้ Stub (ขั้นตอนแรก)
import sqa.test.stub.*;

class CookingConversionCalculatorTopDownTest {

    @Test
    void testTemperatureWithStub() {
        CookingConversionCalculator calc = new CookingConversionCalculator() {
            @Override
            public double convert(double value, String choice, String fromUnit, String toUnit) {
                return new TemperatureConverterStub().convert(value, fromUnit, toUnit);
            }
        };

        double result = calc.convert(10, "temperature", "celsius", "fahrenheit");
        assertEquals(100.0, result, 0.001); // Expected from Stub
    }

    @Test
    void testMassWithStub() {
        CookingConversionCalculator calc = new CookingConversionCalculator() {
            @Override
            public double convert(double value, String choice, String fromUnit, String toUnit) {
                return new MassConverterStub().convert(value, fromUnit, toUnit);
            }
        };

        double result = calc.convert(2, "mass", "cup", "gram");
        assertEquals(200.0, result, 0.001); // Expected from Stub
    }

    @Test
    void testLiquidWithStub() {
        CookingConversionCalculator calc = new CookingConversionCalculator() {
            @Override
            public double convert(double value, String choice, String fromUnit, String toUnit) {
                return new LiquidVolumeConverterStub().convert(value, fromUnit, toUnit);
            }
        };

        double result = calc.convert(1, "liquid", "cup", "ml");
        assertEquals(300.0, result, 0.001); // Expected from Stub
    }

    // ขั้นตอนต่อมา → ใช้ module จริง (ไม่ใช้ Stub แล้ว)

    @Test
    void testTemperatureIntegration() {
        CookingConversionCalculator calc = new CookingConversionCalculator();
        double result = calc.convert(212, "temperature", "fahrenheit", "celsius");
        assertEquals(100.0, result, 0.001);
    }

    @Test
    void testMassIntegration() {
        CookingConversionCalculator calc = new CookingConversionCalculator();
        double result = calc.convert(1, "mass", "cup", "gram");
        assertEquals(125.0, result, 0.001);
    }

    @Test
    void testLiquidIntegration() {
        CookingConversionCalculator calc = new CookingConversionCalculator();
        double result = calc.convert(1, "liquid", "cup", "ml");
        assertEquals(250.0, result, 0.001);
    }

    @Test
    void testFullIntegration_Mass() {
        CookingConversionCalculator calc = new CookingConversionCalculator();
        double result = calc.convert(2, "mass", "tablespoon", "gram");
        assertEquals(16.0, result, 0.001);
    }

    @Test
    void testFullIntegration_Liquid() {
        CookingConversionCalculator calc = new CookingConversionCalculator();
        double result = calc.convert(3, "liquid", "teaspoon", "ml");
        assertEquals(15.0, result, 0.001);
    }
}
