# Getting Started

1. MariaDB 설치 및 실행

2. 아래 명령 실행

   ```bash
   mysql -u root -p
   ```

   ```mariadb
   create database hibernate_example;
   
   grant all privileges on hibernate_example.* to 'hibernate'@'localhost' identified by "1234";
   grant all privileges on hibernate_example.* to 'hibernate'@'%' identified by "1234";
   
   exit
   ```

3. application.properties 수정

   ```properties
   spring.jpa.hibernate.ddl-auto=update
   spring.datasource.driverClassName=org.mariadb.jdbc.Driver
   spring.datasource.url=jdbc:mariadb://localhost:3306/hibernate_example
   spring.datasource.username=hibernate
   spring.datasource.password=1234
   ```

4. 테스트

   ```bash
   http://localhost:8080/tier/add?name=test1 #tier 테이블에 생성
   http://localhost:8080/tier/all #tier 테이블 조회
   
   http://localhost:8080/user/add?name=aaa&email=aaa@a.com # user 테이블에 생성
   http://localhost:8080/user/all # user 테이블 조회
   ```

   