# Assignment 3: Bridge Pattern - Board Game Renderer

## Project Overview
This project demonstrates the Bridge Structural Design Pattern by decoupling board game logic (Abstraction) from the rendering engine (Implementor).

## Clean Code Principles Justification
1. **Separation of Concerns:** The `BoardGame` abstraction handles game-specific logic, while `GameRenderer` implementations deal strictly with visual output.
2. **Single Responsibility Principle (SRP):** Classes like `ConsoleRenderer` and `ChessGame` have single, well-defined responsibilities.
3. **Open/Closed Principle (OCP):** New board games or new renderers (e.g., `WebRenderer`) can be added without modifying existing abstract classes or interfaces.
4. **Meaningful Naming:** Interface and class names clearly convey their role in the Bridge architecture (`GameRenderer`, `BoardGame`, `ChessGame`).
5. **Don't Repeat Yourself (DRY):** Common logic for maintaining and updating the renderer reference resides solely in the abstract `BoardGame` class.