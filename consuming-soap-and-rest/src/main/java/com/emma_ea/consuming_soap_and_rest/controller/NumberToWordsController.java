package com.emma_ea.consuming_soap_and_rest.controller;

import com.dataaccess.webservicesserver.NumberToWordsResponse;
import com.emma_ea.consuming_soap_and_rest.service.NumberToWordsSoapService;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ntw")
public class NumberToWordsController {

    private final NumberToWordsSoapService service;

    public NumberToWordsController(NumberToWordsSoapService service) {
        this.service = service;
    }

    @GetMapping("/{number}")
    public String getWords(@PathVariable String number) {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.dataaccess.webservicesserver");
        service.setMarshaller(marshaller);
        service.setUnmarshaller(marshaller);
        NumberToWordsResponse response = service.getWords(number);
        return response.getNumberToWordsResult();
    }
}
