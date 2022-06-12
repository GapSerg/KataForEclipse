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
        Assert.assertEquals(dataTest.output7, strCalc.add(dataTest.input7));
        Assert.assertEquals(dataTest.output8, strCalc.add(dataTest.input8));

    }
    @Test
    public void anyElementStep4() {
        Assert.assertEquals(dataTest.output9,  strCalc.add(dataTest.input9));
        Assert.assertEquals(dataTest.output10, strCalc.add(dataTest.input10));
        Assert.assertEquals(dataTest.output11, strCalc.add(dataTest.input11));
        Assert.assertEquals(dataTest.output12, strCalc.add(dataTest.input12));
        Assert.assertEquals(dataTest.output13, strCalc.add(dataTest.input13));
        Assert.assertEquals(dataTest.output14, strCalc.add(dataTest.input14));


    }


}
