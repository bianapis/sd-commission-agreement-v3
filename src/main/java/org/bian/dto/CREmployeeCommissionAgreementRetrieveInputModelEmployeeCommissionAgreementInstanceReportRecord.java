package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CREmployeeCommissionAgreementRetrieveInputModelEmployeeCommissionAgreementInstanceReportRecord
 */
public class CREmployeeCommissionAgreementRetrieveInputModelEmployeeCommissionAgreementInstanceReportRecord   {
  private String employeeCommissionAgreementInstanceReportReference = null;

  private String employeeCommissionAgreementInstanceReportType = null;

  private String employeeCommissionAgreementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return employeeCommissionAgreementInstanceReportReference
  **/

  public String getEmployeeCommissionAgreementInstanceReportReference() {
    return employeeCommissionAgreementInstanceReportReference;
  }

  public void setEmployeeCommissionAgreementInstanceReportReference(String employeeCommissionAgreementInstanceReportReference) {
    this.employeeCommissionAgreementInstanceReportReference = employeeCommissionAgreementInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return employeeCommissionAgreementInstanceReportParameters
  **/

  public String getEmployeeCommissionAgreementInstanceReportParameters() {
    return employeeCommissionAgreementInstanceReportParameters;
  }

  public void setEmployeeCommissionAgreementInstanceReportParameters(String employeeCommissionAgreementInstanceReportParameters) {
    this.employeeCommissionAgreementInstanceReportParameters = employeeCommissionAgreementInstanceReportParameters;
  }


}

