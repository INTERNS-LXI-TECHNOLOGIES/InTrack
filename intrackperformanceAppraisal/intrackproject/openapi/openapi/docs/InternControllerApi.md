# InternControllerApi

All URIs are relative to *http://localhost:8081*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createIntern**](InternControllerApi.md#createIntern) | **POST** /interns |  |
| [**deleteIntern**](InternControllerApi.md#deleteIntern) | **DELETE** /interns/{internId} |  |
| [**getAllInterns**](InternControllerApi.md#getAllInterns) | **GET** /interns |  |
| [**getInternById**](InternControllerApi.md#getInternById) | **GET** /interns/{internId} |  |
| [**getInternHistory**](InternControllerApi.md#getInternHistory) | **GET** /interns/{internId}/history |  |


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
    defaultClient.setBasePath("http://localhost:8081");

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
> deleteIntern(internId)



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
    defaultClient.setBasePath("http://localhost:8081");

    InternControllerApi apiInstance = new InternControllerApi(defaultClient);
    Long internId = 56L; // Long | 
    try {
      apiInstance.deleteIntern(internId);
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
| **internId** | **Long**|  | |

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
    defaultClient.setBasePath("http://localhost:8081");

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
> Intern getInternById(internId)



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
    defaultClient.setBasePath("http://localhost:8081");

    InternControllerApi apiInstance = new InternControllerApi(defaultClient);
    Long internId = 56L; // Long | 
    try {
      Intern result = apiInstance.getInternById(internId);
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
| **internId** | **Long**|  | |

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

<a id="getInternHistory"></a>
# **getInternHistory**
> InternHistoryDTO getInternHistory(internId)



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
    defaultClient.setBasePath("http://localhost:8081");

    InternControllerApi apiInstance = new InternControllerApi(defaultClient);
    Long internId = 56L; // Long | 
    try {
      InternHistoryDTO result = apiInstance.getInternHistory(internId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternControllerApi#getInternHistory");
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

[**InternHistoryDTO**](InternHistoryDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

