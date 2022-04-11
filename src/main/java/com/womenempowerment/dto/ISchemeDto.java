package com.womenempowerment.dto;

import java.time.LocalDate;

public class ISchemeDto {
    private Integer schemeId;
    private String schemeName;
    private String schemeType;
    private LocalDate schemeLaunchDate;
    private String schemeEligibility;
    private String schemeObjective;

    public Integer getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(Integer schemeId) {
        this.schemeId = schemeId;
    }

    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public String getSchemeType() {
        return schemeType;
    }

    public void setSchemeType(String schemeType) {
        this.schemeType = schemeType;
    }

    public LocalDate getSchemeLaunchDate() {
        return schemeLaunchDate;
    }

    public void setSchemeLaunchDate(LocalDate schemeLaunchDate) {
        this.schemeLaunchDate = schemeLaunchDate;
    }

    public String getSchemeEligibility() {
        return schemeEligibility;
    }

    public void setSchemeEligibility(String schemeEligibility) {
        this.schemeEligibility = schemeEligibility;
    }

    public String getSchemeObjective() {
        return schemeObjective;
    }

    public void setSchemeObjective(String schemeObjective) {
        this.schemeObjective = schemeObjective;
    }
}
