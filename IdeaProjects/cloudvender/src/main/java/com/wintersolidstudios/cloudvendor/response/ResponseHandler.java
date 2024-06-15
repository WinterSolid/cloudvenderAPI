package com.wintersolidstudios.cloudvendor.response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;
/**
 * Utility class to build standardized API responses.
 */
public class ResponseHandler {

    /**
     * Builds a standardized response for API endpoints.
     *
     * @param message       the response message
     * @param status        the HTTP status code
     * @param responseData  the response data object
     * @return a ResponseEntity containing the standardized response
     */
    public static ResponseEntity<Object> responseBuilder(
            String message, HttpStatus status, Object responseData
    ) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", message);
        response.put("status", status);
        response.put("data", responseData);

        return new ResponseEntity<>(response, status);
    }
}
