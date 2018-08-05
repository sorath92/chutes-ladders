# chutes-ladders
A mock implementation for the Chutes and Ladders game

## Assignment Instructions. 

Assignment
In Java, code a simulation of the classic children’s game “Chutes And Ladders.” There is no “right” answer to
this assignment, we will be evaluating the design choices and coding style.
Instructions
1. Use this document as a business spec
2. Design and develop the business objects only (do not create a GUI)
3. To demonstrate that the software works, write a “main” method that simulates 2 to 4 four players and
generates output similar to the sample below
4. Deliver the final code in .java files and any other resources required to run the program
5. Please indicate in comments or in a separate document any assumptions you make about the
requirements, as well as any “ToDo” items that you would do if this was a “real” project but that are
not in the requirements given.

### Answers

MainClass - chute-ladders/src/com/sovan/main/ChuteAndLadders.java . The main method simultes 2 Players.

### My Sample Output with Two Players. Alpha And Beta

1. beta: 0 --> 2 
2. alpha: 0 --> 4 --LADDER--> 14  
3. beta: 2 --> 7  
4. alpha: 14 --> 16 --CHUTE--> 6  
5. beta: 7 --> 12 
6. alpha: 6 --> 9 --LADDER--> 31 
7. beta: 12 --> 17 
8. alpha: 31 --> 33 
9. beta: 17 --> 19  
10. alpha: 33 --> 35 
11. beta: 19 --> 21 --LADDER--> 42  
12. alpha: 35 --> 37 
13. beta: 42 --> 47 --CHUTE--> 26 
14. alpha: 37 --> 40 
15. beta: 26 --> 29 
16. alpha: 40 --> 45 
17. beta: 29 --> 33 
18. alpha: 45 --> 48  
19. beta: 33 --> 38 
20. alpha: 48 --> 51 --LADDER--> 67 
21. beta: 38 --> 43 
22. alpha: 67 --> 71 --LADDER--> 91 
23. beta: 43 --> 48 
24. alpha: 91 --> 94 
25. beta: 48 --> 54 
26. alpha: 94 --> 99 
27. beta: 54 --> 55 
28. beta: 55 --> 61 
29. beta: 61 --> 65 
30. beta: 65 --> 68 
31. beta: 68 --> 74 
32. alpha: 99 --> 100 
The winner is alpha 

### Todo Items: If this were a real project

1. Would like to add a Multithread execution to enable faster processing of turns for each player. 
2. Allow content Bundling for l10n changes. 
3. Create a rest API for the logic to enable multiple views as in Web, Desktop and Mobile Apps. 
4. Decouple Player from positon to Ensure this player Class can be used for other games like Chess where there is no single position. 
5. Build a GUI ;depending on the requirements. 


