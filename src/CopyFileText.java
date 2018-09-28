import java.io.*;

public class CopyFileText {
    public static void main(String[] args) {

        try {
            String line = readFileText("D:/file.txt");
            File fcopy = new File("D:/file-copy.txt");
            FileWriter fileWriter = new FileWriter(fcopy);
            fileWriter.write(line);
            fileWriter.close();
            readFileText("D:/file-copy.txt");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static String readFileText(String filePath) throws Exception {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = null;
        String result = "";
        while ((line = reader.readLine()) != null) {
            result += (line + " ");
        }
        System.out.println(result);
        reader.close();
        return result;
    }
}
