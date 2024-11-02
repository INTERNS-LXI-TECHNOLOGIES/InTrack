# TaskCompletionControllerApi

All URIs are relative to *http://localhost:8081*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createtaskcompltion**](TaskCompletionControllerApi.md#createtaskcompltion) | **POST** /task |  |
| [**getTaskCompletionByInternId**](TaskCompletionControllerApi.md#getTaskCompletionByInternId) | **GET** /task/{internId} |  |


<a id="createtaskcompltion"></a>
# **createtaskcompltion**
> TaskCompletion createtaskcompltion(internId, taskCompletion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskCompletionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081");

    TaskCompletionControllerApi apiInstance = new TaskCompletionControllerApi(defaultClient);
    Long internId = 56L; // Long | 
    TaskCompletion taskCompletion = new TaskCompletion(); // TaskCompletion | 
    try {
      TaskCompletion result = apiInstance.createtaskcompltion(internId, taskCompletion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskCompletionControllerApi#createtaskcompltion");
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
| **taskCompletion** | [**TaskCompletion**](TaskCompletion.md)|  | |

### Return type

[**TaskCompletion**](TaskCompletion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTaskCompletionByInternId"></a>
# **getTaskCompletionByInternId**
> TaskCompletionDto getTaskCompletionByInternId(internId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskCompletionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081");

    TaskCompletionControllerApi apiInstance = new TaskCompletionControllerApi(defaultClient);
    Long internId = 56L; // Long | 
    try {
      TaskCompletionDto result = apiInstance.getTaskCompletionByInternId(internId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskCompletionControllerApi#getTaskCompletionByInternId");
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

[**TaskCompletionDto**](TaskCompletionDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

