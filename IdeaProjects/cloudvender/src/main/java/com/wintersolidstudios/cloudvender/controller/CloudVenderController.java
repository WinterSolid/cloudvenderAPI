package com.wintersolidstudios.cloudvender.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
@Api(value = "CloudVendor Management System", description = "Operations pertaining to Cloud Vendor in CloudVendor Management System")
public class CloudVendorController {

    @Autowired
    private CloudVendorService cloudVendorService; // TODO CloudVendorService

    // Constructor injection for CloudVendorService
    @Autowired
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }



}
