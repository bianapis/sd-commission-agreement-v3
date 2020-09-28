package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CREmployeeCommissionAgreementInitiateOutputModel
 */
public class CREmployeeCommissionAgreementInitiateOutputModel   {
  private String employeeCommissionAgreementInstanceReference = null;

  private String employeeCommissionAgreementInitiateActionReference = null;

  private Object employeeCommissionAgreementInitiateActionRecord = null;

  private String employeeCommissionAgreementInstanceStatus = null;

  private String employeeCommissionAgreementRequest = null;

  private String employeeCommissionAgreementSchedule = null;

  private String employeeCommissionAgreementStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Employee Commission Agreement instance 
   * @return employeeCommissionAgreementInstanceReference
  **/

  public String getEmployeeCommissionAgreementInstanceReference() {
    return employeeCommissionAgreementInstanceReference;
  }

  public void setEmployeeCommissionAgreementInstanceReference(String employeeCommissionAgreementInstanceReference) {
    this.employeeCommissionAgreementInstanceReference = employeeCommissionAgreementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return employeeCommissionAgreementInitiateActionReference
  **/

  public String getEmployeeCommissionAgreementInitiateActionReference() {
    return employeeCommissionAgreementInitiateActionReference;
  }

  public void setEmployeeCommissionAgreementInitiateActionReference(String employeeCommissionAgreementInitiateActionReference) {
    this.employeeCommissionAgreementInitiateActionReference = employeeCommissionAgreementInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return employeeCommissionAgreementInitiateActionRecord
  **/

  public Object getEmployeeCommissionAgreementInitiateActionRecord() {
    return employeeCommissionAgreementInitiateActionRecord;
  }

  public void setEmployeeCommissionAgreementInitiateActionRecord(Object employeeCommissionAgreementInitiateActionRecord) {
    this.employeeCommissionAgreementInitiateActionRecord = employeeCommissionAgreementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Employee Commission Agreement instance (e.g. initialised, pending, active) 
   * @return employeeCommissionAgreementInstanceStatus
  **/

  public String getEmployeeCommissionAgreementInstanceStatus() {
    return employeeCommissionAgreementInstanceStatus;
  }

  public void setEmployeeCommissionAgreementInstanceStatus(String employeeCommissionAgreementInstanceStatus) {
    this.employeeCommissionAgreementInstanceStatus = employeeCommissionAgreementInstanceStatus;
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


}

