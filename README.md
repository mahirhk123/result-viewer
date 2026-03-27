# 🎓 Result Viewer

A web application built with **Spring Boot, Thymeleaf, and MySQL** that allows students to securely check their academic results using their **Roll Number and Date of Birth**.

The system retrieves student details and marks from the database and generates a **dynamic marksheet view**.

---

# 🚀 Features

* 🔍 Search result using **Roll Number and Date of Birth**
* 📄 Dynamic **student marksheet generation**
* 📊 Displays **subject-wise marks, grade, and feedback**
* 🧾 Shows **total marks, percentage, and result status**
* 🖨️ **Print marksheet** functionality
* 🖼️ Default **student profile photo support**
* 🎨 Clean and responsive UI built with **Tailwind CSS**
* ⚡ Fast backend using **Spring Boot**

---

# 🛠️ Tech Stack

### Backend

* Java
* Spring Boot
* Spring MVC
* Spring Data JPA
* Hibernate

### Frontend

* Thymeleaf
* Tailwind CSS
* HTML5

### Database

* MySQL

### Tools

* IntelliJ IDEA
* Maven
* Git & GitHub

---

# 📂 Project Structure

src/main/java
├── controller → Handles HTTP requests
├── entity → Database entities (Student, Marks)
├── repository → JPA repositories
├── service → Business logic
└── dto → Request forms

src/main/resources
├── templates → Thymeleaf HTML pages
├── static → CSS, images, JS
└── application.properties

---

# ⚙️ How It Works

1. User enters **Roll Number and Date of Birth** on the result form.
2. The request is sent to the **Spring Boot controller**.
3. The controller fetches student data from the **MySQL database**.
4. Student details and marks are passed to the **Thymeleaf template**.
5. The system dynamically renders the **student marksheet**.

---



---

# ▶️ Run Locally

Clone the repository

```bash
git clone https://github.com/your-username/result-viewer.git
```

Navigate to project

```bash
cd result-viewer
```

Run the application

```bash
mvn spring-boot:run
```

Open in browser

```
http://localhost:8081
```

---

# 📌 Future Improvements

* 📥 Download marksheet as **PDF**
* 📸 Upload and display **student photos**
* 🔐 Add **admin panel to manage results**
* 📊 Generate **result analytics**
* ☁️ Store images using **Cloudinary**

---

# 👨‍💻 Author

**Mahir Hussain**

GitHub: https://github.com/mahirhk123

---

⭐ If you like this project, consider giving it a **star on GitHub**!
