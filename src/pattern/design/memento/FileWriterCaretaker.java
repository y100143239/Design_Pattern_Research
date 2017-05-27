package pattern.design.memento;

/**
 * Created by Alex on 2017/5/27.
 */
public class FileWriterCaretaker {

    private Object obj;

    public void save(FileWriterUtil fileWriter) {
        this.obj = fileWriter.save();
    }

    public void undo(FileWriterUtil fileWriter) {
        fileWriter.undoToLastSave(obj);
    }


}
