# Project-Chronos

An all-in-one native Android calendar that merges my schedule, bills, finances, and school due dates into one app, with a toggle for each so I can see exactly what I want and nothing else.

Later on, the plan is to build a battery-powered color e-ink display that shows the same information and cycles through the different views.

> **Status:** Early planning. No code yet. This README will change as the project does.

## Why I'm building this

My life is busy with school, a full-time job, friends, and my girlfriend, and I struggle to keep track of everything. I want one app on my phone where my calendar is merged with a finance tracker. No finance app I've tried works for me, and I don't want to pay for something that won't. If everything lives in one place, my days get a lot easier to manage.

## Planned features

- **Calendar** with recurring events and time blocking
- **Bills and paydays** as calendar items, with paid/unpaid tracking and reminders
- **School assignments and due dates**
- **Category toggles** to show or hide Calendar, Bills, School, and more
- **Debt and investment tracking**
- **Transaction import** from my bank, starting with CSV import
- **Foldable-friendly layout** designed for the Samsung Galaxy Z Fold 8, so it works on both the cover screen and the unfolded screen

## Roadmap

1. **App v1:** First Android app with a month view and a layout that adapts to the fold
2. **Recurring items and category toggles:** Bills, school, and normal events
3. **Paid/unpaid tracking and reminders**
4. **CSV import of bank transactions**
5. **Bank auto-import** (if it turns out to be practical)
6. **E-ink display:** A battery-powered color e-ink device that shows the same data

## Tech stack (planned)

- Kotlin and Jetpack Compose
- Room (local SQLite database)
- Android Studio
- Embedded phase: STM32 firmware (details to come)

## Goals

This is a learning project. I'm building it myself to get hands-on with native Android development, and later with low-power embedded firmware. The decisions behind the project are tracked in [`decisions.md`](decisions.md).
