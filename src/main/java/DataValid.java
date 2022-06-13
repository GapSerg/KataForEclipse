import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValid {
    private boolean validator1(String someString){
        return someString.matches("(\\-?\\d+)|((\\-?\\d+)([,\n]{1}\\-?\\d+)+)");
    }
    private String convertStringWithMinus (String someString){
        StringBuilder rezult = new StringBuilder();
        String[] temp= someString.split("\\-");
        for (String s :temp) {
            if (s.isEmpty()){
                rezult.append("-");
            }
            else rezult.append(s).append(",");

        }
           rezult.deleteCharAt(rezult.length()-1);
        return rezult.toString();
    }
    public boolean validator(String someString){
        String splitter;
        if (!someString.startsWith("//"))  {
            if (someString.isEmpty()){
                return true;
            }
            return validator1(someString);
        }
        else {
            if (someString.substring(3,4).equals("\n")) {
                splitter = someString.substring(2, 3);
                
                if ("([{\\^-=$!|]})?*+.".contains(splitter)){
                    splitter="\\"+splitter;
                }
                 if (splitter.equals("\\-")){
                     if (someString.charAt(someString.length()-1)=='-'){
                         return false;
                     }
                     return validator1(convertStringWithMinus(someString.substring(4)));
                 }
                return validator1(someString.substring(4).replaceAll(splitter, ","));
            }
            else{

                String[] partOfSomeString = someString.split("\n",2);
                if (!partOfSomeString[0].matches("/{2}(\\[.+?\\])+")){
                    return false;
                }
                else {
                    Pattern pattern = Pattern.compile("\\[.+?\\]");
                    Matcher matcher = pattern.matcher(partOfSomeString[0]);
                    List<String> splitters=new ArrayList<>();
                    while (matcher.find()) {
                        splitters.add(partOfSomeString[0].substring(matcher.start()+1, matcher.end()-1));

                    }
                    for(int i=0;i<splitters.size();i++){
                        if ("([{\\^-=$!|]})?*+.".contains(splitters.get(i))){
                            splitters.set(i,"\\"+splitters.get(i));
                        }
                        if (splitters.get(i).equals("\\-")){
                            if (someString.charAt(someString.length()-1)=='-'){
                                return false;
                            }
                            partOfSomeString[1]=convertStringWithMinus(partOfSomeString[1]);
                        }
                        else partOfSomeString[1] = partOfSomeString[1].replaceAll(splitters.get(i), ",");
                    }
                    return validator1(partOfSomeString[1]);
                }


            }




        }


    }

}
