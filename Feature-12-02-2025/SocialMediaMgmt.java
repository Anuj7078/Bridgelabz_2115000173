import java.util.*;
class User {
    int userID;
    String name;
    int age;
    List<Integer> friends;
    User next;

    User(int userID, String name, int age) {
        this.userID = userID;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
        this.next = null;
    }
}
class SocialMedia {
    User head;
    SocialMedia() {
        this.head = null;
    }

    void addUser(int userID, String name, int age) {
        User newUser = new User(userID, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }
    void addFriend(int userID1, int userID2) {
        User user1 = findUser(userID1);
        User user2 = findUser(userID2);
        if (user1 != null && user2 != null) {
            user1.friends.add(userID2);
            user2.friends.add(userID1);
        }
    }
    void removeFriend(int userID1, int userID2) {
        User user1 = findUser(userID1);
        User user2 = findUser(userID2);
        if (user1 != null && user2 != null) {
            user1.friends.remove(Integer.valueOf(userID2));
            user2.friends.remove(Integer.valueOf(userID1));
        }
    }
    void findMutualFriends(int userID1, int userID2) {
        User user1 = findUser(userID1);
        User user2 = findUser(userID2);
        if (user1 != null && user2 != null) {
            List<Integer> mutualFriends = new ArrayList<>(user1.friends);
            mutualFriends.retainAll(user2.friends);
            if (!mutualFriends.isEmpty()) {
                System.out.println("******** Mutual Friends ********");
                for (int id : mutualFriends) {
                    System.out.println("User ID: " + id);
                }
            } else {
                System.out.println("No mutual friends found.");
            }
        }
    }
    void displayFriends(int userID) {
        User user = findUser(userID);
        if (user != null) {
            System.out.println("******** Friends of User " + userID + " ********");
            for (int friendID : user.friends) {
                System.out.println("Friend ID: " + friendID);
            }
        }
    }
    void searchUser(int userID) {
        User user = findUser(userID);
        if (user != null) {
            System.out.println("******** User Found ********");
            System.out.println("User ID: " + user.userID);
            System.out.println("Name: " + user.name);
            System.out.println("Age: " + user.age);
        } else {
            System.out.println("User not found.");
        }
    }
    void searchUserByName(String name) {
        User user = head;
        while (user != null) {
            if (user.name.equalsIgnoreCase(name)) {
                System.out.println("******** User Found by Name ********");
                System.out.println("User ID: " + user.userID);
                System.out.println("Name: " + user.name);
                System.out.println("Age: " + user.age);
                return;
            }
            user = user.next;
        }
        System.out.println("User not found by Name.");
    }
    void countFriends(int userID) {
        User user = findUser(userID);
        if (user != null) {
            System.out.println("User ID: " + userID + " has " + user.friends.size() + " friends.");
        }
    }
    User findUser(int userID) {
        User temp = head;
        while (temp != null) {
            if (temp.userID == userID) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    void display() {
        User temp = head;
        while (temp != null) {
            System.out.println("User ID: " + temp.userID);
            System.out.println("Name: " + temp.name);
            System.out.println("Age: " + temp.age);
            System.out.println("Friends: " + temp.friends);
            System.out.println("******** next node ********");
            temp = temp.next;
        }
    }
}
public class SocialMediaMgmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SocialMedia list = new SocialMedia();

        list.addUser(1, "Anuj", 21);
        list.addUser(2, "Aman", 21);
        list.addUser(3, "Chitranshi", 22);
        list.addUser(4, "Chirag", 23);

        list.addFriend(1, 2);
        list.addFriend(1, 3);
        list.addFriend(2, 4);
        list.addFriend(3, 4);

        list.display();

        System.out.println("Enter User ID to search for a user:");
        list.searchUser(sc.nextInt());

        System.out.println("Enter Name to search for a user:");
        list.searchUserByName(sc.next());

        System.out.println("Enter User ID to display friends:");
        list.displayFriends(sc.nextInt());

        System.out.println("Enter two User IDs to find mutual friends:");
        list.findMutualFriends(sc.nextInt(), sc.nextInt());

        System.out.println("Enter User ID to count friends:");
        list.countFriends(sc.nextInt());

        System.out.println("Enter two User IDs to remove friend connection:");
        list.removeFriend(sc.nextInt(), sc.nextInt());

        System.out.println("******** After Removal ********");
        list.display();

        sc.close();
    }
}
