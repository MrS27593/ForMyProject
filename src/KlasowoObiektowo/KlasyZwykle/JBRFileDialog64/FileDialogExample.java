package KlasowoObiektowo.KlasyZwykle.JBRFileDialog64;

import java.awt.*;
import java.util.Arrays;

import com.jetbrains.desktop.JBRFileDialog;

public class FileDialogExample {
    public static void main(String[] args) {
        Frame frame = new Frame();
        FileDialog fileDialog = new FileDialog(frame, "Wybierz plik", FileDialog.LOAD);

        // Uzyskanie instancji JBRFileDialog
        JBRFileDialog jbrDialog = JBRFileDialog.get(fileDialog);

        if (jbrDialog != null) {
            // Ustawienie wskazówek wyboru
            jbrDialog.setHints(JBRFileDialog.SELECT_FILES_HINT);

            // Dostosowanie tekstów interfejsu
            jbrDialog.setLocalizationStrings(String.valueOf(JBRFileDialog.SELECT_FILES_HINT), "Otwórz plik");
            jbrDialog.setLocalizationStrings(String.valueOf(JBRFileDialog.SELECT_DIRECTORIES_HINT), "Wszystkie pliki");

            // Ustawienie filtra plików
            jbrDialog.setLocalizationStrings("Pliki tekstowe (*.txt)", Arrays.toString(new String[] {"txt"}));
        }

        fileDialog.setVisible(true);

        String selectedFile = fileDialog.getFile();
        if (selectedFile != null) {
            System.out.println("Wybrano plik: " + selectedFile);
        }

        frame.dispose();
    }
}