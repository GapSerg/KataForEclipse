import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    DataTest dataTest = new DataTest();
    StringCalculator strCalc = new StringCalculator();

    @Test
    public void testNoElement() {
        Assert.assertEquals(dataTest.output1, strCalc.add(dataTest.input1));
    }

    @Test
    public void oneElement() {
        Assert.assertEquals(dataTest.output2, strCalc.add(dataTest.input2));
    }

    @Test
    public void twoElement() {
        Assert.assertEquals(dataTest.output3, strCalc.add(dataTest.input3));
        Assert.assertEquals(dataTest.output4, strCalc.add(dataTest.input4));
    }

    @Test
    public void anyElement() {

        Assert.assertEquals(dataTest.output5, strCalc.add(dataTest.input5));
        Assert.assertEquals(dataTest.output6, strCalc.add(dataTest.input6));

    }
}
