import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder();

        File src = new File("C:\\Games\\src\\main");
        if (src.mkdirs())
            s.append("Папки src и main созданы\n");
        else
            s.append("Папки src и main НЕ созданы\n");

        File res = new File("C:\\Games\\res\\drawables");
        if (res.mkdirs())
            s.append("Папки res и drawables созданы\n");
        else
            s.append("Папки res и drawables НЕ созданы\n");

        File savegames = new File("C:\\Games\\savegames");
        if (savegames.mkdir())
            s.append("Папка savegames создана\n");
        else
            s.append("Папка savegames НЕ создана\n");

        File temp = new File("C:\\Games\\temp");
        if(temp.mkdir())
            s.append("Папка temp создана\n");
        else
            s.append("Папка temp НЕ создана\n");

        File test = new File("C:\\Games\\src\\test");
        if (test.mkdir())
            s.append("Папка test создана\n");
        else
            s.append("Папкам test НЕ создана\n");

        File vectors = new File("C:\\Games\\res\\vectors");
        if (vectors.mkdir())
            s.append("Папка vectors создана\n");
        else
            s.append("Папкам vectors НЕ создана\n");

        File icons = new File("C:\\Games\\res\\icons");
        if (icons.mkdir())
            s.append("Папка icons создана\n");
        else
            s.append("Папкам icons НЕ создана\n");

        File temps = new File(temp, "temp.txt");
        try { if (temps.createNewFile())
            s.append("Файл temp создан\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }

        File files = new File(src, "Main.java");
        try {
            if(files.createNewFile())
                s.append("Файл Main создан\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }

        File files2 = new File(src, "Utils.java");
        try {
            if(files2.createNewFile())
                s.append("Файл Utils создан\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            FileWriter log = new FileWriter(temps);
            log.write(String.valueOf(s));
            log.flush();
            log.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }


        //System.out.println("Hello world!");
    }
}