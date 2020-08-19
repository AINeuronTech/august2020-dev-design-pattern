package design.pattern;

import design.pattern.builder.BankAccount;

public class BuilderDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount.BankAccountBuilder("John Doe", "7652421")
                .withEmail("jon.doe@test.com")
                .wantNewsletter(true)
                .build();
        System.out.println(" Bank Account owner =" + bankAccount.getName()+"has email =" + bankAccount.getEmail());


    }
}
