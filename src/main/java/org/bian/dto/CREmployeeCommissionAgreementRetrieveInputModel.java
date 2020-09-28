package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREmployeeCommissionAgreementRetrieveInputModelEmployeeCommissionAgreementInstanceAnalysis;
import org.bian.dto.CREmployeeCommissionAgreementRetrieveInputModelEmployeeCommissionAgreementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CREmployeeCommissionAgreementRetrieveInputModel
 */
public class CREmployeeCommissionAgreementRetrieveInputModel   {
  private Object employeeCommissionAgreementRetrieveActionTaskRecord = null;

  private String employeeCommissionAgreementRetrieveActionRequest = null;

  private CREmployeeCommissionAgreementRetrieveInputModelEmployeeCommissionAgreementInstanceReportRecord employeeCommissionAgreementInstanceReportRecord = null;

  private CREmployeeCommissionAgreementRetrieveInputModelEmployeeCommissionAgreementInstanceAnalysis employeeCommissionAgreementInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return employeeCommissionAgreementRetrieveActionRequest
  **/

  public String getEmployeeCommissionAgreementRetrieveActionRequest() {
    return employeeCommissionAgreementRetrieveActionRequest;
  }

  public void setEmployeeCommissionAgreementRetrieveActionRequest(String employeeCommissionAgreementRetrieveActionRequest) {
    this.employeeCommissionAgreementRetrieveActionRequest = employeeCommissionAgreementRetrieveActionRequest;
  }


  /**
   * Get employeeCommissionAgreementInstanceReportRecord
   * @return employeeCommissionAgreementInstanceReportRecord
  **/

  public CREmployeeCommissionAgreementRetrieveInputModelEmployeeCommissionAgreementInstanceReportRecord getEmployeeCommissionAgreementInstanceReportRecord() {
    return employeeCommissionAgreementInstanceReportRecord;
  }

  public void setEmployeeCommissionAgreementInstanceReportRecord(CREmployeeCommissionAgreementRetrieveInputModelEmployeeCommissionAgreementInstanceReportRecord employeeCommissionAgreementInstanceReportRecord) {
    this.employeeCommissionAgreementInstanceReportRecord = employeeCommissionAgreementInstanceReportRecord;
  }


  /**
   * Get employeeCommissionAgreementInstanceAnalysis
   * @return employeeCommissionAgreementInstanceAnalysis
  **/

  public CREmployeeCommissionAgreementRetrieveInputModelEmployeeCommissionAgreementInstanceAnalysis getEmployeeCommissionAgreementInstanceAnalysis() {
    return employeeCommissionAgreementInstanceAnalysis;
  }

  public void setEmployeeCommissionAgreementInstanceAnalysis(CREmployeeCommissionAgreementRetrieveInputModelEmployeeCommissionAgreementInstanceAnalysis employeeCommissionAgreementInstanceAnalysis) {
    this.employeeCommissionAgreementInstanceAnalysis = employeeCommissionAgreementInstanceAnalysis;
  }


}

