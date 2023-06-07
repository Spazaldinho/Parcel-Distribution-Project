# Parcel-Distribution-Project
- Language: Java
- Date: Q1 2022
- Level: Grade 12

Parcel Distribution is a Java-based simulation of a conveyor belt system used in a parcel distribution center. It provides a graphical representation of a conveyor belt with moving parcels and various components.

## Features
Conveyor Belt: The main component of the simulation is the conveyor belt, represented by the simpleBelt class. It displays a belt with moving lines and rotating wheels, simulating the movement of parcels.

Parcels: Parcels are objects that move along the conveyor belt, representing packages to be distributed. They are represented by the parcel class and appear as colored polygons. Parcels have different types indicated by their colors (green, yellow, blue), reflecting their destinations or handling requirements.

Scanners: Scanners are components that scan the parcels as they pass by on the conveyor belt, ensuring proper tracking and sorting. Two types of scanners are available: scanner and scanner2. They are represented by polygons of different shapes and colors.

Control: The simulation provides basic control functionality. Pressing the space bar toggles the movement of the conveyor belt, allowing pausing and resuming of the simulation. This control mechanism enables the simulation to be easily managed and observed.

## Usage
To run the Parcel Distribution simulation, follow these steps:

Compile the Java source files using a Java compiler.
Execute the Main class to start the simulation.
The simulation window will open, displaying the conveyor belt and moving parcels.
Press the space bar to pause or resume the movement of the conveyor belt.
Observe the parcels moving along the belt and interacting with the scanners.

## Dependencies
The Parcel Distribution project relies on the following dependencies:

Java Swing: Utilized for creating the graphical user interface (GUI) components and rendering the simulation.
