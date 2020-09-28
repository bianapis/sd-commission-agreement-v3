package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCommissionTermsInitiateOutputModel
 */
public class BQCommissionTermsInitiateOutputModel   {
  private String commissionTermsInstanceReference = null;

  private String commissionTermsInitiateActionReference = null;

  private Object commissionTermsInitiateActionRecord = null;

  private String commissionTermsInstanceStatus = null;

  private String commissionTermsPreconditions = null;

  private String commissionTermsTermSchedule = null;

  private String commissionTermsServiceType = null;

  private String commissionTermsServiceDescription = null;

  private String commissionTermsServiceInputsandOuputs = null;

  private String commissionTermsServiceWorkProduct = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return commissionTermsInitiateActionReference
  **/

  public String getCommissionTermsInitiateActionReference() {
    return commissionTermsInitiateActionReference;
  }

  public void setCommissionTermsInitiateActionReference(String commissionTermsInitiateActionReference) {
    this.commissionTermsInitiateActionReference = commissionTermsInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return commissionTermsInitiateActionRecord
  **/

  public Object getCommissionTermsInitiateActionRecord() {
    return commissionTermsInitiateActionRecord;
  }

  public void setCommissionTermsInitiateActionRecord(Object commissionTermsInitiateActionRecord) {
    this.commissionTermsInitiateActionRecord = commissionTermsInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Commission Terms instance (e.g. initialised, pending, active) 
   * @return commissionTermsInstanceStatus
  **/

  public String getCommissionTermsInstanceStatus() {
    return commissionTermsInstanceStatus;
  }

  public void setCommissionTermsInstanceStatus(String commissionTermsInstanceStatus) {
    this.commissionTermsInstanceStatus = commissionTermsInstanceStatus;
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


}

