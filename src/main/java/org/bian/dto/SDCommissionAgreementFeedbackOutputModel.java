package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionAgreementFeedbackOutputModelCommissionAgreementFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDCommissionAgreementFeedbackOutputModel
 */
public class SDCommissionAgreementFeedbackOutputModel   {
  private String commissionAgreementFeedbackActionTaskReference = null;

  private Object commissionAgreementFeedbackActionTaskRecord = null;

  private SDCommissionAgreementFeedbackOutputModelCommissionAgreementFeedbackActionRecord commissionAgreementFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return commissionAgreementFeedbackActionTaskReference
  **/

  public String getCommissionAgreementFeedbackActionTaskReference() {
    return commissionAgreementFeedbackActionTaskReference;
  }

  public void setCommissionAgreementFeedbackActionTaskReference(String commissionAgreementFeedbackActionTaskReference) {
    this.commissionAgreementFeedbackActionTaskReference = commissionAgreementFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return commissionAgreementFeedbackActionTaskRecord
  **/

  public Object getCommissionAgreementFeedbackActionTaskRecord() {
    return commissionAgreementFeedbackActionTaskRecord;
  }

  public void setCommissionAgreementFeedbackActionTaskRecord(Object commissionAgreementFeedbackActionTaskRecord) {
    this.commissionAgreementFeedbackActionTaskRecord = commissionAgreementFeedbackActionTaskRecord;
  }


  /**
   * Get commissionAgreementFeedbackActionRecord
   * @return commissionAgreementFeedbackActionRecord
  **/

  public SDCommissionAgreementFeedbackOutputModelCommissionAgreementFeedbackActionRecord getCommissionAgreementFeedbackActionRecord() {
    return commissionAgreementFeedbackActionRecord;
  }

  public void setCommissionAgreementFeedbackActionRecord(SDCommissionAgreementFeedbackOutputModelCommissionAgreementFeedbackActionRecord commissionAgreementFeedbackActionRecord) {
    this.commissionAgreementFeedbackActionRecord = commissionAgreementFeedbackActionRecord;
  }


}

