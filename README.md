## CheckMate
<br>

### 서비스 소개
---
<br>


### 사용 설명서
---

  #### 사용자 타입
  `사용자`, `서버 관리자`
  #### 서비스 이용 흐름
  `홈페이지 소개` -> `회원가입 및 로그인(비회원)` -> `리스트 추가 및 확인`
  #### 페이지
  `메인(HOME)`, `로그인`, `회원가입`, `리스트 페이지`, `리스트 추가 페이지`, `마이 페이지`, `관리자 페이지(로그)`
  #### 기능
  **회원** : `로그인`, `회원가입` <br>
  **To-do List** : `List 등록(및 등록 성공 상세 페이지)`, `List 전체 확인(및 개별 페이지)` <br>
  **관리자** : `로그`, `회원 관리`, `List 전체 관리` <br>
  #### 참고 자료
<br>


### 관리자 페이지
---
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
