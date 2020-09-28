package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREmployeeCommissionAgreementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQCommissionTermsRequestInputModel
 */
public class BQCommissionTermsRequestInputModel   {
  private String employeeCommissionAgreementInstanceReference = null;

  private String commissionTermsInstanceReference = null;

  private String commissionTermsPreconditions = null;

  private String commissionTermsTermSchedule = null;

  private String commissionTermsServiceType = null;

  private String commissionTermsServiceDescription = null;

  private String commissionTermsServiceInputsandOuputs = null;

  private String commissionTermsServiceWorkProduct = null;

  private Object commissionTermsRequestActionTaskRecord = null;

  private CREmployeeCommissionAgreementRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Employee Commission Agreement instance 
   * @return employeeCommissionAgreementInstanceReference
  **/

  public String getEmployeeCommissionAgreementInstanceReference() {
    return employeeCommissionAgreementInstanceReference;
  }

  public void setEmployeeCommissionAgreementInstanceReference(String employeeCommissionAgreementInstanceReference) {
    this.employeeCommissionAgreementInstanceReference = employeeCommissionAgreementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Commission Terms instance 
   * @return commissionTermsInstanceReference
  **/

  public String getCommissionTermsInstanceReference() {
    return commissionTermsInstanceReference;
  }

  public void setCommissionTermsInstanceReference(String commissionTermsInstanceReference) {
    this.commissionTermsInstanceReference = commissionTermsInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation for the terms to applyand or tasks that need to be completed prior to the initiation of the workstep 
   * @return commissionTermsPreconditions
  **/

  public String getCommissionTermsPreconditions() {
    return commissionTermsPreconditions;
  }

  public void setCommissionTermsPreconditions(String commissionTermsPreconditions) {
    this.commissionTermsPreconditions = commissionTermsPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any timing/duration considerations applying to the terms 
   * @return commissionTermsTermSchedule
  **/

  public String getCommissionTermsTermSchedule() {
    return commissionTermsTermSchedule;
  }

  public void setCommissionTermsTermSchedule(String commissionTermsTermSchedule) {
    this.commissionTermsTermSchedule = commissionTermsTermSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return commissionTermsServiceType
  **/

  public String getCommissionTermsServiceType() {
    return commissionTermsServiceType;
  }

  public void setCommissionTermsServiceType(String commissionTermsServiceType) {
    this.commissionTermsServiceType = commissionTermsServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return commissionTermsServiceDescription
  **/

  public String getCommissionTermsServiceDescription() {
    return commissionTermsServiceDescription;
  }

  public void setCommissionTermsServiceDescription(String commissionTermsServiceDescription) {
    this.commissionTermsServiceDescription = commissionTermsServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return commissionTermsServiceInputsandOuputs
  **/

  public String getCommissionTermsServiceInputsandOuputs() {
    return commissionTermsServiceInputsandOuputs;
  }

  public void setCommissionTermsServiceInputsandOuputs(String commissionTermsServiceInputsandOuputs) {
    this.commissionTermsServiceInputsandOuputs = commissionTermsServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return commissionTermsServiceWorkProduct
  **/

  public String getCommissionTermsServiceWorkProduct() {
    return commissionTermsServiceWorkProduct;
  }

  public void setCommissionTermsServiceWorkProduct(String commissionTermsServiceWorkProduct) {
    this.commissionTermsServiceWorkProduct = commissionTermsServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return commissionTermsRequestActionTaskRecord
  **/

  public Object getCommissionTermsRequestActionTaskRecord() {
    return commissionTermsRequestActionTaskRecord;
  }

  public void setCommissionTermsRequestActionTaskRecord(Object commissionTermsRequestActionTaskRecord) {
    this.commissionTermsRequestActionTaskRecord = commissionTermsRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CREmployeeCommissionAgreementRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CREmployeeCommissionAgreementRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

