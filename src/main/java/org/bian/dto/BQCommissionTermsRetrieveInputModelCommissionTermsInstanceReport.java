package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCommissionTermsRetrieveInputModelCommissionTermsInstanceReport
 */
public class BQCommissionTermsRetrieveInputModelCommissionTermsInstanceReport   {
  private String commissionTermsInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return commissionTermsInstanceReportReference
  **/

  public String getCommissionTermsInstanceReportReference() {
    return commissionTermsInstanceReportReference;
  }

  public void setCommissionTermsInstanceReportReference(String commissionTermsInstanceReportReference) {
    this.commissionTermsInstanceReportReference = commissionTermsInstanceReportReference;
  }


}

