package com.loof.common.model.base;

import java.util.Date;

public class BaseShipInfo {
    private String id;

    private String shipowner;

    private String shipName;

    private Double shipLength;

    private String shipDraft;

    private String reportAddress;

    private String destination;

    private String shipType;

    private String carryCargo;

    private Date reportTime;

    private String throughCannel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getShipowner() {
        return shipowner;
    }

    public void setShipowner(String shipowner) {
        this.shipowner = shipowner == null ? null : shipowner.trim();
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName == null ? null : shipName.trim();
    }

    public Double getShipLength() {
        return shipLength;
    }

    public void setShipLength(Double shipLength) {
        this.shipLength = shipLength;
    }

    public String getShipDraft() {
        return shipDraft;
    }

    public void setShipDraft(String shipDraft) {
        this.shipDraft = shipDraft == null ? null : shipDraft.trim();
    }

    public String getReportAddress() {
        return reportAddress;
    }

    public void setReportAddress(String reportAddress) {
        this.reportAddress = reportAddress == null ? null : reportAddress.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType == null ? null : shipType.trim();
    }

    public String getCarryCargo() {
        return carryCargo;
    }

    public void setCarryCargo(String carryCargo) {
        this.carryCargo = carryCargo == null ? null : carryCargo.trim();
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public String getThroughCannel() {
        return throughCannel;
    }

    public void setThroughCannel(String throughCannel) {
        this.throughCannel = throughCannel == null ? null : throughCannel.trim();
    }
}