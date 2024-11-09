import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for ContactControllerApi
void main() {
  final instance = Openapi().getContactControllerApi();

  group(ContactControllerApi, () {
    //Future<Contact> createContact(Contact contact) async
    test('test createContact', () async {
      // TODO
    });

    //Future<JsonObject> deleteContact(int id) async
    test('test deleteContact', () async {
      // TODO
    });

    //Future<BuiltList<Contact>> getAllContacts() async
    test('test getAllContacts', () async {
      // TODO
    });

    //Future<Contact> getContactById(int id) async
    test('test getContactById', () async {
      // TODO
    });

    //Future<Contact> updateContact(int id, Contact contact) async
    test('test updateContact', () async {
      // TODO
    });

  });
}
