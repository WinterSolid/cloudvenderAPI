package com.wintersolidstudios.cloudvender.controller;


import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
