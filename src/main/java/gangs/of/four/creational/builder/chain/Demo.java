package gangs.of.four.creational.builder.chain;

public class Demo {

    public static void main(String[] args) {
        Account account = Account.newBuilder()
                .setToken("Hello")
                .setUserId("habr")
                .build();

        System.out.println(account);
    }
}
