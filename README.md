## CheckMate
<br>

![checkmate](https://github.com/SeungTaeGit/CheckMate/assets/129585999/01393551-8759-4df8-9513-23478778c80e)

- 기본적인 To-do 관리 앱입니다.
- Java 및 Spring Framework Web 개발에서 주로 사용하는 `메소드`, `어노테이션` 등을 학습하기 위한 프로젝트입니다.

#### 개발 기간
2024.02. - 2024.05.
<br>
<br>


### Stacks
---
**Evironment** <br>
<img src="https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&amp;logo=IntelliJ%20IDEA&amp;logoColor=white" alt="IntelliJ_IDEA">
<img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=Git&logoColor=white">   <!-- Git -->
<img src="https://img.shields.io/badge/Github-181717?style=for-the-badge&logo=GitHub&logoColor=white">   <!-- Github -->

**Development** <br>
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=OpenJDK&logoColor=white">   <!-- Java -->
<img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=Spring&logoColor=white">  <!-- Spring -->
<img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">  <!-- Spring boot -->
<br>
<br>


### 사용 설명서
---

  #### 사용자 타입
  `사용자`
  #### 서비스 이용 흐름
  `홈페이지 소개` -> `회원가입 및 로그인(비회원)` -> `리스트 추가 및 관리리`
  #### URL
  ```
  http://3.39.240.104:8080/
  ```
  #### Test ID
  ```
  ID : ST ,  Password : pw
  ```
  #### 기능
  **회원** : `로그인`, `회원가입` <br>
  **To-do List** : `List CREATE (리스트 등록)`, `List READ (전체 조회 및 개별 상세 조회)`, `List UPDATE (수정)`, `List DELETE (삭제)`
<br>
<br>


### 디렉토리 구조
---
```bash
├─.gradle
│  ├─8.5
│  │  ├─checksums
│  │  ├─dependencies-accessors
│  │  ├─executionHistory
│  │  ├─fileChanges
│  │  ├─fileHashes
│  │  └─vcsMetadata
│  ├─buildOutputCleanup
│  └─vcs-1
├─.idea
│  └─modules
├─build
│  ├─classes
│  │  └─java
│  │      └─main
│  │          └─seungtae
│  │              └─first
│  │                  ├─controller
│  │                  ├─list
│  │                  ├─member
│  │                  ├─repository
│  │                  └─Service
│  ├─generated
│  │  └─sources
│  │      ├─annotationProcessor
│  │      │  └─java
│  │      │      └─main
│  │      └─headers
│  │          └─java
│  │              └─main
│  ├─resources
│  │  └─main
│  │      ├─static
│  │      │  ├─css
│  │      │  ├─img
│  │      │  └─js
│  │      └─templates
│  │          ├─list
│  │          ├─member
│  │          └─page
│  └─tmp
│      └─compileJava
│          └─compileTransaction
│              ├─backup-dir
│              └─stash-dir
├─gradle
│  └─wrapper
└─src
    ├─main
    │  ├─java
    │  │  └─seungtae
    │  │      └─first
    │  │          ├─controller
    │  │              ├─BasicController.java
    │  │              ├─ItemController.java
    │  │              ├─LoginController.java
    │  │              └─MemberController.java
    │  │          ├─list
    │  │              └─List.java
    │  │          ├─member
    │  │              ├─LoginForm.java
    │  │              └─Member.java
    │  │          ├─repository
    │  │              ├─ItemRepository.java
    │  │              └─MemberRepository.java
    │  │          ├─Service
    │  │              └─LoginService.java
    │  │          ├─FirstProjectApplication        // Main Thread
    │  │          └─TestData
    │  └─resources
    │      ├─static
    │      │  ├─css
    │      │     ├─basic.css
    │      │     ├─bootstrap.css
    │      │     ├─home.css
    │      │     ├─lists.css
    │      │     └─login.css
    │      │  ├─img
    │      │     ├─background.css
    │      │     └─night.css
    │      │  └─js
    │      │     └─home.js
    │      └─templates
    │         ├─list
    │            ├─edit.html
    │            ├─list.html
    │            ├─lists.html
    │            └─wirteListForm.html
    │          ├─member
    │            ├─loginForm.html
    │            └─signupForm.html
    │          └─page
    │            └─contact.html
    └─test
        └─java
            └─seungtae
                └─first
```

<br>
