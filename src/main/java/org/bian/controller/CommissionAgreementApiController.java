/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.AgreeTerms;

@BianRestController
public class CommissionAgreementApiController {

	@Autowired
	CommissionAgreementApiService service;
	
	@AgreeTerms.Activate
	public BianResponse<SDCommissionAgreementActivateOutputModel> activate(@RequestBody BianRequest<SDCommissionAgreementActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@AgreeTerms.Configure
	public BianResponse<SDCommissionAgreementConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCommissionAgreementConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("commissionterms")
	@AgreeTerms.Control
	public BianResponse<BQCommissionTermsControlOutputModel> controlCommissionterms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCommissionTermsControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlCommissionterms(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.Control
	public BianResponse<CREmployeeCommissionAgreementControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CREmployeeCommissionAgreementControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("commissionterms")
	@AgreeTerms.Exchange
	public BianResponse<BQCommissionTermsExchangeOutputModel> exchangeCommissionterms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCommissionTermsExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeCommissionterms(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.Exchange
	public BianResponse<CREmployeeCommissionAgreementExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CREmployeeCommissionAgreementExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.Feedback
	public BianResponse<SDCommissionAgreementFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCommissionAgreementFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("commissionterms")
	@AgreeTerms.Grant
	public BianResponse<BQCommissionTermsGrantOutputModel> grantCommissionterms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCommissionTermsGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grantCommissionterms(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.Grant
	public BianResponse<CREmployeeCommissionAgreementGrantOutputModel> grant(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CREmployeeCommissionAgreementGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grant(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.Initiate
	public BianResponse<CREmployeeCommissionAgreementInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CREmployeeCommissionAgreementInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("commissionterms")
	@AgreeTerms.Initiate
	public BianResponse<BQCommissionTermsInitiateOutputModel> initiateCommissionterms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQCommissionTermsInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateCommissionterms(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("commissionterms")
	@AgreeTerms.Request
	public BianResponse<BQCommissionTermsRequestOutputModel> requestCommissionterms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCommissionTermsRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestCommissionterms(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.Request
	public BianResponse<CREmployeeCommissionAgreementRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CREmployeeCommissionAgreementRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.Retrieve
	public BianResponse<CREmployeeCommissionAgreementRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@AgreeTerms.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@AgreeTerms.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@AgreeTerms.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("commissionterms")
	@AgreeTerms.Retrieve
	public BianResponse<BQCommissionTermsRetrieveOutputModel> retrieveCommissionterms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCommissionterms(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@AgreeTerms.RetrieveSD
	public BianResponse<SDCommissionAgreementRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@AgreeTerms.Update
	public BianResponse<CREmployeeCommissionAgreementUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CREmployeeCommissionAgreementUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("commissionterms")
	@AgreeTerms.Update
	public BianResponse<BQCommissionTermsUpdateOutputModel> updateCommissionterms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCommissionTermsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCommissionterms(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
