# spring-boot

## 1. OpenJDK 설치

1. openjdk 다운로드
   -  https://jdk.java.net/13/ 
2. 원하는 경로에 압축 해제
3. 내 PC - 속성 - 고급 시스템 설정 - 고급 탭 - 환경 변수 클릭
4. 시스템 변수에서 새로 만들기 클릭
   - 변수 이름: JAVA_HOME
   - 변수 값: [압축해제한 디렉토리 경로]
5. 시스템 변수 - 변수 컬럼에서 Path 선택 - 편집 클릭
6. 새로 만들기 클릭 후 아래 경로 입력
   - %JAVA_HOME%\bin
7. 확인 클릭
8. CMD에서 아래 명령 실행
   - java -version

## 2. Eclipse 다운로드 및 설치

1. eclipse 다운로드
   -  https://www.eclipse.org/downloads/packages/ 
2. 원하는 경로에 압축 해제
3. eclipse 실행
4. 상단 메뉴바 - Help - Eclipse Marketplace 클릭
5. Search 탭 - Find에 sts 입력
6. Spring Tools 4 - for Spring Boot (aka Spring Tool Suite 4)의 Install 클릭 후 설치 진행
7. eclipse 재시작
