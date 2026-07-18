CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(50),
    Age NUMBER,
    Balance NUMBER,
    IsVIP VARCHAR2(5)
);

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    InterestRate NUMBER,
    DueDate DATE
);
INSERT INTO Customers VALUES (1, 'Ravi', 65, 15000, 'FALSE');
INSERT INTO Customers VALUES (2, 'Priya', 45, 8000, 'FALSE');
INSERT INTO Customers VALUES (3, 'Kumar', 70, 20000, 'FALSE');

INSERT INTO Loans VALUES (101, 1, 10, SYSDATE + 20);
INSERT INTO Loans VALUES (102, 2, 12, SYSDATE + 50);
INSERT INTO Loans VALUES (103, 3, 11, SYSDATE + 10);

COMMIT;
SELECT * FROM Customers;
SELECT * FROM Loans;

BEGIN
    FOR cust IN (SELECT CustomerID, Age FROM Customers) LOOP
        IF cust.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust.CustomerID;
        END IF;
    END LOOP;

    COMMIT;
END;
/
SELECT * FROM Loans;
BEGIN
    FOR cust IN (SELECT CustomerID, Balance FROM Customers) LOOP
        IF cust.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = cust.CustomerID;
        END IF;
    END LOOP;

    COMMIT;
END;
/
SELECT * FROM Customers;
BEGIN
    FOR loan IN (
        SELECT c.Name, l.DueDate
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID
        WHERE l.DueDate <= SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Dear ' || loan.Name ||
            ', your loan is due on ' || loan.DueDate
        );
    END LOOP;
END;
/