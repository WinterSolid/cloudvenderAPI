package com.wintersolidstudios.cloudvendor.controller;
import com.wintersolidstudios.cloudvendor.model.CloudVendor;
import com.wintersolidstudios.cloudvendor.service.CloudVendorService;
import com.wintersolidstudios.cloudvendor.response.ResponseHandler;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cloudvendor")
@Api(value = "CloudVendor Management System")
public class CloudVendorController {

    @Autowired
    private CloudVendorService cloudVendorService;

    // Constructor injection for CloudVendorService
    @Autowired
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    /**
     * Get details of a specific cloud vendor by ID.
     */
    @GetMapping("/{vendorId}")
    @ApiOperation(value = "Get a cloud vendor by Id", response = ResponseEntity.class)
    public ResponseEntity<Object> getCloudVendorDetails(
            @ApiParam(value = "ID of the cloud vendor to retrieve", required = true) @PathVariable("vendorId") String vendorId) {
        return ResponseHandler.responseBuilder("Requested Vendor Details are given here",
                HttpStatus.OK, cloudVendorService.getCloudVendor(vendorId));
    }

    /**
     * Get details of all cloud vendors.
     */
    @GetMapping("/")
    @ApiOperation(value = "View a list of available cloud vendors", response = List.class)
    public List<CloudVendor> getAllCloudVendorDetails() {
        return cloudVendorService.getAllCloudVendors();
    }

    /**
     * Create a new cloud vendor.
     */
    @PostMapping("/")
    @ApiOperation(value = "Create a new cloud vendor")
    public String createCloudVendorDetails(
            @ApiParam(value = "Cloud Vendor object to be created", required = true) @RequestBody CloudVendor cloudVendor) {
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created Successfully";
    }

    /**
     * Update an existing cloud vendor's details.
     */
    @PutMapping("/")
    @ApiOperation(value = "Update an existing cloud vendor")
    public String updateCloudVendorDetails(
            @ApiParam(value = "Cloud Vendor object with updated details", required = true) @RequestBody CloudVendor cloudVendor) {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated Successfully";
    }

    /**
     * Delete a cloud vendor by ID.
     */
    @DeleteMapping("/{vendorId}")
    @ApiOperation(value = "Delete a cloud vendor")
    public String deleteCloudVendorDetails(
            @ApiParam(value = "ID of the cloud vendor to be deleted", required = true) @PathVariable("vendorId") String vendorId) {
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor Deleted Successfully";
    }
}

