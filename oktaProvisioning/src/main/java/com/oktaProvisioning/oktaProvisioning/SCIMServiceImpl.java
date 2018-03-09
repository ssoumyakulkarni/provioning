package com.oktaProvisioning.oktaProvisioning;

import com.okta.scim.server.capabilities.UserManagementCapabilities;
import com.okta.scim.server.exception.DuplicateGroupException;
import com.okta.scim.server.exception.EntityNotFoundException;
import com.okta.scim.server.exception.OnPremUserManagementException;
import com.okta.scim.server.service.SCIMService;
import com.okta.scim.util.model.*;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

public class SCIMServiceImpl implements SCIMService {







    @Override
    public SCIMUser createUser(SCIMUser scimUser) throws OnPremUserManagementException {



        System.out.println("url");
return null;

        }

    @Override
    public SCIMUser updateUser(String s, SCIMUser scimUser) throws OnPremUserManagementException, EntityNotFoundException {
        return null;
    }

    @Override
    public SCIMUserQueryResponse getUsers(PaginationProperties paginationProperties, SCIMFilter scimFilter) throws OnPremUserManagementException {
        return null;
    }

    @Override
    public SCIMUser getUser(String s) throws OnPremUserManagementException, EntityNotFoundException {
        return null;
    }

    @Override
    public SCIMGroup createGroup(SCIMGroup scimGroup) throws OnPremUserManagementException, DuplicateGroupException {
        return null;
    }

    @Override
    public SCIMGroup updateGroup(String s, SCIMGroup scimGroup) throws OnPremUserManagementException, EntityNotFoundException {
        return null;
    }

    @Override
    public SCIMGroupQueryResponse getGroups(PaginationProperties paginationProperties) throws OnPremUserManagementException {
        return null;
    }

    @Override
    public SCIMGroup getGroup(String s) throws OnPremUserManagementException, EntityNotFoundException {
        return null;
    }

    @Override
    public void deleteGroup(String s) throws OnPremUserManagementException, EntityNotFoundException {

    }

    @Override
    public UserManagementCapabilities[] getImplementedUserManagementCapabilities() {
        return new UserManagementCapabilities[0];
    }
}
