public class DataValid {
    private boolean validator1(String someString){
        return someString.matches("(\\-?\\d+)|((\\-?\\d+)([,\n]{1}\\-?\\d+)+)");
    }
    public boolean validator(String someString){
        if (!someString.startsWith("//"))  {
            if (someString.isEmpty()){
                return true;
            }
            return validator1(someString);
        }
       return true;
    }

}
