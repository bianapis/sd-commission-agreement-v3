package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionAgreementFeedbackInputModelCommissionAgreementFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDCommissionAgreementFeedbackInputModel
 */
public class SDCommissionAgreementFeedbackInputModel   {
  private Object commissionAgreementFeedbackActionTaskRecord = null;

  private SDCommissionAgreementFeedbackInputModelCommissionAgreementFeedbackActionRecord commissionAgreementFeedbackActionRecord = null;


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

  public SDCommissionAgreementFeedbackInputModelCommissionAgreementFeedbackActionRecord getCommissionAgreementFeedbackActionRecord() {
    return commissionAgreementFeedbackActionRecord;
  }

  public void setCommissionAgreementFeedbackActionRecord(SDCommissionAgreementFeedbackInputModelCommissionAgreementFeedbackActionRecord commissionAgreementFeedbackActionRecord) {
    this.commissionAgreementFeedbackActionRecord = commissionAgreementFeedbackActionRecord;
  }


}

