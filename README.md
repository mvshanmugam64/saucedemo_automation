# SauceDemo Automation Framework 🚀

Welcome to the **SauceDemo Test Automation Framework**, built with TestNG and enhanced by Extent Reports for professional-grade reporting.  
This project demonstrates robust automation for login scenarios on the [SauceDemo](https://www.saucedemo.com/) website, featuring data-driven testing, storage validation, and a maintainable code structure.

---

## 📁 Project Structure

```
src/
├── main/
│   └── java/
│       └── Pages/                # Page Object classes (e.g., LoginPage.java)
├── test/
│   └── java/
│       ├── commons/              # BaseTest.java (test setup/teardown)
│       ├── Tests/                # Test classes (e.g., LoginTest.java)
│       └── Utils/                # Utilities (ElementUtils, ExtentManager, FileReader)
Properties/
└── config.properties             # Configuration settings
target/
├── Extent/                       # Extent HTML reports
└── screenshots/                  # Test screenshots
pom.xml                           # Maven dependencies
testng.xml                        # TestNG suite file
```

---

## ✨ Features

- **TestNG Framework:** Reliable and scalable test execution.
- **Data-Driven Testing:** Login scenarios powered by DataProviders for comprehensive coverage.
- **Storage Validation:** Ensures correct storage of session and token data after login.
- **Page Object Model (POM):** Clean separation of UI interactions for maintainability.
- **Extent Reports Integration:** Interactive HTML test reports, with screenshots on failure.
- **Utility Classes:** For element actions, reporting, and configuration management.
- **Easy Configuration:** Centralized property management for seamless environment setup.

---

## 🚦 Getting Started

1. **Clone the repository**
   ```bash
   git clone https://github.com/mvshanmugam64/<your-repo>.git
   ```

2. **Install dependencies**
   - Ensure [Java JDK 8+](https://adoptopenjdk.net/) and [Maven](https://maven.apache.org/) are installed.
   - Run:
     ```bash
     mvn clean install
     ```

3. **Configure settings**
   - Edit `Properties/config.properties` for browser type, base URL, credentials, etc.

4. **Run the tests**
   ```bash
   mvn test
   ```
   - Test results and Extent reports will be generated in `target/Extent/`.

---

## 🔑 Login Scenario Highlights

- **Multiple Credentials:** Validates login using diverse user data via TestNG DataProvider.
- **Robust Validation:** Checks for success/error messages and validates session storage.
- **Screenshots on Failure:** Automatically captures screenshots for failed steps.

---

## 📊 Reporting

- **Extent Reports**  
  Interactive HTML reports with pass/fail status, error logs, and screenshots.
  - Location: `target/Extent/`
- **Screenshots**  
  All test screenshots are saved in `target/screenshots/`.

---

## 🛠️ Customization & Extensibility

- Add new pages in `src/main/java/Pages/`
- Create new tests in `src/test/java/Tests/`
- Extend utility classes in `src/test/java/Utils/`
- Update configuration in `Properties/config.properties`
- Integrate with your CI/CD pipeline using Maven and TestNG

---

## 🤝 Contributing

Open to pull requests, issues, and suggestions!  
Feel free to fork, star ⭐, and enhance the framework for your own test needs.

---

## 📄 License

Licensed under the MIT License.

---

## 🙏 Credits

- [TestNG](https://testng.org/)
- [Extent Reports](https://extentreports.com/)
- [Maven](https://maven.apache.org/)
- [SauceDemo](https://www.saucedemo.com/)

---

**Happy Testing!**
