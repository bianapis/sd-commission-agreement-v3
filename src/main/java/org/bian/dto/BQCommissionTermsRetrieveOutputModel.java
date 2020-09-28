package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCommissionTermsRetrieveOutputModelCommissionTermsInstanceAnalysis;
import org.bian.dto.BQCommissionTermsRetrieveOutputModelCommissionTermsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCommissionTermsRetrieveOutputModel
 */
public class BQCommissionTermsRetrieveOutputModel   {
  private String commissionTermsPreconditions = null;

  private String commissionTermsTermSchedule = null;

  private String commissionTermsServiceType = null;

  private String commissionTermsServiceDescription = null;

  private String commissionTermsServiceInputsandOuputs = null;

  private String commissionTermsServiceWorkProduct = null;

  private String commissionTermsRetrieveActionTaskReference = null;

  private Object commissionTermsRetrieveActionTaskRecord = null;

  private String commissionTermsRetrieveActionResponse = null;

  private BQCommissionTermsRetrieveOutputModelCommissionTermsInstanceReport commissionTermsInstanceReport = null;

  private BQCommissionTermsRetrieveOutputModelCommissionTermsInstanceAnalysis commissionTermsInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Commission Terms instance retrieve service call 
   * @return commissionTermsRetrieveActionTaskReference
  **/

  public String getCommissionTermsRetrieveActionTaskReference() {
    return commissionTermsRetrieveActionTaskReference;
  }

  public void setCommissionTermsRetrieveActionTaskReference(String commissionTermsRetrieveActionTaskReference) {
    this.commissionTermsRetrieveActionTaskReference = commissionTermsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return commissionTermsRetrieveActionTaskRecord
  **/

  public Object getCommissionTermsRetrieveActionTaskRecord() {
    return commissionTermsRetrieveActionTaskRecord;
  }

  public void setCommissionTermsRetrieveActionTaskRecord(Object commissionTermsRetrieveActionTaskRecord) {
    this.commissionTermsRetrieveActionTaskRecord = commissionTermsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return commissionTermsRetrieveActionResponse
  **/

  public String getCommissionTermsRetrieveActionResponse() {
    return commissionTermsRetrieveActionResponse;
  }

  public void setCommissionTermsRetrieveActionResponse(String commissionTermsRetrieveActionResponse) {
    this.commissionTermsRetrieveActionResponse = commissionTermsRetrieveActionResponse;
  }


  /**
   * Get commissionTermsInstanceReport
   * @return commissionTermsInstanceReport
  **/

  public BQCommissionTermsRetrieveOutputModelCommissionTermsInstanceReport getCommissionTermsInstanceReport() {
    return commissionTermsInstanceReport;
  }

  public void setCommissionTermsInstanceReport(BQCommissionTermsRetrieveOutputModelCommissionTermsInstanceReport commissionTermsInstanceReport) {
    this.commissionTermsInstanceReport = commissionTermsInstanceReport;
  }


  /**
   * Get commissionTermsInstanceAnalysis
   * @return commissionTermsInstanceAnalysis
  **/

  public BQCommissionTermsRetrieveOutputModelCommissionTermsInstanceAnalysis getCommissionTermsInstanceAnalysis() {
    return commissionTermsInstanceAnalysis;
  }

  public void setCommissionTermsInstanceAnalysis(BQCommissionTermsRetrieveOutputModelCommissionTermsInstanceAnalysis commissionTermsInstanceAnalysis) {
    this.commissionTermsInstanceAnalysis = commissionTermsInstanceAnalysis;
  }


}

