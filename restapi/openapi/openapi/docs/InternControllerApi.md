# InternControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deletedIntern**](InternControllerApi.md#deletedIntern) | **DELETE** /delete |  |
| [**readIntern**](InternControllerApi.md#readIntern) | **GET** /get |  |
| [**saveIntern**](InternControllerApi.md#saveIntern) | **POST** /create |  |
| [**updatedIntern**](InternControllerApi.md#updatedIntern) | **PUT** /update |  |


<a id="deletedIntern"></a>
# **deletedIntern**
> deletedIntern()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InternControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    InternControllerApi apiInstance = new InternControllerApi(defaultClient);
    try {
      apiInstance.deletedIntern();
    } catch (ApiException e) {
      System.err.println("Exception when calling InternControllerApi#deletedIntern");
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

<a id="readIntern"></a>
# **readIntern**
> List&lt;Intern&gt; readIntern()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InternControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    InternControllerApi apiInstance = new InternControllerApi(defaultClient);
    try {
      List<Intern> result = apiInstance.readIntern();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternControllerApi#readIntern");
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

[**List&lt;Intern&gt;**](Intern.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="saveIntern"></a>
# **saveIntern**
> saveIntern(intern)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InternControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    InternControllerApi apiInstance = new InternControllerApi(defaultClient);
    Intern intern = new Intern(); // Intern | 
    try {
      apiInstance.saveIntern(intern);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternControllerApi#saveIntern");
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
| **intern** | [**Intern**](Intern.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updatedIntern"></a>
# **updatedIntern**
> Intern updatedIntern(intern)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InternControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    InternControllerApi apiInstance = new InternControllerApi(defaultClient);
    Intern intern = new Intern(); // Intern | 
    try {
      Intern result = apiInstance.updatedIntern(intern);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternControllerApi#updatedIntern");
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
| **intern** | [**Intern**](Intern.md)|  | |

### Return type

[**Intern**](Intern.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

