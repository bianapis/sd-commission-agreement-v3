package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCommissionTermsRetrieveInputModelCommissionTermsInstanceAnalysis
 */
public class BQCommissionTermsRetrieveInputModelCommissionTermsInstanceAnalysis   {
  private String commissionTermsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return commissionTermsInstanceAnalysisReference
  **/

  public String getCommissionTermsInstanceAnalysisReference() {
    return commissionTermsInstanceAnalysisReference;
  }

  public void setCommissionTermsInstanceAnalysisReference(String commissionTermsInstanceAnalysisReference) {
    this.commissionTermsInstanceAnalysisReference = commissionTermsInstanceAnalysisReference;
  }


}

