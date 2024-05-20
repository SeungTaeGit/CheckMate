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


### 클래스 구조
---
#### Java Class
- repository
  - MemberRepository
    > 회원 데이터 저장
    - save
    - update
    - findById
    - findAll
  - ListRepository
    > 리스트 데이터 저장
    - save
    - update
      
- service
  - LoginService
    > 로그인 관련 로직
    - login
  - ListService
    > 리스트 관련 로직
- controller
  - LoginController
  - BasicController
  - MemberController
  - ListController
- testData
  - MemberData
  - ListData
<br>

#### Template
- 

<br>
