package doselect;

public class Problem2 {

    public static void main(String[] args) {

        Activity a = new Activity("helloworldbye", "world", "*");
        Source source = new Source();
        String result = source.handleException(a);
        System.out.println(result);
    }


}

class Activity {
    String string1, string2, operator;

    public Activity(String string1, String string2, String operator) {
        this.string1 = string1;
        this.string2 = string2;
        this.operator = operator;
    }

}

class Source {

    public String doOperation(Activity a) {
        switch (a.operator) {
            case "+": {
                return a.string1 + a.string2;
            }

            case "-": {
                String replaced = a.string1.replaceAll(a.string2, "");
                return replaced;
                /*
                int index=a.string1.indexOf(a.string2);
                int endIndex = index+a.string2.length();
                String startString=a.string1.substring(0,index);
                String endString=a.string1.substring(endIndex);
                String result=startString+endString;
                return result;*/
            }

            default: {
                return a.string1;
            }

        }

    }


    public String handleException(Activity a) {
        try {
            if (a.string1 == null || a.string2 == null) {
                throw new NullPointerException("Null values found");
            }

            if (!a.operator.equals("+") && !a.operator.equals("-")) {
                throw new Exception(a.operator);
            }

            return "No Exception Found";

        } catch (NullPointerException e) {
            return e.getMessage();
        } catch (Exception e) {
            return e.getMessage();
        }

    }

}
