# Calculator Application

## Author
- Aryo Rakatama (221524003)
- Muhamad Mathar Rizqi (221524014)
- Muhammad Rama Nurimani (221524021)

## Overview
This project is a software under test include its unit testing for Software Testing Course in JTK POLBAN, it is simple calculator application built in Java. It provides basic arithmetic operations such as addition, subtraction, multiplication, and division. 

## Features
- Addition, subtraction, multiplication, and division operations. 
- Input within structure `number number operator`
- Input validation to ensure numbers are within a valid range.
- Error handling for invalid inputs and division by zero.
- Interactive console-based user interface.

## Project Structure
```
├── pom.xml                # Maven configuration file
├── README.md              # Project documentation
├── src/                   # Source code directory
│   ├── main/              # Main application source code
│   │   ├── java/          # Java source files
│   │   │   ├── com/
│   │   │   │   ├── calculator/
│   │   │   │   │   ├── Main.java          # Entry point of the application
│   │   │   │   │   ├── components/        # Application components
│   │   │   │   │   │   ├── calculator.java # Calculator logic
│   │   │   │   │   │   ├── display.java    # User interface logic
│   │   │   │   │   │   ├── helper.java     # Helper methods
│   │   │   │   │   │   ├── validator.java  # Input validation logic
├── target/                # Compiled output and build artifacts
│   ├── calculator-1.0-SNAPSHOT.jar # Packaged JAR file
│   ├── classes/           # Compiled class files
│   │   ├── com/
│   │   │   ├── calculator/
│   │   │   │   ├── Main.class          # Compiled Main class
│   │   │   │   ├── components/        # Compiled components
│   │   │   │   │   ├── calculator.class # Compiled Calculator logic
│   │   │   │   │   ├── display.class    # Compiled User interface logic
│   │   │   │   │   ├── helper.class     # Compiled Helper methods
│   │   │   │   │   ├── validator.class  # Compiled Input validation logic
│   ├── generated-sources/ # Generated sources (if any)
│   │   ├── annotations/   # Annotation processing output
│   ├── maven-archiver/    # Maven build metadata
│   │   ├── pom.properties # Build properties
│   ├── maven-status/      # Maven build status
│   │   ├── maven-compiler-plugin/
│   │   │   ├── compile/
│   │   │   │   ├── default-compile/
│   │   │   │   │   ├── createdFiles.lst # List of created files during compilation
│   │   │   │   │   ├── inputFiles.lst   # List of input files for compilation
│   ├── site/              # Maven site reports
│   │   ├── dependencies.html          # Dependency report
│   │   ├── dependency-info.html       # Detailed dependency information
│   │   ├── index.html                 # Maven site index
│   │   ├── plugin-management.html     # Plugin management report
│   │   ├── plugins.html               # Plugins report
│   │   ├── project-info.html          # Project information
│   │   ├── project-reports.html       # Project reports summary
│   │   ├── summary.html               # Build summary
│   │   ├── surefire-report.html       # Test report
│   │   ├── css/                       # CSS files for Maven site
│   │   │   ├── maven-base.css
│   │   │   ├── maven-theme.css
│   │   │   ├── print.css
│   │   │   ├── site.css
│   │   ├── images/                    # Images for Maven site
│   │   │   ├── close.gif
│   │   │   ├── collapsed.gif
│   │   │   ├── expanded.gif
│   │   │   ├── external.png
│   │   │   ├── icon_error_sml.gif
│   │   │   ├── icon_info_sml.gif
│   │   │   ├── icon_success_sml.gif
│   │   │   ├── icon_warning_sml.gif
│   │   │   ├── newwindow.png
│   │   │   ├── logos/                 # Maven logos
│   │   │   │   ├── build-by-maven-black.png
│   │   │   │   ├── build-by-maven-white.png
│   │   │   │   ├── maven-feather.png
```

## How to Run
1. Ensure you have Java 17 or later installed on your system and Maven
2. Clone this repository to your local machine.
   ```
   https://github.com/muhammadrama19/ppl-unit-testing.git
   ```
3. Navigate to the project directory.
   ```
   cd ppl-unit-testing
   ```
4. Compile the project using Maven:
   ```
   mvn clean install
   ```
5. Run the test and get the report:
   ```
   mvn test site
   ```
6. Check on this path below to see the report file
   ```
   target\site\surefire-report.html
   ```
## Dependencies
This project uses the following dependencies:
- JUnit 4.13.2 for unit testing.
- Surefire for reporting
- Maven for Build Tools