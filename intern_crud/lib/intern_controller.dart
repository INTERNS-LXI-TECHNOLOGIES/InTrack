
import 'package:internform/intern.dart';


class InternController {
   // Private named constructor
  InternController._internal();

  // Single instance
  static final InternController _instance = InternController._internal();

  // Factory constructor to return the same instance
  factory InternController() {
    return _instance;
  }
  final List<Intern> _internList = [];
   
  // Add a new intern
  void addIntern(Intern intern) {
    _internList.add(intern);
  }
List<Intern> getInternList() {
    return _internList;
  }
  // Get the list of interns
  void updateInterns(
      String name, String newName, String newAge, String newEmail) {
    for (Intern int in _internList) {
      if (int.name == name) {
        Intern int1 = int;
        int1.name = newName;
        int1.role= newAge;
        int1.email = newEmail;
        
      }
    }
  }
}
