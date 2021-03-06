package org.iemm.sicomoro.db.client;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.iemm.sicomoro.db.dao.MovementCut;
import org.iemm.sicomoro.db.dao.MovementCutExample;

public interface MovementCutMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movementCut
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    int countByExample(MovementCutExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movementCut
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    int deleteByExample(MovementCutExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movementCut
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    @Delete({
        "delete from movementCut",
        "where idMovementCut = #{idMovementCut,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer idMovementCut);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movementCut
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    @Insert({
        "insert into movementCut (cutDate, previousBalance, ",
        "currentBalance, description, ",
        "createDate, updateDate)",
        "values (#{cutDate,jdbcType=TIMESTAMP}, #{previousBalance,jdbcType=DECIMAL}, ",
        "#{currentBalance,jdbcType=DECIMAL}, #{description,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=TIMESTAMP}, #{updateDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="idMovementCut", before=false, resultType=Integer.class)
    int insert(MovementCut record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movementCut
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    int insertSelective(MovementCut record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movementCut
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    List<MovementCut> selectByExample(MovementCutExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movementCut
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    @Select({
        "select",
        "idMovementCut, cutDate, previousBalance, currentBalance, description, createDate, ",
        "updateDate",
        "from movementCut",
        "where idMovementCut = #{idMovementCut,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    MovementCut selectByPrimaryKey(Integer idMovementCut);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movementCut
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    int updateByExampleSelective(@Param("record") MovementCut record, @Param("example") MovementCutExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movementCut
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    int updateByExample(@Param("record") MovementCut record, @Param("example") MovementCutExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movementCut
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    int updateByPrimaryKeySelective(MovementCut record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movementCut
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    @Update({
        "update movementCut",
        "set cutDate = #{cutDate,jdbcType=TIMESTAMP},",
          "previousBalance = #{previousBalance,jdbcType=DECIMAL},",
          "currentBalance = #{currentBalance,jdbcType=DECIMAL},",
          "description = #{description,jdbcType=VARCHAR},",
          "createDate = #{createDate,jdbcType=TIMESTAMP},",
          "updateDate = #{updateDate,jdbcType=TIMESTAMP}",
        "where idMovementCut = #{idMovementCut,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MovementCut record);
}