package Tematycznie.CałkiemUsefullMethods;

import java.io.*;
import java.util.*;
public class FolderCreator {
    public static void main(String basePath, List<String> foldersName) {

        for (String folderName : foldersName) {
            String path = basePath + File.separator + folderName.replace(".", File.separator);
            File folder = new File(basePath + File.separator + folderName);
            if (!folder.exists()) {
                boolean created = folder.mkdirs();
                if (created) {
                    System.out.println("Folder utworzony" + folder.getAbsolutePath());
                } else {
                    System.out.println("Nie udało się utworzyć folderu " + folder.getAbsolutePath());
                }
            } else {
                System.out.println("Foplder już istnieje " + folder.getAbsolutePath());
            }

        }
    }

    public static void createFiles(String basePath, List<String> foldersName) throws IOException {
        for (String fileName : foldersName) {
            String path = basePath + File.separator + fileName.replace(".", File.separator);
            File plik = new File(basePath + File.separator + fileName + File.separator + fileName);
            if (!plik.exists()) {
                boolean created = plik.createNewFile();
                if (created) {
                    System.out.println("Plik utworzony" + plik.getAbsolutePath());
                } else {
                    System.out.println("Nie udało się utworzyć pliku " + plik.getAbsolutePath());
                }
            } else {
                System.out.println("Plik już istnieje " + plik.getAbsolutePath());
            }

            File plik2 = new File(basePath + File.separator + fileName + File.separator + fileName + " c");
            if (!plik2.exists()) {
                boolean created = plik2.createNewFile();
                if (created) {
                    System.out.println("Plik utworzony" + plik.getAbsolutePath());
                } else {
                    System.out.println("Nie udało się utworzyć pliku " + plik.getAbsolutePath());
                }
            } else {
                System.out.println("Plik już istnieje " + plik.getAbsolutePath());
            }

            File plik3 = new File(basePath + File.separator + fileName + File.separator + fileName + " q");
            if (!plik3.exists()) {
                boolean created = plik3.createNewFile();
                if (created) {
                    System.out.println("Plik utworzony" + plik.getAbsolutePath());
                } else {
                    System.out.println("Nie udało się utworzyć pliku " + plik.getAbsolutePath());
                }
            } else {
                System.out.println("Plik już istnieje " + plik.getAbsolutePath());
            }

        }
    }

        public static void removeFiles (String basePath, List < String > foldersName) throws IOException {
            for (String fileName : foldersName) {
                String path = basePath + File.separator + fileName.replace(".", File.separator);
                File plik = new File(basePath + File.separator + fileName + File.separator + fileName);
                if (!plik.exists()) {
                    boolean created = plik.delete();
                    if (created) {
                        System.out.println("Plik utworzony" + plik.getAbsolutePath());
                    } else {
                        System.out.println("Nie udało się utworzyć pliku " + plik.getAbsolutePath());
                    }
                } else {
                    System.out.println("Plik już istnieje " + plik.getAbsolutePath());
                }

                File plik2 = new File(basePath + File.separator + fileName + File.separator + fileName + "c");
                if (!plik2.exists()) {
                    boolean created = plik2.delete();
                    if (created) {
                        System.out.println("Plik utworzony" + plik.getAbsolutePath());
                    } else {
                        System.out.println("Nie udało się utworzyć pliku " + plik.getAbsolutePath());
                    }
                } else {
                    System.out.println("Plik już istnieje " + plik.getAbsolutePath());
                }

                File plik3 = new File(basePath + File.separator + fileName + File.separator + fileName + "q");
                if (!plik3.exists()) {
                    boolean created = plik3.delete();
                    if (created) {
                        System.out.println("Plik utworzony" + plik.getAbsolutePath());
                    } else {
                        System.out.println("Nie udało się utworzyć pliku " + plik.getAbsolutePath());
                    }
                } else {
                    System.out.println("Plik już istnieje " + plik.getAbsolutePath());
                }

            }

        }
    }


