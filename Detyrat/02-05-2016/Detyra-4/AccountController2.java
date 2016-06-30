public class AccountController2
{ private BankReader reader; // input view
// the primary bank-account: model and its output-view:
private BankAccount primary account;
private BankWriter primary writer;
// the secondary bank-account: model and its output-view:
private BankAccount secondary account;
private BankWriter secondary writer;
// fields that remember which model and view are active for transactions:
private BankAccount account;
private BankWriter writer;
// invariant: these fields must belong to the primary or secondary account
/** AccountController2 initializes the bank accounts */
public AccountController2(BankReader r, BankAccount a1, BankWriter w1,
BankAccount a2, BankWriter w2)
{ reader = r;
primary account = a1;
primary writer = w1;
secondary account = a2;
secondary writer = w2;
// start processing with the primary account:
account = primary account;
writer = primary writer;
}
/** resetAccount changes the current account to new account and new writer */
private void resetAccount(BankAccount new account, BankWriter new writer)
{ writer.showTransaction("Inactive"); // deactivate current account
account = new account; // reset the account to the new one
writer = new writer;
writer.showTransaction("Active");
}
public void processTransactions()
   { char command = reader.readCommand("Command (P,S, D,W,Q):");
   if ( command == ’Q’ ) // quit?
   { }
   else { if ( command == ’D’ ) // deposit?
   { int amount = reader.readAmount();
   account.deposit(amount);
   writer.showTransaction("Deposit of $", amount);
   }
   else if ( command == ’W’ ) // withdraw?
   { int amount = reader.readAmount();
   boolean ok = account.withdraw(amount);
   if ( ok )
   { writer.showTransaction("Withdrawal of $", amount); }
   else { writer.showTransaction("Withdrawal invalid", amount); }
   }
   else if ( command == ’P’ ) // work with primary account?
   { resetAccount(primary account, primary writer); }
   else if ( command == ’S’ ) // work with secondary account?
   { resetAccount(secondary account, secondary writer); }
   else { writer.showTransaction("Illegal command"); }
   this.processTransactions(); // send message to self to repeat
   ll}
   }
}