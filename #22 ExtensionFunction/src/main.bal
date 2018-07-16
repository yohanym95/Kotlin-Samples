import ballerina/io;

import ballerina/io;

function main(string... args) {

    int c=0;
    while ( c != 5) {
        // print options menu to choose from
        io:println("Select operation.");
        io:println("1. Add");
        io:println("2. Subtract");
        io:println("3. Multiply");
        io:println("4. Divide");
        io:println("5. Exit");

        // read user's choice
        string choice = io:readln("Enter choice 1 - 5: ");
        c = check <int>choice;

        if (c == 5) {
            break;
        }

        // Read two numbers from user to be used for calculator operations
        var input1 = io:readln("Enter first number: ");
        float a = check <float>input1;
        var input2 = io:readln("Enter second number: ");
        float b = check <float>input2;

        // Execute calculator operations based on user's choice
        if(c == 1) {
            io:print("Add result: ");
            io:println(add(a, b));
        } else if(c == 2) {
            io:print("Subtract result: ");
            io:println(subtract(a, b));
        } else {
            io:println("Invalid choice");
        }
    }
}
