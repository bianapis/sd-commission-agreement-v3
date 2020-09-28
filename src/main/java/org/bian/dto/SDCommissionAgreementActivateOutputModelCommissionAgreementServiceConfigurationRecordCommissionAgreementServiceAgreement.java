package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCommissionAgreementActivateOutputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceAgreement
 */
public class SDCommissionAgreementActivateOutputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceAgreement   {
  private String commissionAgreementServiceAgreementReference = null;

  private String commissionAgreementServiceUserReference = null;

  private String commissionAgreementServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return commissionAgreementServiceAgreementReference
  **/

  public String getCommissionAgreementServiceAgreementReference() {
    return commissionAgreementServiceAgreementReference;
  }

  public void setCommissionAgreementServiceAgreementReference(String commissionAgreementServiceAgreementReference) {
    this.commissionAgreementServiceAgreementReference = commissionAgreementServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return commissionAgreementServiceUserReference
  **/

  public String getCommissionAgreementServiceUserReference() {
    return commissionAgreementServiceUserReference;
  }

  public void setCommissionAgreementServiceUserReference(String commissionAgreementServiceUserReference) {
    this.commissionAgreementServiceUserReference = commissionAgreementServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return commissionAgreementServiceAgreementTermsandConditions
  **/

  public String getCommissionAgreementServiceAgreementTermsandConditions() {
    return commissionAgreementServiceAgreementTermsandConditions;
  }

  public void setCommissionAgreementServiceAgreementTermsandConditions(String commissionAgreementServiceAgreementTermsandConditions) {
    this.commissionAgreementServiceAgreementTermsandConditions = commissionAgreementServiceAgreementTermsandConditions;
  }


}

