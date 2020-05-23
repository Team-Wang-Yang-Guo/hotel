package com.dbs.dao;

import com.dbs.entity.Role;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleDao {

    @Select("select rno,rname,rpwd,rtype from t_role where rname = #{rname}")
    Role findByRoleName(String rname);

    @Select("select rno,rname,rpwd,rtype from t_role where rno = #{rno}")
    Role findByRoleId(int rno);

    @Insert("insert into t_role(rname,rpwd,rtype) values(#{rname},#{rpwd},#{rtype})")
    int addRole(Role role);

    @Delete("delete from t_role where rno = #{rno}")
    int deleteRole(int rno);

    @Update("update t_role set rname=#{rname},rpwd=#{rpwd},rtype=#{rtype} where rno = #{rno}")
    int updateRole(Role role);

    @Select("select * from t_role")
    List<Role> getAll();

}
