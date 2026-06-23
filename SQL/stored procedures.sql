CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(50),
    AccountType VARCHAR2(20),
    Balance NUMBER
);

CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    EmployeeName VARCHAR2(50),
    Department VARCHAR2(30),
    Salary NUMBER
);
INSERT INTO Accounts VALUES (101, 'Ravi', 'Savings', 10000);
INSERT INTO Accounts VALUES (102, 'Priya', 'Savings', 15000);
INSERT INTO Accounts VALUES (103, 'Kumar', 'Current', 8000);

INSERT INTO Employees VALUES (1, 'Arun', 'IT', 50000);
INSERT INTO Employees VALUES (2, 'Divya', 'HR', 45000);
INSERT INTO Employees VALUES (3, 'Vijay', 'IT', 55000);

COMMIT;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'Savings';

    COMMIT;
END;
/

EXEC ProcessMonthlyInterest;
SELECT * FROM Accounts;

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    dept IN VARCHAR2,
    bonusPercent IN NUMBER
)
IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * bonusPercent / 100)
    WHERE Department = dept;

    COMMIT;
END;
/
EXEC UpdateEmployeeBonus('IT', 10);
SELECT * FROM Employees;

CREATE OR REPLACE PROCEDURE TransferFunds(
    sourceAcc IN NUMBER,
    targetAcc IN NUMBER,
    amount IN NUMBER
)
IS
    sourceBalance NUMBER;
BEGIN
    SELECT Balance INTO sourceBalance
    FROM Accounts
    WHERE AccountID = sourceAcc;

    IF sourceBalance >= amount THEN
        UPDATE Accounts
        SET Balance = Balance - amount
        WHERE AccountID = sourceAcc;

        UPDATE Accounts
        SET Balance = Balance + amount
        WHERE AccountID = targetAcc;

        DBMS_OUTPUT.PUT_LINE('Transfer Successful');
        COMMIT;
    ELSE
        DBMS_OUTPUT.PUT_LINE('Insufficient Balance');
    END IF;
END;
/
EXEC TransferFunds(101, 102, 3000);
SELECT * FROM Accounts;