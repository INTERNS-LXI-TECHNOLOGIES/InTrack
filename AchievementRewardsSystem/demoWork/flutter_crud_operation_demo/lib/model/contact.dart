class Contact {
  static List<String> usernames = [];
  static List<String> numbers = [];
  static List<String> badgeIds = [];

  static void addContact(String username, String number, String badgeId) {
    usernames.add(username);
    numbers.add(number);
    badgeIds.add(badgeId);
  }
}
