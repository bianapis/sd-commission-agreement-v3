package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionAgreementRetrieveOutputModelCommissionAgreementOfferedServiceCommissionAgreementServiceRecordCommissionAgreementServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDCommissionAgreementRetrieveOutputModelCommissionAgreementOfferedServiceCommissionAgreementServiceRecord
 */
public class SDCommissionAgreementRetrieveOutputModelCommissionAgreementOfferedServiceCommissionAgreementServiceRecord   {
  private String commissionAgreementServiceType = null;

  private String commissionAgreementServiceVersion = null;

  private String commissionAgreementServiceDescription = null;

  private SDCommissionAgreementRetrieveOutputModelCommissionAgreementOfferedServiceCommissionAgreementServiceRecordCommissionAgreementServicePoliciesandGuidelines commissionAgreementServicePoliciesandGuidelines = null;

  private String commissionAgreementServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return commissionAgreementServiceType
  **/

  public String getCommissionAgreementServiceType() {
    return commissionAgreementServiceType;
  }

  public void setCommissionAgreementServiceType(String commissionAgreementServiceType) {
    this.commissionAgreementServiceType = commissionAgreementServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return commissionAgreementServiceVersion
  **/

  public String getCommissionAgreementServiceVersion() {
    return commissionAgreementServiceVersion;
  }

  public void setCommissionAgreementServiceVersion(String commissionAgreementServiceVersion) {
    this.commissionAgreementServiceVersion = commissionAgreementServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return commissionAgreementServiceDescription
  **/

  public String getCommissionAgreementServiceDescription() {
    return commissionAgreementServiceDescription;
  }

  public void setCommissionAgreementServiceDescription(String commissionAgreementServiceDescription) {
    this.commissionAgreementServiceDescription = commissionAgreementServiceDescription;
  }


  /**
   * Get commissionAgreementServicePoliciesandGuidelines
   * @return commissionAgreementServicePoliciesandGuidelines
  **/

  public SDCommissionAgreementRetrieveOutputModelCommissionAgreementOfferedServiceCommissionAgreementServiceRecordCommissionAgreementServicePoliciesandGuidelines getCommissionAgreementServicePoliciesandGuidelines() {
    return commissionAgreementServicePoliciesandGuidelines;
  }

  public void setCommissionAgreementServicePoliciesandGuidelines(SDCommissionAgreementRetrieveOutputModelCommissionAgreementOfferedServiceCommissionAgreementServiceRecordCommissionAgreementServicePoliciesandGuidelines commissionAgreementServicePoliciesandGuidelines) {
    this.commissionAgreementServicePoliciesandGuidelines = commissionAgreementServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return commissionAgreementServiceSchedule
  **/

  public String getCommissionAgreementServiceSchedule() {
    return commissionAgreementServiceSchedule;
  }

  public void setCommissionAgreementServiceSchedule(String commissionAgreementServiceSchedule) {
    this.commissionAgreementServiceSchedule = commissionAgreementServiceSchedule;
  }


}

