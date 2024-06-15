package com.wintersolidstudios.cloudvendor.service;

import com.wintersolidstudios.cloudvendor.model.CloudVendor;

import java.util.List;

/**
 * Service interface for managing Cloud Vendors.
 */
public interface CloudVendorService {

    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);

    public CloudVendor getCloudVendor(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();
    public List<CloudVendor> getByVendorName(String vendorName);
}
