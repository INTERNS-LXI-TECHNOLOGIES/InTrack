# McqQuestionControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createQuestion**](McqQuestionControllerApi.md#createQuestion) | **POST** /api/mcq |  |
| [**deleteAllQuestions**](McqQuestionControllerApi.md#deleteAllQuestions) | **DELETE** /api/mcq |  |
| [**deleteQuestion**](McqQuestionControllerApi.md#deleteQuestion) | **DELETE** /api/mcq/{id} |  |
| [**getAllQuestions**](McqQuestionControllerApi.md#getAllQuestions) | **GET** /api/mcq |  |
| [**getQuestionById**](McqQuestionControllerApi.md#getQuestionById) | **GET** /api/mcq/{id} |  |
| [**submitAnswer**](McqQuestionControllerApi.md#submitAnswer) | **POST** /api/mcq/{id}/submit |  |
| [**updateQuestion**](McqQuestionControllerApi.md#updateQuestion) | **PUT** /api/mcq/{id} |  |


<a id="createQuestion"></a>
# **createQuestion**
> MCQQuestion createQuestion(mcQQuestion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.McqQuestionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    McqQuestionControllerApi apiInstance = new McqQuestionControllerApi(defaultClient);
    MCQQuestion mcQQuestion = new MCQQuestion(); // MCQQuestion | 
    try {
      MCQQuestion result = apiInstance.createQuestion(mcQQuestion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling McqQuestionControllerApi#createQuestion");
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
| **mcQQuestion** | [**MCQQuestion**](MCQQuestion.md)|  | |

### Return type

[**MCQQuestion**](MCQQuestion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteAllQuestions"></a>
# **deleteAllQuestions**
> deleteAllQuestions()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.McqQuestionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    McqQuestionControllerApi apiInstance = new McqQuestionControllerApi(defaultClient);
    try {
      apiInstance.deleteAllQuestions();
    } catch (ApiException e) {
      System.err.println("Exception when calling McqQuestionControllerApi#deleteAllQuestions");
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

<a id="deleteQuestion"></a>
# **deleteQuestion**
> deleteQuestion(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.McqQuestionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    McqQuestionControllerApi apiInstance = new McqQuestionControllerApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteQuestion(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling McqQuestionControllerApi#deleteQuestion");
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

<a id="getAllQuestions"></a>
# **getAllQuestions**
> List&lt;MCQQuestion&gt; getAllQuestions()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.McqQuestionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    McqQuestionControllerApi apiInstance = new McqQuestionControllerApi(defaultClient);
    try {
      List<MCQQuestion> result = apiInstance.getAllQuestions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling McqQuestionControllerApi#getAllQuestions");
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

[**List&lt;MCQQuestion&gt;**](MCQQuestion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getQuestionById"></a>
# **getQuestionById**
> MCQQuestion getQuestionById(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.McqQuestionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    McqQuestionControllerApi apiInstance = new McqQuestionControllerApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      MCQQuestion result = apiInstance.getQuestionById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling McqQuestionControllerApi#getQuestionById");
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

[**MCQQuestion**](MCQQuestion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="submitAnswer"></a>
# **submitAnswer**
> String submitAnswer(id, body)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.McqQuestionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    McqQuestionControllerApi apiInstance = new McqQuestionControllerApi(defaultClient);
    Long id = 56L; // Long | 
    String body = "body_example"; // String | 
    try {
      String result = apiInstance.submitAnswer(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling McqQuestionControllerApi#submitAnswer");
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
| **body** | **String**|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateQuestion"></a>
# **updateQuestion**
> MCQQuestion updateQuestion(id, mcQQuestion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.McqQuestionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    McqQuestionControllerApi apiInstance = new McqQuestionControllerApi(defaultClient);
    Long id = 56L; // Long | 
    MCQQuestion mcQQuestion = new MCQQuestion(); // MCQQuestion | 
    try {
      MCQQuestion result = apiInstance.updateQuestion(id, mcQQuestion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling McqQuestionControllerApi#updateQuestion");
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
| **mcQQuestion** | [**MCQQuestion**](MCQQuestion.md)|  | |

### Return type

[**MCQQuestion**](MCQQuestion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

