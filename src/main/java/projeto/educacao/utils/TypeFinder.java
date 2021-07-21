package projeto.educacao.utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class TypeFinder {
    public static String findType(String s) throws NumberFormatException{
        if (s == null) return null;
        if (testLocalDate(s)){
            return "date";
        }else if (testLong(s)){
            return "numeric";
        }else if (testDouble(s)){
            return "float";
        }else{
            return "varchar";
        }

    }
    private static boolean testLong(String s){
        try{
            Long.parseLong(s);
            return true;
        }catch (NumberFormatException e) {return false;}
    }
    private static boolean testDouble(String s){
        try{
            Double.parseDouble(s);
            return true;
        }catch (NumberFormatException e) {return false;}
    }
    private static boolean testLocalDate(String s){
        try{
            LocalDate.parse(s);
            return true;
        }catch (DateTimeParseException e) {return false;}
    }
}

