package zad2;

import java.io.File;

public class Document {
    private File file;
    private short privacy;

    public Document(){
        file = new File("doc.txt");
        privacy = 0;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public short getPrivacy() {
        return privacy;
    }

    public void setPrivacy(short privacy) {
        this.privacy = privacy;
    }
}
