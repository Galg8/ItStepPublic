package Task6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;

public class Main {
    public static void main(String[] args) throws IOException{
        XmlReader xlr = new XmlReader();

        for(int i = 0; i < 10; i++) {
            try {
                xlr.read();
            }
            catch (FileSystemAlreadyExistsException ex) {
                throw new RuntimeException(ex);
               // throw new FileNotFoundException(ex.toString());

            }
        }

    }
}
