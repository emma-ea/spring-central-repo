package com.emma_ea.consuming_soap_and_rest.service;

import com.dataaccess.webservicesserver.NumberToWords;
import com.dataaccess.webservicesserver.NumberToWordsResponse;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.annotation.XmlSeeAlso;
import java.math.BigInteger;

@Service
public class NumberToWordsSoapService extends WebServiceGatewaySupport {

    public NumberToWordsResponse getWords(String number) {
        String uri = "https://www.dataaccess.com/webservicesserver/numberconversion.wso";

        NumberToWords numberRequest = new NumberToWords();
        numberRequest.setUbiNum(new BigInteger(number));

        NumberToWordsResponse numberResponse =
                (NumberToWordsResponse) getWebServiceTemplate().marshalSendAndReceive(uri, numberRequest);
        return numberResponse;
    }

}
