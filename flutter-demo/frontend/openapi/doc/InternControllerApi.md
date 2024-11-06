# openapi.api.InternControllerApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIntern**](InternControllerApi.md#createintern) | **POST** /api/interns | 
[**deleteIntern**](InternControllerApi.md#deleteintern) | **DELETE** /api/interns/{id} | 
[**getAllInterns**](InternControllerApi.md#getallinterns) | **GET** /api/interns | 
[**getInternById**](InternControllerApi.md#getinternbyid) | **GET** /api/interns/{id} | 
[**updateIntern**](InternControllerApi.md#updateintern) | **PUT** /api/interns/{id} | 


# **createIntern**
> Intern createIntern(intern)



### Example
```dart
import 'package:openapi/api.dart';

final api = Openapi().getInternControllerApi();
final Intern intern = ; // Intern | 

try {
    final response = api.createIntern(intern);
    print(response);
} catch on DioException (e) {
    print('Exception when calling InternControllerApi->createIntern: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intern** | [**Intern**](Intern.md)|  | 

### Return type

[**Intern**](Intern.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteIntern**
> deleteIntern(id)



### Example
```dart
import 'package:openapi/api.dart';

final api = Openapi().getInternControllerApi();
final int id = 789; // int | 

try {
    api.deleteIntern(id);
} catch on DioException (e) {
    print('Exception when calling InternControllerApi->deleteIntern: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAllInterns**
> BuiltList<Intern> getAllInterns()



### Example
```dart
import 'package:openapi/api.dart';

final api = Openapi().getInternControllerApi();

try {
    final response = api.getAllInterns();
    print(response);
} catch on DioException (e) {
    print('Exception when calling InternControllerApi->getAllInterns: $e\n');
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BuiltList&lt;Intern&gt;**](Intern.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getInternById**
> Intern getInternById(id)



### Example
```dart
import 'package:openapi/api.dart';

final api = Openapi().getInternControllerApi();
final int id = 789; // int | 

try {
    final response = api.getInternById(id);
    print(response);
} catch on DioException (e) {
    print('Exception when calling InternControllerApi->getInternById: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 

### Return type

[**Intern**](Intern.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateIntern**
> Intern updateIntern(id, intern)



### Example
```dart
import 'package:openapi/api.dart';

final api = Openapi().getInternControllerApi();
final int id = 789; // int | 
final Intern intern = ; // Intern | 

try {
    final response = api.updateIntern(id, intern);
    print(response);
} catch on DioException (e) {
    print('Exception when calling InternControllerApi->updateIntern: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 
 **intern** | [**Intern**](Intern.md)|  | 

### Return type

[**Intern**](Intern.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

