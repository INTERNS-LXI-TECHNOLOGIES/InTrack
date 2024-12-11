import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Control Panel',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: const ControlPanel(),
    );
  }
}

class ControlPanel extends StatefulWidget {
  const ControlPanel({Key? key}) : super(key: key);

  @override
  _ControlPanelState createState() => _ControlPanelState();
}

class _ControlPanelState extends State<ControlPanel>
    with SingleTickerProviderStateMixin {
  final Map<String, List<String>> pomodoros = {
    'Q1': ['Q1A', 'Q1B', 'Q1C', 'Q1D', 'Q1E'],
    'Q2': ['Q2A', 'Q2B', 'Q2C', 'Q2D'],
    'Q3': ['Q3A', 'Q3B', 'Q3C'],
    'Q4': ['Q4A', 'Q4B', 'Q4C', 'Q4D', 'Q4E', 'Q4F'],
  };

  String selectedValve = 'Q1';
  late AnimationController _animationController;
  late Animation<double> _fallAnimation;

  @override
  void initState() {
    super.initState();
    _animationController = AnimationController(
      duration: const Duration(seconds: 1),
      vsync: this,
    );
    _fallAnimation = Tween<double>(begin: -100, end: 0).animate(
      CurvedAnimation(parent: _animationController, curve: Curves.easeOut),
    );
  }

  @override
  void dispose() {
    _animationController.dispose();
    super.dispose();
  }

  void handleValveTurn(String valve) {
    setState(() {
      selectedValve = valve;
    });
    _animationController.reset();
    _animationController.forward();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Control Panel'),
      ),
      body: SingleChildScrollView(
        child: Column(
          children: [
            // Top container displaying Pomodoros
            Container(
              height: 80, // Adjusted for better visibility
              width: double.infinity,
              margin: const EdgeInsets.all(8),
              decoration: BoxDecoration(
                color: Colors.blue[100],
                borderRadius: BorderRadius.circular(8),
                boxShadow: [BoxShadow(color: Colors.black26, blurRadius: 6)],
              ),
              child: Row(
                children: [
                  const Padding(
                    padding: EdgeInsets.all(6.0),
                    child: Text(
                      'Pomodoros:',
                      style:
                          TextStyle(fontWeight: FontWeight.bold, fontSize: 14),
                    ),
                  ),
                  Expanded(
                    child: ListView(
                      scrollDirection: Axis.horizontal,
                      children: pomodoros[selectedValve]!
                          .map((pomodoro) => Container(
                                margin:
                                    const EdgeInsets.symmetric(horizontal: 5),
                                padding: const EdgeInsets.all(6),
                                decoration: BoxDecoration(
                                  color: Colors.blueAccent,
                                  borderRadius: BorderRadius.circular(8),
                                ),
                                child: Center(
                                  child: Text(
                                    pomodoro,
                                    style: const TextStyle(
                                        color: Colors.white, fontSize: 12),
                                  ),
                                ),
                              ))
                          .toList(),
                    ),
                  ),
                ],
              ),
            ),

            // Control panel with valves
            Padding(
              padding:
                  const EdgeInsets.symmetric(horizontal: 8.0, vertical: 16),
              child: Container(
                padding: const EdgeInsets.all(12),
                decoration: BoxDecoration(
                  color: Colors.blue[50],
                  borderRadius: BorderRadius.circular(12),
                  boxShadow: [BoxShadow(color: Colors.black26, blurRadius: 6)],
                ),
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    const Text(
                      'Select Valve:',
                      style:
                          TextStyle(fontWeight: FontWeight.bold, fontSize: 16),
                    ),
                    SizedBox(height: 8),
                    GridView.count(
                      crossAxisCount: 2,
                      shrinkWrap:
                          true, // Allows GridView to take only necessary space
                      padding: const EdgeInsets.all(8),
                      mainAxisSpacing: 8,
                      crossAxisSpacing: 8,
                      children: [
                        buildValve('Q1', Colors.red),
                        buildValve('Q2', Colors.green),
                        buildValve('Q3', Colors.orange),
                        buildValve('Q4', Colors.blue),
                      ],
                    ),
                  ],
                ),
              ),
            ),

            // Bottom container for falling Pomodoros
            AnimatedBuilder(
              animation: _fallAnimation,
              builder: (context, child) {
                return Transform.translate(
                  offset: Offset(0, _fallAnimation.value),
                  child: Container(
                    width: double.infinity,
                    margin: const EdgeInsets.all(8),
                    decoration: BoxDecoration(
                      color: Colors.grey[200],
                      borderRadius: BorderRadius.circular(8),
                      boxShadow: [
                        BoxShadow(color: Colors.black26, blurRadius: 6)
                      ],
                    ),
                    child: Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        const Padding(
                          padding: EdgeInsets.all(6.0),
                          child: Text(
                            'Falling Pomodoros:',
                            style: TextStyle(
                                fontWeight: FontWeight.bold, fontSize: 14),
                          ),
                        ),
                        // Wrap ListView with ConstrainedBox or SizedBox
                        ConstrainedBox(
                          constraints: BoxConstraints(
                              maxHeight: 200), // Add max height constraint
                          child: ListView(
                            children: pomodoros[selectedValve]!
                                .map((pomodoro) => Container(
                                      margin: const EdgeInsets.all(5),
                                      padding: const EdgeInsets.all(8),
                                      decoration: BoxDecoration(
                                        color: Colors.redAccent,
                                        borderRadius: BorderRadius.circular(6),
                                      ),
                                      child: Text(
                                        pomodoro,
                                        style: const TextStyle(
                                            color: Colors.white, fontSize: 12),
                                      ),
                                    ))
                                .toList(),
                          ),
                        ),
                      ],
                    ),
                  ),
                );
              },
            ),
          ],
        ),
      ),
    );
  }

  Widget buildValve(String valve, Color color) {
    return GestureDetector(
      onTap: () => handleValveTurn(valve),
      child: Container(
        decoration: BoxDecoration(
          color: selectedValve == valve
              ? color.withOpacity(0.4)
              : color.withOpacity(0.2),
          border: Border.all(color: color, width: 1.5),
          borderRadius: BorderRadius.circular(8),
        ),
        child: Center(
          child: Text(
            valve,
            style: TextStyle(
              color: selectedValve == valve ? color : color.withOpacity(0.7),
              fontWeight: FontWeight.bold,
              fontSize: 14,
            ),
          ),
        ),
      ),
    );
  }
}
