public class DataTest {
    protected String input1 = "";
    protected int output1 = 0;

    protected String input2 = "7";
    protected int output2 = 7;

    protected String input3 = "1,2";
    protected int output3 = 3;
    protected String input4 = "123,12";
    protected int output4 = 135;

    protected String input5 = "1,2,4";
    protected int output5 = 7;
    protected String input6 = "123,12,1,24";
    protected int output6 = 160;
    protected String input7="1\n2,4";
    protected int output7 = 7;
    protected String input8="12\n3,1,2\n2";
    protected int output8 = 20;

    protected String input9="//:\n1\n2:4";
    protected int output9 = 7;
    protected String input10="//,\n12,3,1,2,2";
    protected int output10 = 20;
    protected String input11="//.\n12.3.1.2\n2";
    protected int output11 = 20;
    protected String input12="//^\n12^3^1^2^2";
    protected int output12 = 20;
}
