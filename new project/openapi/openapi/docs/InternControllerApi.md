# InternControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteIntern**](InternControllerApi.md#deleteIntern) | **DELETE** /Interns/{id} |  |
| [**getAllIntern**](InternControllerApi.md#getAllIntern) | **GET** /Interns |  |
| [**saveIntern**](InternControllerApi.md#saveIntern) | **POST** /Interns |  |
| [**updateIntern**](InternControllerApi.md#updateIntern) | **PUT** /Interns/{id} |  |


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
import org.openapitools.client.api.InternControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    InternControllerApi apiInstance = new InternControllerApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteIntern(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternControllerApi#deleteIntern");
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

<a id="getAllIntern"></a>
# **getAllIntern**
> List&lt;Intern&gt; getAllIntern()



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
      List<Intern> result = apiInstance.getAllIntern();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternControllerApi#getAllIntern");
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

<a id="updateIntern"></a>
# **updateIntern**
> updateIntern(id, intern)



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
    Long id = 56L; // Long | 
    Intern intern = new Intern(); // Intern | 
    try {
      apiInstance.updateIntern(id, intern);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternControllerApi#updateIntern");
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

