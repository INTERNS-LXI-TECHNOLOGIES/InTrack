# FeedbackControllerApi

All URIs are relative to *http://localhost:8081*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFeedbacks**](FeedbackControllerApi.md#createFeedbacks) | **POST** /feedback |  |
| [**getFeedbackByInternId**](FeedbackControllerApi.md#getFeedbackByInternId) | **GET** /feedback/{internId} |  |


<a id="createFeedbacks"></a>
# **createFeedbacks**
> List&lt;Feedback&gt; createFeedbacks(internId, feedback)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FeedbackControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081");

    FeedbackControllerApi apiInstance = new FeedbackControllerApi(defaultClient);
    Long internId = 56L; // Long | 
    List<Feedback> feedback = Arrays.asList(); // List<Feedback> | 
    try {
      List<Feedback> result = apiInstance.createFeedbacks(internId, feedback);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeedbackControllerApi#createFeedbacks");
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
| **feedback** | [**List&lt;Feedback&gt;**](Feedback.md)|  | |

### Return type

[**List&lt;Feedback&gt;**](Feedback.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFeedbackByInternId"></a>
# **getFeedbackByInternId**
> FeedbackDto getFeedbackByInternId(internId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FeedbackControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081");

    FeedbackControllerApi apiInstance = new FeedbackControllerApi(defaultClient);
    Long internId = 56L; // Long | 
    try {
      FeedbackDto result = apiInstance.getFeedbackByInternId(internId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeedbackControllerApi#getFeedbackByInternId");
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

[**FeedbackDto**](FeedbackDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

