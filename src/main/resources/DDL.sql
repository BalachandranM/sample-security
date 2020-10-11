insert into USER (ID, EMAIL, FIRST_NAME, LAST_NAME) values (USER_ID_SEQ.nextval,'mnskbal@gmail.com','Balachandran','Mathiyazhagan');
insert into USER (ID, EMAIL, FIRST_NAME, LAST_NAME) values (USER_ID_SEQ.nextval,'testuser@gmail.com','user','a');

insert into ROLE (ID,ROLE_NAME) values (ROLE_ID_SEQ.nextval,'ADMIN');
insert into ROLE (ID,ROLE_NAME) values (ROLE_ID_SEQ.nextval,'USER');
insert into ROLE (ID,ROLE_NAME) values (ROLE_ID_SEQ.nextval,'PUBLIC');

INSERT INTO USER_ROLES (USERS_ID,ROLES_ID) VALUES(1,1);
INSERT INTO USER_ROLES (USERS_ID,ROLES_ID) VALUES(1,2);

SELECT * FROM USER;
SELECT * FROM ROLE;
SELECT * FROM USER_ROLES;



