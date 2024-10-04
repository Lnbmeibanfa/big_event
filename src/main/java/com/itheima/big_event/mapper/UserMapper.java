package com.itheima.big_event.mapper;

import com.itheima.big_event.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegisterMapper {

    @Insert("insert into user(id, username, password, nickname, email, user_pic, create_time, update_time)" +
            "values (null, #{username}, #{password}, null, null, null, #{createTime}, #{updateTime})")
    public void insertUser(User user);
}
