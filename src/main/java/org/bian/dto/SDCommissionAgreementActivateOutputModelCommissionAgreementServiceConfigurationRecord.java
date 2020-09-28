package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionAgreementActivateInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceConfigurationSetup;
import org.bian.dto.SDCommissionAgreementActivateOutputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceAgreement;
import org.bian.dto.SDCommissionAgreementActivateOutputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDCommissionAgreementActivateOutputModelCommissionAgreementServiceConfigurationRecord
 */
public class SDCommissionAgreementActivateOutputModelCommissionAgreementServiceConfigurationRecord   {
  private String commissionAgreementServiceConfigurationSettingReference = null;

  private String commissionAgreementServiceConfigurationSettingDescription = null;

  private SDCommissionAgreementActivateInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceConfigurationSetup commissionAgreementServiceConfigurationSetup = null;

  private SDCommissionAgreementActivateOutputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceSubscription commissionAgreementServiceSubscription = null;

  private SDCommissionAgreementActivateOutputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceAgreement commissionAgreementServiceAgreement = null;

  private String commissionAgreementServiceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return commissionAgreementServiceConfigurationSettingDescription
  **/

  public String getCommissionAgreementServiceConfigurationSettingDescription() {
    return commissionAgreementServiceConfigurationSettingDescription;
  }

  public void setCommissionAgreementServiceConfigurationSettingDescription(String commissionAgreementServiceConfigurationSettingDescription) {
    this.commissionAgreementServiceConfigurationSettingDescription = commissionAgreementServiceConfigurationSettingDescription;
  }


  /**
   * Get commissionAgreementServiceConfigurationSetup
   * @return commissionAgreementServiceConfigurationSetup
  **/

  public SDCommissionAgreementActivateInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceConfigurationSetup getCommissionAgreementServiceConfigurationSetup() {
    return commissionAgreementServiceConfigurationSetup;
  }

  public void setCommissionAgreementServiceConfigurationSetup(SDCommissionAgreementActivateInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceConfigurationSetup commissionAgreementServiceConfigurationSetup) {
    this.commissionAgreementServiceConfigurationSetup = commissionAgreementServiceConfigurationSetup;
  }


  /**
   * Get commissionAgreementServiceSubscription
   * @return commissionAgreementServiceSubscription
  **/

  public SDCommissionAgreementActivateOutputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceSubscription getCommissionAgreementServiceSubscription() {
    return commissionAgreementServiceSubscription;
  }

  public void setCommissionAgreementServiceSubscription(SDCommissionAgreementActivateOutputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceSubscription commissionAgreementServiceSubscription) {
    this.commissionAgreementServiceSubscription = commissionAgreementServiceSubscription;
  }


  /**
   * Get commissionAgreementServiceAgreement
   * @return commissionAgreementServiceAgreement
  **/

  public SDCommissionAgreementActivateOutputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceAgreement getCommissionAgreementServiceAgreement() {
    return commissionAgreementServiceAgreement;
  }

  public void setCommissionAgreementServiceAgreement(SDCommissionAgreementActivateOutputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceAgreement commissionAgreementServiceAgreement) {
    this.commissionAgreementServiceAgreement = commissionAgreementServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return commissionAgreementServiceStatus
  **/

  public String getCommissionAgreementServiceStatus() {
    return commissionAgreementServiceStatus;
  }

  public void setCommissionAgreementServiceStatus(String commissionAgreementServiceStatus) {
    this.commissionAgreementServiceStatus = commissionAgreementServiceStatus;
  }


}

