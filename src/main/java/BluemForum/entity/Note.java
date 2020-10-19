package BluemForum.entity;


public class Note {
    private Integer noteId;
    private String noteName;
    private String noteInf;
    private String noteTime;
    private String noteUser;
    private String noteBank;
    private Integer noteHot;

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public String getNoteName() {
        return noteName;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    public String getNoteInf() {
        return noteInf;
    }

    public void setNoteInf(String noteInf) {
        this.noteInf = noteInf;
    }

    public String getNoteTime() {
        return noteTime;
    }

    public void setNoteTime(String noteTime) {
        this.noteTime = noteTime;
    }

    public String getNoteUser() {
        return noteUser;
    }

    public void setNoteUser(String noteUser) {
        this.noteUser = noteUser;
    }

    public String getNoteBank() {
        return noteBank;
    }

    public void setNoteBank(String noteBank) {
        this.noteBank = noteBank;
    }

    public Integer getNoteHot() {
        return noteHot;
    }

    public void setNoteHot(Integer noteHot) {
        this.noteHot = noteHot;
    }
}
