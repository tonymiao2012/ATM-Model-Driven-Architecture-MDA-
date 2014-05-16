ATM-Model-Driven-Architecture-MDA-
==================================

Design three kinds of ATMs with the following OO design patterns: State pattern, Strategy pattern, Abstract factory pattern

There are three ATM components: ATM-1, ATM-2 and ATM-3. The ATM-1 component supports the following operations:
create()
card (int x, string y) 
pin (string x) 
deposit (int d) 
withdraw (int w)
balance ()
lock(string x) 
unlock(string x) 
exit()
// ATM is created
// ATM card is inserted where x is a balance and y is a pin # 
// provides pin #
// deposit amount d
// withdraw amount w
// display the current balance 
// locktheATM,wherexisapin#
// unlock the ATM, where x is pin #
// exit from the ATM
The ATM-2 component supports the following operations:
create()
CARD (float x, int y) 
PIN (int x)
DEPOSIT (float d)
WITHDRAW (float w)
BALANCE ()
EXIT()
// ATM is created
// ATM card is inserted where x is a balance and y is a pin # 
// provides pin #
// deposit amount d
// withdraw amount w
// display the current balance
// exit from the ATM
The ATM-3 component supports the following operations:
create()
card (int x, int y) 
pin (int x) 
deposit (int d)
withdraw (int w)
balance ()
lock()
unlock()
exit()
// ATM is created
// ATM card is inserted where x is a balance and y is a pin # // provides pin #
// deposit amount d
// withdraw amount w
// display the current balance
// lock the ATM
// unlock the ATM
// exit from the ATM

Aspects that vary between three ATM components:
a. Maximum number of times incorrect pin can be entered
b. Minimum balance
c. Display menu(s)
d. Messages, e.g., error messages, etc.
e. Penalties
f. Operation names and signatures
g. Data types
h. etc.
The goal of this project is to design three ATM components using a Model-Driven Architecture (MDA). An executable meta-model, referred to as MDA-EFSM, of ATM components should capture the “generic behavior” of all three ATM components and should be de-coupled from data and implementation details. Notice that in your design there should be ONLY one MDA-EFSM for all three ATM components.In addition, in the Model-Driven Architecture coupling between components should be minimized and cohesion of components should be maximized (components with high cohesion and low coupling between components). The meta-model (MDA-EFSM) used in the Model-Driven architecture should be expressed as an EFSM (Extended Finite State Machine) model. 

In your design you must use the following OO design patterns:
• state pattern
• strategy pattern
• abstract factory pattern
