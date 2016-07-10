public class AccountManager
{ public static void main(String[] args)
  { BankReader reader = new BankReader();
    char personi = reader.readCommand("A, B apo Bankieri(M)");
    if(personi == 'A')
    { BankAccount account1 = new BankAccount(0);
      BankWritter writer1 = new BankWritter("Llogaria e personit A", account1);
      writer1.showTransaction("Llogaria e personit A");
      AccountController controller = new AccountController(reader, account1, writer1);
      controller.processTransactions();
    }
    else if(personi == 'B')
    { BankAccount account2 = new BankAccount(0);
      BankWritter writer2 = new BankWritter("Llogaria e personit B", account2);
      writer2.showTransaction("Llogaria e personit B");
      AccountController controller1 = new AccountController(reader, account2, writer2);
      controller1.processTransactions1(); 
    }
    else if(personi == 'M')
    { BankAccount account1 = new BankAccount(0);
      BankWritter writer1 = new BankWritter("Llogaria e personit A", account1);
      BankAccount account2 = new BankAccount(0);
      BankWritter writer2 = new BankWritter("Llogaria e personit B", account2);
      char llogaria = reader.readCommand("A apo B");
      if(llogaria == 'A')
      { writer1.showTransaction("Llogaria e personit A");
        AccountController controller = new AccountController(reader, account1, writer1);
        controller.processTransactions();
      }
      else if(llogaria == 'B')
      { writer2.showTransaction("Llogaria e personit B");
        AccountController controller1 = new AccountController(reader, account2, writer2);
        controller1.processTransactions1();
       }
     }
  }
}