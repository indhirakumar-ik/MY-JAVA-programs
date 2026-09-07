import java.io.*;

public class RemoveEmptyLines {

    public static void main(String[] args) {

        String inputFile = "Application documentation.txt";
        String outputFile = "output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;

            while ((line = reader.readLine()) != null) {

                // Remove empty lines and lines containing only spaces
                if (!line.trim().isEmpty()) {
                    writer.write(line);
                    writer.newLine();
                }
            }

            reader.close();
            writer.close();

            System.out.println("Empty lines removed successfully!");
            System.out.println("Output saved in: " + outputFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}