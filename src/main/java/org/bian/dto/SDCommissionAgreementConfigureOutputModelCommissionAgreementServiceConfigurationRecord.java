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
 * SDCommissionAgreementConfigureOutputModelCommissionAgreementServiceConfigurationRecord
 */
public class SDCommissionAgreementConfigureOutputModelCommissionAgreementServiceConfigurationRecord   {
  private String commissionAgreementServiceConfigurationSettingDescription = null;

  private SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceConfigurationSetup commissionAgreementServiceConfigurationSetup = null;

  private SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceSubscription commissionAgreementServiceSubscription = null;

  private SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceAgreement commissionAgreementServiceAgreement = null;

  private String commissionAgreementServiceStatus = null;


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

