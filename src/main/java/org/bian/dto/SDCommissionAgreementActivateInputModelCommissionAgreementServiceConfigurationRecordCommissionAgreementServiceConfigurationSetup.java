package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCommissionAgreementActivateInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceConfigurationSetup
 */
public class SDCommissionAgreementActivateInputModelCommissionAgreementServiceConfigurationRecordCommissionAgreementServiceConfigurationSetup   {
  private String commissionAgreementServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return commissionAgreementServiceConfigurationParameter
  **/

  public String getCommissionAgreementServiceConfigurationParameter() {
    return commissionAgreementServiceConfigurationParameter;
  }

  public void setCommissionAgreementServiceConfigurationParameter(String commissionAgreementServiceConfigurationParameter) {
    this.commissionAgreementServiceConfigurationParameter = commissionAgreementServiceConfigurationParameter;
  }


}

