package BluemForum.entity;


public class Note {
    private Integer NoteID;
    private String NoteName;
    private String NoteInf;
    private String NoteTime;
    private String NoteUser;
    private String NoteBank;
    private Integer NoteHot;

    public String getNoteName() {
        return NoteName;
    }

    public void setNoteName(String noteName) {
        NoteName = noteName;
    }

    public String getNoteUser() {
        return NoteUser;
    }

    public void setNoteUser(String noteUser) {
        NoteUser = noteUser;
    }

    public String getNoteBank() {
        return NoteBank;
    }

    public void setNoteBank(String noteBank) {
        NoteBank = noteBank;
    }

    public Integer getNoteHot() {
        return NoteHot;
    }

    public void setNoteHot(Integer noteHot) {
        NoteHot = noteHot;
    }

    public Integer getNoteID() {
        return NoteID;
    }

    public void setNoteID(Integer noteID) {
        NoteID = noteID;
    }

    public String getNoteInf() {
        return NoteInf;
    }

    public void setNoteInf(String noteInf) {
        NoteInf = noteInf;
    }

    public String getNoteTime() {
        return NoteTime;
    }

    public void setNoteTime(String noteTime) {
        NoteTime = noteTime;
    }

}
