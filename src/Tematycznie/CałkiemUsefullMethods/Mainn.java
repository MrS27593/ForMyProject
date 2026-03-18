package Tematycznie.CałkiemUsefullMethods;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Mainn {
    public static void main(String[] args) throws IOException {

        String allfodersString = "abstract\n" +
                "assert\n" +
                "boolean\n" +
                "break\n" +
                "byte\n" +
                "case\n" +
                "catch\n" +
                "char\n" +
                "class\n" +
                "const (zarezerwowane, ale nieużywane)\n" +
                "continue\n" +
                "default\n" +
                "do\n" +
                "double\n" +
                "else\n" +
                "enum\n" +
                "extends\n" +
                "final\n" +
                "finally\n" +
                "float\n" +
                "for\n" +
                "goto (zarezerwowane, ale nieużywane)\n" +
                "if\n" +
                "implements\n" +
                "import\n" +
                "instanceof\n" +
                "int\n" +
                "interface\n" +
                "long\n" +
                "native\n" +
                "new\n" +
                "package\n" +
                "private\n" +
                "protected\n" +
                "public\n" +
                "return\n" +
                "short\n" +
                "static\n" +
                "strictfp\n" +
                "super\n" +
                "switch\n" +
                "synchronized\n" +
                "this\n" +
                "throw\n" +
                "throws\n" +
                "transient\n" +
                "try\n" +
                "void\n" +
                "volatile\n" +
                "while\n"+
                "null\n"+
                "true\n"+
                "false\n";

        StringBuilder stringBuilder = new StringBuilder();
        boolean capitalizatinNext = true;

        for(char c: allfodersString.toCharArray()){
            if(capitalizatinNext&&Character.isLetter(c)){
                stringBuilder.append((Character.toUpperCase(c)));
                capitalizatinNext = false;
            }else {
                stringBuilder.append(c);
            }

            if(c=='\n'){
                capitalizatinNext=true;
            }
        }


        System.out.println(stringBuilder.toString());

        List<String> foldersNames =  Arrays.asList(stringBuilder.toString().split("\\r?\\n"));

        foldersNames.forEach(System.out::println);

        FolderCreator.main("C:\\Users\\HolvePC\\Desktop\\Java\\src\\SlowaKluczowe", foldersNames);

        FolderCreator.createFiles("C:\\Users\\HolvePC\\Desktop\\Java\\src\\SlowaKluczowe",foldersNames);
        FolderCreator.removeFiles("C:\\Users\\HolvePC\\Desktop\\Java\\src\\SlowaKluczowe",foldersNames);
    }
}
