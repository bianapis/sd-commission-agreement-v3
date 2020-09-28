package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREmployeeCommissionAgreementRetrieveOutputModelEmployeeCommissionAgreementInstanceAnalysis;
import org.bian.dto.CREmployeeCommissionAgreementRetrieveOutputModelEmployeeCommissionAgreementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CREmployeeCommissionAgreementRetrieveOutputModel
 */
public class CREmployeeCommissionAgreementRetrieveOutputModel   {
  private String employeeCommissionAgreementParameterType = null;

  private String employeeCommissionAgreementSelectedOption = null;

  private String employeeCommissionAgreementType = null;

  private String employeeCommissionAgreementReference = null;

  private String employeeCommissionAgreementRequest = null;

  private String employeeCommissionAgreementSchedule = null;

  private String employeeCommissionAgreementStatus = null;

  private String employeeCommissionAgreementCustomerReference = null;

  private String employeeCommissionAgreementObligation = null;

  private String employeeCommissionAgreementEntitlement = null;

  private String employeeCommissionAgreementRegulationReference = null;

  private String employeeCommissionAgreementRegulationType = null;

  private String employeeCommissionAgreementJurisdiction = null;

  private String employeeCommissionAgreementAccountReference = null;

  private String employeeCommissionAgreementRetrieveActionTaskReference = null;

  private Object employeeCommissionAgreementRetrieveActionTaskRecord = null;

  private String employeeCommissionAgreementRetrieveActionResponse = null;

  private CREmployeeCommissionAgreementRetrieveOutputModelEmployeeCommissionAgreementInstanceReportRecord employeeCommissionAgreementInstanceReportRecord = null;

  private CREmployeeCommissionAgreementRetrieveOutputModelEmployeeCommissionAgreementInstanceAnalysis employeeCommissionAgreementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between Options defined within Employee Commission Agreement 
   * @return employeeCommissionAgreementParameterType
  **/

  public String getEmployeeCommissionAgreementParameterType() {
    return employeeCommissionAgreementParameterType;
  }

