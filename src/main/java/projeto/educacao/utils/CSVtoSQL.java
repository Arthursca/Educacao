package projeto.educacao.utils;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVtoSQL {
    @org.jetbrains.annotations.NotNull
    public static String createTableFromFile(String[] colluns, String tbName , String[] type) {

            String query = "CREATE TABLE "+ tbName + " ( ID numeric PRIMARY KEY AUTOINCREMENT,";
            for (int j = 0; j < colluns.length - 1;j++)
            {
                String element = colluns[j] + " " + type[j] + ", ";
                query = query + element;
            }
            query = query + colluns[colluns.length - 1] + " " + type[colluns.length - 1] + ");";
            return query;
    }

    public static String createTableFromCSV(String path, String tbName , String split){
        try{
            BufferedReader csvReader = new BufferedReader(new FileReader(path));
            String row = csvReader.readLine();

            String[] colluns = row.split(split);
            csvReader.readLine();
            String[] type = new String[colluns.length];
            int i = 0;
            for (String ex : csvReader.readLine().split(split)){
                type[i] = TypeFinder.findType(ex);
                i++;
            }

            csvReader.close();
            return createTableFromFile(colluns, tbName, type);
    } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return null;
    }


}
