import 'package:openapi/model/home_page_model.dart';

import '/flutter_flow/flutter_flow_theme.dart';
import '/flutter_flow/flutter_flow_util.dart';
import '/flutter_flow/flutter_flow_widgets.dart';
import 'package:flutter/material.dart';


class HomePageWidget extends StatefulWidget {
  /// create
  const HomePageWidget({super.key});

  @override
  State<HomePageWidget> createState() => _HomePageWidgetState();
}

class _HomePageWidgetState extends State<HomePageWidget> {
  late HomePageModel _model;

  final scaffoldKey = GlobalKey<ScaffoldState>();

  @override
  void initState() {
    super.initState();
    _model = createModel(context, () => HomePageModel());
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
        appBar: AppBar(
          backgroundColor: Color(0xFF242429),
          automaticallyImplyLeading: false,
          title: Row(
            mainAxisSize: MainAxisSize.max,
            children: [
              Text(
                'CRUD OPERATION',
                style: FlutterFlowTheme.of(context).headlineMedium.override(
                      fontFamily: 'Inter Tight',
                      color: Colors.white,
                      fontSize: 22,
                      letterSpacing: 0.0,
                    ),
              ),
            ],
          ),
          actions: [],
          centerTitle: false,
          elevation: 2,
        ),
        body: SafeArea(
          top: true,
          child: Row(
            mainAxisSize: MainAxisSize.min,
            mainAxisAlignment: MainAxisAlignment.spaceBetween,
            crossAxisAlignment: CrossAxisAlignment.stretch,
            children: [
              Column(
                mainAxisSize: MainAxisSize.max,
                children: [
                  Container(
                    width: 417,
                    height: 104,
                    decoration: BoxDecoration(
                      color: FlutterFlowTheme.of(context).primaryBackground,
                      border: Border.all(
                        color: FlutterFlowTheme.of(context).primary,
                      ),
                    ),
                    child: Column(
                      mainAxisSize: MainAxisSize.max,
                      mainAxisAlignment: MainAxisAlignment.center,
                      crossAxisAlignment: CrossAxisAlignment.center,
                      children: [
                        Text(
                          'create',
                          textAlign: TextAlign.center,
                          style:
                              FlutterFlowTheme.of(context).titleMedium.override(
                                    fontFamily: 'Inter Tight',
                                    color: Color(0xE9121215),
                                    letterSpacing: 0.0,
                                    decoration: TextDecoration.underline,
                                  ),
                        ),
                        Flexible(
                          child: ClipRRect(
                            borderRadius: BorderRadius.circular(6),
                            child: Image.network(
                              'https://cdn-icons-png.flaticon.com/512/5070/5070296.png',
                              width: 107,
                              height: 67,
                              fit: BoxFit.fitHeight,
                            ),
                          ),
                        ),
                      ],
                    ),
                  ),
                  Container(
                    width: 412,
                    height: 87,
                    decoration: BoxDecoration(
                      color: Color(0xFF242429),
                    ),
                    child: Column(
                      mainAxisSize: MainAxisSize.max,
                      children: [
                        Text(
                          'Read',
                          textAlign: TextAlign.center,
                          style:
                              FlutterFlowTheme.of(context).titleMedium.override(
                                    fontFamily: 'Inter Tight',
                                    color: FlutterFlowTheme.of(context)
                                        .primaryBackground,
                                    letterSpacing: 0.0,
                                    decoration: TextDecoration.underline,
                                  ),
                        ),
                        ClipRRect(
                          borderRadius: BorderRadius.circular(8),
                          child: Image.network(
                            'https://cdn-icons-png.flaticon.com/512/1503/1503170.png',
                            width: 200,
                            height: 57,
                            fit: BoxFit.fitHeight,
                          ),
                        ),
                      ],
                    ),
                  ),
                  Container(
                    width: 417,
                    height: 97,
                    decoration: BoxDecoration(
                      color: FlutterFlowTheme.of(context).secondaryBackground,
                      border: Border.all(
                        color: FlutterFlowTheme.of(context).primary,
                      ),
                    ),
                    child: Column(
                      mainAxisSize: MainAxisSize.max,
                      children: [
                        Text(
                          'Update',
                          textAlign: TextAlign.center,
                          style: FlutterFlowTheme.of(context)
                              .titleMedium
                              .override(
                                fontFamily: 'Inter Tight',
                                color: FlutterFlowTheme.of(context).primaryText,
                                letterSpacing: 0.0,
                                decoration: TextDecoration.underline,
                              ),
                        ),
                        ClipRRect(
                          borderRadius: BorderRadius.circular(8),
                          child: Image.network(
                            'https://cdn.icon-icons.com/icons2/2313/PNG/512/transfer_man_employee_user_avatar_arrow_refresh_icon_141997.png',
                            width: 193,
                            height: 62,
                            fit: BoxFit.fitHeight,
                          ),
                        ),
                      ],
                    ),
                  ),
                  Container(
                    width: 415,
                    height: 90,
                    decoration: BoxDecoration(
                      color: Color(0xFF242429),
                    ),
                    child: Column(
                      mainAxisSize: MainAxisSize.max,
                      children: [
                        Text(
                          'Delete',
                          textAlign: TextAlign.center,
                          style:
                              FlutterFlowTheme.of(context).titleMedium.override(
                                    fontFamily: 'Inter Tight',
                                    color: FlutterFlowTheme.of(context)
                                        .primaryBackground,
                                    letterSpacing: 0.0,
                                    decoration: TextDecoration.underline,
                                  ),
                        ),
                        ClipRRect(
                          borderRadius: BorderRadius.only(
                            bottomLeft: Radius.circular(0),
                            bottomRight: Radius.circular(0),
                            topLeft: Radius.circular(0),
                            topRight: Radius.circular(0),
                          ),
                          child: Image.network(
                            'https://cdn-icons-png.flaticon.com/512/2444/2444442.png',
                            width: 66,
                            height: 49,
                            fit: BoxFit.fill,
                          ),
                        ),
                      ],
                    ),
                  ),
                ],
              ),
            ],
          ),
        ),
      ),
    );
  }
}
