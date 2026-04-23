# ERD - Authentication and Employee

## Tables

- users (login credentials)
- locations (cities)
- employee (work details)

## Relationships

- users to employee: 1:1
- locations to employee: 1:M

## Diagram

```
┌──────────────────┐
│     users        │
├──────────────────┤
│ 🔑 user_id       │
│    username      │─── UNIQUE
│    password      │
│    role          │─── ADMIN / EMPLOYEE
│    is_active     │
│    created_at    │
└──────────────────┘
         │
         │ 1:1
         │
         ▼
┌──────────────────┐      ┌──────────────────┐
│    employee      │      │    locations     │
├──────────────────┤      ├──────────────────┤
│ 🔑 employee_id   │      │ 🔑 location_id   │
│ 🔗 user_id       │      │    city          │─── UNIQUE
│    name          │      │    country       │
│    initials      │──────│                  │
│    mobile        │ M:1  └──────────────────┘
│ 🔗 location_id   │
│    emp_group     │─── FLOOR / STOCK_ROOM / DELI
│    role          │─── SUPERVISOR / CREW
│    date_of_joining│
└──────────────────┘
```

## Legend

- 🔑 Primary Key
- 🔗 Foreign Key
- UNIQUE means no duplicate values allowed

## Notes

- Mobile stored as 9 digits, +353 added in app layer
- Supervisor emp_group is NULL (oversees all areas)
- Crew must have emp_group (FLOOR, STOCK_ROOM, or DELI)
- Username in users is the initials (SVS, BTV)
