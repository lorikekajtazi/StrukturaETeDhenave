public class AccountController
{ private BankReader reader; 
  private BankAccount account1;
  private BankWritter writer1;
  private BankAccount account2;
  private BankWritter writer2;
  private BankAccount account;
  private BankWritter writer;
  public AccountController(BankReader r, BankAccount a, BankWritter w)
  { reader = r;
    account1 = a;
    writer1 = w;
    account2 = a;
    writer2 = w;
    account = account1;
    writer = writer1;
  }
  private void resetAccount(BankAccount new_account, BankWritter new_writer)
  { writer.showTransaction("Inactive"); 
    account = new_account; 
    writer = new_writer;
    writer.showTransaction("Active");
  }
  public void processTransactions()
  { char command = reader.readCommand("Command ( D,W,Q):");
    if ( command == 'Q' ) { }
    else { if ( command == 'D' ) 
    { int amount = reader.readAmount();
      boolean ok = account.deposit(amount);
      writer.showTransaction("Deposit of $", amount);
    }
    else if ( command == 'W' ) 
    { int amount = reader.readAmount();
      boolean ok = account.withdraw(amount);
      if ( ok )
      { writer.showTransaction("Withdrawal of $", amount); }
      else { writer.showTransaction("Withdrawal invalid", amount); }
    }
    this.processTransactions();}
  }
  public void processTransactions1()
  { char command = reader.readCommand("Command ( D,W,Q):");
    if ( command == 'Q' ) { }
    else { if ( command == 'D' ) 
    { int amount = reader.readAmount();
      boolean ok = account.deposit(amount);
      writer.showTransaction("Deposit of $", amount);
    }
    else if ( command == 'W' ) 
    { int amount = reader.readAmount();
      boolean ok = account.withdraw(amount);
      if ( ok )
      { writer.showTransaction("Withdrawal of $", amount); }
        else { writer.showTransaction("Withdrawal invalid", amount); }
      }
    this.processTransactions();}
  }
}