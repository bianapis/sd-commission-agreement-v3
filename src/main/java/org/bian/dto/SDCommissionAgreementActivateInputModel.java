package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionAgreementActivateInputModelCommissionAgreementServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCommissionAgreementActivateInputModel
 */
public class SDCommissionAgreementActivateInputModel   {
  private Object commissionAgreementActivationActionTaskRecord = null;

  private String commissionAgreementCenterReference = null;

  private String commissionAgreementServiceReference = null;

  private SDCommissionAgreementActivateInputModelCommissionAgreementServiceConfigurationRecord commissionAgreementServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return commissionAgreementActivationActionTaskRecord
  **/

  public Object getCommissionAgreementActivationActionTaskRecord() {
    return commissionAgreementActivationActionTaskRecord;
  }

  public void setCommissionAgreementActivationActionTaskRecord(Object commissionAgreementActivationActionTaskRecord) {
    this.commissionAgreementActivationActionTaskRecord = commissionAgreementActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return commissionAgreementCenterReference
  **/

  public String getCommissionAgreementCenterReference() {
    return commissionAgreementCenterReference;
  }

  public void setCommissionAgreementCenterReference(String commissionAgreementCenterReference) {
    this.commissionAgreementCenterReference = commissionAgreementCenterReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return commissionAgreementServiceReference
  **/

  public String getCommissionAgreementServiceReference() {
    return commissionAgreementServiceReference;
  }

  public void setCommissionAgreementServiceReference(String commissionAgreementServiceReference) {
    this.commissionAgreementServiceReference = commissionAgreementServiceReference;
  }


  /**
   * Get commissionAgreementServiceConfigurationRecord
   * @return commissionAgreementServiceConfigurationRecord
  **/

  public SDCommissionAgreementActivateInputModelCommissionAgreementServiceConfigurationRecord getCommissionAgreementServiceConfigurationRecord() {
    return commissionAgreementServiceConfigurationRecord;
  }

  public void setCommissionAgreementServiceConfigurationRecord(SDCommissionAgreementActivateInputModelCommissionAgreementServiceConfigurationRecord commissionAgreementServiceConfigurationRecord) {
    this.commissionAgreementServiceConfigurationRecord = commissionAgreementServiceConfigurationRecord;
  }


}

