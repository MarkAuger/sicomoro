package org.iemm.sicomoro.db.dao;

import java.util.Date;

public class Catalog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column catalog.idCatalog
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    private Integer idCatalog;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column catalog.group
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    private String group;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column catalog.name
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column catalog.value
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    private String value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column catalog.description
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column catalog.createDate
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column catalog.updateDate
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    private Date updateDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column catalog.idCatalog
     *
     * @return the value of catalog.idCatalog
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    public Integer getIdCatalog() {
        return idCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column catalog.idCatalog
     *
     * @param idCatalog the value for catalog.idCatalog
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    public void setIdCatalog(Integer idCatalog) {
        this.idCatalog = idCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column catalog.group
     *
     * @return the value of catalog.group
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    public String getGroup() {
        return group;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column catalog.group
     *
     * @param group the value for catalog.group
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    public void setGroup(String group) {
        this.group = group == null ? null : group.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column catalog.name
     *
     * @return the value of catalog.name
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column catalog.name
     *
     * @param name the value for catalog.name
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column catalog.value
     *
     * @return the value of catalog.value
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column catalog.value
     *
     * @param value the value for catalog.value
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column catalog.description
     *
     * @return the value of catalog.description
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column catalog.description
     *
     * @param description the value for catalog.description
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column catalog.createDate
     *
     * @return the value of catalog.createDate
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column catalog.createDate
     *
     * @param createDate the value for catalog.createDate
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column catalog.updateDate
     *
     * @return the value of catalog.updateDate
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column catalog.updateDate
     *
     * @param updateDate the value for catalog.updateDate
     *
     * @mbggenerated Sun Sep 02 15:34:08 CDT 2012
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}