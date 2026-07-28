# Chapter 7: Object-Oriented Design (OOD)

## Easy Explanation
OOD questions ask you to design a system (like a parking lot, a deck of cards, or an elevator system) using classes and objects — the same way you'd model real-world things in code.

## Why It Matters
These questions test whether you can translate a vague, real-world problem into clean, extensible code structure — a core skill for real software engineering, not just algorithms.

## Step-by-Step Approach
1. **Handle Ambiguity** — Ask clarifying questions. ("Is this a small parking garage or a huge stadium lot? Multiple levels?")
2. **Define the Core Objects** — What are the "nouns" in the problem? (Car, ParkingSpot, Level, Ticket)
3. **Analyze Relationships** — Does a Level "have many" Spots? Does a Car "is-a" Vehicle?
4. **Investigate Actions** — What do these objects *do*? (park(), removeVehicle(), findSpot())

## Core OOP Concepts (quick refresher)
- **Encapsulation**: Keep an object's internal data private; expose behavior through methods.
- **Inheritance**: A subclass ("Motorcycle") inherits behavior from a parent class ("Vehicle").
- **Polymorphism**: Different classes can be used through the same interface (`vehicle.park()` works whether it's a Car or Truck).
- **Abstraction**: Hide complex implementation details behind a simple interface.
- **Design Patterns worth knowing**:
  - **Singleton**: Ensure only one instance of a class exists (e.g., one global settings object).
  - **Factory**: A method that creates objects without exposing the exact creation logic.
  - **Observer**: Objects "subscribe" to be notified when another object changes state.

## Classic Design Problems

### 1. Deck of Cards
**Easy idea:** Classes: `Card`, `Suit` (enum), `Deck` (holds a list of Cards, can shuffle/deal), `Hand`, `Game` (subclassed per game type like Blackjack).

### 2. Parking Lot
**Easy idea:** Classes: `ParkingLot` (has many `Level`s), `Level` (has many `ParkingSpot`s), `Vehicle` (base class for Car/Motorcycle/Bus), `ParkingSpot` (knows its size and if occupied).

### 3. Chess Game
**Easy idea:** Classes: `Board`, `Piece` (base class, subclassed into Pawn/Knight/etc. — polymorphism handles each piece's unique `move()` rules), `Player`, `Game` (manages turns and check/checkmate logic).

### 4. Online Book Reader / Jukebox / Elevator system
**Easy idea:** Same general recipe: identify the physical or logical "things" involved, model each as a class, and figure out which class "owns" which behavior.

## Practice Tip
Don't over-engineer with too many classes on a whiteboard. Focus on 4–6 core classes and their relationships — depth over breadth.
