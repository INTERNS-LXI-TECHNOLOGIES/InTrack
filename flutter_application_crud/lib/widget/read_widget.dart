import 'package:demo/controller/intern_controller.dart';
import 'package:demo/entity/intern.dart';
import 'package:demo/model/read_model.dart';

import '/flutter_flow/flutter_flow_icon_button.dart';
import '/flutter_flow/flutter_flow_theme.dart';
import '/flutter_flow/flutter_flow_util.dart';
import 'package:flutter/material.dart';

export 'package:demo/model/read_model.dart';

class ReadWidget extends StatefulWidget {
  const ReadWidget({super.key});

  @override
  State<ReadWidget> createState() => _ReadWidgetState();
}

class _ReadWidgetState extends State<ReadWidget> {
  late ReadModel _model;
  late InternController _internController = InternController();

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
    final interns = _internController.getInterns();
    //print(interns);
    setState(() {
      internsDetails = interns;
    });
  }

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: () => FocusScope.of(context).unfocus(),
      child: Scaffold(
        key: scaffoldKey,
        backgroundColor: FlutterFlowTheme.of(context).primaryBackground,
        appBar: AppBar(
          backgroundColor: FlutterFlowTheme.of(context).primary,
          automaticallyImplyLeading: false,
          title: Text(
            'Read',
            style: FlutterFlowTheme.of(context).headlineMedium.override(
                  fontFamily: 'Inter Tight',
                  color: Colors.white,
                  fontSize: 22,
                  letterSpacing: 0.0,
                ),
          ),
          centerTitle: false,
          elevation: 2,
        ),
        body: SafeArea(
          top: true,
          child: ListView.builder(
            itemCount: internsDetails.length,
            itemBuilder: (context, index) {
              final intern = internsDetails[index];
              return Padding(
                padding: const EdgeInsets.symmetric(vertical: 10.0),
                child: Column(
                  children: [
                    Row(
                      children: [
                        Expanded(
                          child: Text(
                            'Name: ${intern.name}',
                            style: FlutterFlowTheme.of(context)
                                .bodyMedium
                                .override(
                                  fontFamily: 'Inter',
                                  fontSize: 20,
                                ),
                          ),
                        ),
                        FlutterFlowIconButton(
                          borderRadius: 8,
                          buttonSize: 35,
                          fillColor: FlutterFlowTheme.of(context).primary,
                          icon: Icon(
                            Icons.edit_note_rounded,
                            color: FlutterFlowTheme.of(context).info,
                            size: 24,
                          ),
                          onPressed: () async {
                            Navigator.pushNamed(context, '/update',arguments: intern);
                          },
                        ),
                        FlutterFlowIconButton(
                          borderRadius: 8,
                          buttonSize: 38,
                          fillColor: FlutterFlowTheme.of(context).primary,
                          icon: Icon(
                            Icons.delete,
                            color: FlutterFlowTheme.of(context).info,
                            size: 24,
                          ),
                          onPressed: () {
                            setState(() {
                              internsDetails.removeAt(index); // Delete intern
                            });
                          },
                        ),
                      ],
                    ),
                    Row(
                      children: [
                        Expanded(
                          child: Text(
                            'Age: ${intern.age}',
                            style: FlutterFlowTheme.of(context)
                                .bodyMedium
                                .override(
                                  fontFamily: 'Inter',
                                  fontSize: 20,
                                ),
                          ),
                        ),
                      ],
                    ),
                    Row(
                      children: [
                        Expanded(
                          child: Text(
                            'Email: ${intern.email}',
                            style: FlutterFlowTheme.of(context)
                                .bodyMedium
                                .override(
                                  fontFamily: 'Inter',
                                  fontSize: 20,
                                ),
                          ),
                        ),
                      ],
                    ),
                    const Divider(thickness: 1),
                  ],
                ),
              );
            },
          ),
        ),
      ),
    );
  }
}
