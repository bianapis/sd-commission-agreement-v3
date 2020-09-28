package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionAgreementRetrieveInputModelCommissionAgreementRetrieveActionRecordCommissionAgreementActivityAnalysis;
import org.bian.dto.SDCommissionAgreementRetrieveInputModelCommissionAgreementRetrieveActionRecordCommissionAgreementPerformanceAnalysis;
import org.bian.dto.SDCommissionAgreementRetrieveInputModelCommissionAgreementRetrieveActionRecordControlRecordPortfolioAnalysis;

import javax.validation.Valid;
  
/**
 * SDCommissionAgreementRetrieveInputModelCommissionAgreementRetrieveActionRecord
 */
public class SDCommissionAgreementRetrieveInputModelCommissionAgreementRetrieveActionRecord   {
  private SDCommissionAgreementRetrieveInputModelCommissionAgreementRetrieveActionRecordCommissionAgreementActivityAnalysis commissionAgreementActivityAnalysis = null;

  private SDCommissionAgreementRetrieveInputModelCommissionAgreementRetrieveActionRecordCommissionAgreementPerformanceAnalysis commissionAgreementPerformanceAnalysis = null;

  private SDCommissionAgreementRetrieveInputModelCommissionAgreementRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get commissionAgreementActivityAnalysis
   * @return commissionAgreementActivityAnalysis
  **/

  public SDCommissionAgreementRetrieveInputModelCommissionAgreementRetrieveActionRecordCommissionAgreementActivityAnalysis getCommissionAgreementActivityAnalysis() {
    return commissionAgreementActivityAnalysis;
  }

  public void setCommissionAgreementActivityAnalysis(SDCommissionAgreementRetrieveInputModelCommissionAgreementRetrieveActionRecordCommissionAgreementActivityAnalysis commissionAgreementActivityAnalysis) {
    this.commissionAgreementActivityAnalysis = commissionAgreementActivityAnalysis;
  }


  /**
   * Get commissionAgreementPerformanceAnalysis
   * @return commissionAgreementPerformanceAnalysis
  **/

  public SDCommissionAgreementRetrieveInputModelCommissionAgreementRetrieveActionRecordCommissionAgreementPerformanceAnalysis getCommissionAgreementPerformanceAnalysis() {
    return commissionAgreementPerformanceAnalysis;
  }

  public void setCommissionAgreementPerformanceAnalysis(SDCommissionAgreementRetrieveInputModelCommissionAgreementRetrieveActionRecordCommissionAgreementPerformanceAnalysis commissionAgreementPerformanceAnalysis) {
    this.commissionAgreementPerformanceAnalysis = commissionAgreementPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDCommissionAgreementRetrieveInputModelCommissionAgreementRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCommissionAgreementRetrieveInputModelCommissionAgreementRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

