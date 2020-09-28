package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionAgreementRetrieveOutputModelCommissionAgreementOfferedService;
import org.bian.dto.SDCommissionAgreementRetrieveOutputModelCommissionAgreementRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDCommissionAgreementRetrieveOutputModel
 */
public class SDCommissionAgreementRetrieveOutputModel   {
  private String commissionAgreementRetrieveActionTaskReference = null;

  private Object commissionAgreementRetrieveActionTaskRecord = null;

  private String commissionAgreementRetrieveActionResponse = null;

  private SDCommissionAgreementRetrieveOutputModelCommissionAgreementRetrieveActionRecord commissionAgreementRetrieveActionRecord = null;

  private SDCommissionAgreementRetrieveOutputModelCommissionAgreementOfferedService commissionAgreementOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return commissionAgreementRetrieveActionTaskReference
  **/

  public String getCommissionAgreementRetrieveActionTaskReference() {
    return commissionAgreementRetrieveActionTaskReference;
  }

  public void setCommissionAgreementRetrieveActionTaskReference(String commissionAgreementRetrieveActionTaskReference) {
    this.commissionAgreementRetrieveActionTaskReference = commissionAgreementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return commissionAgreementRetrieveActionTaskRecord
  **/

  public Object getCommissionAgreementRetrieveActionTaskRecord() {
    return commissionAgreementRetrieveActionTaskRecord;
  }

  public void setCommissionAgreementRetrieveActionTaskRecord(Object commissionAgreementRetrieveActionTaskRecord) {
    this.commissionAgreementRetrieveActionTaskRecord = commissionAgreementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return commissionAgreementRetrieveActionResponse
  **/

  public String getCommissionAgreementRetrieveActionResponse() {
    return commissionAgreementRetrieveActionResponse;
  }

  public void setCommissionAgreementRetrieveActionResponse(String commissionAgreementRetrieveActionResponse) {
    this.commissionAgreementRetrieveActionResponse = commissionAgreementRetrieveActionResponse;
  }


  /**
   * Get commissionAgreementRetrieveActionRecord
   * @return commissionAgreementRetrieveActionRecord
  **/

  public SDCommissionAgreementRetrieveOutputModelCommissionAgreementRetrieveActionRecord getCommissionAgreementRetrieveActionRecord() {
    return commissionAgreementRetrieveActionRecord;
  }

  public void setCommissionAgreementRetrieveActionRecord(SDCommissionAgreementRetrieveOutputModelCommissionAgreementRetrieveActionRecord commissionAgreementRetrieveActionRecord) {
    this.commissionAgreementRetrieveActionRecord = commissionAgreementRetrieveActionRecord;
  }


  /**
   * Get commissionAgreementOfferedService
   * @return commissionAgreementOfferedService
  **/

  public SDCommissionAgreementRetrieveOutputModelCommissionAgreementOfferedService getCommissionAgreementOfferedService() {
    return commissionAgreementOfferedService;
  }

  public void setCommissionAgreementOfferedService(SDCommissionAgreementRetrieveOutputModelCommissionAgreementOfferedService commissionAgreementOfferedService) {
    this.commissionAgreementOfferedService = commissionAgreementOfferedService;
  }


}

