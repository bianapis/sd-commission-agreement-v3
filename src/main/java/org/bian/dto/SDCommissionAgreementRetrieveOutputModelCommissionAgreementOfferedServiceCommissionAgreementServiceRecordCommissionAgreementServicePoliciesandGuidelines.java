package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCommissionAgreementRetrieveOutputModelCommissionAgreementOfferedServiceCommissionAgreementServiceRecordCommissionAgreementServicePoliciesandGuidelines
 */
public class SDCommissionAgreementRetrieveOutputModelCommissionAgreementOfferedServiceCommissionAgreementServiceRecordCommissionAgreementServicePoliciesandGuidelines   {
  private String commissionAgreementServiceEligibility = null;

  private String commissionAgreementServiceIntendedUses = null;

  private String commissionAgreementServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return commissionAgreementServiceEligibility
  **/

  public String getCommissionAgreementServiceEligibility() {
    return commissionAgreementServiceEligibility;
  }

  public void setCommissionAgreementServiceEligibility(String commissionAgreementServiceEligibility) {
    this.commissionAgreementServiceEligibility = commissionAgreementServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return commissionAgreementServiceIntendedUses
  **/

  public String getCommissionAgreementServiceIntendedUses() {
    return commissionAgreementServiceIntendedUses;
  }

  public void setCommissionAgreementServiceIntendedUses(String commissionAgreementServiceIntendedUses) {
    this.commissionAgreementServiceIntendedUses = commissionAgreementServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return commissionAgreementServicePricingandTerms
  **/

  public String getCommissionAgreementServicePricingandTerms() {
    return commissionAgreementServicePricingandTerms;
  }

  public void setCommissionAgreementServicePricingandTerms(String commissionAgreementServicePricingandTerms) {
    this.commissionAgreementServicePricingandTerms = commissionAgreementServicePricingandTerms;
  }


}

