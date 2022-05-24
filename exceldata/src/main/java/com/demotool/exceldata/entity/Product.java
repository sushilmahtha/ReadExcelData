package com.demotool.exceldata.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    private Integer testId;

    private String moduleName;

    private String testDesc;


    public Product(Integer testId, String moduleName, String testDesc) {
        this.testId = testId;
        this.moduleName = moduleName;
        this.testDesc = testDesc;

    }


    public Product() {
    }

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getTestDesc() {
        return testDesc;
    }

    public void setTestDesc(String testDesc) {
        this.testDesc = testDesc;
    }
}
