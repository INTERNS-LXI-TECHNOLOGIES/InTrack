import 'package:flutter/material.dart';
import 'package:flutterdemo/widget/create_widget.dart';
import 'package:flutterdemo/widget/read_widget.dart';
import 'package:flutterdemo/widget/update_widget.dart'; // Import ReadWidget

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Flutter CRUD App',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      initialRoute: '/', // Set the initial route
      routes: {
        '/': (context) => const CreateWidget(), // Route for CreateWidget
        '/read': (context) => const ReadWidget(firstName: '', lastName: '', email: '',), // Route for ReadWidget
         '/update': (context) => const UpdateWidget(),
      },
    );
  }
}
