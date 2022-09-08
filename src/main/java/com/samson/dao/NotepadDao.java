package com.samson.dao;


import com.samson.entity.Notepad;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 记事本DAO
 * @author su.maosen
 */
@Mapper
public interface NotepadDao {

    List<Notepad> selectAllPage(@Param("page")Integer page,@Param("size")Integer size);

    long total();

    void updateNotepad(Notepad notepad);

    void deleteById(Integer id);

    void insertNotepad(Notepad notepad);
}
