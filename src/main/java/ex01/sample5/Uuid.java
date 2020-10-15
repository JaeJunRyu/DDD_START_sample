package ex01.sample5;

import java.util.UUID;

public class Uuid {

    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();

        final String uuidStr = uuid.toString();

        System.out.println("uuidStr = " + uuidStr);
    }
}