  public void setEmployeeCommissionAgreementParameterType(String employeeCommissionAgreementParameterType) {
    this.employeeCommissionAgreementParameterType = employeeCommissionAgreementParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional feature in a product, identified by Parameter Type 
   * @return employeeCommissionAgreementSelectedOption
  **/

  public String getEmployeeCommissionAgreementSelectedOption() {
    return employeeCommissionAgreementSelectedOption;
  }

  public void setEmployeeCommissionAgreementSelectedOption(String employeeCommissionAgreementSelectedOption) {
    this.employeeCommissionAgreementSelectedOption = employeeCommissionAgreementSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between the subject matters of Employee Commission Agreement 
   * @return employeeCommissionAgreementType
  **/

  public String getEmployeeCommissionAgreementType() {
    return employeeCommissionAgreementType;
  }

  public void setEmployeeCommissionAgreementType(String employeeCommissionAgreementType) {
    this.employeeCommissionAgreementType = employeeCommissionAgreementType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to Employee Commission Agreement 
   * @return employeeCommissionAgreementReference
  **/

  public String getEmployeeCommissionAgreementReference() {
    return employeeCommissionAgreementReference;
  }

  public void setEmployeeCommissionAgreementReference(String employeeCommissionAgreementReference) {
    this.employeeCommissionAgreementReference = employeeCommissionAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Request to discharge Employee Commission Agreement 
   * @return employeeCommissionAgreementRequest
  **/

  public String getEmployeeCommissionAgreementRequest() {
    return employeeCommissionAgreementRequest;
  }

  public void setEmployeeCommissionAgreementRequest(String employeeCommissionAgreementRequest) {
    this.employeeCommissionAgreementRequest = employeeCommissionAgreementRequest;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timetable to discharge Employee Commission Agreement 
   * @return employeeCommissionAgreementSchedule
  **/

  public String getEmployeeCommissionAgreementSchedule() {
    return employeeCommissionAgreementSchedule;
  }

  public void setEmployeeCommissionAgreementSchedule(String employeeCommissionAgreementSchedule) {
    this.employeeCommissionAgreementSchedule = employeeCommissionAgreementSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Employee Commission Agreement discharging 
   * @return employeeCommissionAgreementStatus
  **/

  public String getEmployeeCommissionAgreementStatus() {
    return employeeCommissionAgreementStatus;
  }

  public void setEmployeeCommissionAgreementStatus(String employeeCommissionAgreementStatus) {
    this.employeeCommissionAgreementStatus = employeeCommissionAgreementStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer who is involved in Employee Commission Agreement 
   * @return employeeCommissionAgreementCustomerReference
  **/

  public String getEmployeeCommissionAgreementCustomerReference() {
    return employeeCommissionAgreementCustomerReference;
  }

  public void setEmployeeCommissionAgreementCustomerReference(String employeeCommissionAgreementCustomerReference) {
    this.employeeCommissionAgreementCustomerReference = employeeCommissionAgreementCustomerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Liability or duty to do something under the terms of Employee Commission Agreement 
   * @return employeeCommissionAgreementObligation
  **/

  public String getEmployeeCommissionAgreementObligation() {
    return employeeCommissionAgreementObligation;
  }

  public void setEmployeeCommissionAgreementObligation(String employeeCommissionAgreementObligation) {
    this.employeeCommissionAgreementObligation = employeeCommissionAgreementObligation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Right to do something under the terms of Employee Commission Agreement 
   * @return employeeCommissionAgreementEntitlement
  **/

  public String getEmployeeCommissionAgreementEntitlement() {
    return employeeCommissionAgreementEntitlement;
  }

  public void setEmployeeCommissionAgreementEntitlement(String employeeCommissionAgreementEntitlement) {
    this.employeeCommissionAgreementEntitlement = employeeCommissionAgreementEntitlement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the regulation which is defined in Employee Commission Agreement 
   * @return employeeCommissionAgreementRegulationReference
  **/

  public String getEmployeeCommissionAgreementRegulationReference() {
    return employeeCommissionAgreementRegulationReference;
  }

  public void setEmployeeCommissionAgreementRegulationReference(String employeeCommissionAgreementRegulationReference) {
    this.employeeCommissionAgreementRegulationReference = employeeCommissionAgreementRegulationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification that distinguishes between the regularity domains of Employee Commission Agreement 
   * @return employeeCommissionAgreementRegulationType
  **/

  public String getEmployeeCommissionAgreementRegulationType() {
    return employeeCommissionAgreementRegulationType;
  }

  public void setEmployeeCommissionAgreementRegulationType(String employeeCommissionAgreementRegulationType) {
    this.employeeCommissionAgreementRegulationType = employeeCommissionAgreementRegulationType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the jurisdiction that is assigned to Employee Commission Agreement in case of legal dispute. 
   * @return employeeCommissionAgreementJurisdiction
  **/

  public String getEmployeeCommissionAgreementJurisdiction() {
    return employeeCommissionAgreementJurisdiction;
  }

  public void setEmployeeCommissionAgreementJurisdiction(String employeeCommissionAgreementJurisdiction) {
    this.employeeCommissionAgreementJurisdiction = employeeCommissionAgreementJurisdiction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account which is linked to Employee Commission Agreement 
   * @return employeeCommissionAgreementAccountReference
  **/

  public String getEmployeeCommissionAgreementAccountReference() {
    return employeeCommissionAgreementAccountReference;
  }

  public void setEmployeeCommissionAgreementAccountReference(String employeeCommissionAgreementAccountReference) {
    this.employeeCommissionAgreementAccountReference = employeeCommissionAgreementAccountReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Employee Commission Agreement instance retrieve service call 
   * @return employeeCommissionAgreementRetrieveActionTaskReference
  **/

  public String getEmployeeCommissionAgreementRetrieveActionTaskReference() {
    return employeeCommissionAgreementRetrieveActionTaskReference;
  }

  public void setEmployeeCommissionAgreementRetrieveActionTaskReference(String employeeCommissionAgreementRetrieveActionTaskReference) {
    this.employeeCommissionAgreementRetrieveActionTaskReference = employeeCommissionAgreementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return employeeCommissionAgreementRetrieveActionTaskRecord
  **/

  public Object getEmployeeCommissionAgreementRetrieveActionTaskRecord() {
    return employeeCommissionAgreementRetrieveActionTaskRecord;
  }

  public void setEmployeeCommissionAgreementRetrieveActionTaskRecord(Object employeeCommissionAgreementRetrieveActionTaskRecord) {
    this.employeeCommissionAgreementRetrieveActionTaskRecord = employeeCommissionAgreementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return employeeCommissionAgreementRetrieveActionResponse
  **/

  public String getEmployeeCommissionAgreementRetrieveActionResponse() {
    return employeeCommissionAgreementRetrieveActionResponse;
  }

  public void setEmployeeCommissionAgreementRetrieveActionResponse(String employeeCommissionAgreementRetrieveActionResponse) {
    this.employeeCommissionAgreementRetrieveActionResponse = employeeCommissionAgreementRetrieveActionResponse;
  }


  /**
   * Get employeeCommissionAgreementInstanceReportRecord
   * @return employeeCommissionAgreementInstanceReportRecord
  **/

  public CREmployeeCommissionAgreementRetrieveOutputModelEmployeeCommissionAgreementInstanceReportRecord getEmployeeCommissionAgreementInstanceReportRecord() {
    return employeeCommissionAgreementInstanceReportRecord;
  }

  public void setEmployeeCommissionAgreementInstanceReportRecord(CREmployeeCommissionAgreementRetrieveOutputModelEmployeeCommissionAgreementInstanceReportRecord employeeCommissionAgreementInstanceReportRecord) {
    this.employeeCommissionAgreementInstanceReportRecord = employeeCommissionAgreementInstanceReportRecord;
  }


  /**
   * Get employeeCommissionAgreementInstanceAnalysis
   * @return employeeCommissionAgreementInstanceAnalysis
  **/

  public CREmployeeCommissionAgreementRetrieveOutputModelEmployeeCommissionAgreementInstanceAnalysis getEmployeeCommissionAgreementInstanceAnalysis() {
    return employeeCommissionAgreementInstanceAnalysis;
  }

  public void setEmployeeCommissionAgreementInstanceAnalysis(CREmployeeCommissionAgreementRetrieveOutputModelEmployeeCommissionAgreementInstanceAnalysis employeeCommissionAgreementInstanceAnalysis) {
    this.employeeCommissionAgreementInstanceAnalysis = employeeCommissionAgreementInstanceAnalysis;
  }


}

