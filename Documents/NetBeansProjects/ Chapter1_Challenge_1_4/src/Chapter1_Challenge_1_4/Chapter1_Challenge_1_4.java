 
package Chapter1_Challenge_1_4;
  import java.io.*;
public class Chapter1_Challenge_1_4 {

    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            File configFile = new File("config.txt");
            reader = new BufferedReader(new FileReader(configFile));

            // Read config version (first line)
            String versionLine = reader.readLine();
            int configVersion = Integer.parseInt(versionLine);

            // Check version
            if (configVersion < 2) {
                throw new Exception("Config version too old!");
            }

            // Read file path (second line)
            String filePath = reader.readLine();
            File pathFile = new File(filePath);

            // Check if file at path exists
            if (!pathFile.exists()) {
                throw new IOException("Referenced file does not exist: " + filePath);
            }

            // All good
            System.out.println("Config loaded successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("Error: config.txt file not found.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format in config file.");
        } catch (IOException e) {
            System.out.println("Error: I/O Exception - " + e.getMessage());
        } catch (Exception e) {
            // Catches our custom config version error
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Config read attempt finished.");
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                // Silently ignore close errors
            }
        }
    }
}
