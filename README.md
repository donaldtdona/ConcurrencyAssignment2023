# ConcurrencyAssignment2023
The assignment entails producing a Java simulation of a club, ensuring that it follows defined behavioral rules. In this simulation, a club is represented as a grid of a specified size, containing an entrance door, an exit door, a dance area and a bar. 
Certainly, here's an updated README file that includes instructions on using the provided Makefile:

---

# Club Simulation Program

This is a multi-threaded simulation program that simulates a club environment where patrons interact with various constraints. The simulation enforces rules such as maximum patron limits, waiting queues, and entrance access. The program is implemented in Java and utilizes multiple threads to achieve the simulation.

## Compiling and Running the Program

### Using the Makefile (Recommended)

1. **Compile and Run:**
   Open a terminal or command prompt and navigate to the root directory of the program. Use the following command to compile and run the program using the provided Makefile:

   ```bash
   make run
   ```

   The program will start running, and a graphical user interface (GUI) window will appear, showing the simulation animation.

### Manual Compilation and Running

1. **Compile the Code:**
   Open a terminal or command prompt and navigate to the root directory of the program. Use the following command to compile the program:

   ```bash
   make
   ```

2. **Run the Program:**
   After successful compilation, use the following command to run the program:

   ```bash
   make run
   ```
3. **Run the Program with different arguments:**
   After successful compilation, use the following command to run the program on a bigger grid(20x20), 50 noClubgoers and 15 people allowed inside the club:

   ```bash
   make run
   ```

   The program will start running, and a graphical user interface (GUI) window will appear, showing the simulation animation.

## Using Command Line Arguments

You can provide command line arguments to customize the simulation. The available arguments are:

- `noClubgoers`: Total number of people to enter the club.
- `gridX`: Number of X grid cells in the club.
- `gridY`: Number of Y grid cells in the club.
- `max`: Maximum number of people allowed inside the club.

Example of running the program with command line arguments:

```bash
java -cp bin ClubSimulation 20 10 10 5
```

## GUI Controls

The GUI window displays the simulation animation along with control buttons:

- **Start:** Pressing the "Start" button will initiate the simulation, and the animation will begin.
- **Pause:** Pressing the "Pause" button will pause the simulation. Pressing it again will resume the simulation.
- **Quit:** Pressing the "Quit" button will exit the program.

## Simulation Behavior

- Patrons enter the club and must adhere to the maximum patron limit.
- Patrons wait if the club limit is reached or the entrance door is occupied.
- Patrons may leave the club.

## Exiting the Program

To exit the program, simply close the GUI window or press the "Quit" button.

## Important Note

This simulation involves multiple threads and graphical components. While the program aims to simulate the described behavior, it may vary based on system performance and thread execution.
