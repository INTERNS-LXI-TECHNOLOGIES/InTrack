//import '/flutter_flow/flutter_flow_theme.dart';
import '/flutter_flow/flutter_flow_util.dart';
//import '/flutter_flow/flutter_flow_widgets.dart';
import 'package:flutterdemo/widget/create_widget.dart' show CreateWidget;
import 'package:flutter/material.dart';
//import 'package:google_fonts/google_fonts.dart';
//import 'package:provider/provider.dart';

class CreateModel extends FlutterFlowModel<CreateWidget> {
  ///  State fields for stateful widgets in this page.

  // State field(s) for Textfield widget.
  FocusNode? textfieldFocusNode1;
  TextEditingController? textfieldTextController1;
  String? Function(BuildContext, String?)? textfieldTextController1Validator;
  // State field(s) for Textfield widget.
  FocusNode? textfieldFocusNode2;
  TextEditingController? textfieldTextController2;
  String? Function(BuildContext, String?)? textfieldTextController2Validator;
  // State field(s) for Textfield widget.
  FocusNode? textfieldFocusNode3;
  TextEditingController? textfieldTextController3;
  String? Function(BuildContext, String?)? textfieldTextController3Validator;

  @override
  void initState(BuildContext context) {}

  @override
  void dispose() {
    textfieldFocusNode1?.dispose();
    textfieldTextController1?.dispose();

    textfieldFocusNode2?.dispose();
    textfieldTextController2?.dispose();

    textfieldFocusNode3?.dispose();
    textfieldTextController3?.dispose();
  }
}
