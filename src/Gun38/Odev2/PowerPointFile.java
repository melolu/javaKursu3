package Gun38.Odev2;

public class PowerPointFile implements ReadFile{
    @Override
    public String open() {
        return "opening.ppt";
    }

    @Override
    public String read() {
        return "reading.ppt";
    }

    @Override
    public String save() {
        return "saving.ppt";
    }

    @Override
    public String close() {
        return "closing.ppt";
    }
}
