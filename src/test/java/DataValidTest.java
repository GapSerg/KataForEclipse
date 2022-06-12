import org.junit.Assert;
import org.junit.Test;

public class DataValidTest {
    DataTest dataTest = new DataTest();
    DataValid dataValid = new DataValid();

    @Test
    public void testNoElement() {
        Assert.assertTrue( dataValid.validator(dataTest.input1));
    }
    @Test
    public void oneElement() {
        Assert.assertTrue( dataValid.validator(dataTest.input2));
        Assert.assertFalse( dataValid.validator(","));
        Assert.assertTrue( dataValid.validator("-8"));
    }
    @Test
    public void twoElement() {
        Assert.assertTrue( dataValid.validator(dataTest.input3));
        Assert.assertTrue( dataValid.validator(dataTest.input4));
        Assert.assertFalse( dataValid.validator("12,,8"));
        Assert.assertFalse( dataValid.validator(",12,8"));
    }
    @Test
    public void anyElementStep2() {
        Assert.assertTrue( dataValid.validator(dataTest.input5));
        Assert.assertTrue( dataValid.validator(dataTest.input6));
        Assert.assertFalse( dataValid.validator("1,,2,3,4"));
        Assert.assertFalse( dataValid.validator("1,3,3,"));

    }
    @Test
    public void anyElementStep3() {
        Assert.assertFalse( dataValid.validator("1,\n2,4"));
        Assert.assertFalse( dataValid.validator("1,2\n\n5"));
        Assert.assertTrue( dataValid.validator(dataTest.input7));
        Assert.assertTrue( dataValid.validator(dataTest.input8));

    }





}
