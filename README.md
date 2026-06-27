# Java Shapes OOP Project
A Java Object-Oriented Programming project that calculates the **total area** of geometric shapes (**Circle** and **Cube**).

## Features
- **OOP design** using interface, abstract classes, and inheritance
- **Three input methods:**
  1. From file (`input.txt`)
  2. From command line arguments
  3. Using GUI (Swing)
- Validates user input (positive numbers, valid shape types)
- Outputs the result as: `Sum of shapes: <value>`

- ## OOP Structure
- Drawable (interface) └── Shape (abstract class) ├── Circle └── ThreeDShape (abstract class) └── Cube
  
| Class | Description |
|-------|-------------|
| `Drawable` | Interface with `HowToDraw()` |
| `Shape` | Abstract base class (color, date, area, perimeter) |
| `Circle` | 2D circle — area = π × r² |
| `ThreeDShape` | Abstract 3D shape with volume |
| `Cube` | 3D cube — surface area = 6 × side² |

## Requirements
- Java JDK 8 or higher
- IDE to run the project

## How the Project works
after running it you will choose one way:
1. input file -> you will put the input int file "input.txt" and the program create file "output.txt" - if it not created - and put the answer in it
2. Command Line Interface
3. GUI of the Program
