package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCommissionTermsRetrieveInputModelCommissionTermsInstanceAnalysis;
import org.bian.dto.BQCommissionTermsRetrieveInputModelCommissionTermsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCommissionTermsRetrieveInputModel
 */
public class BQCommissionTermsRetrieveInputModel   {
  private Object commissionTermsRetrieveActionTaskRecord = null;

  private String commissionTermsRetrieveActionRequest = null;

  private BQCommissionTermsRetrieveInputModelCommissionTermsInstanceReport commissionTermsInstanceReport = null;

  private BQCommissionTermsRetrieveInputModelCommissionTermsInstanceAnalysis commissionTermsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return commissionTermsRetrieveActionTaskRecord
  **/

  public Object getCommissionTermsRetrieveActionTaskRecord() {
    return commissionTermsRetrieveActionTaskRecord;
  }

  public void setCommissionTermsRetrieveActionTaskRecord(Object commissionTermsRetrieveActionTaskRecord) {
    this.commissionTermsRetrieveActionTaskRecord = commissionTermsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return commissionTermsRetrieveActionRequest
  **/

  public String getCommissionTermsRetrieveActionRequest() {
    return commissionTermsRetrieveActionRequest;
  }

  public void setCommissionTermsRetrieveActionRequest(String commissionTermsRetrieveActionRequest) {
    this.commissionTermsRetrieveActionRequest = commissionTermsRetrieveActionRequest;
  }


  /**
   * Get commissionTermsInstanceReport
   * @return commissionTermsInstanceReport
  **/

  public BQCommissionTermsRetrieveInputModelCommissionTermsInstanceReport getCommissionTermsInstanceReport() {
    return commissionTermsInstanceReport;
  }

  public void setCommissionTermsInstanceReport(BQCommissionTermsRetrieveInputModelCommissionTermsInstanceReport commissionTermsInstanceReport) {
    this.commissionTermsInstanceReport = commissionTermsInstanceReport;
  }


  /**
   * Get commissionTermsInstanceAnalysis
   * @return commissionTermsInstanceAnalysis
  **/

  public BQCommissionTermsRetrieveInputModelCommissionTermsInstanceAnalysis getCommissionTermsInstanceAnalysis() {
    return commissionTermsInstanceAnalysis;
  }

  public void setCommissionTermsInstanceAnalysis(BQCommissionTermsRetrieveInputModelCommissionTermsInstanceAnalysis commissionTermsInstanceAnalysis) {
    this.commissionTermsInstanceAnalysis = commissionTermsInstanceAnalysis;
  }


}

