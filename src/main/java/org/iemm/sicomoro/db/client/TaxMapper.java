package org.iemm.sicomoro.db.client;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.iemm.sicomoro.db.dao.Tax;
import org.iemm.sicomoro.db.dao.TaxExample;

public interface TaxMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tax
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    int countByExample(TaxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tax
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    int deleteByExample(TaxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tax
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    @Delete({
        "delete from tax",
        "where idTax = #{idTax,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer idTax);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tax
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    @Insert({
        "insert into tax (name, rate, ",
        "createDate, updateDate)",
        "values (#{name,jdbcType=VARCHAR}, #{rate,jdbcType=DECIMAL}, ",
        "#{createDate,jdbcType=TIMESTAMP}, #{updateDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="idTax", before=false, resultType=Integer.class)
    int insert(Tax record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tax
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    int insertSelective(Tax record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tax
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    List<Tax> selectByExample(TaxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tax
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    @Select({
        "select",
        "idTax, name, rate, createDate, updateDate",
        "from tax",
        "where idTax = #{idTax,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Tax selectByPrimaryKey(Integer idTax);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tax
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    int updateByExampleSelective(@Param("record") Tax record, @Param("example") TaxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tax
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    int updateByExample(@Param("record") Tax record, @Param("example") TaxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tax
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    int updateByPrimaryKeySelective(Tax record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tax
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    @Update({
        "update tax",
        "set name = #{name,jdbcType=VARCHAR},",
          "rate = #{rate,jdbcType=DECIMAL},",
          "createDate = #{createDate,jdbcType=TIMESTAMP},",
          "updateDate = #{updateDate,jdbcType=TIMESTAMP}",
        "where idTax = #{idTax,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Tax record);
}