# Java Console Calculator 🧮

A simple, interactive console-based calculator application built with Java for performing basic arithmetic operations with continuous calculation support.

## ✨ Features

- ➕ Basic arithmetic operations (Addition, Subtraction, Multiplication, Division)
- 🔄 **Continuous calculation mode** - perform multiple calculations without restarting
- ⚠️ Error handling for invalid inputs
- 🛡️ Division by zero protection
- 💻 Simple and intuitive command-line interface
- 👤 User-friendly input/output format
- ↩️ Option to continue or exit after each calculation

## 🛠️ Technologies Used

- **Language:** Java ☕
- **Input Handling:** java.util.Scanner 📥
- **JDK Version:** Java 8 or higher recommended 📌

## 📥 Installation

### Prerequisites
- ☕ Java Development Kit (JDK) 8 or higher
- 💻 Any Java IDE (Eclipse, IntelliJ IDEA, NetBeans) or a text editor
- ⌨️ Command line/Terminal access

### Steps

1. **📂 Clone the repository**
git clone https://github.com/Anbuselvan-22/console-calculator.git
cd console-calculator

text

2. **🔨 Compile the Java file**
javac ConsoleCalculator.java

text

3. **▶️ Run the application**
java ConsoleCalculator

text

## 🚀 Usage

1. ▶️ Run the program
2. 1️⃣ Enter the first number when prompted
3. ➗ Choose an operator (+, -, *, /)
4. 2️⃣ Enter the second number
5. 👁️ View the result
6. ❓ Choose whether to continue (y) or exit (n)

### 📋 Example Session:
=== Simple Console Calculator ===

Enter first number: 15
Enter operator (+, -, *, /): +
Enter second number: 25
Result: 40.0

Do you want to continue? (y/n): y

Enter first number: 100
Enter operator (+, -, *, /): /
Enter second number: 4
Result: 25.0

Do you want to continue? (y/n): n
Calculator closed.

text

## 💡 How It Works

The calculator uses a `while` loop to enable continuous calculations:
- 🔄 **Switch-case structure** handles different operators
- ✅ **Input validation** prevents division by zero errors
- 🏁 **Boolean flag** (`continueCalc`) controls the loop execution
- 📝 **Scanner class** handles user input efficiently


## 🔧 Code Highlights

- 🔄 **Continuous Operation**: Unlike basic calculators, this supports multiple calculations in one session
- ⚠️ **Error Handling**: Gracefully handles division by zero and invalid operators
- ✨ **Clean Code**: Well-structured with clear variable names and logic flow
- 🎮 **User Control**: User decides
