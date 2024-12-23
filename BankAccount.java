import java.util.*;
class Account{
String customerName;
int accountNum;
String accountType;
double min;
Account(String customerName,int accountNum,String accountType){
this.customerName = customerName;
this.accountNum = accountNum;
this.accountType = accountType;
}
void showDetails(){
System.out.println("Your name is "+customerName+" and your accountNum is " +accountNum+" your account type is "+accountType);
}
}



class Curacct extends Account{
boolean hasChecqueBook;
double deposit;
double balance;
double withdrawl;
double penalty;
String customerName;
int accountNum;
Curacct(){
this.customerName = super.customerName;
this.accountNum = super.accountNum;
this.penalty = 100;
this.balance = 0;
this.hasChecqueBook = false;
}
void depositMethod(double deposit){
this.balance = this.balance + deposit;
showBalance();
}
void showBalance(){
System.out.println("Your current balance is "+this.balance);
}
void giveChecqueBook(){
if(!hasChecqueBook){
System.out.println("Checqubook has been issued");
hasChecqueBook = true;
}
else {
System.out.println("You already have ChequeBook");
}
}
void getDetails(){
super.showDetails();
}

}


class Savacct extends Account{
double deposit;
double balance;
double withdrawl;
double compInterest;
double penalty;
String customerName;
int accountNum;
Savacct(){
this.customerName = super.customerName;
this.accountNum = super.accountNum;
super.min = 1000;
compInterest = 7; // In percentage
this.balance = 0;
this.penalty = 100; //In percentage
}
void depositMethod(double deposit){
this.balance = this.balance + deposit;
showBalance();
}
void showBalance(){
System.out.println("Your current balance is "+this.balance);
}
void withDrawl(double withdrawl){
this.balance = this.balance - withdrawl;
showBalance();
}
boolean hasMinBalance(){
return this.balance<super.min;
}
void penalty(){
if(!hasMinBalance()){
System.out.println("You don't have min balance");
showBalance();
System.out.println("You have imposed penalty of "+this.penalty);
this.balance = this.balance - this.penalty;
showBalance();
}
return;
}
void compoundInterest(){
if(this.balance>2000){
this.balance = this.balance + (this.balance*this.compoundInterest);
}
}
void getDetails(){
super.showDetails();
}


}


class Bank{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter customer name: ");
String name1= sc.nextLine();
System.out.println("Enter the account type");
String type1 = sc.nextLine();
System.out.println("Enter the account number: ");
int accNo1 = sc.nextInt();
System.out.println("Enter second customer name: ");
String name2 = sc.nextLine();
System.out.println("Enter the account type");
String type2= sc.nextLine();
System.out.println("Enter the account number: ");
int accNo2 = sc.nextInt();
type1 = type1.toLowerCase();
if(type1=="savings"){
Account acc1 = new Account(name1,accNo1,type1);
Savacct s1 = new Savacct();
}
if(type2 == "current"){
Account acc1 = new Account(name1,accNo1,type1);
Curacct c1 = new Curacct();
}


while(true){
System.out.println("Enter 1 to deposit \n Enter 2 to withdraw,");
int op = sc.nextInt();
if(op == 1){
System.out.println("Enter the amount to deposit");
int money = sc.nextInt();
s1.depositMethod(money);
s1.compoundInterest();
} else {
System.out.println("Enter the amount to withdraw");
int withdraw = sc.nextInt();
s1.withDrawl(withdraw);
}
System.out.println("Enter 1 to continue 0 to break");
int cn = sc.nextInt();
if(cn == 1) continue;
else break;
}
}

}
