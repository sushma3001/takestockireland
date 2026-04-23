# TakeStock Ireland — Workforce Management System

![Java](https://img.shields.io/badge/Java-21-orange?style=flat-square)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5.13-brightgreen?style=flat-square)
![React](https://img.shields.io/badge/React-18-blue?style=flat-square)
![TypeScript](https://img.shields.io/badge/TypeScript-Enabled-3178C6?style=flat-square)
![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=flat-square)
![Spring AI](https://img.shields.io/badge/Spring_AI-Enabled-purple?style=flat-square)
![Docker](https://img.shields.io/badge/Docker-Enabled-2496ED?style=flat-square)
![AWS](https://img.shields.io/badge/AWS-EC2_RDS-FF9900?style=flat-square)
![GitHub Actions](https://img.shields.io/badge/CI/CD-GitHub_Actions-2088FF?style=flat-square)
![Status](https://img.shields.io/badge/Status-In_Progress-yellow?style=flat-square)

---

## 👋 About This Project

I'm Sushmitha, a recent Masters graduate currently working at TakeStock Ireland — one of Ireland's leading retail stocktake providers.

While working here, I noticed something straight away — the entire workforce scheduling process was being handled manually through WhatsApp. The manager would type out rosters, send credentials individually, track availability through messages, and follow up on hours worked — all through a single chat app.

I decided to fix that.

This is a full stack workforce management system I'm building for TakeStock Ireland — replacing the manual WhatsApp workflow with a proper web application. Every feature in this project solves a real problem I've seen firsthand on the job.

---

## 🚨 The Problem

Every week, the admin would:

- Manually type out shift rosters and send them on WhatsApp
- Send login credentials to new staff one by one via WhatsApp
- Chase employees to find out their availability
- Have no record of past shifts, store history, or hours worked
- Manually calculate hours for payroll

This project automates all of that.

---

## ✅ Features

### Admin Side
- **Employee Management** — Add staff, auto-generate credentials, send via WhatsApp automatically
- **Store Management** — Store details, meeting points, stocktake frequency, trip flag
- **Shift Creation** — Cart-style roster builder with availability-filtered crew selection
- **Two Crew Groups** — Floor and Stock Room crew managed separately per shift
- **Trip Management** — Flag shifts as trips when travelling outside Dublin
- **WhatsApp Roster** — Auto-generate and send formatted roster to WhatsApp group
- **Store History** — Full history of every store visit, supervisor, timings and crew
- **View All Shifts** — Filter, search and manage all past and upcoming shifts
- **Edit & Cancel Shifts** — Edit any confirmed shift and auto-resend updated roster
- **Shift Timings** — Supervisor logs start/end time post-shift, admin approves
- **Reports** — Shift reports, employee hours, store visit history, export to PDF/Excel
- **Calendar View** — Monthly view of all scheduled shifts
- **Notifications** — Store due alerts, new employee alerts, shift updates
- **AI Conflict Detection** — Flags if same person is double booked
- **AI Duration Prediction** — Predicts shift duration based on store history (Spring AI)

### User/Employee Side
- **Dashboard** — Next shift, hours this month, quick links
- **Availability Calendar** — Mark availability, morning, evening, trip, holiday
- **My Shifts** — View all assigned shifts with full details and crew list
- **Hours Worked** — Monthly breakdown of approved hours for payroll reference
- **Notifications** — Shift assigned, updated, cancelled with full roster details
- **Chat with Admin** — Direct messaging with the manager
- **Profile** — View personal details

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|-----------|
| Backend | Java 21, Spring Boot 3.5.13 |
| Frontend | React 18, TypeScript, Tailwind CSS |
| Database | MySQL 8.0, Hibernate / JPA |
| Security | Spring Security, JWT |
| AI | Spring AI |
| Testing | JUnit 5, Mockito |
| Containerization | Docker |
| Cloud | AWS (EC2, RDS) |
| CI/CD | GitHub Actions |
| Version Control | Git & GitHub |
| API Testing | Postman |
| Project Management | Agile / Scrum |

---

## 🏗️ Architecture

```
React Frontend (TypeScript + Tailwind CSS)
              ↓
        REST API Layer
       (Spring Boot 3.x)
              ↓
       Service Layer
      (Business Logic)
              ↓
      Repository Layer
       (JPA/Hibernate)
              ↓
       MySQL Database
```

---

## 📁 Project Structure

```
takestockireland/
├── backend/                          # Spring Boot application
│   └── src/main/java/com/takestock/takestockireland/
│       ├── controller/               # REST API endpoints
│       ├── service/                  # Business logic
│       ├── repository/               # Database access
│       ├── entity/                   # JPA entities
│       └── dto/                      # Data transfer objects
│
├── database/                         # SQL schema & seed data
│   ├── schema/
│   └── seed/
│
└── README.md
```

---

## 📚 Key Concepts Used

```
Backend:
→ OOP Principles
→ Design Patterns (MVC, Singleton, Builder)
→ Java 8+ (Streams, Lambda, Optional)
→ RESTful API Design
→ JWT Authentication
→ Spring Security
→ Dependency Injection & IOC

Frontend:
→ React Hooks
→ Component Based Architecture
→ TypeScript
→ Axios (API Integration)

Database:
→ Relational Database Design
→ ER Diagram
→ JPA Relationships
→ SQL Queries & Joins

DevOps:
→ Docker Containerization
→ AWS EC2 & RDS
→ GitHub Actions CI/CD Pipeline
→ Linux Basics
```

---

## 🚀 Project Status

| Phase | Status |
|-------|--------|
| Planning & Requirements | ✅ Complete |
| Database Design | ✅ Complete |
| Backend — User Module | ✅ Complete |
| Backend — Location Module | ✅ Complete |
| Backend — Employee Module | ✅ Complete |
| Backend — Full CRUD (UPDATE, DELETE) | 🔄 In Progress |
| Input Validation & Exception Handling | ⏳ Upcoming |
| Spring Security + JWT Authentication | ⏳ Upcoming |
| Frontend Development | ⏳ Upcoming |
| AI Integration | ⏳ Upcoming |
| Docker Setup | ⏳ Upcoming |
| AWS Deployment | ⏳ Upcoming |
| CI/CD Pipeline | ⏳ Upcoming |
| Testing | ⏳ Upcoming |

---

## 📡 API Endpoints (Currently Available)

### Users
```
GET    /api/users          List all users
GET    /api/users/{id}     Get user by ID
POST   /api/users          Create new user
```

### Locations
```
GET    /api/locations        List all locations
GET    /api/locations/{id}   Get location by ID
POST   /api/locations        Create new location
```

### Employees
```
GET    /api/employees        List all employees
GET    /api/employees/{id}   Get employee by ID
POST   /api/employees        Create new employee
```

---

## 💡 What I'm Learning

This project is pushing me to think like a real developer — not just writing code but planning architecture, designing databases, thinking about user experience and solving actual business problems.

Building something that's being used by a real Irish company makes every feature feel meaningful. My goal is to use this project to land a full time Java Full Stack role in Ireland.

---

## 📸 Screenshots

*Coming soon as features are built...*

---

## 🔗 Live Demo

🚧 Coming soon...

---

## ⚙️ How to Run Locally

```bash
# Clone the repository
git clone https://github.com/sushma3001/takestockireland.git
cd takestockireland

# Set up database (MySQL must be running)
mysql -u root -p < database/init.sql

# Backend
cd backend
cp src/main/resources/application.properties.example src/main/resources/application.properties
# Edit application.properties with your MySQL password
./mvnw spring-boot:run

# Frontend (coming soon)
cd frontend
npm install
npm start
```

---

## 📬 Contact

**Sushmitha VS**
📧 sushmithasridhar@gmail.com
🐙 [github.com/sushma3001](https://github.com/sushma3001)

---

*Built with purpose. Solving a real problem. One commit at a time. 🚀*
