# Parcel-Distribution-Project
Language: Java
Final Grade 12 Computer Science project, 2022.

The goal of this assignment was to use the Java Swing graphics library to emulate a package distribution warehouse. 
Key concepts applied:
- Classes and Objects
- Dynamic Graphics with Swing
- Encapsulation
- Polymorphism
- Randomization
- Images
- Files
- Arrays
- Data Structures
- Project management and Top-down design

## Assignment Requirements:
### How the Distribution Center works:
Unsorted parcels enter the distribution center from the left on a conveyor belt. The parcels will pass over a scanner (in the middle of the distribution center) that will identify the parcel. The parcels are identified based on their colour: Blue – International, Green – Domestic and Yellow – Unknown. International parcels will move up from the scanner onto a conveyor belt. Domestic parcels will move right from the scanner on a conveyor belt. Unknown parcels will move down from the scanner on a conveyor belt.
### How the Scanner works:
When a parcel is touching the scanner a red light turns on to indicate that the scanner is working. The result of the scan is displayed as an image in the bottom left corner of the screen. International parcels will display a plane, domestic parcels will display a truck and unknown parcels will display a question mark. The scanned result will remain until the next parcel enters the scanner.
### How the Conveyor belts work:
The conveyor belt bringing the parcel into the Distribution Center has a switch. This switch turns the conveyor belt on and off. When it’s on, the switch is green and the parcels move towards the scanner. When it’s off, the switch is red and the parcels do not move. You can toggle the switch by pressing the spacebar. All the other conveyor belts only run if there are parcels on them.
### Parcel Specs:
There are 20 parcels to be sorted. Their colour is randomly chosen. Their sizes are randomly chosen (height: 20 – 50 pixels, length 20 – 50 pixels, width 10 – 50 pixels). Parcels will be separated by at least 200 pixels.
