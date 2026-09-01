package dosw.semana_1;

import java.util.List;

public class Ejercisio05 {


    public static void main(String[] args){
        List<Transaction> transactions = List.of(
                new Transaction("TX-001", 120.50,true),
                new Transaction("tx-002", 350.00, true),
                new Transaction("TX-003", 90.25, false),
                new Transaction("TX-004", 500.00, true)
        );

        boolean hasUnapprovedTransaction = transactions.stream()
                .peek(System.out::println)
                .anyMatch(transaction -> !transaction.isApproved());

        System.out.println(hasUnapprovedTransaction);
    }
}
