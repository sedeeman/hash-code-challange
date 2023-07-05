# hash-code-challange

In this example, I'll be using HashSets as fields, and I'll use the Scanner class, which I've used many times before, always passing System.in to the constructor.
I'll be using Scanner with just a String passed to the constructor. 
It works similarly.  If you want to see this in action, be sure to follow along.   
Eventually I'll cover reading input from files, although this code won't be doing that.
Using scanner this way, gives you a taste for a way to do this.
Again the purpose of having a separate video here, to set up a bit of code, is to keep the new topic material more on point later.

This last constructor should do the following:
Add the email argument to the emails set, if email is not null.
Transform the phone argument, a long, (if it's not zero), to a string in the format (123) 456-7890, for example.
Add the transformed phone to the phones set.
Finally, include a method called mergeContactData, that takes a contact, and returns a new Contact instance, which merges the current instance with the Contact passed.

<img width="350" alt="image" src="https://github.com/sedeeman/hash-code-challange/assets/119731054/e11c22e6-6a66-44a0-ac0e-7c1fe293bc66">

The ContactData class is going to emulate getting data from an external source, but instead of an external source, I just want you to set this data up with two different text blocks, in the format shown on this slide.
This data purposely has duplicates.

<img width="350" alt="image" src="https://github.com/sedeeman/hash-code-challange/assets/119731054/af1e73f2-1fc4-462f-9c76-675b7d58e549">

Create a Method named getData, that takes a String type (either “phone” or “email”), and returns a List of Contact.
