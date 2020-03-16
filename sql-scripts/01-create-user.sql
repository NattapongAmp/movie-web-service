# Starting with MySQL 8.0.4, the MySQL team changed the 
# default authentication plugin for MySQL server 
# from mysql_native_password to caching_sha2_password.

CREATE USER crudapp IDENTIFIED WITH mysql_native_password BY 'crudapp';

GRANT ALL ON * . * TO 'crudapp'@'localhost';