import 'package:openapi/openapi.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        // This is the theme of your application.
        //
        // TRY THIS: Try running your application with "flutter run". You'll see
        // the application has a purple toolbar. Then, without quitting the app,
        // try changing the seedColor in the colorScheme below to Colors.green
        // and then invoke "hot reload" (save your changes or press the "hot
        // reload" butt
        //on in a Flutter-supported IDE, or press "r" if you used
        // the command line to start the app).
        //
        // Notice that the counter didn't reset back to zero; the application
        // state is not lost during the reload. To reset the state, use hot
        // restart instead.
        //
        // This works for code too, not just values: Most code changes can be
        // tested with just a hot reload.
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
        useMaterial3: true,
      ),
      home: const MyHomePage(title: 'Flutter Demo Home Page'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key, required this.title});

  // This widget is the home page of your application. It is stateful, meaning
  // that it has a State object (defined below) that contains fields that affect
  // how it looks.

  // This class is the configuration for the state. It holds the values (in this
  // case the title) provided by the parent (in this case the App widget) and
  // used by the build method of the State. Fields in a Widget subclass are
  // always marked "final".

  final String title;

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
List<Contact>? contacts ;
void initState(){
  super.initState();
  _getAllContacts();
}

Future<void> _getAllContacts() async {
    ContactControllerApi contactControllerApi = Openapi().getContactControllerApi();

    try {
      var fetchedContacts = await contactControllerApi.getAllContacts();
      setState(() {
        if (fetchedContacts.data != null) {
          contacts = fetchedContacts.data!.toList();
        } else {
          contacts = []; // Handle the case where data is null by setting contacts to an empty list
        }
      });
    } catch (e) {
      print('error: $e');
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Contacts'),
      ),
      body: contacts == null
          ? Center(child: CircularProgressIndicator()) // Show a loader while contacts are being fetched
          : ListView.builder(
              itemCount: contacts!.length,
              itemBuilder: (context, index) {
                Contact contact = contacts![index];
                return ListTile(
                  title: Text(contact.name ?? 'No Name'), // Display the contact's name
                  subtitle: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Text(contact.phoneNumber ?? 'No Phone'), // Display the contact's phone
                      Text(contact.email ?? 'No email')
                    ],
                  ) 
                );
              },
            ),
      floatingActionButton: FloatingActionButton(
        onPressed: _getAllContacts, // Reload contacts on button press
        child: Icon(Icons.refresh),
      ),
    );
  }
}
