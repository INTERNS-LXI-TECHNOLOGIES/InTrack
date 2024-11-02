# AttendanceControllerApi

All URIs are relative to *http://localhost:8081*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAttendance**](AttendanceControllerApi.md#createAttendance) | **POST** /attendance |  |
| [**getAttendanceByInternId**](AttendanceControllerApi.md#getAttendanceByInternId) | **GET** /attendance/{internId} |  |


<a id="createAttendance"></a>
# **createAttendance**
> Attendance createAttendance(internId, attendance)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AttendanceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081");

    AttendanceControllerApi apiInstance = new AttendanceControllerApi(defaultClient);
    Long internId = 56L; // Long | 
    Attendance attendance = new Attendance(); // Attendance | 
    try {
      Attendance result = apiInstance.createAttendance(internId, attendance);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendanceControllerApi#createAttendance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **internId** | **Long**|  | |
| **attendance** | [**Attendance**](Attendance.md)|  | |

### Return type

[**Attendance**](Attendance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAttendanceByInternId"></a>
# **getAttendanceByInternId**
> AttendanceDto getAttendanceByInternId(internId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AttendanceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081");

    AttendanceControllerApi apiInstance = new AttendanceControllerApi(defaultClient);
    Long internId = 56L; // Long | 
    try {
      AttendanceDto result = apiInstance.getAttendanceByInternId(internId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendanceControllerApi#getAttendanceByInternId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **internId** | **Long**|  | |

### Return type

[**AttendanceDto**](AttendanceDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

