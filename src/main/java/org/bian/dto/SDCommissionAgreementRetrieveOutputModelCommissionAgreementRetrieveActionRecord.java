package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionAgreementRetrieveOutputModelCommissionAgreementRetrieveActionRecordCommissionAgreementActivityAnalysis;
import org.bian.dto.SDCommissionAgreementRetrieveOutputModelCommissionAgreementRetrieveActionRecordCommissionAgreementPerformanceAnalysis;
import org.bian.dto.SDCommissionAgreementRetrieveOutputModelCommissionAgreementRetrieveActionRecordControlRecordPortfolioAnalysis;

import javax.validation.Valid;
  
/**
 * SDCommissionAgreementRetrieveOutputModelCommissionAgreementRetrieveActionRecord
 */
public class SDCommissionAgreementRetrieveOutputModelCommissionAgreementRetrieveActionRecord   {
  private SDCommissionAgreementRetrieveOutputModelCommissionAgreementRetrieveActionRecordCommissionAgreementActivityAnalysis commissionAgreementActivityAnalysis = null;

  private SDCommissionAgreementRetrieveOutputModelCommissionAgreementRetrieveActionRecordCommissionAgreementPerformanceAnalysis commissionAgreementPerformanceAnalysis = null;

  private SDCommissionAgreementRetrieveOutputModelCommissionAgreementRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get commissionAgreementActivityAnalysis
   * @return commissionAgreementActivityAnalysis
  **/

  public SDCommissionAgreementRetrieveOutputModelCommissionAgreementRetrieveActionRecordCommissionAgreementActivityAnalysis getCommissionAgreementActivityAnalysis() {
    return commissionAgreementActivityAnalysis;
  }

  public void setCommissionAgreementActivityAnalysis(SDCommissionAgreementRetrieveOutputModelCommissionAgreementRetrieveActionRecordCommissionAgreementActivityAnalysis commissionAgreementActivityAnalysis) {
    this.commissionAgreementActivityAnalysis = commissionAgreementActivityAnalysis;
  }


  /**
   * Get commissionAgreementPerformanceAnalysis
   * @return commissionAgreementPerformanceAnalysis
  **/

  public SDCommissionAgreementRetrieveOutputModelCommissionAgreementRetrieveActionRecordCommissionAgreementPerformanceAnalysis getCommissionAgreementPerformanceAnalysis() {
    return commissionAgreementPerformanceAnalysis;
  }

  public void setCommissionAgreementPerformanceAnalysis(SDCommissionAgreementRetrieveOutputModelCommissionAgreementRetrieveActionRecordCommissionAgreementPerformanceAnalysis commissionAgreementPerformanceAnalysis) {
    this.commissionAgreementPerformanceAnalysis = commissionAgreementPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDCommissionAgreementRetrieveOutputModelCommissionAgreementRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCommissionAgreementRetrieveOutputModelCommissionAgreementRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

