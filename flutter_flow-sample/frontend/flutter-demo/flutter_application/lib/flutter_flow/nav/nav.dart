
import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutterdemo/widget/create_widget.dart';
import 'package:flutterdemo/widget/update_widget.dart';
import 'package:flutterdemo/widget/read_widget.dart';

//import 'package:provider/provider.dart';
import 'package:go_router/go_router.dart';


import '/flutter_flow/flutter_flow_util.dart';

export 'package:go_router/go_router.dart';
export 'serialization_util.dart';

const kTransitionInfoKey = '__transition_info__';



// Import your CRUD widgets



class AppStateNotifier extends ChangeNotifier {
  AppStateNotifier._();

  static AppStateNotifier? _instance;
  static AppStateNotifier get instance => _instance ??= AppStateNotifier._();

  bool showSplashImage = true;

  void stopShowingSplashImage() {
    showSplashImage = false;
    notifyListeners();
  }
}

// Router setup
GoRouter createRouter(AppStateNotifier appStateNotifier) => GoRouter(
      initialLocation: '/create',
      debugLogDiagnostics: true,
      refreshListenable: appStateNotifier,
      routes: [
        // Create Page
        FFRoute(
          name: 'create',
          path: '/create',
          builder: (context, _) => const CreateWidget(),
        ),
        // Read Page
        FFRoute(
          name: 'read',
          path: '/read',
          builder: (context, _) => const ReadWidget(),
        ),
        // Update Page with Parameter
        FFRoute(
          name: 'update',
          path: '/update/:id',
          builder: (context, state) {
            final id = state.pathParameters['id'];
            return UpdateWidget(id: id);
          },
        ),
        // Delete Page
        



      ].map((r) => r.toRoute(appStateNotifier)).toList(),
    );

extension NavigationExtensions on BuildContext {
  void safePop() {
    if (canPop()) {
      pop();
    } else {
      go('/create'); // Default back to Create page
    }
  }
}

class FFRoute {
  const FFRoute({
    required this.name,
    required this.path,
    required this.builder,
    this.requireAuth = false,
    this.asyncParams = const {},
    this.routes = const [],
  });

  final String name;
  final String path;
  final Widget Function(BuildContext, GoRouterState) builder;
  final bool requireAuth;
  final Map<String, Future<dynamic> Function(String)> asyncParams;
  final List<GoRoute> routes;

  GoRoute toRoute(AppStateNotifier appStateNotifier) => GoRoute(
        name: name,
        path: path,
        pageBuilder: (context, state) {
          final child = builder(context, state);
          return MaterialPage(key: state.pageKey, child: child);
        },
        routes: routes,
      );
}
