CREATE TABLE Orders(orderNumber number(5) NOT NULL,paymentState VARCHAR(12),creationTime DATE,totalAmount number(5),PRIMARY KEY (orderNumber)
);

CREATE TABLE Customers(custId number(5)NOT NULL,cname VARCHAR(20),phone VARCHAR(20),PRIMARY KEY(custId));

CREATE TABLE Products(prodId number(5) NOT NULL,pname VARCHAR(20),price number(5),PRIMARY KEY(prodId));

CREATE TABLE OrderDetail(orderNumber number(5) NOT NULL,prodId number(5) NOT NULL,
			FOREIGN KEY(orderNumber) REFERENCES Orders(orderNumber),
			FOREIGN KEY(prodId) REFERENCES Products(prodId));

insert into Products values(101,'Watch',2000);
insert into Products values(102,'Laptop',40000);
insert into Products values(103,'Mobile',8000);
insert into Products values(104,'Teddy',1000);
insert into Products values(105,'Dress',1500);

select * from Products;

insert into Customers values(11,'Priya',9876543210);
insert into Customers values(12,'Shiva',8765432109);
insert into Customers values(13,'Lalitha',7654321098);
insert into Customers values(14,'Prem',9874563210);
insert into Customers values(15,'Vivek',98765432211);

select * from Customers;

alter table Orders add custId number(5) NOT NULL;
alter table Orders add constraint fk_cust_orders FOREIGN KEY(custId) REFERENCES Customers(custId);

insert into Orders values(1,'Success','15-05-2022',2000,11);
insert into Orders values(2,'Success','15-01-2023',40000,11);
insert into Orders values(3,'Failed','11-07-2022',5000,12);
insert into Orders values(4,'Failed','07-09-2022',6000,14);
insert into Orders values(5,'Success','21-03-2021',4000,15);

select * from Orders;

insert into OrderDetail values(1,101);
insert into OrderDetail values(1,102);
insert into OrderDetail values(2,101);
insert into OrderDetail values(3,102);
insert into OrderDetail values(4,104);
insert into OrderDetail values(5,105);

select * from OrderDetail;




