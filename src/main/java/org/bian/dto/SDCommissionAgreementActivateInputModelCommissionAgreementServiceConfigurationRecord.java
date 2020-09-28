package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionAgreementActivateInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDCommissionAgreementActivateInputModelCommissionAgreementServiceConfigurationRecord
 */
public class SDCommissionAgreementActivateInputModelCommissionAgreementServiceConfigurationRecord   {
  private String commissionAgreementServiceConfigurationSettingReference = null;

  private String commissionAgreementServiceConfigurationSettingType = null;

  private SDCommissionAgreementActivateInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceConfigurationSetup commissionAgreementServiceConfigurationSetup = null;


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

  public SDCommissionAgreementActivateInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceConfigurationSetup getCommissionAgreementServiceConfigurationSetup() {
    return commissionAgreementServiceConfigurationSetup;
  }

  public void setCommissionAgreementServiceConfigurationSetup(SDCommissionAgreementActivateInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceConfigurationSetup commissionAgreementServiceConfigurationSetup) {
    this.commissionAgreementServiceConfigurationSetup = commissionAgreementServiceConfigurationSetup;
  }


}

