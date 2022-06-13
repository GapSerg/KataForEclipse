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
    @Test
    public void anyElementStep4() {

        Assert.assertTrue(dataValid.validator(dataTest.input9));
        Assert.assertTrue(dataValid.validator(dataTest.input10));
        Assert.assertTrue(dataValid.validator(dataTest.input11));
        Assert.assertTrue(dataValid.validator(dataTest.input12));
        Assert.assertFalse( dataValid.validator("//:/n\n1\n2:4"));
        Assert.assertFalse( dataValid.validator("//:\n1:2::4"));
        Assert.assertFalse( dataValid.validator("///:\n1:2:4"));

    }
        @Test
        public void anyElementWithNegative() {
        Assert.assertTrue( dataValid.validator(dataTest.input13));
        Assert.assertTrue( dataValid.validator(dataTest.input14));
        Assert.assertTrue( dataValid.validator(dataTest.input15));
        Assert.assertTrue( dataValid.validator(dataTest.input16));
        Assert.assertTrue( dataValid.validator(dataTest.input17));
        Assert.assertFalse( dataValid.validator("//-\n10-3--2-"));
        Assert.assertFalse( dataValid.validator("//-\n10-3---2"));
        Assert.assertFalse( dataValid.validator("//-\n--10-3---2"));

    }
    @Test
    public void anyElementManyAndMultDelit() {
        Assert.assertTrue( dataValid.validator(dataTest.input18));
        Assert.assertTrue( dataValid.validator(dataTest.input19));
        Assert.assertTrue( dataValid.validator(dataTest.input20));
        Assert.assertTrue( dataValid.validator(dataTest.input21));
        Assert.assertTrue( dataValid.validator(dataTest.input22));
        Assert.assertFalse( dataValid.validator("//[::][-][%%]\n12:::10-1003%%1\n2"));
        Assert.assertFalse( dataValid.validator("//[:][-][%]\n12:10-1003%1%%2"));
        Assert.assertFalse( dataValid.validator("//[:][--][%]\n-12:10-1003%1--2"));

    }





}
