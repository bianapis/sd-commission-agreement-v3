package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CREmployeeCommissionAgreementExchangeOutputModel
 */
public class CREmployeeCommissionAgreementExchangeOutputModel   {
  private String employeeCommissionAgreementRequest = null;

  private String employeeCommissionAgreementSchedule = null;

  private String employeeCommissionAgreementStatus = null;

  private String employeeCommissionAgreementExchangeActionTaskReference = null;

  private Object employeeCommissionAgreementExchangeActionTaskRecord = null;

  private String employeeCommissionAgreementExchangeActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Employee Commission Agreement instance exchange service call 
   * @return employeeCommissionAgreementExchangeActionTaskReference
  **/

  public String getEmployeeCommissionAgreementExchangeActionTaskReference() {
    return employeeCommissionAgreementExchangeActionTaskReference;
  }

  public void setEmployeeCommissionAgreementExchangeActionTaskReference(String employeeCommissionAgreementExchangeActionTaskReference) {
    this.employeeCommissionAgreementExchangeActionTaskReference = employeeCommissionAgreementExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return employeeCommissionAgreementExchangeActionTaskRecord
  **/

  public Object getEmployeeCommissionAgreementExchangeActionTaskRecord() {
    return employeeCommissionAgreementExchangeActionTaskRecord;
  }

  public void setEmployeeCommissionAgreementExchangeActionTaskRecord(Object employeeCommissionAgreementExchangeActionTaskRecord) {
    this.employeeCommissionAgreementExchangeActionTaskRecord = employeeCommissionAgreementExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return employeeCommissionAgreementExchangeActionResponse
  **/

  public String getEmployeeCommissionAgreementExchangeActionResponse() {
    return employeeCommissionAgreementExchangeActionResponse;
  }

  public void setEmployeeCommissionAgreementExchangeActionResponse(String employeeCommissionAgreementExchangeActionResponse) {
    this.employeeCommissionAgreementExchangeActionResponse = employeeCommissionAgreementExchangeActionResponse;
  }


}

