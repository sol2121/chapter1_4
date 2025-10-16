
package pakage4;
  import java.io.*;

public class Chapter1_Challenge_1_4 {

    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            File configFile = new File("config.txt");
            reader = new BufferedReader(new FileReader(configFile));

            // Read and parse the first line (version)
            String versionLine = reader.readLine();
            int version = Integer.parseInt(versionLine);

            // Check version validity
            if (version < 2) {
                throw new Exception("Config version too old!");
            }

            // Read the second line (file path)
            String filePath = reader.readLine();
            File pathFile = new File(filePath);
            if (!pathFile.exists()) {
                throw new IOException("Configured file path does not exist: " + filePath);
            }

            // If everything is fine
            System.out.println("Config version: " + version);
            System.out.println("File path exists: " + filePath);

        } catch (FileNotFoundException e) {
            System.out.println("Error: Config version too oid!");
        } catch (IOException e) {
            System.out.println("Error: I/O problem - " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: First line is not a valid number.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Config read attempt finished.");
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                // Ignore silently or log if needed
            }
        }
    }
}
  

