package com.oktaProvisioning.oktaProvisioning.apiresource;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/scim/v2")

public class ApiResource {
    public ApiResource apiResource;


    public ApiResource( ApiResource apiResource) {
        this.apiResource = apiResource;

    }

    @RequestMapping(value = "/user/", method = RequestMethod.POST)
    public @ResponseBody
    String createUser(){
        return this.createUser();
    }




}