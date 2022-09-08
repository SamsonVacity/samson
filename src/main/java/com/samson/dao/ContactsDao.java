package com.samson.dao;

import com.samson.entity.Contacts;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 联系人DAO
 * @author su.maosen
 */
@Mapper
public interface ContactsDao {

   //分页查所有
   List<Contacts> selectAllPage(@Param("page")Integer page,@Param("size")Integer size);

   //查询总数
   long total();

   //更新联系人
   void updateContacts(Contacts contacts);

   //删除联系人
   void deleteById(Integer id);

   //新增联系人
   void insertContacs(Contacts contacts);
}