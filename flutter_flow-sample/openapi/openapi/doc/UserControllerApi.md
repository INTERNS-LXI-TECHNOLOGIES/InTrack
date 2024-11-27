# openapi.api.UserControllerApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *http://localhost:8081*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletUser**](UserControllerApi.md#deletuser) | **DELETE** /api/users/{id} | 
[**geUserByName**](UserControllerApi.md#geuserbyname) | **GET** /api/users/name/{name} | 
[**getAllUsers**](UserControllerApi.md#getallusers) | **GET** /api/users/showAll | 
[**getUserById**](UserControllerApi.md#getuserbyid) | **GET** /api/users/{id} | 
[**postUser**](UserControllerApi.md#postuser) | **POST** /api/users/create | 
[**putUser**](UserControllerApi.md#putuser) | **PUT** /api/users/{id} | 


# **deletUser**
> deletUser(id)



### Example
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUserControllerApi();
final int id = 789; // int | 

try {
    api.deletUser(id);
} catch on DioException (e) {
    print('Exception when calling UserControllerApi->deletUser: $e\n');
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

# **geUserByName**
> User geUserByName(secondName)



### Example
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUserControllerApi();
final String secondName = secondName_example; // String | 

try {
    final response = api.geUserByName(secondName);
    print(response);
} catch on DioException (e) {
    print('Exception when calling UserControllerApi->geUserByName: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secondName** | **String**|  | 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAllUsers**
> BuiltList<User> getAllUsers()



### Example
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUserControllerApi();

try {
    final response = api.getAllUsers();
    print(response);
} catch on DioException (e) {
    print('Exception when calling UserControllerApi->getAllUsers: $e\n');
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BuiltList&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getUserById**
> User getUserById(id)



### Example
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUserControllerApi();
final int id = 789; // int | 

try {
    final response = api.getUserById(id);
    print(response);
} catch on DioException (e) {
    print('Exception when calling UserControllerApi->getUserById: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postUser**
> User postUser(user)



### Example
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUserControllerApi();
final User user = ; // User | 

try {
    final response = api.postUser(user);
    print(response);
} catch on DioException (e) {
    print('Exception when calling UserControllerApi->postUser: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)|  | 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **putUser**
> User putUser(id, user)



### Example
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUserControllerApi();
final int id = 789; // int | 
final User user = ; // User | 

try {
    final response = api.putUser(id, user);
    print(response);
} catch on DioException (e) {
    print('Exception when calling UserControllerApi->putUser: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 
 **user** | [**User**](User.md)|  | 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

