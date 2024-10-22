# RewardControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRewards**](RewardControllerApi.md#createRewards) | **POST** /create |  |
| [**deleteRewards**](RewardControllerApi.md#deleteRewards) | **DELETE** /{id} |  |
| [**getRewardbyNames**](RewardControllerApi.md#getRewardbyNames) | **GET** /{name} |  |
| [**getRewards**](RewardControllerApi.md#getRewards) | **GET** / |  |
| [**updateRewards**](RewardControllerApi.md#updateRewards) | **PUT** /{id} |  |


<a id="createRewards"></a>
# **createRewards**
> createRewards(reward)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RewardControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    RewardControllerApi apiInstance = new RewardControllerApi(defaultClient);
    Reward reward = new Reward(); // Reward | 
    try {
      apiInstance.createRewards(reward);
    } catch (ApiException e) {
      System.err.println("Exception when calling RewardControllerApi#createRewards");
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
| **reward** | [**Reward**](Reward.md)|  | |

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

<a id="deleteRewards"></a>
# **deleteRewards**
> deleteRewards(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RewardControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    RewardControllerApi apiInstance = new RewardControllerApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteRewards(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling RewardControllerApi#deleteRewards");
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

<a id="getRewardbyNames"></a>
# **getRewardbyNames**
> Reward getRewardbyNames(name)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RewardControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    RewardControllerApi apiInstance = new RewardControllerApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      Reward result = apiInstance.getRewardbyNames(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RewardControllerApi#getRewardbyNames");
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
| **name** | **String**|  | |

### Return type

[**Reward**](Reward.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getRewards"></a>
# **getRewards**
> List&lt;Reward&gt; getRewards()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RewardControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    RewardControllerApi apiInstance = new RewardControllerApi(defaultClient);
    try {
      List<Reward> result = apiInstance.getRewards();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RewardControllerApi#getRewards");
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

[**List&lt;Reward&gt;**](Reward.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateRewards"></a>
# **updateRewards**
> updateRewards(id, reward)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RewardControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    RewardControllerApi apiInstance = new RewardControllerApi(defaultClient);
    Long id = 56L; // Long | 
    Reward reward = new Reward(); // Reward | 
    try {
      apiInstance.updateRewards(id, reward);
    } catch (ApiException e) {
      System.err.println("Exception when calling RewardControllerApi#updateRewards");
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
| **reward** | [**Reward**](Reward.md)|  | |

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

