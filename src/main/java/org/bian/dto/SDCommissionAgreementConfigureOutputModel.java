package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionAgreementConfigureOutputModelCommissionAgreementServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCommissionAgreementConfigureOutputModel
 */
public class SDCommissionAgreementConfigureOutputModel   {
  private String commissionAgreementConfigurationActionTaskReference = null;

  private Object commissionAgreementConfigurationActionTaskRecord = null;

  private SDCommissionAgreementConfigureOutputModelCommissionAgreementServiceConfigurationRecord commissionAgreementServiceConfigurationRecord = null;

  private String commissionAgreementServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return commissionAgreementConfigurationActionTaskReference
  **/

  public String getCommissionAgreementConfigurationActionTaskReference() {
    return commissionAgreementConfigurationActionTaskReference;
  }

  public void setCommissionAgreementConfigurationActionTaskReference(String commissionAgreementConfigurationActionTaskReference) {
    this.commissionAgreementConfigurationActionTaskReference = commissionAgreementConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return commissionAgreementConfigurationActionTaskRecord
  **/

  public Object getCommissionAgreementConfigurationActionTaskRecord() {
    return commissionAgreementConfigurationActionTaskRecord;
  }

  public void setCommissionAgreementConfigurationActionTaskRecord(Object commissionAgreementConfigurationActionTaskRecord) {
    this.commissionAgreementConfigurationActionTaskRecord = commissionAgreementConfigurationActionTaskRecord;
  }


  /**
   * Get commissionAgreementServiceConfigurationRecord
   * @return commissionAgreementServiceConfigurationRecord
  **/

  public SDCommissionAgreementConfigureOutputModelCommissionAgreementServiceConfigurationRecord getCommissionAgreementServiceConfigurationRecord() {
    return commissionAgreementServiceConfigurationRecord;
  }

  public void setCommissionAgreementServiceConfigurationRecord(SDCommissionAgreementConfigureOutputModelCommissionAgreementServiceConfigurationRecord commissionAgreementServiceConfigurationRecord) {
    this.commissionAgreementServiceConfigurationRecord = commissionAgreementServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return commissionAgreementServicingSessionStatus
  **/

  public String getCommissionAgreementServicingSessionStatus() {
    return commissionAgreementServicingSessionStatus;
  }

  public void setCommissionAgreementServicingSessionStatus(String commissionAgreementServicingSessionStatus) {
    this.commissionAgreementServicingSessionStatus = commissionAgreementServicingSessionStatus;
  }


}

