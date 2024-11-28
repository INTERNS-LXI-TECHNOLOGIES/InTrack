import 'package:demo/entity/intern.dart';

class InternController {
  // Private named constructor
  InternController._internal();

  // Single instance
  static final InternController _instance = InternController._internal();

  // Factory constructor to return the same instance
  factory InternController() {
    return _instance;
  }

  List<Intern> internsList = [];

  void createInterns(String name, String age, String email) {
    Intern intern = Intern(name, age, email);
    internsList.add(intern);
  }

  List<Intern> getInterns() {
    return internsList;
  }

  void updateInterns(
      String name, String newName, String newAge, String newEmail) {
    for (Intern int in internsList) {
      if (int.name == name) {
        Intern int1 = int;
        int1.name = newName;
        int1.age = newAge;
        int1.email = newEmail;
        
      }
    }
  }
}
