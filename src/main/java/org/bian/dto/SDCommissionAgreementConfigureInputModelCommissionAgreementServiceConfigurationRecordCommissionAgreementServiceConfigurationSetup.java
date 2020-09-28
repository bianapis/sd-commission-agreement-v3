package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceConfigurationSetup
 */
public class SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceConfigurationSetup   {
  private String commissionAgreementServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return commissionAgreementServiceConfigurationParameter
  **/

  public String getCommissionAgreementServiceConfigurationParameter() {
    return commissionAgreementServiceConfigurationParameter;
  }

  public void setCommissionAgreementServiceConfigurationParameter(String commissionAgreementServiceConfigurationParameter) {
    this.commissionAgreementServiceConfigurationParameter = commissionAgreementServiceConfigurationParameter;
  }


}

