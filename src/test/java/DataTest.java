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
    protected String input12="//-\n12-10-3-1-2";
    protected int output12 = 28;

    protected String input13="//;\n-10;-3;-2";
    protected String output13="negatives not allowed -10 -3 -2";
    protected String input14="//-\n10-3--2";
    protected String output14="negatives not allowed -2";
    protected String input15="-10,3\n-2";
    protected String output15="negatives not allowed -10 -2";

    protected String input16="//.\n1200.3.1.2.2";
    protected int output16 = 8;
    protected String input17="12,10,1003\n1\n2";
    protected int output17 = 25;

    protected String input18="//[-;-]\n1200-;-3-;-1-;-2-;-2";
    protected int output18 = 8;
    protected String input19="//[:::]\n12:::10:::1003\n1\n2";
    protected int output19 = 25;

    protected String input20="//[-;-][%]\n1200-;-3-;-1-;-2-;-2%2";
    protected int output20 = 10;
    protected String input21="//[:::][-][%%]\n12:::10-1003%%1\n2";
    protected int output21 = 25;
    protected String input22="//[:][-][%]\n12:10-1003%1\n2";
    protected int output22 = 25;

}
