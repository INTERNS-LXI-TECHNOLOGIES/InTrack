# InternControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createIntern**](InternControllerApi.md#createIntern) | **POST** /api/interns |  |
| [**deleteIntern**](InternControllerApi.md#deleteIntern) | **DELETE** /api/interns/{id} |  |
| [**getAllInterns**](InternControllerApi.md#getAllInterns) | **GET** /api/interns |  |
| [**getInternById**](InternControllerApi.md#getInternById) | **GET** /api/interns/{id} |  |
| [**updateIntern**](InternControllerApi.md#updateIntern) | **PUT** /api/interns/{id} |  |


<a id="createIntern"></a>
# **createIntern**
> Intern createIntern(intern)



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
      Intern result = apiInstance.createIntern(intern);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternControllerApi#createIntern");
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

<a id="getAllInterns"></a>
# **getAllInterns**
> List&lt;Intern&gt; getAllInterns()



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
      List<Intern> result = apiInstance.getAllInterns();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternControllerApi#getAllInterns");
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

<a id="getInternById"></a>
# **getInternById**
> Intern getInternById(id)



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
      Intern result = apiInstance.getInternById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternControllerApi#getInternById");
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

[**Intern**](Intern.md)

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
> Intern updateIntern(id, intern)



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
      Intern result = apiInstance.updateIntern(id, intern);
      System.out.println(result);
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

