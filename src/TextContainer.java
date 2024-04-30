import java.io.FileNotFoundException;
import java.io.PrintWriter;

@SaveTo(
    path = " text.txt "
)
public class TextContainer {
    private String text;

    public TextContainer() {
        this.text = this.text;
    }

    @Save
    public void save(String path) {
        try {
            PrintWriter printWriter = new PrintWriter(path);

            try {
                printWriter.println(this.text);
            } catch (Throwable var6) {
                try {
                    printWriter.close();
                } catch (Throwable var5) {
                    var6.addSuppressed(var5);
                }

                throw var6;
            }

            printWriter.close();
        } catch (FileNotFoundException var7) {
            FileNotFoundException e = var7;
            e.printStackTrace();
        }

    }
}
