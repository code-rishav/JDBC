
create table employee  
(  
    fname varchar(15) not null,  
    minit char,  
    Lname varchar(15) not null,  
    SSn char(9)  not null,  
    Bdate Date,  
    Address varchar(30),  
    Sex char,  
    Salary numeric(10,2),  
    Super_SSN char(9),  
    Dno int not null  
);

create table department  
(  
    Dname varchar(15) not null,  
    Dnumber int not null ,  
    Mgr_SSN char(9) not null,  
    Mgr_start_date Date  
);

create table dept_locations 
( 
    Dnumber int not null, 
    Dlocation varchar(15) not null 
);

create table project 
( 
    Pname varchar(15) not null, 
    Pnumber int not null, 
    Plocation varchar(15), 
    Dnum int not null 
);

create table works_on 
( 
    Essn char(9) not null, 
    Pno int not null, 
    Hours Decimal(3,1) not null 
);

create table dependent  
(  
    Essn char(9) not null,  
    Dependent_name varchar(15) not null,  
    Sex char,  
    Bdate Date,  
    Relationship varchar(8)  
);


insert into employee
values 
( 
    'John','B','Smith','123456789',to_date('1965-01-09','yyyy-mm-dd'),'731,Houstan','M','30000','333445555',5 
);

insert into employee 
values 
( 
    'Franklin','T','Wong','333445555',to_date('1955-12-08','yyyy-mm-dd'),'638,Houstan','M','40000','888665555',5 
);

insert into employee
values 
( 
    'Alicia','J','Zelaya','999887777',to_date('1968-01-19','yyyy-mm-dd'),'3321,Spring','F','25000','987654321',4 
);

insert into employee
values 
( 
    'Jennifer','S','Wallace','987654321',to_date('1941-06-20','yyyy-mm-dd'),'291,Bellaire','F','43000','888665555',4 
);

insert into employee 
values 
( 
    'Ramesh','K','Narayan','666884444',to_date('1962-09-15','yyyy-mm-dd'),'975,Humble','M','38000','333445555',5 
);

insert into employee 
values 
( 
    'Joyce','A','English','453453453',to_date('1972-07-31','yyyy-mm-dd'),'5631,Houstan','F','25000','333445555',5 
);

insert into employee 
values 
( 
    'Ahmad','V','Jabbar','987987987',to_date('1969-03-29','yyyy-mm-dd'),'980,Houstan','F','25000','987654321',4 
);

insert into employee 
values 
( 
    'James','E','Borg','888665555',to_date('1937-11-10','yyyy-mm-dd'),'450,Houstan','M','55000',NULL,1 
);

insert into department
values 
( 
    'Research',3,'333445555',to_date('1988-05-02','yyyy-mm-dd') 
);

insert into department 
values 
( 
	'Administration',4,'987654321',to_date('1995-01-01','yyyy-mm-dd') 
);

insert into department 
values 
( 
	'Headquaters',1,'888665555',to_date('1981-06-19','yyyy-mm-dd') 
);

insert into dept_locations 
values 
( 
    1,'Houston' 
);

insert into dept_locations 
values 
( 
    4,'Stafford' 
);

insert into dept_locations 
values 
( 
    5,'Bellaire' 
);

insert into dept_locations 
values 
( 
    5,'Sugarland' 
);

insert into dept_locations 
values 
( 
    5,'Houston' 
);

insert into project 
values 
( 
    'ProdcutX',1,'Bellaire',5 
);

insert into project 
values 
( 
    'ProductY',2,'Sugarland',5 
);

insert into project 
values 
( 
    'ProductZ',3,'Houston',5 
);

insert into project 
values 
( 
    'Computerization',10,'Stafford',4 
);

insert into project 
values 
( 
	'Reorganisation',20,'Houston',1 
);

insert into project 
values 
( 
	'Newbenefits',30,'Stafford',4 
);

insert into works_on 
values 
( 
    '123456789',1,32.5 
);

insert into works_on 
values 
( 
    '123456789',2,7.5 
);

insert into works_on 
values 
( 
    '666884444',3,40 
);

insert into works_on 
values 
( 
    '453453453',1,20.0 
);

insert into works_on 
values 
( 
    '453453453',2,20.0 
);

insert into works_on 
values 
( 
    '333445555',2,10.0 
);

insert into works_on 
values 
( 
    '333445555',3,10.0 
);

insert into works_on 
values 
( 
    '333445555',10,10.0 
);

insert into works_on 
values 
( 
    '333445555',20,10.0 
);

insert into works_on 
values 
( 
    '999887777',30,30.0 
);

insert into works_on 
values 
( 
    '999887777',10,10.0 
);

insert into works_on 
values 
( 
    '999887777',10,35.0 
);

insert into works_on 
values 
( 
    '999887777',30,5.0 
);

insert into works_on 
values 
( 
    '987654321',30,20.0 
);

insert into works_on 
values 
( 
    '987654321',20,15.0 
);

insert into works_on 
values 
( 
    '888665555',20,0 
);

insert into dependent 
values 
( 
    '333445555','Alice','F',to_date('1986-04-05','yyyy-mm-dd'),'Daughter' 
);

insert into dependent 
values 
( 
    '333445555','Theodore','M',to_date('1983-10-05','yyyy-mm-dd'),'Son' 
);

insert into dependent 
values 
( 
    '333445555','Joy','F',to_date('1958-05-03','yyyy-mm-dd'),'Spouse' 
);

insert into dependent 
values 
( 
    '333445555','Abner','M',to_date('1942-02-28','yyyy-mm-dd'),'Spouse' 
);

insert into dependent 
values 
( 
    '123456789','Michael','M',to_date('1988-01-04','yyyy-mm-dd'),'Son' 
);

insert into dependent 
values 
( 
    '123456789','Alice','F',to_date('1988-12-30','yyyy-mm-dd'),'Daughter' 
);

insert into dependent 
values 
( 
    '123456789','Elizabeth','F',to_date('1967-05-05','yyyy-mm-dd'),'Spouse' 
);

