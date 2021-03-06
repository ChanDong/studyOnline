package com.arcsoft.studyOnline.dao;

import com.arcsoft.studyOnline.bean.Adminstrator;
import com.arcsoft.studyOnline.bean.AdminstratorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminstratorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table adminstrator
     *
     * @mbg.generated Tue May 23 22:25:57 CST 2017
     */
    long countByExample(AdminstratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table adminstrator
     *
     * @mbg.generated Tue May 23 22:25:57 CST 2017
     */
    int deleteByExample(AdminstratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table adminstrator
     *
     * @mbg.generated Tue May 23 22:25:57 CST 2017
     */
    int insert(Adminstrator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table adminstrator
     *
     * @mbg.generated Tue May 23 22:25:57 CST 2017
     */
    int insertSelective(Adminstrator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table adminstrator
     *
     * @mbg.generated Tue May 23 22:25:57 CST 2017
     */
    List<Adminstrator> selectByExample(AdminstratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table adminstrator
     *
     * @mbg.generated Tue May 23 22:25:57 CST 2017
     */
    int updateByExampleSelective(@Param("record") Adminstrator record, @Param("example") AdminstratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table adminstrator
     *
     * @mbg.generated Tue May 23 22:25:57 CST 2017
     */
    int updateByExample(@Param("record") Adminstrator record, @Param("example") AdminstratorExample example);

    long countByUsername(@Param("username")String username);

    long countByUsernameAndPassword(@Param("username")String username,@Param("password")String password);

    Adminstrator selectPasswordByUsername(@Param("username")String username);

    void updatePassword(Adminstrator adminstrator);



}