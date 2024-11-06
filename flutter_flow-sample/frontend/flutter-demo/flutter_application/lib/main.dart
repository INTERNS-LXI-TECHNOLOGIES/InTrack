import 'package:flutter/material.dart';
import 'package:openapi/widget/home_page_widget.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Flutter CRUD App',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: const HomePageWidget(),
    );

    
  }
}
