# BalancedScoreCardControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**showDetails**](BalancedScoreCardControllerApi.md#showDetails) | **GET** /get |  |


<a id="showDetails"></a>
# **showDetails**
> List&lt;BalancedScoreCardEntity&gt; showDetails()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BalancedScoreCardControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    BalancedScoreCardControllerApi apiInstance = new BalancedScoreCardControllerApi(defaultClient);
    try {
      List<BalancedScoreCardEntity> result = apiInstance.showDetails();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalancedScoreCardControllerApi#showDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;BalancedScoreCardEntity&gt;**](BalancedScoreCardEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

