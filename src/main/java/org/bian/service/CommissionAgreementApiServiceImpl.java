/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CommissionAgreementApiServiceImpl implements CommissionAgreementApiService {

	public SDCommissionAgreementActivateOutputModel activate(SDCommissionAgreementActivateInputModel request){
		return JsonReader.read("activate-SDCommissionAgreementActivateOutputModel.json",new TypeReference<SDCommissionAgreementActivateOutputModel>(){});
	}
	
	public SDCommissionAgreementConfigureOutputModel configure(String sdReferenceId, SDCommissionAgreementConfigureInputModel request){
		return JsonReader.read("configure-SDCommissionAgreementConfigureOutputModel.json",new TypeReference<SDCommissionAgreementConfigureOutputModel>(){});
	}
	
	public BQCommissionTermsControlOutputModel controlCommissionterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCommissionTermsControlInputModel request){
		return JsonReader.read("control-BQCommissionTermsControlOutputModel.json",new TypeReference<BQCommissionTermsControlOutputModel>(){});
	}
	
	public CREmployeeCommissionAgreementControlOutputModel control(String sdReferenceId, String crReferenceId, CREmployeeCommissionAgreementControlInputModel request){
		return JsonReader.read("control-CREmployeeCommissionAgreementControlOutputModel.json",new TypeReference<CREmployeeCommissionAgreementControlOutputModel>(){});
	}
	
	public BQCommissionTermsExchangeOutputModel exchangeCommissionterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCommissionTermsExchangeInputModel request){
		return JsonReader.read("exchange-BQCommissionTermsExchangeOutputModel.json",new TypeReference<BQCommissionTermsExchangeOutputModel>(){});
	}
	
	public CREmployeeCommissionAgreementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CREmployeeCommissionAgreementExchangeInputModel request){
		return JsonReader.read("exchange-CREmployeeCommissionAgreementExchangeOutputModel.json",new TypeReference<CREmployeeCommissionAgreementExchangeOutputModel>(){});
	}
	
	public SDCommissionAgreementFeedbackOutputModel feedback(String sdReferenceId, SDCommissionAgreementFeedbackInputModel request){
		return JsonReader.read("feedback-SDCommissionAgreementFeedbackOutputModel.json",new TypeReference<SDCommissionAgreementFeedbackOutputModel>(){});
	}
	
	public BQCommissionTermsGrantOutputModel grantCommissionterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCommissionTermsGrantInputModel request){
		return JsonReader.read("grant-BQCommissionTermsGrantOutputModel.json",new TypeReference<BQCommissionTermsGrantOutputModel>(){});
	}
	
	public CREmployeeCommissionAgreementGrantOutputModel grant(String sdReferenceId, String crReferenceId, CREmployeeCommissionAgreementGrantInputModel request){
		return JsonReader.read("grant-CREmployeeCommissionAgreementGrantOutputModel.json",new TypeReference<CREmployeeCommissionAgreementGrantOutputModel>(){});
	}
	
	public CREmployeeCommissionAgreementInitiateOutputModel initiate(String sdReferenceId, CREmployeeCommissionAgreementInitiateInputModel request){
		return JsonReader.read("initiate-CREmployeeCommissionAgreementInitiateOutputModel.json",new TypeReference<CREmployeeCommissionAgreementInitiateOutputModel>(){});
	}
	
	public BQCommissionTermsInitiateOutputModel initiateCommissionterms(String sdReferenceId, String crReferenceId, BQCommissionTermsInitiateInputModel request){
		return JsonReader.read("initiate-BQCommissionTermsInitiateOutputModel.json",new TypeReference<BQCommissionTermsInitiateOutputModel>(){});
	}
	
	public BQCommissionTermsRequestOutputModel requestCommissionterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCommissionTermsRequestInputModel request){
		return JsonReader.read("request-BQCommissionTermsRequestOutputModel.json",new TypeReference<BQCommissionTermsRequestOutputModel>(){});
	}
	
	public CREmployeeCommissionAgreementRequestOutputModel request(String sdReferenceId, String crReferenceId, CREmployeeCommissionAgreementRequestInputModel request){
		return JsonReader.read("request-CREmployeeCommissionAgreementRequestOutputModel.json",new TypeReference<CREmployeeCommissionAgreementRequestOutputModel>(){});
	}
	
	public CREmployeeCommissionAgreementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CREmployeeCommissionAgreementRetrieveOutputModel.json",new TypeReference<CREmployeeCommissionAgreementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQCommissionTermsRetrieveOutputModel retrieveCommissionterms(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCommissionTermsRetrieveOutputModel.json",new TypeReference<BQCommissionTermsRetrieveOutputModel>(){});
	}
	
	public SDCommissionAgreementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCommissionAgreementRetrieveOutputModel.json",new TypeReference<SDCommissionAgreementRetrieveOutputModel>(){});
	}
	
	public CREmployeeCommissionAgreementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CREmployeeCommissionAgreementUpdateInputModel request){
		return JsonReader.read("update-CREmployeeCommissionAgreementUpdateOutputModel.json",new TypeReference<CREmployeeCommissionAgreementUpdateOutputModel>(){});
	}
	
	public BQCommissionTermsUpdateOutputModel updateCommissionterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCommissionTermsUpdateInputModel request){
		return JsonReader.read("update-BQCommissionTermsUpdateOutputModel.json",new TypeReference<BQCommissionTermsUpdateOutputModel>(){});
	}
	
}
