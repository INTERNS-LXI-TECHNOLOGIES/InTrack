import 'package:flutter/material.dart';

void main() {
  runApp(CarWorkshopApp());
}

class CarWorkshopApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Car Workshop',
      theme: ThemeData(
        primarySwatch: Colors.blue,
        visualDensity: VisualDensity.adaptivePlatformDensity,
      ),
      home: WorkshopHomePage(),
    );
  }
}

class WorkshopHomePage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Car Workshop'),
        centerTitle: true,
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          children: [
            Text(
              'Welcome to SpeedyFix!',
              style: TextStyle(fontSize: 24, fontWeight: FontWeight.bold),
            ),
            SizedBox(height: 10),
            Text(
              'Choose a service or view ongoing repairs.',
              style: TextStyle(fontSize: 16, color: Colors.grey[700]),
            ),
            SizedBox(height: 20),
            Expanded(
              child: ListView(
                children: [
                  ServiceCard(
                    icon: Icons.build,
                    title: 'General Repair',
                    description: 'Engine, transmission, brakes, and more.',
                    price: 'Starting at \$150',
                  ),
                  ServiceCard(
                    icon: Icons.oil_barrel,
                    title: 'Oil Change',
                    description: 'High-quality oil change and filter.',
                    price: 'Starting at \$50',
                  ),
                  ServiceCard(
                    icon: Icons.electric_car,
                    title: 'Battery Replacement',
                    description: 'Battery testing and replacement.',
                    price: 'Starting at \$80',
                  ),
                  ServiceCard(
                    icon: Icons.car_repair,
                    title: 'Tire Service',
                    description: 'Tire rotation, balance, and replacement.',
                    price: 'Starting at \$40',
                  ),
                ],
              ),
            ),
          ],
        ),
      ),
      floatingActionButton: FloatingActionButton.extended(
        onPressed: () {
          // Add navigation to booking page here
          Navigator.push(
            context,
            MaterialPageRoute(builder: (context) => BookingPage()),
          );
        },
        label: Text('Book Now'),
        icon: Icon(Icons.calendar_today),
        backgroundColor: Colors.blue,
      ),
      floatingActionButtonLocation: FloatingActionButtonLocation.centerFloat,
    );
  }
}

class ServiceCard extends StatelessWidget {
  final IconData icon;
  final String title;
  final String description;
  final String price;

  ServiceCard({
    required this.icon,
    required this.title,
    required this.description,
    required this.price,
  });

  @override
  Widget build(BuildContext context) {
    return Card(
      elevation: 4,
      shape: RoundedRectangleBorder(
        borderRadius: BorderRadius.circular(12.0),
      ),
      margin: const EdgeInsets.symmetric(vertical: 10.0),
      child: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Row(
          children: [
            Icon(icon, size: 40, color: Colors.blue),
            SizedBox(width: 16),
            Expanded(
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text(
                    title,
                    style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
                  ),
                  SizedBox(height: 5),
                  Text(description),
                  SizedBox(height: 5),
                  Text(
                    price,
                    style: TextStyle(color: Colors.blueAccent),
                  ),
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }
}

class BookingPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Book a Service'),
      ),
      body: Center(
        child: Text(
          'Booking functionality coming soon!',
          style: TextStyle(fontSize: 18, color: Colors.grey[700]),
        ),
      ),
    );
  }
}
