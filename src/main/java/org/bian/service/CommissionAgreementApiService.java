/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CommissionAgreementApiService {

	SDCommissionAgreementActivateOutputModel activate(SDCommissionAgreementActivateInputModel request);
	
	SDCommissionAgreementConfigureOutputModel configure(String sdReferenceId, SDCommissionAgreementConfigureInputModel request);
	
	BQCommissionTermsControlOutputModel controlCommissionterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCommissionTermsControlInputModel request);
	
	CREmployeeCommissionAgreementControlOutputModel control(String sdReferenceId, String crReferenceId, CREmployeeCommissionAgreementControlInputModel request);
	
	BQCommissionTermsExchangeOutputModel exchangeCommissionterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCommissionTermsExchangeInputModel request);
	
	CREmployeeCommissionAgreementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CREmployeeCommissionAgreementExchangeInputModel request);
	
	SDCommissionAgreementFeedbackOutputModel feedback(String sdReferenceId, SDCommissionAgreementFeedbackInputModel request);
	
	BQCommissionTermsGrantOutputModel grantCommissionterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCommissionTermsGrantInputModel request);
	
	CREmployeeCommissionAgreementGrantOutputModel grant(String sdReferenceId, String crReferenceId, CREmployeeCommissionAgreementGrantInputModel request);
	
	CREmployeeCommissionAgreementInitiateOutputModel initiate(String sdReferenceId, CREmployeeCommissionAgreementInitiateInputModel request);
	
	BQCommissionTermsInitiateOutputModel initiateCommissionterms(String sdReferenceId, String crReferenceId, BQCommissionTermsInitiateInputModel request);
	
	BQCommissionTermsRequestOutputModel requestCommissionterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCommissionTermsRequestInputModel request);
	
	CREmployeeCommissionAgreementRequestOutputModel request(String sdReferenceId, String crReferenceId, CREmployeeCommissionAgreementRequestInputModel request);
	
	CREmployeeCommissionAgreementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQCommissionTermsRetrieveOutputModel retrieveCommissionterms(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDCommissionAgreementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CREmployeeCommissionAgreementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CREmployeeCommissionAgreementUpdateInputModel request);
	
	BQCommissionTermsUpdateOutputModel updateCommissionterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCommissionTermsUpdateInputModel request);
	
}
