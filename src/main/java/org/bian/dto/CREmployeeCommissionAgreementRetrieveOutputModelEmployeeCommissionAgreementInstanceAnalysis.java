package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CREmployeeCommissionAgreementRetrieveOutputModelEmployeeCommissionAgreementInstanceAnalysis
 */
public class CREmployeeCommissionAgreementRetrieveOutputModelEmployeeCommissionAgreementInstanceAnalysis   {
  private String employeeCommissionAgreementInstanceAnalysisData = null;

  private String employeeCommissionAgreementInstanceAnalysisReportType = null;

  private Object employeeCommissionAgreementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return employeeCommissionAgreementInstanceAnalysisData
  **/

  public String getEmployeeCommissionAgreementInstanceAnalysisData() {
    return employeeCommissionAgreementInstanceAnalysisData;
  }

  public void setEmployeeCommissionAgreementInstanceAnalysisData(String employeeCommissionAgreementInstanceAnalysisData) {
    this.employeeCommissionAgreementInstanceAnalysisData = employeeCommissionAgreementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return employeeCommissionAgreementInstanceAnalysisReportType
  **/

  public String getEmployeeCommissionAgreementInstanceAnalysisReportType() {
    return employeeCommissionAgreementInstanceAnalysisReportType;
  }

  public void setEmployeeCommissionAgreementInstanceAnalysisReportType(String employeeCommissionAgreementInstanceAnalysisReportType) {
    this.employeeCommissionAgreementInstanceAnalysisReportType = employeeCommissionAgreementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return employeeCommissionAgreementInstanceAnalysisReport
  **/

  public Object getEmployeeCommissionAgreementInstanceAnalysisReport() {
    return employeeCommissionAgreementInstanceAnalysisReport;
  }

  public void setEmployeeCommissionAgreementInstanceAnalysisReport(Object employeeCommissionAgreementInstanceAnalysisReport) {
    this.employeeCommissionAgreementInstanceAnalysisReport = employeeCommissionAgreementInstanceAnalysisReport;
  }


}

