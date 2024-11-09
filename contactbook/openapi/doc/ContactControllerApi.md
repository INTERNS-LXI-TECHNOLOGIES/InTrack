# openapi.api.ContactControllerApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createContact**](ContactControllerApi.md#createcontact) | **POST** /api/contacts | 
[**deleteContact**](ContactControllerApi.md#deletecontact) | **DELETE** /api/contacts/{id} | 
[**getAllContacts**](ContactControllerApi.md#getallcontacts) | **GET** /api/contacts | 
[**getContactById**](ContactControllerApi.md#getcontactbyid) | **GET** /api/contacts/{id} | 
[**updateContact**](ContactControllerApi.md#updatecontact) | **PUT** /api/contacts/{id} | 


# **createContact**
> Contact createContact(contact)



### Example
```dart
import 'package:openapi/api.dart';

final api = Openapi().getContactControllerApi();
final Contact contact = ; // Contact | 

try {
    final response = api.createContact(contact);
    print(response);
} catch on DioException (e) {
    print('Exception when calling ContactControllerApi->createContact: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact** | [**Contact**](Contact.md)|  | 

### Return type

[**Contact**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteContact**
> JsonObject deleteContact(id)



### Example
```dart
import 'package:openapi/api.dart';

final api = Openapi().getContactControllerApi();
final int id = 789; // int | 

try {
    final response = api.deleteContact(id);
    print(response);
} catch on DioException (e) {
    print('Exception when calling ContactControllerApi->deleteContact: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 

### Return type

[**JsonObject**](JsonObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAllContacts**
> BuiltList<Contact> getAllContacts()



### Example
```dart
import 'package:openapi/api.dart';

final api = Openapi().getContactControllerApi();

try {
    final response = api.getAllContacts();
    print(response);
} catch on DioException (e) {
    print('Exception when calling ContactControllerApi->getAllContacts: $e\n');
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BuiltList&lt;Contact&gt;**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getContactById**
> Contact getContactById(id)



### Example
```dart
import 'package:openapi/api.dart';

final api = Openapi().getContactControllerApi();
final int id = 789; // int | 

try {
    final response = api.getContactById(id);
    print(response);
} catch on DioException (e) {
    print('Exception when calling ContactControllerApi->getContactById: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 

### Return type

[**Contact**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateContact**
> Contact updateContact(id, contact)



### Example
```dart
import 'package:openapi/api.dart';

final api = Openapi().getContactControllerApi();
final int id = 789; // int | 
final Contact contact = ; // Contact | 

try {
    final response = api.updateContact(id, contact);
    print(response);
} catch on DioException (e) {
    print('Exception when calling ContactControllerApi->updateContact: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 
 **contact** | [**Contact**](Contact.md)|  | 

### Return type

[**Contact**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

