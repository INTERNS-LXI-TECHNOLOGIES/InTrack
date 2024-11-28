import '/flutter_flow/flutter_flow_theme.dart';
import '/flutter_flow/flutter_flow_util.dart';
import '/flutter_flow/flutter_flow_widgets.dart';
import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:provider/provider.dart';

import '../model/homepage_model.dart';
export '../model/homepage_model.dart';

class HomepageWidget extends StatefulWidget {
  const HomepageWidget({super.key});

  @override
  State<HomepageWidget> createState() => _HomepageWidgetState();
}

class _HomepageWidgetState extends State<HomepageWidget> {
  late HomepageModel _model;

  final scaffoldKey = GlobalKey<ScaffoldState>();

  @override
  void initState() {
    super.initState();
    _model = createModel(context, () => HomepageModel());
  }

  @override
  void dispose() {
    _model.dispose();

    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: () => FocusScope.of(context).unfocus(),
      child: Scaffold(
        key: scaffoldKey,
        backgroundColor: FlutterFlowTheme.of(context).primaryBackground,
        body: SafeArea(
          top: true,
          child: Container(
            width: MediaQuery.of(context).size.width, // 25% of the screen width
    height: MediaQuery.of(context).size.height , // 15% of the screen height
            decoration: BoxDecoration(
              gradient: LinearGradient(
                colors: [
                  FlutterFlowTheme.of(context).primary,
                  FlutterFlowTheme.of(context).secondary
                ],
                stops: [0, 1],
                begin: AlignmentDirectional(1, -1),
                end: AlignmentDirectional(-1, 1),
              ),
            ),
            child: Padding(
              padding: EdgeInsets.all(24),
              child: Column(
                mainAxisSize: MainAxisSize.max,
                children: [
                  Padding(
                    padding: EdgeInsetsDirectional.fromSTEB(0, 150, 0, 0),
                    child: Container(
                      width: 100,
                      height: 100,
                      decoration: BoxDecoration(
                        color: FlutterFlowTheme.of(context).secondaryText,
                      ),
                      child: ClipRRect(
                        borderRadius: BorderRadius.circular(90),
                        child: Image.network(
                          'https://th.bing.com/th/id/R.8cdcd5fdf013dcf2922bc99a2347557f?rik=l6tqYz%2f3MsvDMQ&riu=http%3a%2f%2fi4.birminghammail.co.uk%2fincoming%2farticle9032443.ece%2fALTERNATES%2fs1227b%2fclub3.jpg&ehk=BzFIYqP9ejkSEudvlix8JtKuGMM%2b0diJS4ESOUe5Ozo%3d&risl=&pid=ImgRaw&r=0',
                          width: 200,
                          height: 200,
                          fit: BoxFit.cover,
                        ),
                      ),
                    ),
                  ),
                  Text(
                    'InternConnect',
                    style: FlutterFlowTheme.of(context).bodyMedium.override(
                          fontFamily: 'Inter',
                          color: FlutterFlowTheme.of(context).primaryBackground,
                          fontSize: 40,
                          letterSpacing: 0.0,
                          fontWeight: FontWeight.w600,
                        ),
                  ),
                  Text(
                    'Your Gateway to Professional Growth',
                    style: FlutterFlowTheme.of(context).bodyMedium.override(
                          fontFamily: 'Inter',
                          color: FlutterFlowTheme.of(context).primaryBackground,
                          fontSize: 19,
                          letterSpacing: 0.0,
                        ),
                  ),
                  FFButtonWidget(
                    onPressed: ()async{
                               Navigator.pushNamed(context, '/create');    
                                  
                                },
                    text: 'Get Started',
                    options: FFButtonOptions(
                      height: 40,
                      padding: EdgeInsetsDirectional.fromSTEB(16, 0, 16, 0),
                      iconPadding: EdgeInsetsDirectional.fromSTEB(0, 0, 0, 0),
                      color: Color(0x5357636C),
                      textStyle:
                          FlutterFlowTheme.of(context).titleSmall.override(
                                fontFamily: 'Inter Tight',
                                color: Colors.white,
                                fontSize: 24,
                                letterSpacing: 0.0,
                              ),
                      elevation: 0,
                      borderSide: BorderSide(
                        color: FlutterFlowTheme.of(context).primaryBackground,
                        width: 2,
                      ),
                      borderRadius: BorderRadius.circular(16), iconAlignment: IconAlignment.start,
                    ),
                  ),
SizedBox(height: 10), // Add space between buttons
FFButtonWidget(
  onPressed: () async {
    Navigator.pushNamed(context, '/read'); // Navigate to Read Page
  },
  text: 'show Intern',
  options: FFButtonOptions(
    height: 40,
    padding: EdgeInsetsDirectional.fromSTEB(16, 0, 16, 0),
    iconPadding: EdgeInsetsDirectional.fromSTEB(0, 0, 0, 0),
    color: Color(0x5357636C),
    textStyle: FlutterFlowTheme.of(context).titleSmall.override(
          fontFamily: 'Inter Tight',
          color: Colors.white,
          fontSize: 24,
          letterSpacing: 0.0,
        ),
    elevation: 0,
    borderSide: BorderSide(
      color: FlutterFlowTheme.of(context).primaryBackground,
      width: 2,
    ),
    borderRadius: BorderRadius.circular(16),
    iconAlignment: IconAlignment.start,
  ),
),

                ].divide(SizedBox(height: 32)),
                
              ),
            ),
          ),
        ),
      ),
    );
  }
}
