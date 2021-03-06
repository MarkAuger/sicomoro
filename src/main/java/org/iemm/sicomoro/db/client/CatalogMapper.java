package org.iemm.sicomoro.db.client;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.iemm.sicomoro.db.dao.Catalog;
import org.iemm.sicomoro.db.dao.CatalogExample;

public interface CatalogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table catalog
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    int countByExample(CatalogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table catalog
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    int deleteByExample(CatalogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table catalog
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    @Delete({
        "delete from catalog",
        "where idCatalog = #{idCatalog,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer idCatalog);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table catalog
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    @Insert({
        "insert into catalog (group, name, ",
        "value, description, ",
        "createDate, updateDate)",
        "values (#{group,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{value,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=TIMESTAMP}, #{updateDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="idCatalog", before=false, resultType=Integer.class)
    int insert(Catalog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table catalog
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    int insertSelective(Catalog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table catalog
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    List<Catalog> selectByExample(CatalogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table catalog
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    @Select({
        "select",
        "idCatalog, group, name, value, description, createDate, updateDate",
        "from catalog",
        "where idCatalog = #{idCatalog,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Catalog selectByPrimaryKey(Integer idCatalog);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table catalog
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    int updateByExampleSelective(@Param("record") Catalog record, @Param("example") CatalogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table catalog
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    int updateByExample(@Param("record") Catalog record, @Param("example") CatalogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table catalog
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    int updateByPrimaryKeySelective(Catalog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table catalog
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    @Update({
        "update catalog",
        "set group = #{group,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "value = #{value,jdbcType=VARCHAR},",
          "description = #{description,jdbcType=VARCHAR},",
          "createDate = #{createDate,jdbcType=TIMESTAMP},",
          "updateDate = #{updateDate,jdbcType=TIMESTAMP}",
        "where idCatalog = #{idCatalog,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Catalog record);
}