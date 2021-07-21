package projeto.educacao.utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class XLSX {


        public static Iterator<Row> Connect(String path) {
            FileInputStream fisPlanilha = null;

            try {
                File file = new File("D:\\Documentos\\Projeto Educação\\avaliacao\\2017\\Municipios\\TAXA_REND_2017_MUNICIPIOS\\TX_REND_MUNICIPIOS_2017.xlsx");
                fisPlanilha = new FileInputStream(file);

                //cria um workbook = planilha toda com todas as abas
                XSSFWorkbook workbook = new XSSFWorkbook(fisPlanilha);

                //recuperamos apenas a primeira aba ou primeira planilha
                XSSFSheet sheet = workbook.getSheetAt(0);

                //retorna todas as linhas da planilha 0 (aba 1)
                return sheet.iterator();

            } catch (
                    FileNotFoundException ex) {
                Logger.getLogger(XLSX.class.getName()).log(Level.SEVERE, null, ex);
            } catch (
                    IOException ex) {
                Logger.getLogger(XLSX.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fisPlanilha.close();
                } catch (IOException ex) {
                    Logger.getLogger(XLSX.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return null;
        }
}


