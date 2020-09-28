package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceAgreement;
import org.bian.dto.SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceConfigurationSetup;
import org.bian.dto.SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecord
 */
public class SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecord   {
  private String commissionAgreementServiceConfigurationSettingReference = null;

  private String commissionAgreementServiceConfigurationSettingType = null;

  private SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceConfigurationSetup commissionAgreementServiceConfigurationSetup = null;

  private SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceSubscription commissionAgreementServiceSubscription = null;

  private SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceAgreement commissionAgreementServiceAgreement = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return commissionAgreementServiceConfigurationSettingReference
  **/

  public String getCommissionAgreementServiceConfigurationSettingReference() {
    return commissionAgreementServiceConfigurationSettingReference;
  }

  public void setCommissionAgreementServiceConfigurationSettingReference(String commissionAgreementServiceConfigurationSettingReference) {
    this.commissionAgreementServiceConfigurationSettingReference = commissionAgreementServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return commissionAgreementServiceConfigurationSettingType
  **/

  public String getCommissionAgreementServiceConfigurationSettingType() {
    return commissionAgreementServiceConfigurationSettingType;
  }

  public void setCommissionAgreementServiceConfigurationSettingType(String commissionAgreementServiceConfigurationSettingType) {
    this.commissionAgreementServiceConfigurationSettingType = commissionAgreementServiceConfigurationSettingType;
  }


  /**
   * Get commissionAgreementServiceConfigurationSetup
   * @return commissionAgreementServiceConfigurationSetup
  **/

  public SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceConfigurationSetup getCommissionAgreementServiceConfigurationSetup() {
    return commissionAgreementServiceConfigurationSetup;
  }

  public void setCommissionAgreementServiceConfigurationSetup(SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceConfigurationSetup commissionAgreementServiceConfigurationSetup) {
    this.commissionAgreementServiceConfigurationSetup = commissionAgreementServiceConfigurationSetup;
  }


  /**
   * Get commissionAgreementServiceSubscription
   * @return commissionAgreementServiceSubscription
  **/

  public SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceSubscription getCommissionAgreementServiceSubscription() {
    return commissionAgreementServiceSubscription;
  }

  public void setCommissionAgreementServiceSubscription(SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceSubscription commissionAgreementServiceSubscription) {
    this.commissionAgreementServiceSubscription = commissionAgreementServiceSubscription;
  }


  /**
   * Get commissionAgreementServiceAgreement
   * @return commissionAgreementServiceAgreement
  **/

  public SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceAgreement getCommissionAgreementServiceAgreement() {
    return commissionAgreementServiceAgreement;
  }

  public void setCommissionAgreementServiceAgreement(SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceAgreement commissionAgreementServiceAgreement) {
    this.commissionAgreementServiceAgreement = commissionAgreementServiceAgreement;
  }


}

