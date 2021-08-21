package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		
		//Account é, agora, uma classe abstrata e não pode ser instanciada
		//O comando a sequir não é válido
		//Account acc1 = new Account(1001, "Alex", 1000.0);
		
		Account acc2 = new SavingAccount(1002, "Maria", 1000.0, 0.01);
		Account acc3 = new BusinessAcount(1003, "Bob", 1000.0, 500.0);
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingAccount(1001, "Alex", 500.0,0.01));
		list.add(new BusinessAcount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAcount(1005, "Ana", 500.0, 500.0));
		
		double sum = 0.0;
		
		//Somando o saldo de todas as contas
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		
		//Impressão usando printf
		System.out.printf("Total balance %.2f%n", sum);
		
		//Depositando R$ 10.00 em cada conta
		for(Account acc : list) {
			acc.deposit(10.0);
		}
		
		//Imprimindo o saldo de caca conta usando printf
		for(Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}

		
	}
}	
