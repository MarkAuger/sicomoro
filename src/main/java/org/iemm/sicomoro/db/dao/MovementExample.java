package org.iemm.sicomoro.db.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovementExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table movement
     *
     * @mbggenerated Thu Sep 27 17:27:59 CDT 2012
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table movement
     *
     * @mbggenerated Thu Sep 27 17:27:59 CDT 2012
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table movement
     *
     * @mbggenerated Thu Sep 27 17:27:59 CDT 2012
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movement
     *
     * @mbggenerated Thu Sep 27 17:27:59 CDT 2012
     */
    public MovementExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movement
     *
     * @mbggenerated Thu Sep 27 17:27:59 CDT 2012
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movement
     *
     * @mbggenerated Thu Sep 27 17:27:59 CDT 2012
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movement
     *
     * @mbggenerated Thu Sep 27 17:27:59 CDT 2012
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movement
     *
     * @mbggenerated Thu Sep 27 17:27:59 CDT 2012
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movement
     *
     * @mbggenerated Thu Sep 27 17:27:59 CDT 2012
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movement
     *
     * @mbggenerated Thu Sep 27 17:27:59 CDT 2012
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movement
     *
     * @mbggenerated Thu Sep 27 17:27:59 CDT 2012
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movement
     *
     * @mbggenerated Thu Sep 27 17:27:59 CDT 2012
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movement
     *
     * @mbggenerated Thu Sep 27 17:27:59 CDT 2012
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movement
     *
     * @mbggenerated Thu Sep 27 17:27:59 CDT 2012
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table movement
     *
     * @mbggenerated Thu Sep 27 17:27:59 CDT 2012
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdMovementIsNull() {
            addCriterion("idMovement is null");
            return (Criteria) this;
        }

        public Criteria andIdMovementIsNotNull() {
            addCriterion("idMovement is not null");
            return (Criteria) this;
        }

        public Criteria andIdMovementEqualTo(Integer value) {
            addCriterion("idMovement =", value, "idMovement");
            return (Criteria) this;
        }

        public Criteria andIdMovementNotEqualTo(Integer value) {
            addCriterion("idMovement <>", value, "idMovement");
            return (Criteria) this;
        }

        public Criteria andIdMovementGreaterThan(Integer value) {
            addCriterion("idMovement >", value, "idMovement");
            return (Criteria) this;
        }

        public Criteria andIdMovementGreaterThanOrEqualTo(Integer value) {
            addCriterion("idMovement >=", value, "idMovement");
            return (Criteria) this;
        }

        public Criteria andIdMovementLessThan(Integer value) {
            addCriterion("idMovement <", value, "idMovement");
            return (Criteria) this;
        }

        public Criteria andIdMovementLessThanOrEqualTo(Integer value) {
            addCriterion("idMovement <=", value, "idMovement");
            return (Criteria) this;
        }

        public Criteria andIdMovementIn(List<Integer> values) {
            addCriterion("idMovement in", values, "idMovement");
            return (Criteria) this;
        }

        public Criteria andIdMovementNotIn(List<Integer> values) {
            addCriterion("idMovement not in", values, "idMovement");
            return (Criteria) this;
        }

        public Criteria andIdMovementBetween(Integer value1, Integer value2) {
            addCriterion("idMovement between", value1, value2, "idMovement");
            return (Criteria) this;
        }

        public Criteria andIdMovementNotBetween(Integer value1, Integer value2) {
            addCriterion("idMovement not between", value1, value2, "idMovement");
            return (Criteria) this;
        }

        public Criteria andIdMovementTypeIsNull() {
            addCriterion("idMovementType is null");
            return (Criteria) this;
        }

        public Criteria andIdMovementTypeIsNotNull() {
            addCriterion("idMovementType is not null");
            return (Criteria) this;
        }

        public Criteria andIdMovementTypeEqualTo(Integer value) {
            addCriterion("idMovementType =", value, "idMovementType");
            return (Criteria) this;
        }

        public Criteria andIdMovementTypeNotEqualTo(Integer value) {
            addCriterion("idMovementType <>", value, "idMovementType");
            return (Criteria) this;
        }

        public Criteria andIdMovementTypeGreaterThan(Integer value) {
            addCriterion("idMovementType >", value, "idMovementType");
            return (Criteria) this;
        }

        public Criteria andIdMovementTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("idMovementType >=", value, "idMovementType");
            return (Criteria) this;
        }

        public Criteria andIdMovementTypeLessThan(Integer value) {
            addCriterion("idMovementType <", value, "idMovementType");
            return (Criteria) this;
        }

        public Criteria andIdMovementTypeLessThanOrEqualTo(Integer value) {
            addCriterion("idMovementType <=", value, "idMovementType");
            return (Criteria) this;
        }

        public Criteria andIdMovementTypeIn(List<Integer> values) {
            addCriterion("idMovementType in", values, "idMovementType");
            return (Criteria) this;
        }

        public Criteria andIdMovementTypeNotIn(List<Integer> values) {
            addCriterion("idMovementType not in", values, "idMovementType");
            return (Criteria) this;
        }

        public Criteria andIdMovementTypeBetween(Integer value1, Integer value2) {
            addCriterion("idMovementType between", value1, value2, "idMovementType");
            return (Criteria) this;
        }

        public Criteria andIdMovementTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("idMovementType not between", value1, value2, "idMovementType");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andIdMovementCutIsNull() {
            addCriterion("idMovementCut is null");
            return (Criteria) this;
        }

        public Criteria andIdMovementCutIsNotNull() {
            addCriterion("idMovementCut is not null");
            return (Criteria) this;
        }

        public Criteria andIdMovementCutEqualTo(Integer value) {
            addCriterion("idMovementCut =", value, "idMovementCut");
            return (Criteria) this;
        }

        public Criteria andIdMovementCutNotEqualTo(Integer value) {
            addCriterion("idMovementCut <>", value, "idMovementCut");
            return (Criteria) this;
        }

        public Criteria andIdMovementCutGreaterThan(Integer value) {
            addCriterion("idMovementCut >", value, "idMovementCut");
            return (Criteria) this;
        }

        public Criteria andIdMovementCutGreaterThanOrEqualTo(Integer value) {
            addCriterion("idMovementCut >=", value, "idMovementCut");
            return (Criteria) this;
        }

        public Criteria andIdMovementCutLessThan(Integer value) {
            addCriterion("idMovementCut <", value, "idMovementCut");
            return (Criteria) this;
        }

        public Criteria andIdMovementCutLessThanOrEqualTo(Integer value) {
            addCriterion("idMovementCut <=", value, "idMovementCut");
            return (Criteria) this;
        }

        public Criteria andIdMovementCutIn(List<Integer> values) {
            addCriterion("idMovementCut in", values, "idMovementCut");
            return (Criteria) this;
        }

        public Criteria andIdMovementCutNotIn(List<Integer> values) {
            addCriterion("idMovementCut not in", values, "idMovementCut");
            return (Criteria) this;
        }

        public Criteria andIdMovementCutBetween(Integer value1, Integer value2) {
            addCriterion("idMovementCut between", value1, value2, "idMovementCut");
            return (Criteria) this;
        }

        public Criteria andIdMovementCutNotBetween(Integer value1, Integer value2) {
            addCriterion("idMovementCut not between", value1, value2, "idMovementCut");
            return (Criteria) this;
        }

        public Criteria andIdContributorIsNull() {
            addCriterion("idContributor is null");
            return (Criteria) this;
        }

        public Criteria andIdContributorIsNotNull() {
            addCriterion("idContributor is not null");
            return (Criteria) this;
        }

        public Criteria andIdContributorEqualTo(Integer value) {
            addCriterion("idContributor =", value, "idContributor");
            return (Criteria) this;
        }

        public Criteria andIdContributorNotEqualTo(Integer value) {
            addCriterion("idContributor <>", value, "idContributor");
            return (Criteria) this;
        }

        public Criteria andIdContributorGreaterThan(Integer value) {
            addCriterion("idContributor >", value, "idContributor");
            return (Criteria) this;
        }

        public Criteria andIdContributorGreaterThanOrEqualTo(Integer value) {
            addCriterion("idContributor >=", value, "idContributor");
            return (Criteria) this;
        }

        public Criteria andIdContributorLessThan(Integer value) {
            addCriterion("idContributor <", value, "idContributor");
            return (Criteria) this;
        }

        public Criteria andIdContributorLessThanOrEqualTo(Integer value) {
            addCriterion("idContributor <=", value, "idContributor");
            return (Criteria) this;
        }

        public Criteria andIdContributorIn(List<Integer> values) {
            addCriterion("idContributor in", values, "idContributor");
            return (Criteria) this;
        }

        public Criteria andIdContributorNotIn(List<Integer> values) {
            addCriterion("idContributor not in", values, "idContributor");
            return (Criteria) this;
        }

        public Criteria andIdContributorBetween(Integer value1, Integer value2) {
            addCriterion("idContributor between", value1, value2, "idContributor");
            return (Criteria) this;
        }

        public Criteria andIdContributorNotBetween(Integer value1, Integer value2) {
            addCriterion("idContributor not between", value1, value2, "idContributor");
            return (Criteria) this;
        }

        public Criteria andMovementDateIsNull() {
            addCriterion("movementDate is null");
            return (Criteria) this;
        }

        public Criteria andMovementDateIsNotNull() {
            addCriterion("movementDate is not null");
            return (Criteria) this;
        }

        public Criteria andMovementDateEqualTo(Date value) {
            addCriterion("movementDate =", value, "movementDate");
            return (Criteria) this;
        }

        public Criteria andMovementDateNotEqualTo(Date value) {
            addCriterion("movementDate <>", value, "movementDate");
            return (Criteria) this;
        }

        public Criteria andMovementDateGreaterThan(Date value) {
            addCriterion("movementDate >", value, "movementDate");
            return (Criteria) this;
        }

        public Criteria andMovementDateGreaterThanOrEqualTo(Date value) {
            addCriterion("movementDate >=", value, "movementDate");
            return (Criteria) this;
        }

        public Criteria andMovementDateLessThan(Date value) {
            addCriterion("movementDate <", value, "movementDate");
            return (Criteria) this;
        }

        public Criteria andMovementDateLessThanOrEqualTo(Date value) {
            addCriterion("movementDate <=", value, "movementDate");
            return (Criteria) this;
        }

        public Criteria andMovementDateIn(List<Date> values) {
            addCriterion("movementDate in", values, "movementDate");
            return (Criteria) this;
        }

        public Criteria andMovementDateNotIn(List<Date> values) {
            addCriterion("movementDate not in", values, "movementDate");
            return (Criteria) this;
        }

        public Criteria andMovementDateBetween(Date value1, Date value2) {
            addCriterion("movementDate between", value1, value2, "movementDate");
            return (Criteria) this;
        }

        public Criteria andMovementDateNotBetween(Date value1, Date value2) {
            addCriterion("movementDate not between", value1, value2, "movementDate");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("createDate =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("createDate <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("createDate >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("createDate >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("createDate <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("createDate <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("createDate in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("createDate not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("createDate between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("createDate not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("updateDate is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("updateDate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("updateDate =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("updateDate <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("updateDate >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("updateDate >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("updateDate <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("updateDate <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("updateDate in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("updateDate not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("updateDate between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("updateDate not between", value1, value2, "updateDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table movement
     *
     * @mbggenerated do_not_delete_during_merge Thu Sep 27 17:27:59 CDT 2012
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table movement
     *
     * @mbggenerated Thu Sep 27 17:27:59 CDT 2012
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}