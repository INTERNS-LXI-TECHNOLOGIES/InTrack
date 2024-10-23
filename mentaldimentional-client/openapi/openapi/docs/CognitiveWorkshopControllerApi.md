# CognitiveWorkshopControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**completeWorkshop**](CognitiveWorkshopControllerApi.md#completeWorkshop) | **POST** /api/workshops/{id}/complete |  |
| [**createWorkshop**](CognitiveWorkshopControllerApi.md#createWorkshop) | **POST** /api/workshops |  |
| [**deleteAllWorkshops**](CognitiveWorkshopControllerApi.md#deleteAllWorkshops) | **DELETE** /api/workshops |  |
| [**deleteWorkshop**](CognitiveWorkshopControllerApi.md#deleteWorkshop) | **DELETE** /api/workshops/{id} |  |
| [**getAllWorkshops**](CognitiveWorkshopControllerApi.md#getAllWorkshops) | **GET** /api/workshops |  |
| [**getWorkshopById**](CognitiveWorkshopControllerApi.md#getWorkshopById) | **GET** /api/workshops/{id} |  |
| [**updateWorkshop**](CognitiveWorkshopControllerApi.md#updateWorkshop) | **PUT** /api/workshops/{id} |  |


<a id="completeWorkshop"></a>
# **completeWorkshop**
> CognitiveWorkshop completeWorkshop(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveWorkshopControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CognitiveWorkshopControllerApi apiInstance = new CognitiveWorkshopControllerApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      CognitiveWorkshop result = apiInstance.completeWorkshop(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveWorkshopControllerApi#completeWorkshop");
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

[**CognitiveWorkshop**](CognitiveWorkshop.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createWorkshop"></a>
# **createWorkshop**
> CognitiveWorkshop createWorkshop(cognitiveWorkshop)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveWorkshopControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CognitiveWorkshopControllerApi apiInstance = new CognitiveWorkshopControllerApi(defaultClient);
    CognitiveWorkshop cognitiveWorkshop = new CognitiveWorkshop(); // CognitiveWorkshop | 
    try {
      CognitiveWorkshop result = apiInstance.createWorkshop(cognitiveWorkshop);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveWorkshopControllerApi#createWorkshop");
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
| **cognitiveWorkshop** | [**CognitiveWorkshop**](CognitiveWorkshop.md)|  | |

### Return type

[**CognitiveWorkshop**](CognitiveWorkshop.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteAllWorkshops"></a>
# **deleteAllWorkshops**
> deleteAllWorkshops()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveWorkshopControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CognitiveWorkshopControllerApi apiInstance = new CognitiveWorkshopControllerApi(defaultClient);
    try {
      apiInstance.deleteAllWorkshops();
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveWorkshopControllerApi#deleteAllWorkshops");
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

<a id="deleteWorkshop"></a>
# **deleteWorkshop**
> deleteWorkshop(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveWorkshopControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CognitiveWorkshopControllerApi apiInstance = new CognitiveWorkshopControllerApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteWorkshop(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveWorkshopControllerApi#deleteWorkshop");
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

<a id="getAllWorkshops"></a>
# **getAllWorkshops**
> List&lt;CognitiveWorkshop&gt; getAllWorkshops()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveWorkshopControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CognitiveWorkshopControllerApi apiInstance = new CognitiveWorkshopControllerApi(defaultClient);
    try {
      List<CognitiveWorkshop> result = apiInstance.getAllWorkshops();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveWorkshopControllerApi#getAllWorkshops");
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

[**List&lt;CognitiveWorkshop&gt;**](CognitiveWorkshop.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getWorkshopById"></a>
# **getWorkshopById**
> CognitiveWorkshop getWorkshopById(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveWorkshopControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CognitiveWorkshopControllerApi apiInstance = new CognitiveWorkshopControllerApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      CognitiveWorkshop result = apiInstance.getWorkshopById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveWorkshopControllerApi#getWorkshopById");
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

[**CognitiveWorkshop**](CognitiveWorkshop.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateWorkshop"></a>
# **updateWorkshop**
> CognitiveWorkshop updateWorkshop(id, cognitiveWorkshop)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveWorkshopControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CognitiveWorkshopControllerApi apiInstance = new CognitiveWorkshopControllerApi(defaultClient);
    Long id = 56L; // Long | 
    CognitiveWorkshop cognitiveWorkshop = new CognitiveWorkshop(); // CognitiveWorkshop | 
    try {
      CognitiveWorkshop result = apiInstance.updateWorkshop(id, cognitiveWorkshop);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveWorkshopControllerApi#updateWorkshop");
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
| **cognitiveWorkshop** | [**CognitiveWorkshop**](CognitiveWorkshop.md)|  | |

### Return type

[**CognitiveWorkshop**](CognitiveWorkshop.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

