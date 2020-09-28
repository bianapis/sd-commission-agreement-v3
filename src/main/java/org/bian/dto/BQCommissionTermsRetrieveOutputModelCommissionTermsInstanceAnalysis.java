package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCommissionTermsRetrieveOutputModelCommissionTermsInstanceAnalysis
 */
public class BQCommissionTermsRetrieveOutputModelCommissionTermsInstanceAnalysis   {
  private Object commissionTermsInstanceAnalysisRecord = null;

  private String commissionTermsInstanceAnalysisReportType = null;

  private String commissionTermsInstanceAnalysisParameters = null;

  private Object commissionTermsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return commissionTermsInstanceAnalysisRecord
  **/

  public Object getCommissionTermsInstanceAnalysisRecord() {
    return commissionTermsInstanceAnalysisRecord;
  }

  public void setCommissionTermsInstanceAnalysisRecord(Object commissionTermsInstanceAnalysisRecord) {
    this.commissionTermsInstanceAnalysisRecord = commissionTermsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return commissionTermsInstanceAnalysisReportType
  **/

  public String getCommissionTermsInstanceAnalysisReportType() {
    return commissionTermsInstanceAnalysisReportType;
  }

  public void setCommissionTermsInstanceAnalysisReportType(String commissionTermsInstanceAnalysisReportType) {
    this.commissionTermsInstanceAnalysisReportType = commissionTermsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return commissionTermsInstanceAnalysisParameters
  **/

  public String getCommissionTermsInstanceAnalysisParameters() {
    return commissionTermsInstanceAnalysisParameters;
  }

  public void setCommissionTermsInstanceAnalysisParameters(String commissionTermsInstanceAnalysisParameters) {
    this.commissionTermsInstanceAnalysisParameters = commissionTermsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return commissionTermsInstanceAnalysisReport
  **/

  public Object getCommissionTermsInstanceAnalysisReport() {
    return commissionTermsInstanceAnalysisReport;
  }

  public void setCommissionTermsInstanceAnalysisReport(Object commissionTermsInstanceAnalysisReport) {
    this.commissionTermsInstanceAnalysisReport = commissionTermsInstanceAnalysisReport;
  }


}

