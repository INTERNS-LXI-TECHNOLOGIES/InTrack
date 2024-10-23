# LeetCodeChallengeControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createChallenge**](LeetCodeChallengeControllerApi.md#createChallenge) | **POST** /api/cognitive/challenges/create |  |
| [**deleteAllChallenges**](LeetCodeChallengeControllerApi.md#deleteAllChallenges) | **DELETE** /api/cognitive/challenges/deleteAll |  |
| [**deleteChallengeById**](LeetCodeChallengeControllerApi.md#deleteChallengeById) | **DELETE** /api/cognitive/challenges/{id} |  |
| [**getAllChallenges**](LeetCodeChallengeControllerApi.md#getAllChallenges) | **GET** /api/cognitive/challenges/all |  |
| [**getChallengeById**](LeetCodeChallengeControllerApi.md#getChallengeById) | **GET** /api/cognitive/challenges/{id} |  |
| [**submitSolution**](LeetCodeChallengeControllerApi.md#submitSolution) | **POST** /api/cognitive/challenges/submit |  |
| [**updateChallenge**](LeetCodeChallengeControllerApi.md#updateChallenge) | **PUT** /api/cognitive/challenges/{id} |  |


<a id="createChallenge"></a>
# **createChallenge**
> LeetCodeChallenge createChallenge(leetCodeChallenge)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LeetCodeChallengeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    LeetCodeChallengeControllerApi apiInstance = new LeetCodeChallengeControllerApi(defaultClient);
    LeetCodeChallenge leetCodeChallenge = new LeetCodeChallenge(); // LeetCodeChallenge | 
    try {
      LeetCodeChallenge result = apiInstance.createChallenge(leetCodeChallenge);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeetCodeChallengeControllerApi#createChallenge");
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
| **leetCodeChallenge** | [**LeetCodeChallenge**](LeetCodeChallenge.md)|  | |

### Return type

[**LeetCodeChallenge**](LeetCodeChallenge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteAllChallenges"></a>
# **deleteAllChallenges**
> deleteAllChallenges()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LeetCodeChallengeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    LeetCodeChallengeControllerApi apiInstance = new LeetCodeChallengeControllerApi(defaultClient);
    try {
      apiInstance.deleteAllChallenges();
    } catch (ApiException e) {
      System.err.println("Exception when calling LeetCodeChallengeControllerApi#deleteAllChallenges");
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

<a id="deleteChallengeById"></a>
# **deleteChallengeById**
> deleteChallengeById(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LeetCodeChallengeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    LeetCodeChallengeControllerApi apiInstance = new LeetCodeChallengeControllerApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteChallengeById(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeetCodeChallengeControllerApi#deleteChallengeById");
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

<a id="getAllChallenges"></a>
# **getAllChallenges**
> List&lt;LeetCodeChallenge&gt; getAllChallenges()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LeetCodeChallengeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    LeetCodeChallengeControllerApi apiInstance = new LeetCodeChallengeControllerApi(defaultClient);
    try {
      List<LeetCodeChallenge> result = apiInstance.getAllChallenges();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeetCodeChallengeControllerApi#getAllChallenges");
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

[**List&lt;LeetCodeChallenge&gt;**](LeetCodeChallenge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getChallengeById"></a>
# **getChallengeById**
> LeetCodeChallenge getChallengeById(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LeetCodeChallengeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    LeetCodeChallengeControllerApi apiInstance = new LeetCodeChallengeControllerApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      LeetCodeChallenge result = apiInstance.getChallengeById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeetCodeChallengeControllerApi#getChallengeById");
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

[**LeetCodeChallenge**](LeetCodeChallenge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="submitSolution"></a>
# **submitSolution**
> String submitSolution(challengeId, solution)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LeetCodeChallengeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    LeetCodeChallengeControllerApi apiInstance = new LeetCodeChallengeControllerApi(defaultClient);
    Long challengeId = 56L; // Long | 
    String solution = "solution_example"; // String | 
    try {
      String result = apiInstance.submitSolution(challengeId, solution);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeetCodeChallengeControllerApi#submitSolution");
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
| **challengeId** | **Long**|  | |
| **solution** | **String**|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateChallenge"></a>
# **updateChallenge**
> LeetCodeChallenge updateChallenge(id, leetCodeChallenge)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LeetCodeChallengeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    LeetCodeChallengeControllerApi apiInstance = new LeetCodeChallengeControllerApi(defaultClient);
    Long id = 56L; // Long | 
    LeetCodeChallenge leetCodeChallenge = new LeetCodeChallenge(); // LeetCodeChallenge | 
    try {
      LeetCodeChallenge result = apiInstance.updateChallenge(id, leetCodeChallenge);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeetCodeChallengeControllerApi#updateChallenge");
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
| **leetCodeChallenge** | [**LeetCodeChallenge**](LeetCodeChallenge.md)|  | |

### Return type

[**LeetCodeChallenge**](LeetCodeChallenge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

