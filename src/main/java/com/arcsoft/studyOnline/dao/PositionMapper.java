package com.arcsoft.studyOnline.dao;

import com.arcsoft.studyOnline.bean.Position;
import com.arcsoft.studyOnline.bean.PositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PositionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbg.generated Tue May 23 22:25:57 CST 2017
     */
    long countByExample(PositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbg.generated Tue May 23 22:25:57 CST 2017
     */
    int deleteByExample(PositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbg.generated Tue May 23 22:25:57 CST 2017
     */
    int insert(Position record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbg.generated Tue May 23 22:25:57 CST 2017
     */
    int insertSelective(Position record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbg.generated Tue May 23 22:25:57 CST 2017
     */
    List<Position> selectByExample(PositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbg.generated Tue May 23 22:25:57 CST 2017
     */
    int updateByExampleSelective(@Param("record") Position record, @Param("example") PositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbg.generated Tue May 23 22:25:57 CST 2017
     */
    int updateByExample(@Param("record") Position record, @Param("example") PositionExample example);
}