package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREmployeeCommissionAgreementGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CREmployeeCommissionAgreementGrantOutputModel
 */
public class CREmployeeCommissionAgreementGrantOutputModel   {
  private String employeeCommissionAgreementRequest = null;

  private String employeeCommissionAgreementSchedule = null;

  private String employeeCommissionAgreementStatus = null;

  private String employeeCommissionAgreementGrantActionTaskReference = null;

  private Object employeeCommissionAgreementGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CREmployeeCommissionAgreementGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Employee Commission Agreement instance grant service call 
   * @return employeeCommissionAgreementGrantActionTaskReference
  **/

  public String getEmployeeCommissionAgreementGrantActionTaskReference() {
    return employeeCommissionAgreementGrantActionTaskReference;
  }

  public void setEmployeeCommissionAgreementGrantActionTaskReference(String employeeCommissionAgreementGrantActionTaskReference) {
    this.employeeCommissionAgreementGrantActionTaskReference = employeeCommissionAgreementGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return employeeCommissionAgreementGrantActionTaskRecord
  **/

  public Object getEmployeeCommissionAgreementGrantActionTaskRecord() {
    return employeeCommissionAgreementGrantActionTaskRecord;
  }

  public void setEmployeeCommissionAgreementGrantActionTaskRecord(Object employeeCommissionAgreementGrantActionTaskRecord) {
    this.employeeCommissionAgreementGrantActionTaskRecord = employeeCommissionAgreementGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CREmployeeCommissionAgreementGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CREmployeeCommissionAgreementGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

