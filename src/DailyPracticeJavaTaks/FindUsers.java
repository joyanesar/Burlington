package DailyPracticeJavaTaks;

public class FindUsers {
    public static void main(String[] args) {
        String[] logs = {"A:1",
                "A:1",
                "A:2",
                "A:3",
                "A:1",
                "B:1",
                "B:1",
                "B:2",
                "B:3",
                "A:3",
                "C:3",
                "C:2",
                "C:1",
                "B:1",
                "C:1"};

        String u1 = "";
        String u2 = "";
        String u3 = "";

        for (int i = 0; i < logs.length; i++) {
            String[] action = logs[i].split(":");
            if (action[1].equals("1")) {
                u1 += action[0];
            } else if (action[1].equals("2")) {
                u2 += action[0];
            } else {
                u3 += action[0];
            }

        }
        if (u1.contains("ABC")) {
            System.out.println("User 1 is experiencing an error");
        }
        if (u2.contains("ABC")) {
            System.out.println("User 2 is experiencing an error");
        }
        if (u3.contains("ABC")) {
            System.out.println("User 3 is experiencing an error");
        }
    }
}