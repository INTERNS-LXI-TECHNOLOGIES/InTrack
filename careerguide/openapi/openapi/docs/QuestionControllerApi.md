# QuestionControllerApi

All URIs are relative to *http://localhost:8081*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**readQuestions**](QuestionControllerApi.md#readQuestions) | **GET** /read |  |


<a id="readQuestions"></a>
# **readQuestions**
> List&lt;QuestionEntity&gt; readQuestions()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuestionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081");

    QuestionControllerApi apiInstance = new QuestionControllerApi(defaultClient);
    try {
      List<QuestionEntity> result = apiInstance.readQuestions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuestionControllerApi#readQuestions");
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

[**List&lt;QuestionEntity&gt;**](QuestionEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

