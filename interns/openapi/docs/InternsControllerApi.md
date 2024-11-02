# InternsControllerApi

All URIs are relative to *http://localhost:8082*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addInterns**](InternsControllerApi.md#addInterns) | **POST** /rest/interns/addInterns |  |
| [**deleteIntern**](InternsControllerApi.md#deleteIntern) | **DELETE** /rest/interns/deleteIntern/{id} |  |
| [**getAll**](InternsControllerApi.md#getAll) | **GET** /rest/interns/getAll |  |
| [**updateIntern**](InternsControllerApi.md#updateIntern) | **PUT** /rest/interns/updateIntern/{id} |  |


<a id="addInterns"></a>
# **addInterns**
> InternEntity addInterns(internEntity)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InternsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8082");

    InternsControllerApi apiInstance = new InternsControllerApi(defaultClient);
    InternEntity internEntity = new InternEntity(); // InternEntity | 
    try {
      InternEntity result = apiInstance.addInterns(internEntity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternsControllerApi#addInterns");
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
| **internEntity** | [**InternEntity**](InternEntity.md)|  | |

### Return type

[**InternEntity**](InternEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteIntern"></a>
# **deleteIntern**
> deleteIntern(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InternsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8082");

    InternsControllerApi apiInstance = new InternsControllerApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteIntern(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternsControllerApi#deleteIntern");
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
| **id** | **Long**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAll"></a>
# **getAll**
> List&lt;InternEntity&gt; getAll()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InternsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8082");

    InternsControllerApi apiInstance = new InternsControllerApi(defaultClient);
    try {
      List<InternEntity> result = apiInstance.getAll();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternsControllerApi#getAll");
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

[**List&lt;InternEntity&gt;**](InternEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateIntern"></a>
# **updateIntern**
> InternEntity updateIntern(id, internEntity)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InternsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8082");

    InternsControllerApi apiInstance = new InternsControllerApi(defaultClient);
    Long id = 56L; // Long | 
    InternEntity internEntity = new InternEntity(); // InternEntity | 
    try {
      InternEntity result = apiInstance.updateIntern(id, internEntity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternsControllerApi#updateIntern");
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
| **id** | **Long**|  | |
| **internEntity** | [**InternEntity**](InternEntity.md)|  | |

### Return type

[**InternEntity**](InternEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

