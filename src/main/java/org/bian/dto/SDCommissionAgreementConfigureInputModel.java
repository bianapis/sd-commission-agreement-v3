package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCommissionAgreementConfigureInputModel
 */
public class SDCommissionAgreementConfigureInputModel   {
  private Object commissionAgreementConfigurationActionTaskRecord = null;

  private String commissionAgreementServicingSessionReference = null;

  private String commissionAgreementServiceReference = null;

  private SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecord commissionAgreementServiceConfigurationRecord = null;


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

  public SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecord getCommissionAgreementServiceConfigurationRecord() {
    return commissionAgreementServiceConfigurationRecord;
  }

  public void setCommissionAgreementServiceConfigurationRecord(SDCommissionAgreementConfigureInputModelCommissionAgreementServiceConfigurationRecord commissionAgreementServiceConfigurationRecord) {
    this.commissionAgreementServiceConfigurationRecord = commissionAgreementServiceConfigurationRecord;
  }


}

