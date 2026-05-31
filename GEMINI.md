# Habit Tracker AI Directory

Welcome! This file serves as your guide to the most relevant resources for the Habit Tracker project. Use these links and descriptions to understand the requirements, design, and technical standards before generating or modifying code.

## 📋 Requirements & Design
These resources outline how the app should behave and look. They should be "lazy-loaded" (read only when needed).

- **Technical Specs**: [specs/habit-tracker-design.md](file:///Users/jofran.p.duran/AndroidStudioProjects/HabitTracker/specs/habit-tracker-design.md) - Contains the functional requirements and architectural constraints.
- **UI Mock-ups**: [Habit Tracker — Design System & Screens.html](file:///Users/jofran.p.duran/AndroidStudioProjects/HabitTracker/specs/Habit%20Tracker%20—%20Design%20System%20&%20Screens.html) - The definitive source for UI layouts, colors, and spacing. **Always refer to this before generating UI code.**
- **Fonts**: [specs/Fonts/](file:///Users/jofran.p.duran/AndroidStudioProjects/HabitTracker/specs/Fonts/) - Contains **Inter** and **Manrope** fonts used throughout the project.

## 🛠 Android Skills & Guidelines
Follow these skills located in the `skills/` directory to ensure consistency with the project's architecture and best practices.

### 🏛 Core Architecture
- [android-architecture](file:///Users/jofran.p.duran/AndroidStudioProjects/HabitTracker/skills/android-architecture/SKILL.md): Enforces architectural boundaries (Domain, Data, UI) and the "Orchestrator" pattern. Use this for project structure and modularization.
- [android-hilt](file:///Users/jofran.p.duran/AndroidStudioProjects/HabitTracker/skills/android-hilt/SKILL.md): Standards for Dependency Injection. Focuses on `@Binds` vs `@Provides`, scoping, and constructor injection.
- [android-navigation](file:///Users/jofran.p.duran/AndroidStudioProjects/HabitTracker/skills/android-navigation/SKILL.md): Type-safe navigation in Compose using the Orchestrator pattern. Keeps features decoupled from the `NavController`.

### 💻 Presentation & Data
- [android-presentation-mvvm](file:///Users/jofran.p.duran/AndroidStudioProjects/HabitTracker/skills/android-presentation-mvvm/SKILL.md): Standards for the UI layer using MVVM, `UiState`, and `StateFlow`. Emphasizes immutability and side-effect handling.
- [android-data-layer](file:///Users/jofran.p.duran/AndroidStudioProjects/HabitTracker/skills/android-data-layer/SKILL.md): Standards for persistence (Room), repository implementations, and Data-to-Domain mapping using Kotlin's `Result`.

### 🛡 Quality & Tooling
- [android-testing](file:///Users/jofran.p.duran/AndroidStudioProjects/HabitTracker/skills/android-testing/SKILL.md): Guidelines for unit and UI testing.
- [android-error-handling](file:///Users/jofran.p.duran/AndroidStudioProjects/HabitTracker/skills/android-error-handling/SKILL.md): Best practices for managing exceptions and state-based error reporting.
- [android-compose-ui](file:///Users/jofran.p.duran/AndroidStudioProjects/HabitTracker/skills/android-compose-ui/SKILL.md): Jetpack Compose specific UI patterns and components.
- [agp-9-upgrade](file:///Users/jofran.p.duran/AndroidStudioProjects/HabitTracker/skills/agp-9-upgrade/SKILL.md): Context for Android Gradle Plugin 9 specific changes or migrations.

## 🔄 Workflow & Version Control
- **Git Integration**: Every new file created must be automatically added to Git.
- **Commits**: Create meaningful, modular commits for each logical change.

---
> [!TIP]
> Always check `specs/habit-tracker-design.md` for the latest feature roadmap and the HTML mock-up for UI fidelity.
