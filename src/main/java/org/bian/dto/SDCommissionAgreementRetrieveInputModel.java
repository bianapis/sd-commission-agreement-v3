package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionAgreementRetrieveInputModelCommissionAgreementOfferedService;
import org.bian.dto.SDCommissionAgreementRetrieveInputModelCommissionAgreementRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDCommissionAgreementRetrieveInputModel
 */
public class SDCommissionAgreementRetrieveInputModel   {
  private Object commissionAgreementRetrieveActionTaskRecord = null;

  private String commissionAgreementRetrieveActionRequest = null;

  private SDCommissionAgreementRetrieveInputModelCommissionAgreementRetrieveActionRecord commissionAgreementRetrieveActionRecord = null;

  private SDCommissionAgreementRetrieveInputModelCommissionAgreementOfferedService commissionAgreementOfferedService = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return commissionAgreementRetrieveActionRequest
  **/

  public String getCommissionAgreementRetrieveActionRequest() {
    return commissionAgreementRetrieveActionRequest;
  }

  public void setCommissionAgreementRetrieveActionRequest(String commissionAgreementRetrieveActionRequest) {
    this.commissionAgreementRetrieveActionRequest = commissionAgreementRetrieveActionRequest;
  }


  /**
   * Get commissionAgreementRetrieveActionRecord
   * @return commissionAgreementRetrieveActionRecord
  **/

  public SDCommissionAgreementRetrieveInputModelCommissionAgreementRetrieveActionRecord getCommissionAgreementRetrieveActionRecord() {
    return commissionAgreementRetrieveActionRecord;
  }

  public void setCommissionAgreementRetrieveActionRecord(SDCommissionAgreementRetrieveInputModelCommissionAgreementRetrieveActionRecord commissionAgreementRetrieveActionRecord) {
    this.commissionAgreementRetrieveActionRecord = commissionAgreementRetrieveActionRecord;
  }


  /**
   * Get commissionAgreementOfferedService
   * @return commissionAgreementOfferedService
  **/

  public SDCommissionAgreementRetrieveInputModelCommissionAgreementOfferedService getCommissionAgreementOfferedService() {
    return commissionAgreementOfferedService;
  }

  public void setCommissionAgreementOfferedService(SDCommissionAgreementRetrieveInputModelCommissionAgreementOfferedService commissionAgreementOfferedService) {
    this.commissionAgreementOfferedService = commissionAgreementOfferedService;
  }


}

