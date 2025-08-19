
package sqa.test.stub;

public class TemperatureConverterStub {
    public double convert(double value, String fromUnit, String toUnit) {
        return 100.0; // ค่าที่ fix ไว้สำหรับ test integration
    }
}
