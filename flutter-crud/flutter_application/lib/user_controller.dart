import 'package:built_collection/src/list.dart';
import 'package:dio/src/cancel_token.dart';
import 'package:dio/src/options.dart';
import 'package:dio/src/response.dart';
import 'package:flutter/material.dart';
import 'package:openapi/openapi.dart';

class UserController {
  final UserControllerApi userController = Openapi().getUserControllerApi();

  // Fetch all users (Read)
  Future<BuiltList<User>?> fetchAllUsers() async {
    try {
      final response = await userController.getAllUsers(); // Adjust method name if needed
      return response.data;
    } catch (e) {
      print('Error fetching users: $e');
      return null;
    }
  }

  // Fetch a single user by ID (Read)
  Future<User?> fetchUserById(String id) async {
    try {
      final response = await userController.getUserById; // Adjust method name if needed
      return response.data;
    } catch (e) {
      print('Error fetching user by ID: $e');
      return null;
    }
  }

  // Create a new user (Create)
  Future<bool> createUser(User user) async {
    try {
      await userController.postUser; // Adjust method name if needed
      print('User created successfully');
      return true;
    } catch (e) {
      print('Error creating user: $e');
      return false;
    }
  }

  // Update an existing user (Update)
  Future<bool> updateUser(String id, User user) async {
    try {
      await userController.putUser; // Adjust method name if needed
      print('User updated successfully');
      return true;
    } catch (e) {
      print('Error updating user: $e');
      return false;
    }
  }

  // Delete a user (Delete)
  Future<bool> deleteUser(String id) async {
    try {
      await userController.deletUser; // Adjust method name if needed
      print('User deleted successfully');
      return true;
    } catch (e) {
      print('Error deleting user: $e');
      return false;
    }
  }
}

extension on Future<Response<User>> Function({CancelToken? cancelToken, Map<String, dynamic>? extra, Map<String, dynamic>? headers, required int id, ProgressCallback? onReceiveProgress, ProgressCallback? onSendProgress, ValidateStatus? validateStatus}) {
  Future<User?>? get data => null;
}
