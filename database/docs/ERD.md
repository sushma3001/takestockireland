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
users (1) -------- (1) employee (M) -------- (1) locations
```

## Notes

- Mobile stored as 9 digits, +353 added in app
- Supervisor emp_group is NULL (oversees all areas)
- Crew must have emp_group
```
