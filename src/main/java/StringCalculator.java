import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public int add1(String numbers,String splitter) {
        int result = 0;
        int sing =1;
        StringBuilder exceptionMessage= new StringBuilder("negatives not allowed");

        if (!numbers.contains(splitter)) {
            return Integer.parseInt(numbers);
        }

       if ("([{\\^-=$!|]})?*+.".contains(splitter)){
           splitter="\\"+splitter;
       }
        String[] part = numbers.split(splitter);
        if (splitter.equals("\\-")) {

            for (String s : part) {
                if (s.isEmpty()) {
                    sing = -1;
                } else {
                    if (sing * Integer.parseInt(s) > 1000) {
                        continue;
                    }
                    result += sing * Integer.parseInt(s);

                    if (sing * Integer.parseInt(s) < 0) {
                        exceptionMessage.append(" ").append(sing * Integer.parseInt(s));
                    }
                    sing = 1;

                }
            }
        }
        else {
            for (String s : part) {
                if (Integer.parseInt(s) > 1000) {
                    continue;
                }
                result += Integer.parseInt(s);

                if (Integer.parseInt(s) < 0) {
                    exceptionMessage.append(" ").append(Integer.parseInt(s));
                }

            }


        }

        if (exceptionMessage.length()>21)
        {
            throw new NegativeDataException(exceptionMessage.toString());
        }



        return result;
    }

    public int add2(String numbers) {

        if (numbers.isEmpty()) {
            return 0;
        }

        int enterIndex;
        String partOfNumbers;
        String splitter;

        if (numbers.startsWith("//")){

            enterIndex = numbers.indexOf("\n");
            splitter=numbers.substring(enterIndex-1,enterIndex);
            partOfNumbers=numbers.substring(enterIndex+1).replaceAll("\n",splitter);


        }
        else
        {   splitter=",";
            partOfNumbers=numbers.replaceAll("\n", splitter);

        }

        return add1(partOfNumbers,splitter);

    }

    public int add(String numbers){
        Pattern pattern = Pattern.compile("\\[.+?\\]");
        Matcher matcher = pattern.matcher(numbers);

        String  partOfNumbers;
        List<String> splitters=new ArrayList<>();
        while (matcher.find()) {
            splitters.add(numbers.substring(matcher.start()+1, matcher.end()-1));

        }
        if (splitters.isEmpty()){
            return add2(numbers);
        }
        else
        {
            partOfNumbers = numbers.substring(numbers.indexOf("\n") + 1);
            if (splitters.size()>1) {
                for(int i=1;i<splitters.size();i++){
                    partOfNumbers = partOfNumbers.replaceAll(splitters.get(i), splitters.get(0));
                }

            }

                partOfNumbers = partOfNumbers.replaceAll("\n", splitters.get(0));
                return add1(partOfNumbers, splitters.get(0));

        }

    }



}
