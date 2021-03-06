/*
 * This file is generated by jOOQ.
 */
package com.diamondfsd.jooq.learn.codegen.tables.records;


import com.diamondfsd.jooq.learn.codegen.tables.TS4NoPrimary;
import com.diamondfsd.jooq.learn.codegen.tables.interfaces.IS4NoPrimary;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class S4NoPrimaryRecord extends TableRecordImpl<S4NoPrimaryRecord> implements Record4<String, String, Timestamp, Timestamp>, IS4NoPrimary {

    private static final long serialVersionUID = 767711465;

    /**
     * Setter for <code>learn-jooq.s4_no_primary.column1</code>. 测试列1
     */
    @Override
    public void setColumn1(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>learn-jooq.s4_no_primary.column1</code>. 测试列1
     */
    @Override
    public String getColumn1() {
        return (String) get(0);
    }

    /**
     * Setter for <code>learn-jooq.s4_no_primary.column2</code>. 测试列2
     */
    @Override
    public void setColumn2(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>learn-jooq.s4_no_primary.column2</code>. 测试列2
     */
    @Override
    public String getColumn2() {
        return (String) get(1);
    }

    /**
     * Setter for <code>learn-jooq.s4_no_primary.create_time</code>. 创建时间
     */
    @Override
    public void setCreateTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>learn-jooq.s4_no_primary.create_time</code>. 创建时间
     */
    @Override
    public Timestamp getCreateTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>learn-jooq.s4_no_primary.update_time</code>. 更新时间
     */
    @Override
    public void setUpdateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>learn-jooq.s4_no_primary.update_time</code>. 更新时间
     */
    @Override
    public Timestamp getUpdateTime() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, Timestamp, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return TS4NoPrimary.S4_NO_PRIMARY.COLUMN1;
    }

    @Override
    public Field<String> field2() {
        return TS4NoPrimary.S4_NO_PRIMARY.COLUMN2;
    }

    @Override
    public Field<Timestamp> field3() {
        return TS4NoPrimary.S4_NO_PRIMARY.CREATE_TIME;
    }

    @Override
    public Field<Timestamp> field4() {
        return TS4NoPrimary.S4_NO_PRIMARY.UPDATE_TIME;
    }

    @Override
    public String component1() {
        return getColumn1();
    }

    @Override
    public String component2() {
        return getColumn2();
    }

    @Override
    public Timestamp component3() {
        return getCreateTime();
    }

    @Override
    public Timestamp component4() {
        return getUpdateTime();
    }

    @Override
    public String value1() {
        return getColumn1();
    }

    @Override
    public String value2() {
        return getColumn2();
    }

    @Override
    public Timestamp value3() {
        return getCreateTime();
    }

    @Override
    public Timestamp value4() {
        return getUpdateTime();
    }

    @Override
    public S4NoPrimaryRecord value1(String value) {
        setColumn1(value);
        return this;
    }

    @Override
    public S4NoPrimaryRecord value2(String value) {
        setColumn2(value);
        return this;
    }

    @Override
    public S4NoPrimaryRecord value3(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public S4NoPrimaryRecord value4(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    @Override
    public S4NoPrimaryRecord values(String value1, String value2, Timestamp value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IS4NoPrimary from) {
        setColumn1(from.getColumn1());
        setColumn2(from.getColumn2());
        setCreateTime(from.getCreateTime());
        setUpdateTime(from.getUpdateTime());
    }

    @Override
    public <E extends IS4NoPrimary> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached S4NoPrimaryRecord
     */
    public S4NoPrimaryRecord() {
        super(TS4NoPrimary.S4_NO_PRIMARY);
    }

    /**
     * Create a detached, initialised S4NoPrimaryRecord
     */
    public S4NoPrimaryRecord(String column1, String column2, Timestamp createTime, Timestamp updateTime) {
        super(TS4NoPrimary.S4_NO_PRIMARY);

        set(0, column1);
        set(1, column2);
        set(2, createTime);
        set(3, updateTime);
    }
}
