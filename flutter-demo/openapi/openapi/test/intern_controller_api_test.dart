import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for InternControllerApi
void main() {
  final instance = Openapi().getInternControllerApi();

  group(InternControllerApi, () {
    //Future<Intern> createIntern(Intern intern) async
    test('test createIntern', () async {
      // TODO
    });

    //Future deleteIntern(int id) async
    test('test deleteIntern', () async {
      // TODO
    });

    //Future<BuiltList<Intern>> getAllInterns() async
    test('test getAllInterns', () async {
      // TODO
    });

    //Future<Intern> getInternById(int id) async
    test('test getInternById', () async {
      // TODO
    });

    //Future<Intern> updateIntern(int id, Intern intern) async
    test('test updateIntern', () async {
      // TODO
    });

  });
}
