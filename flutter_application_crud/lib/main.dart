import 'package:demo/widget/read_widget.dart';
import 'package:demo/widget/update_widget.dart';
import 'package:flutter/material.dart';
// Ensure GoRouter is imported
import 'package:demo/widget/create_page_widget.dart';
import 'package:demo/widget/home_page_widget.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  MyApp({super.key});

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
        '/': (context) => const HomePageWidget(),
        '/create':(context)=> const CreatepageWidget(),
        '/read':(context)=>const ReadWidget(),
        '/update':(context)=>const UpdateWidget()
      },
    );
  }
}

// Define the createRouter function
// GoRouter createRouter() {
//   return GoRouter(
//     routes: [
//       GoRoute(
//         path: '/', // Default route
//         builder: (context, state) => const HomePageWidget(),
//       ),
//       GoRoute(
//         path: '/createpage', // Named route for CreatePageWidget
//         builder: (context, state) => const CreatepageWidget(),
//       ),
//      GoRoute(
//         path: '/read', 
//         builder: (context, state) => const ReadWidget(),
//       ),
//        GoRoute(
//       path: '/update',
//       builder: (context, state) {
//         // Extract the value from the extra parameter
//         final String? internName = state.extra as String?;
//         return UpdateWidget(name: internName);
//       },
//     ),

//     ],
//   );
// }
