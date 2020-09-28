package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CREmployeeCommissionAgreementUpdateOutputModel
 */
public class CREmployeeCommissionAgreementUpdateOutputModel   {
  private String employeeCommissionAgreementRequest = null;

  private String employeeCommissionAgreementSchedule = null;

  private String employeeCommissionAgreementStatus = null;

  private String employeeCommissionAgreementUpdateActionTaskReference = null;

  private Object employeeCommissionAgreementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return employeeCommissionAgreementUpdateActionTaskReference
  **/

  public String getEmployeeCommissionAgreementUpdateActionTaskReference() {
    return employeeCommissionAgreementUpdateActionTaskReference;
  }

  public void setEmployeeCommissionAgreementUpdateActionTaskReference(String employeeCommissionAgreementUpdateActionTaskReference) {
    this.employeeCommissionAgreementUpdateActionTaskReference = employeeCommissionAgreementUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return employeeCommissionAgreementUpdateActionTaskRecord
  **/

  public Object getEmployeeCommissionAgreementUpdateActionTaskRecord() {
    return employeeCommissionAgreementUpdateActionTaskRecord;
  }

  public void setEmployeeCommissionAgreementUpdateActionTaskRecord(Object employeeCommissionAgreementUpdateActionTaskRecord) {
    this.employeeCommissionAgreementUpdateActionTaskRecord = employeeCommissionAgreementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

