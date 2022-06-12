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

        for (String s : part) {
            if (s.isEmpty()) {
                sing=-1;
            } else
            {
                result += sing*Integer.parseInt(s);
                if (sing*Integer.parseInt(s)<0){
                     exceptionMessage.append(" ").append(sing*Integer.parseInt(s));
                }
                sing=1;
            }
        }

        if (exceptionMessage.length()>21)
        {
            throw new NegativeDataException(exceptionMessage.toString());
        }



        return result;
    }

    public int add(String numbers) {

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



}
