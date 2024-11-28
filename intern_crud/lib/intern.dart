class Intern{

String name;
String role;
String email;

Intern({required this.name,required this.role,required this.email});
@override
  String toString() {
    return '(name: $name, role: $role, email: $email)';
  }

}

