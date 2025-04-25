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
8. 
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
mvn clean install
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

### Phase 3: Advanced Features
- Complete reporting system
- Data analytics
- User experience enhancements

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments

- Developed for dental practices seeking efficient management solutions
- Inspired by modern healthcare management systems
- Special thanks to all contributors and testers


![ER diagram.png](..%2FER%20diagram.png)

![Screenshot (1027).png](..%2F..%2F..%2F..%2FPictures%2FScreenshots%2FScreenshot%20%281027%29.png)

![Screenshot (1026).png](..%2F..%2F..%2F..%2FPictures%2FScreenshots%2FScreenshot%20%281026%29.png)
![Screenshot (1025).png](..%2F..%2F..%2F..%2FPictures%2FScreenshots%2FScreenshot%20%281025%29.png)
![Screenshot (1024).png](..%2F..%2F..%2F..%2FPictures%2FScreenshots%2FScreenshot%20%281024%29.png)
![Screenshot (1023).png](..%2F..%2F..%2F..%2FPictures%2FScreenshots%2FScreenshot%20%281023%29.png)
![Screenshot (1022).png](..%2F..%2F..%2F..%2FPictures%2FScreenshots%2FScreenshot%20%281022%29.png)

![Screenshot (1029).png](..%2F..%2F..%2F..%2FPictures%2FScreenshots%2FScreenshot%20%281029%29.png)