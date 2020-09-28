package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionAgreementRetrieveOutputModelCommissionAgreementOfferedServiceCommissionAgreementServiceRecord;

import javax.validation.Valid;
  
/**
 * SDCommissionAgreementRetrieveOutputModelCommissionAgreementOfferedService
 */
public class SDCommissionAgreementRetrieveOutputModelCommissionAgreementOfferedService   {
  private String commissionAgreementServiceReference = null;

  private SDCommissionAgreementRetrieveOutputModelCommissionAgreementOfferedServiceCommissionAgreementServiceRecord commissionAgreementServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return commissionAgreementServiceReference
  **/

  public String getCommissionAgreementServiceReference() {
    return commissionAgreementServiceReference;
  }

  public void setCommissionAgreementServiceReference(String commissionAgreementServiceReference) {
    this.commissionAgreementServiceReference = commissionAgreementServiceReference;
  }


  /**
   * Get commissionAgreementServiceRecord
   * @return commissionAgreementServiceRecord
  **/

  public SDCommissionAgreementRetrieveOutputModelCommissionAgreementOfferedServiceCommissionAgreementServiceRecord getCommissionAgreementServiceRecord() {
    return commissionAgreementServiceRecord;
  }

  public void setCommissionAgreementServiceRecord(SDCommissionAgreementRetrieveOutputModelCommissionAgreementOfferedServiceCommissionAgreementServiceRecord commissionAgreementServiceRecord) {
    this.commissionAgreementServiceRecord = commissionAgreementServiceRecord;
  }


}

