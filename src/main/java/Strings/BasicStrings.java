package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        String concated = string2.concat(string1);
        return concated;
    }

    public char getChar(String string, int index) {

        return string.charAt(index);
    }

    public String iCantSee(String string) {
        String empty = "";
        for(int i = 0; i<string.length(); i ++){
            empty = empty + " ";
        }
        return empty;
    }

    public String loudAndClear(String string) {
        String s = string.toUpperCase();
        return s;
    }

    public String reverseCase(String string) {
        StringBuffer str = new StringBuffer(string);
        for (int i=0; i<string.length(); i++){
            char c = string.charAt(i);
            if (Character.isLowerCase(c)) {
                str.replace(i, i + 1, Character.toUpperCase(c) + "");
            }else {
                str.replace(i, i + 1, Character.toLowerCase(c) + "");
            }
        }
        String result = str.toString();
        return result;
    }

    public String oneAtATime(String string1, String string2) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<string1.length() || i<string2.length(); i++){
            if (i<string1.length()){
                result.append(string1.charAt(i));
            }
            if (i<string2.length()){
                result.append(string2.charAt(i));
            }
        }
        return result.toString();
    }
}
