package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceSubscription
 */
public class SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceSubscription   {
  private String commissionAgreementServiceSubscriberReference = null;

  private String commissionAgreementServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return commissionAgreementServiceSubscriberReference
  **/

  public String getCommissionAgreementServiceSubscriberReference() {
    return commissionAgreementServiceSubscriberReference;
  }

  public void setCommissionAgreementServiceSubscriberReference(String commissionAgreementServiceSubscriberReference) {
    this.commissionAgreementServiceSubscriberReference = commissionAgreementServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return commissionAgreementServiceSubscriberAccessProfile
  **/

  public String getCommissionAgreementServiceSubscriberAccessProfile() {
    return commissionAgreementServiceSubscriberAccessProfile;
  }

  public void setCommissionAgreementServiceSubscriberAccessProfile(String commissionAgreementServiceSubscriberAccessProfile) {
    this.commissionAgreementServiceSubscriberAccessProfile = commissionAgreementServiceSubscriberAccessProfile;
  }


}

