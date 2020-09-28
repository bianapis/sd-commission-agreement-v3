package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CREmployeeCommissionAgreementRetrieveInputModelEmployeeCommissionAgreementInstanceAnalysis
 */
public class CREmployeeCommissionAgreementRetrieveInputModelEmployeeCommissionAgreementInstanceAnalysis   {
  private String employeeCommissionAgreementInstanceAnalysisReference = null;

  private String employeeCommissionAgreementInstanceAnalysisReportType = null;

  private String employeeCommissionAgreementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return employeeCommissionAgreementInstanceAnalysisReference
  **/

  public String getEmployeeCommissionAgreementInstanceAnalysisReference() {
    return employeeCommissionAgreementInstanceAnalysisReference;
  }

  public void setEmployeeCommissionAgreementInstanceAnalysisReference(String employeeCommissionAgreementInstanceAnalysisReference) {
    this.employeeCommissionAgreementInstanceAnalysisReference = employeeCommissionAgreementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return employeeCommissionAgreementInstanceAnalysisParameters
  **/

  public String getEmployeeCommissionAgreementInstanceAnalysisParameters() {
    return employeeCommissionAgreementInstanceAnalysisParameters;
  }

  public void setEmployeeCommissionAgreementInstanceAnalysisParameters(String employeeCommissionAgreementInstanceAnalysisParameters) {
    this.employeeCommissionAgreementInstanceAnalysisParameters = employeeCommissionAgreementInstanceAnalysisParameters;
  }


}

