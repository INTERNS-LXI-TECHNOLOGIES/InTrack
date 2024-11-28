import 'package:flutter/material.dart';
//import 'package:internform/widget/Readpage_Widget';
import 'package:internform/widget/homepage_widget.dart';
import 'package:internform/widget/internform_widget.dart'; // Import your HomePageWidget
import 'package:go_router/go_router.dart';
import 'package:internform/widget/read_Widget.dart';
import 'package:internform/widget/update_widget.dart';
void main() {
  runApp( MyApp());
}

class MyApp extends StatelessWidget {
   MyApp({super.key});
   //final GoRouter _router = createRouter();

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
        useMaterial3: true,
      ),
      initialRoute: '/',
      
      routes: {
        '/': (context) => const HomepageWidget(),
        '/create':(context)=> const InternformWidget(),
        '/read':(context)=>const ReadWidget(),
        '/update':(context)=>const UpdateWidget(),
      },
    // routerConfig: _router, 
     // Use the GoRouter configuration // Set HomePageWidget as the initial screen
);
}
}

//Define the createRouter function
// GoRouter createRouter() {
//   return GoRouter(
//     routes: [
//       GoRoute(
//         path: '/', // Default route
//         builder: (context, state) => const HomepageWidget(),
//       ),
//       GoRoute(
//         path: '/createpage', // Named route for CreatePageWidget
//         builder: (context, state) => const InternformWidget(),
//       ),
//     GoRoute(
//          path: '/read', 
//          builder: (context, state) => const ReadWidget(),
//        ),
//     //   GoRoute(
//     //     path: '/update', 
//     //     builder: (context, state) => const UpdateWidget(),
//     //   ),

//],);
