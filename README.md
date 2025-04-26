# Adventis Dental Management System

A comprehensive dental practice management system designed to streamline appointment scheduling, patient management, and dental practice operations.

## Project Overview

The Adventis Dental Management System is a Java-based application that helps dental practices efficiently manage appointments, patient records, dentists, and surgery locations. The system provides role-based access for dentists, patients, and office managers, ensuring that each user has appropriate permissions and features.

## Features

- **User Authentication & Authorization**: Secure login system with role-based access control
- **Patient Management**: Register, update, and manage patient information
- **Dentist Management**: Track dentist details, specializations, and availability
- **Appointment Scheduling**: Book, reschedule, and cancel appointments
- **Surgery Location Management**: Manage multiple dental surgery locations
- **Payment Tracking**: Monitor appointment payment status
- **Reporting**: Generate reports on appointments, patients, and financial data

## Technology Stack

- **Backend**: Java with Spring Boot
- **Database**: JPA/Hibernate with a relational database
- **Security**: Spring Security for authentication and authorization
- **UI**: (To be continued - Web-based interface or desktop application)

## Entity Model

The system is built around the following core entities:

- **User**: Authentication and role-based access
- **Patient**: Patient personal and medical information
- **Dentist**: Dental professional information and specializations
- **Appointment**: Scheduled appointments linking patients, dentists, and surgeries
- **Surgery**: Physical location information for dental practices
- **Address**: Location details for surgeries and possibly patients

## User Stories

### Patient Role
1. As a patient, I want to register an account so that I can access the dental management system.
2. As a patient, I want to view my upcoming appointments so that I can track my dental care schedule.
3. As a patient, I want to update my personal information so that my records are accurate.
4. As a patient, I want to view my payment status so that I know if I have outstanding balances.

### Dentist Role
1. As a dentist, I want to view my appointments so that I can prepare for upcoming patient visits.
2. As a dentist, I want to see which surgery location I'm assigned to for specific appointments so that I know where to work.
3. As a dentist, I want to view patient information for my scheduled appointments so I can provide appropriate care.

### Office Manager Role
1. As an office manager, I want to register new dentists so that they can be added to the system.
2. As an office manager, I want to register new patients so that they can be added to the system.
3. As an office manager, I want to schedule appointments for patients with dentists at specific surgery locations.
4. As an office manager, I want to view all appointments across all surgeries so that I can manage resources effectively.
5. As an office manager, I want to track payment status of appointments so that I can manage finances.
6. As an office manager, I want to ensure a dentist doesn't have more than 5 appointments in a week to prevent overbooking.
7. As an office manager, I want to be prevented from scheduling appointments for patients with outstanding balances so that payment issues are resolved first.

## Project Scope

### In Scope

- User authentication and role-based access control
- Patient record management
- Dentist profile and specialization management
- Appointment scheduling system
- Surgery location management
- Basic reporting functionality
- Payment status tracking

### Out of Scope (Potential Future Enhancements)

- Integrated billing and payment processing
- Online patient portal for self-service
- Automatic SMS/email notifications
- Integration with dental imaging systems
- Inventory management for dental supplies
- Advanced analytics and business intelligence

  
### Link to Postman apis 
  https://.postman.co/workspace/Personal-Workspace~6ae3f19e-9f91-4dd2-992a-4b4ca7ec382e/collection/22352850-07f68781-a865-4921-ba11-3cc969368b8c?action=share&creator=22352850

## Getting Started

### Prerequisites

- Java JDK 17
- Gradle latest or higher
- MySQL

### Installation

1. Clone the repository:
```
git clone https://github.com/yourusername/adventis-dental-system.git
```

2. Navigate to the project directory:
```
cd adventis-dental-system
```

3. Build the project:
```
.\gradlew clean build
```

4. Configure your database connection in `application.properties`

5. Run the application:


## Development Roadmap

### Phase 1: Core Features
- User authentication system
- Basic entity CRUD operations
- Simple appointment scheduling

### Phase 2: Enhanced Features
- Advanced appointment management
- User role implementation
- Basic reporting

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request
https://adventisdentalmgmtsystem-e3a7hnbxh6bhhccg.canadacentral-01.azurewebsites.net



## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments

- Developed for dental practices seeking efficient management solutions
- Inspired by modern healthcare management systems
- Special thanks to the professors: Professor Obinna Kalu and Professor Bright Varghese
- 
![ER diagram](https://github.com/user-attachments/assets/67d555d5-078e-4801-8ee9-73a9af0c5132)
![Screenshot (1033)](https://github.com/user-attachments/assets/24f5e875-ade4-4f9d-8418-9dfbeb2a5ae5)


![Screenshot (1032)](https://github.com/user-attachments/assets/88451d1f-86e4-4471-a5f5-5544995c84a1)
![Screenshot (1029)](https://github.com/user-attachments/assets/70cfaf45-ab05-49f9-8db3-f7997e5462c3)

![Screenshot (1028)](https://github.com/user-attachments/assets/e4a3236a-220c-42a6-8220-277506cff07f)
![Screenshot (1027)](https://github.com/user-attachments/assets/87324964-b48d-4053-a5e0-05a3ac945217)
![Screenshot (1041)](https://github.com/user-attachments/assets/88bb0adf-cb95-4cde-8451-1b595db65cbc)


![Screenshot (1026)](https://github.com/user-attachments/assets/dd382db9-7d9a-42d0-92a0-cdc1e05a58d5)

![Screenshot (1025)](https://github.com/user-attachments/assets/be77961a-5a94-49d5-a082-d926e07e1c52)

![Screenshot (1024)](https://github.com/user-attachments/assets/ca2687f3-bdaf-49ce-8d77-034cdd3014b8)

![Screenshot (1040)](https://github.com/user-attachments/assets/eaf1f8bc-d4bd-4503-8b8d-dae059621056)
![Screenshot (1039)](https://github.com/user-attachments/assets/2b141168-7913-4f6d-9871-80a89cb5ef0c)
![Screenshot (1037)](https://github.com/user-attachments/assets/70998980-024b-489f-8321-99de4da0fab8)



![Screenshot (1023)](https://github.com/user-attachments/assets/0bd90d41-d0ee-4abc-87ef-6ba50d94527e)

![Screenshot (1022)](https://github.com/user-attachments/assets/33b5294b-718a-4c44-9abc-36be3398842a)


