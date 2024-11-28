import 'package:internform/intern.dart';
import 'package:internform/intern_controller.dart';

import '/flutter_flow/flutter_flow_icon_button.dart';
import '/flutter_flow/flutter_flow_theme.dart';
import '/flutter_flow/flutter_flow_util.dart';
import '/flutter_flow/flutter_flow_widgets.dart';
import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:provider/provider.dart';

import '../model/read_model.dart';
export '../model/read_model.dart';

class ReadWidget extends StatefulWidget {
  const ReadWidget({super.key});

  @override
  State<ReadWidget> createState() => _ReadWidgetState();
}

class _ReadWidgetState extends State<ReadWidget> {
  late ReadModel _model;
  late InternController Controller = InternController();
  


  final scaffoldKey = GlobalKey<ScaffoldState>();
List<Intern> internsDetails = [];
  @override
  void initState() {
    super.initState();
    _model = createModel(context, () => ReadModel());
    _getInterns();
  }

  @override
  void dispose() {
    _model.dispose();

    super.dispose();
  }

  void _getInterns() {
    final interns = Controller.getInternList();
    //print(interns);
    setState(() {
      internsDetails = interns;
    });
  }

  @override
  Widget build(BuildContext context) {
    final interns = Controller.getInternList();
    return GestureDetector(
      onTap: () => FocusScope.of(context).unfocus(),
      child: Scaffold(
        key: scaffoldKey,
        backgroundColor: FlutterFlowTheme.of(context).primaryBackground,
        appBar: AppBar(
          backgroundColor: FlutterFlowTheme.of(context).primary,
          automaticallyImplyLeading: false,
          title: Text(
            'Intern Management',
            style: FlutterFlowTheme.of(context).headlineMedium.override(
                  fontFamily: 'Inter Tight',
                  color: Colors.white,
                  fontSize: 22,
                  letterSpacing: 0.0,
                ),
          ),
          actions: [
            FlutterFlowIconButton(
              buttonSize: 48,
              icon: Icon(
                Icons.add_circle_outline,
                color: Colors.white,
                size: 24,
              ),
              onPressed: () {
                Navigator.pushNamed(context, '/create');
                print('IconButton pressed ...');
              },
            ),
          ],
          centerTitle: false,
          elevation: 2,
        ),
        body: SafeArea(
          top: true,
          child: Container(
            height: 300,
            decoration: BoxDecoration(),
            child: ListView.builder(
            shrinkWrap: true,
            physics: NeverScrollableScrollPhysics(), // Prevents nested scrolling
            itemCount: interns.length,
            itemBuilder: (context, index) {
              final intern = interns[index];
              return Padding(
                padding: EdgeInsetsDirectional.fromSTEB(16, 16, 16, 16),
                child: Material(
                  color: Colors.transparent,
                  elevation: 2,
                  shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(12),
                  ),
                  child: Container(
                    width: MediaQuery.sizeOf(context).width,
                    decoration: BoxDecoration(
                      color: Theme.of(context).cardColor,
                      borderRadius: BorderRadius.circular(12),
                    ),
                    child: Padding(
                      padding: EdgeInsetsDirectional.fromSTEB(16, 16, 16, 16),
                      child: Column(
                        mainAxisSize: MainAxisSize.min,
                        children: [
                          Row(
                            mainAxisSize: MainAxisSize.max,
                            mainAxisAlignment: MainAxisAlignment.spaceBetween,
                            children: [
                              Column(
                                crossAxisAlignment: CrossAxisAlignment.start,
                                children: [
                                  Text(
                                    'Name :${intern.name}',
                                    style: Theme.of(context).textTheme.headlineSmall,
                                  ),
                                  Text(
                                    'role :${intern.role}',
                                    style: Theme.of(context).textTheme.bodyMedium,
                                  ),
                                ],
                              ),
                              Row(
                                children: [
                                  IconButton(
                                    icon: Icon(Icons.edit, color: Colors.blue),
                                    onPressed: () {
                                      Navigator.pushNamed(context, '/update',arguments: intern);
                                    },
                                  ),
                                  IconButton(
  icon: Icon(Icons.delete_outline, color: Colors.red),
  onPressed: () {
    showDialog(
      context: context,
      builder: (BuildContext context) {
        return AlertDialog(
          title: Text('Confirm Removal'),
          content: Text('Are you sure you want to remove ${interns[index].name}?'),
          actions: [
            TextButton(
              onPressed: () {
                Navigator.of(context).pop(); // Close the dialog
              },
              child: Text('Cancel'),
            ),
            TextButton(
              onPressed: () {
                setState(() {
                  interns.removeAt(index); // Remove the intern
                });
                Navigator.of(context).pop(); // Close the dialog
                ScaffoldMessenger.of(context).showSnackBar(
                  SnackBar(
                    content: Text('${interns[index].name} has been removed'),
                    duration: Duration(seconds: 2),
                  ),
                );
              },
              child: Text('Remove', style: TextStyle(color: Colors.red)),
            ),
          ],
        );
      },
    );
  },
),

                                ],
                              ),
                            ],
                          ),
                          Divider(color: Theme.of(context).dividerColor),
                          Row(
                            children: [
                              Column(
                                crossAxisAlignment: CrossAxisAlignment.start,
                                children: [
                                  Text(
                                    'Email',
                                    style: Theme.of(context).textTheme.bodySmall,
                                  ),
                                  Text(
                                    'email :${intern.email}',
                                    style: Theme.of(context).textTheme.bodyMedium,
                                  ),
                                ],
                              ),
                            ],
                          ),
                        ],
                      ),
                    ),
                  ),
                ),
              );
            },
          ),
         

          )
      ),
        ),
        );
    
  }
}