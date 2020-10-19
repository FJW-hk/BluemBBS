package BluemForum.dao;

import BluemForum.entity.Note;

import java.util.List;

public interface NoteDao {
    /**
     * 上传帖子
     * @param note
     * @return
     */
    int postNote(Note note);

    /**
     * 修改帖子
     * @param note
     * @return
     */
    int changeNote(Note note);

    List<Note> getNote();

}
