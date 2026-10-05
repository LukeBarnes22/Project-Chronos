# Decisions

## 10/04/2026: Planning Phase

### Native Android Application

- **Decision:** I want it to be a native android application
- **Why:** I dont want to deal with servers or self-hosting and I just want it to store everything locally on my phone
- **Potential Options:** Web-app

---

### Kotlin + Jetpack Compose 

- **Decision:** Kotlin with Jetpack Compose for the UI
- **Why:** More modern way of developing android apps and compose is googles recommended UI toolkit
- **Potential Options:** Java with XML

---

### Room for Database

- **Decision:** Room for local Database
- **Why:** Google recommended wrapper
- **Potential Options:** SQLite or storing files

---

### Bank Transactions

- **Decision:** CSV Import for bank transactions before bank auto import
- **Why:** I don't know how to connect banks just yet and want to make sure features work before I mess with that
- **Potential Options:** Bank connection system from the start

---

### Building Finance On Calendar View From The Start

- **Decision:** Build the finance side first but with a calendar as the design from the start
- **Why:** I don't want to rebuild everything once one part of it works and keep the calendar as the backbone
- **Potential Options:** Do one at a time

---

### Multiple Layouts For Folding Phone

- **Decision:** Design multiple layouts for different aspect ratios
- **Why:** I have a z fold 8 and I want to be able to use the cover and inside screen seamlessly
- **Potential Options:** Auto sizing (stretching to big screen)

---

### Build Desk Display

- **Decision:** Build e-ink display for desk use after the app works
- **Why:** I want to push into embedded systems and this is a great way to do so and make something practical and its low power
- **Potential Options:** No physical device

