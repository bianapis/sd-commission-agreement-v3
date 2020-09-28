package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCommissionTermsRetrieveOutputModelCommissionTermsInstanceReport
 */
public class BQCommissionTermsRetrieveOutputModelCommissionTermsInstanceReport   {
  private Object commissionTermsInstanceReportRecord = null;

  private String commissionTermsInstanceReportType = null;

  private String commissionTermsInstanceReportParameters = null;

  private Object commissionTermsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return commissionTermsInstanceReportRecord
  **/

  public Object getCommissionTermsInstanceReportRecord() {
    return commissionTermsInstanceReportRecord;
  }

  public void setCommissionTermsInstanceReportRecord(Object commissionTermsInstanceReportRecord) {
    this.commissionTermsInstanceReportRecord = commissionTermsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return commissionTermsInstanceReportType
  **/

  public String getCommissionTermsInstanceReportType() {
    return commissionTermsInstanceReportType;
  }

  public void setCommissionTermsInstanceReportType(String commissionTermsInstanceReportType) {
    this.commissionTermsInstanceReportType = commissionTermsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return commissionTermsInstanceReportParameters
  **/

  public String getCommissionTermsInstanceReportParameters() {
    return commissionTermsInstanceReportParameters;
  }

  public void setCommissionTermsInstanceReportParameters(String commissionTermsInstanceReportParameters) {
    this.commissionTermsInstanceReportParameters = commissionTermsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return commissionTermsInstanceReport
  **/

  public Object getCommissionTermsInstanceReport() {
    return commissionTermsInstanceReport;
  }

  public void setCommissionTermsInstanceReport(Object commissionTermsInstanceReport) {
    this.commissionTermsInstanceReport = commissionTermsInstanceReport;
  }


}

