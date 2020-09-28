package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionAgreementActivateOutputModelCommissionAgreementServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCommissionAgreementActivateOutputModel
 */
public class SDCommissionAgreementActivateOutputModel   {
  private String commissionAgreementActivationActionTaskReference = null;

  private Object commissionAgreementActivationActionTaskRecord = null;

  private String commissionAgreementServicingSessionReference = null;

  private Object commissionAgreementServicingSessionRecord = null;

  private SDCommissionAgreementActivateOutputModelCommissionAgreementServiceConfigurationRecord commissionAgreementServiceConfigurationRecord = null;

  private String commissionAgreementServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return commissionAgreementActivationActionTaskReference
  **/

  public String getCommissionAgreementActivationActionTaskReference() {
    return commissionAgreementActivationActionTaskReference;
  }

  public void setCommissionAgreementActivationActionTaskReference(String commissionAgreementActivationActionTaskReference) {
    this.commissionAgreementActivationActionTaskReference = commissionAgreementActivationActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return commissionAgreementServicingSessionReference
  **/

  public String getCommissionAgreementServicingSessionReference() {
    return commissionAgreementServicingSessionReference;
  }

  public void setCommissionAgreementServicingSessionReference(String commissionAgreementServicingSessionReference) {
    this.commissionAgreementServicingSessionReference = commissionAgreementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return commissionAgreementServicingSessionRecord
  **/

  public Object getCommissionAgreementServicingSessionRecord() {
    return commissionAgreementServicingSessionRecord;
  }

  public void setCommissionAgreementServicingSessionRecord(Object commissionAgreementServicingSessionRecord) {
    this.commissionAgreementServicingSessionRecord = commissionAgreementServicingSessionRecord;
  }


  /**
   * Get commissionAgreementServiceConfigurationRecord
   * @return commissionAgreementServiceConfigurationRecord
  **/

  public SDCommissionAgreementActivateOutputModelCommissionAgreementServiceConfigurationRecord getCommissionAgreementServiceConfigurationRecord() {
    return commissionAgreementServiceConfigurationRecord;
  }

  public void setCommissionAgreementServiceConfigurationRecord(SDCommissionAgreementActivateOutputModelCommissionAgreementServiceConfigurationRecord commissionAgreementServiceConfigurationRecord) {
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

