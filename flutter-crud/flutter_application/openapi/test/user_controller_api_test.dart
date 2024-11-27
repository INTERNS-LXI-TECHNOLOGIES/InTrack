import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for UserControllerApi
void main() {
  final instance = Openapi().getUserControllerApi();

  group(UserControllerApi, () {
    //Future deletUser(int id) async
    test('test deletUser', () async {
      // TODO
    });

    //Future<User> geUserByName(String secondName) async
    test('test geUserByName', () async {
      // TODO
    });

    //Future<BuiltList<User>> getAllUsers() async
    test('test getAllUsers', () async {
      // TODO
    });

    //Future<User> getUserById(int id) async
    test('test getUserById', () async {
      // TODO
    });

    //Future<User> postUser(User user) async
    test('test postUser', () async {
      // TODO
    });

    //Future<User> putUser(int id, User user) async
    test('test putUser', () async {
      // TODO
    });

  });
}
