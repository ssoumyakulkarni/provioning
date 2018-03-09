package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class HttpService {

    public RestTemplate restTemplate;
    public HttpHeaders headers;

    @Value("${okta.baseurl}")
    private String baseUrl ;

    @Value("${okta.apikey}")
    private  String apikey ;



    @Autowired
    public HttpService() {
        this.restTemplate = restTemplate();
    }

    @PostConstruct
    public void initHeaders(){
        headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        List list = new ArrayList();
        list.add(MediaType.APPLICATION_JSON);
        headers.setAccept(list);
        headers.add("Authorization", "SSWS "+this.apikey+"");
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


    public ResponseEntity<String> doRequest(String url, HttpMethod method, String requestPayload){
        HttpEntity<String> entity = new HttpEntity<String>(requestPayload, headers);
        String fullUrl = this.baseUrl+url;
       // System.out.println("baseurl"+fullUrl);
        ResponseEntity<String> responseEntity = restTemplate.exchange(fullUrl, method, entity, String.class, 100);
        return responseEntity;
    }

}
