package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CREmployeeCommissionAgreementRetrieveOutputModelEmployeeCommissionAgreementInstanceReportRecord
 */
public class CREmployeeCommissionAgreementRetrieveOutputModelEmployeeCommissionAgreementInstanceReportRecord   {
  private String employeeCommissionAgreementInstanceReportData = null;

  private String employeeCommissionAgreementInstanceReportType = null;

  private Object employeeCommissionAgreementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return employeeCommissionAgreementInstanceReportData
  **/

  public String getEmployeeCommissionAgreementInstanceReportData() {
    return employeeCommissionAgreementInstanceReportData;
  }

  public void setEmployeeCommissionAgreementInstanceReportData(String employeeCommissionAgreementInstanceReportData) {
    this.employeeCommissionAgreementInstanceReportData = employeeCommissionAgreementInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return employeeCommissionAgreementInstanceReportType
  **/

  public String getEmployeeCommissionAgreementInstanceReportType() {
    return employeeCommissionAgreementInstanceReportType;
  }

  public void setEmployeeCommissionAgreementInstanceReportType(String employeeCommissionAgreementInstanceReportType) {
    this.employeeCommissionAgreementInstanceReportType = employeeCommissionAgreementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return employeeCommissionAgreementInstanceReport
  **/

  public Object getEmployeeCommissionAgreementInstanceReport() {
    return employeeCommissionAgreementInstanceReport;
  }

  public void setEmployeeCommissionAgreementInstanceReport(Object employeeCommissionAgreementInstanceReport) {
    this.employeeCommissionAgreementInstanceReport = employeeCommissionAgreementInstanceReport;
  }


}

