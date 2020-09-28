package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CREmployeeCommissionAgreementControlOutputModel
 */
public class CREmployeeCommissionAgreementControlOutputModel   {
  private String employeeCommissionAgreementRequest = null;

  private String employeeCommissionAgreementSchedule = null;

  private String employeeCommissionAgreementStatus = null;

  private String employeeCommissionAgreementControlActionTaskReference = null;

  private Object employeeCommissionAgreementControlActionTaskRecord = null;

  private String employeeCommissionAgreementControlActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Employee Commission Agreement instance control processing service call 
   * @return employeeCommissionAgreementControlActionTaskReference
  **/

  public String getEmployeeCommissionAgreementControlActionTaskReference() {
    return employeeCommissionAgreementControlActionTaskReference;
  }

  public void setEmployeeCommissionAgreementControlActionTaskReference(String employeeCommissionAgreementControlActionTaskReference) {
    this.employeeCommissionAgreementControlActionTaskReference = employeeCommissionAgreementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return employeeCommissionAgreementControlActionTaskRecord
  **/

  public Object getEmployeeCommissionAgreementControlActionTaskRecord() {
    return employeeCommissionAgreementControlActionTaskRecord;
  }

  public void setEmployeeCommissionAgreementControlActionTaskRecord(Object employeeCommissionAgreementControlActionTaskRecord) {
    this.employeeCommissionAgreementControlActionTaskRecord = employeeCommissionAgreementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return employeeCommissionAgreementControlActionResponse
  **/

  public String getEmployeeCommissionAgreementControlActionResponse() {
    return employeeCommissionAgreementControlActionResponse;
  }

  public void setEmployeeCommissionAgreementControlActionResponse(String employeeCommissionAgreementControlActionResponse) {
    this.employeeCommissionAgreementControlActionResponse = employeeCommissionAgreementControlActionResponse;
  }


}

