package com.loof.common.model.base;

import com.loof.generic.Pagination;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseShipInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pagination pagination;

    public BaseShipInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPagination(Pagination pagination) {
        this.pagination=pagination;
    }

    public Pagination getPagination() {
        return pagination;
    }

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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andShipownerIsNull() {
            addCriterion("shipowner is null");
            return (Criteria) this;
        }

        public Criteria andShipownerIsNotNull() {
            addCriterion("shipowner is not null");
            return (Criteria) this;
        }

        public Criteria andShipownerEqualTo(String value) {
            addCriterion("shipowner =", value, "shipowner");
            return (Criteria) this;
        }

        public Criteria andShipownerNotEqualTo(String value) {
            addCriterion("shipowner <>", value, "shipowner");
            return (Criteria) this;
        }

        public Criteria andShipownerGreaterThan(String value) {
            addCriterion("shipowner >", value, "shipowner");
            return (Criteria) this;
        }

        public Criteria andShipownerGreaterThanOrEqualTo(String value) {
            addCriterion("shipowner >=", value, "shipowner");
            return (Criteria) this;
        }

        public Criteria andShipownerLessThan(String value) {
            addCriterion("shipowner <", value, "shipowner");
            return (Criteria) this;
        }

        public Criteria andShipownerLessThanOrEqualTo(String value) {
            addCriterion("shipowner <=", value, "shipowner");
            return (Criteria) this;
        }

        public Criteria andShipownerLike(String value) {
            addCriterion("shipowner like", value, "shipowner");
            return (Criteria) this;
        }

        public Criteria andShipownerNotLike(String value) {
            addCriterion("shipowner not like", value, "shipowner");
            return (Criteria) this;
        }

        public Criteria andShipownerIn(List<String> values) {
            addCriterion("shipowner in", values, "shipowner");
            return (Criteria) this;
        }

        public Criteria andShipownerNotIn(List<String> values) {
            addCriterion("shipowner not in", values, "shipowner");
            return (Criteria) this;
        }

        public Criteria andShipownerBetween(String value1, String value2) {
            addCriterion("shipowner between", value1, value2, "shipowner");
            return (Criteria) this;
        }

        public Criteria andShipownerNotBetween(String value1, String value2) {
            addCriterion("shipowner not between", value1, value2, "shipowner");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNull() {
            addCriterion("ship_name is null");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNotNull() {
            addCriterion("ship_name is not null");
            return (Criteria) this;
        }

        public Criteria andShipNameEqualTo(String value) {
            addCriterion("ship_name =", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotEqualTo(String value) {
            addCriterion("ship_name <>", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThan(String value) {
            addCriterion("ship_name >", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThanOrEqualTo(String value) {
            addCriterion("ship_name >=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThan(String value) {
            addCriterion("ship_name <", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThanOrEqualTo(String value) {
            addCriterion("ship_name <=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLike(String value) {
            addCriterion("ship_name like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotLike(String value) {
            addCriterion("ship_name not like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameIn(List<String> values) {
            addCriterion("ship_name in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotIn(List<String> values) {
            addCriterion("ship_name not in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameBetween(String value1, String value2) {
            addCriterion("ship_name between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotBetween(String value1, String value2) {
            addCriterion("ship_name not between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipLengthIsNull() {
            addCriterion("ship_length is null");
            return (Criteria) this;
        }

        public Criteria andShipLengthIsNotNull() {
            addCriterion("ship_length is not null");
            return (Criteria) this;
        }

        public Criteria andShipLengthEqualTo(Double value) {
            addCriterion("ship_length =", value, "shipLength");
            return (Criteria) this;
        }

        public Criteria andShipLengthNotEqualTo(Double value) {
            addCriterion("ship_length <>", value, "shipLength");
            return (Criteria) this;
        }

        public Criteria andShipLengthGreaterThan(Double value) {
            addCriterion("ship_length >", value, "shipLength");
            return (Criteria) this;
        }

        public Criteria andShipLengthGreaterThanOrEqualTo(Double value) {
            addCriterion("ship_length >=", value, "shipLength");
            return (Criteria) this;
        }

        public Criteria andShipLengthLessThan(Double value) {
            addCriterion("ship_length <", value, "shipLength");
            return (Criteria) this;
        }

        public Criteria andShipLengthLessThanOrEqualTo(Double value) {
            addCriterion("ship_length <=", value, "shipLength");
            return (Criteria) this;
        }

        public Criteria andShipLengthIn(List<Double> values) {
            addCriterion("ship_length in", values, "shipLength");
            return (Criteria) this;
        }

        public Criteria andShipLengthNotIn(List<Double> values) {
            addCriterion("ship_length not in", values, "shipLength");
            return (Criteria) this;
        }

        public Criteria andShipLengthBetween(Double value1, Double value2) {
            addCriterion("ship_length between", value1, value2, "shipLength");
            return (Criteria) this;
        }

        public Criteria andShipLengthNotBetween(Double value1, Double value2) {
            addCriterion("ship_length not between", value1, value2, "shipLength");
            return (Criteria) this;
        }

        public Criteria andShipDraftIsNull() {
            addCriterion("ship_draft is null");
            return (Criteria) this;
        }

        public Criteria andShipDraftIsNotNull() {
            addCriterion("ship_draft is not null");
            return (Criteria) this;
        }

        public Criteria andShipDraftEqualTo(String value) {
            addCriterion("ship_draft =", value, "shipDraft");
            return (Criteria) this;
        }

        public Criteria andShipDraftNotEqualTo(String value) {
            addCriterion("ship_draft <>", value, "shipDraft");
            return (Criteria) this;
        }

        public Criteria andShipDraftGreaterThan(String value) {
            addCriterion("ship_draft >", value, "shipDraft");
            return (Criteria) this;
        }

        public Criteria andShipDraftGreaterThanOrEqualTo(String value) {
            addCriterion("ship_draft >=", value, "shipDraft");
            return (Criteria) this;
        }

        public Criteria andShipDraftLessThan(String value) {
            addCriterion("ship_draft <", value, "shipDraft");
            return (Criteria) this;
        }

        public Criteria andShipDraftLessThanOrEqualTo(String value) {
            addCriterion("ship_draft <=", value, "shipDraft");
            return (Criteria) this;
        }

        public Criteria andShipDraftLike(String value) {
            addCriterion("ship_draft like", value, "shipDraft");
            return (Criteria) this;
        }

        public Criteria andShipDraftNotLike(String value) {
            addCriterion("ship_draft not like", value, "shipDraft");
            return (Criteria) this;
        }

        public Criteria andShipDraftIn(List<String> values) {
            addCriterion("ship_draft in", values, "shipDraft");
            return (Criteria) this;
        }

        public Criteria andShipDraftNotIn(List<String> values) {
            addCriterion("ship_draft not in", values, "shipDraft");
            return (Criteria) this;
        }

        public Criteria andShipDraftBetween(String value1, String value2) {
            addCriterion("ship_draft between", value1, value2, "shipDraft");
            return (Criteria) this;
        }

        public Criteria andShipDraftNotBetween(String value1, String value2) {
            addCriterion("ship_draft not between", value1, value2, "shipDraft");
            return (Criteria) this;
        }

        public Criteria andReportAddressIsNull() {
            addCriterion("report_address is null");
            return (Criteria) this;
        }

        public Criteria andReportAddressIsNotNull() {
            addCriterion("report_address is not null");
            return (Criteria) this;
        }

        public Criteria andReportAddressEqualTo(String value) {
            addCriterion("report_address =", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressNotEqualTo(String value) {
            addCriterion("report_address <>", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressGreaterThan(String value) {
            addCriterion("report_address >", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressGreaterThanOrEqualTo(String value) {
            addCriterion("report_address >=", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressLessThan(String value) {
            addCriterion("report_address <", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressLessThanOrEqualTo(String value) {
            addCriterion("report_address <=", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressLike(String value) {
            addCriterion("report_address like", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressNotLike(String value) {
            addCriterion("report_address not like", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressIn(List<String> values) {
            addCriterion("report_address in", values, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressNotIn(List<String> values) {
            addCriterion("report_address not in", values, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressBetween(String value1, String value2) {
            addCriterion("report_address between", value1, value2, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressNotBetween(String value1, String value2) {
            addCriterion("report_address not between", value1, value2, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNull() {
            addCriterion("destination is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("destination is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("destination =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("destination <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("destination >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("destination >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("destination <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("destination <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("destination like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("destination not like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("destination in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("destination not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("destination between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("destination not between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andShipTypeIsNull() {
            addCriterion("ship_type is null");
            return (Criteria) this;
        }

        public Criteria andShipTypeIsNotNull() {
            addCriterion("ship_type is not null");
            return (Criteria) this;
        }

        public Criteria andShipTypeEqualTo(String value) {
            addCriterion("ship_type =", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeNotEqualTo(String value) {
            addCriterion("ship_type <>", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeGreaterThan(String value) {
            addCriterion("ship_type >", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ship_type >=", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeLessThan(String value) {
            addCriterion("ship_type <", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeLessThanOrEqualTo(String value) {
            addCriterion("ship_type <=", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeLike(String value) {
            addCriterion("ship_type like", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeNotLike(String value) {
            addCriterion("ship_type not like", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeIn(List<String> values) {
            addCriterion("ship_type in", values, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeNotIn(List<String> values) {
            addCriterion("ship_type not in", values, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeBetween(String value1, String value2) {
            addCriterion("ship_type between", value1, value2, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeNotBetween(String value1, String value2) {
            addCriterion("ship_type not between", value1, value2, "shipType");
            return (Criteria) this;
        }

        public Criteria andCarryCargoIsNull() {
            addCriterion("carry_cargo is null");
            return (Criteria) this;
        }

        public Criteria andCarryCargoIsNotNull() {
            addCriterion("carry_cargo is not null");
            return (Criteria) this;
        }

        public Criteria andCarryCargoEqualTo(String value) {
            addCriterion("carry_cargo =", value, "carryCargo");
            return (Criteria) this;
        }

        public Criteria andCarryCargoNotEqualTo(String value) {
            addCriterion("carry_cargo <>", value, "carryCargo");
            return (Criteria) this;
        }

        public Criteria andCarryCargoGreaterThan(String value) {
            addCriterion("carry_cargo >", value, "carryCargo");
            return (Criteria) this;
        }

        public Criteria andCarryCargoGreaterThanOrEqualTo(String value) {
            addCriterion("carry_cargo >=", value, "carryCargo");
            return (Criteria) this;
        }

        public Criteria andCarryCargoLessThan(String value) {
            addCriterion("carry_cargo <", value, "carryCargo");
            return (Criteria) this;
        }

        public Criteria andCarryCargoLessThanOrEqualTo(String value) {
            addCriterion("carry_cargo <=", value, "carryCargo");
            return (Criteria) this;
        }

        public Criteria andCarryCargoLike(String value) {
            addCriterion("carry_cargo like", value, "carryCargo");
            return (Criteria) this;
        }

        public Criteria andCarryCargoNotLike(String value) {
            addCriterion("carry_cargo not like", value, "carryCargo");
            return (Criteria) this;
        }

        public Criteria andCarryCargoIn(List<String> values) {
            addCriterion("carry_cargo in", values, "carryCargo");
            return (Criteria) this;
        }

        public Criteria andCarryCargoNotIn(List<String> values) {
            addCriterion("carry_cargo not in", values, "carryCargo");
            return (Criteria) this;
        }

        public Criteria andCarryCargoBetween(String value1, String value2) {
            addCriterion("carry_cargo between", value1, value2, "carryCargo");
            return (Criteria) this;
        }

        public Criteria andCarryCargoNotBetween(String value1, String value2) {
            addCriterion("carry_cargo not between", value1, value2, "carryCargo");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNull() {
            addCriterion("report_time is null");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNotNull() {
            addCriterion("report_time is not null");
            return (Criteria) this;
        }

        public Criteria andReportTimeEqualTo(Date value) {
            addCriterion("report_time =", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotEqualTo(Date value) {
            addCriterion("report_time <>", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThan(Date value) {
            addCriterion("report_time >", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("report_time >=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThan(Date value) {
            addCriterion("report_time <", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThanOrEqualTo(Date value) {
            addCriterion("report_time <=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeIn(List<Date> values) {
            addCriterion("report_time in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotIn(List<Date> values) {
            addCriterion("report_time not in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeBetween(Date value1, Date value2) {
            addCriterion("report_time between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotBetween(Date value1, Date value2) {
            addCriterion("report_time not between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andThroughCannelIsNull() {
            addCriterion("through_cannel is null");
            return (Criteria) this;
        }

        public Criteria andThroughCannelIsNotNull() {
            addCriterion("through_cannel is not null");
            return (Criteria) this;
        }

        public Criteria andThroughCannelEqualTo(String value) {
            addCriterion("through_cannel =", value, "throughCannel");
            return (Criteria) this;
        }

        public Criteria andThroughCannelNotEqualTo(String value) {
            addCriterion("through_cannel <>", value, "throughCannel");
            return (Criteria) this;
        }

        public Criteria andThroughCannelGreaterThan(String value) {
            addCriterion("through_cannel >", value, "throughCannel");
            return (Criteria) this;
        }

        public Criteria andThroughCannelGreaterThanOrEqualTo(String value) {
            addCriterion("through_cannel >=", value, "throughCannel");
            return (Criteria) this;
        }

        public Criteria andThroughCannelLessThan(String value) {
            addCriterion("through_cannel <", value, "throughCannel");
            return (Criteria) this;
        }

        public Criteria andThroughCannelLessThanOrEqualTo(String value) {
            addCriterion("through_cannel <=", value, "throughCannel");
            return (Criteria) this;
        }

        public Criteria andThroughCannelLike(String value) {
            addCriterion("through_cannel like", value, "throughCannel");
            return (Criteria) this;
        }

        public Criteria andThroughCannelNotLike(String value) {
            addCriterion("through_cannel not like", value, "throughCannel");
            return (Criteria) this;
        }

        public Criteria andThroughCannelIn(List<String> values) {
            addCriterion("through_cannel in", values, "throughCannel");
            return (Criteria) this;
        }

        public Criteria andThroughCannelNotIn(List<String> values) {
            addCriterion("through_cannel not in", values, "throughCannel");
            return (Criteria) this;
        }

        public Criteria andThroughCannelBetween(String value1, String value2) {
            addCriterion("through_cannel between", value1, value2, "throughCannel");
            return (Criteria) this;
        }

        public Criteria andThroughCannelNotBetween(String value1, String value2) {
            addCriterion("through_cannel not between", value1, value2, "throughCannel");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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