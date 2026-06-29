# 돈워리 (Don't Worry)

근무 관리, 급여 자동 계산, 구인·구직, 커뮤니티 기능을 통합한 **스마트 급여 정산 및 커뮤니티 플랫폼**입니다.

Spring Framework 기반 MVC 구조로 개발하였으며, 아르바이트생과 사업자가 함께 사용할 수 있는 서비스를 목표로 구현했습니다.

---

## 프로젝트 소개

돈워리는 근무 일정 관리와 급여 계산을 중심으로 구인·구직, 커뮤니티, 관리자 기능을 하나의 플랫폼에서 제공하는 웹 서비스입니다.

근무 시간을 캘린더에 등록하면 자동으로 급여를 계산하고, 사업자는 구인 공고를 등록하고 지원자를 관리할 수 있습니다.

---

## 프로젝트 기간

- 2026.03.27 ~ 2026.04.17 (22일)

---

## 팀 구성

|이름|역할|
|---|---|
|홍설아|Project Leader|
|경지민|Frontend|
|임주영|Database|
|표예찬|Backend|

---

## 기술 스택

### Backend

- Java
- Spring Framework (MVC)
- JDBC
- JdbcTemplate

### Frontend

- JSP
- JSTL
- HTML5
- CSS3
- JavaScript
- jQuery

### Database

- Oracle Database

### Library

- FullCalendar
- Toast UI Editor

### Tools

- Eclipse
- Git
- GitHub

---

## 주요 기능

### 회원

- 회원가입 / 로그인
- 이메일 인증
- 비밀번호 찾기
- 회원정보 수정
- 회원 탈퇴

### 마이페이지

- 개인회원 / 기업회원 분리
- 프로필 관리
- 내가 작성한 글 조회
- 북마크 관리
- 이력서 관리
- 지원자 관리

### 근무 관리

- 근무지 등록 / 수정 / 삭제
- FullCalendar 기반 근무 일정 관리
- 근무 내역 조회
- 월별 급여 자동 계산
- 급여명세서 조회

### 구인·구직

- 기업 공고 등록
- 공고 검색
- 지원자 관리

### 커뮤니티

- 게시글 CRUD
- 댓글 / 대댓글
- Toast UI Editor 적용
- 첨부파일

### 고객지원

- 1:1 문의
- FAQ

### 관리자

- 관리자 대시보드
- 회원 관리
- 게시글 관리
- 댓글 관리
- FAQ 관리
- 문의 관리

---

## 담당 역할

- 프로젝트 리더
- 프로젝트 일정 관리
- 요구사항 분석
- 기능 기획
- 급여 계산 로직 설계
- 발표 자료 제작
- Git 협업 및 일정 조율

---

## 프로젝트 구조

```text
src
├── controller
├── service
├── dao
├── dto
├── common
├── resources
└── webapp
    ├── WEB-INF
    ├── css
    ├── js
    └── jsp
```

---

## 주요 구현 내용

- Spring MVC 기반 웹 서비스 구현
- Oracle DB 연동
- JDBC / JdbcTemplate 활용
- FullCalendar를 이용한 근무 일정 관리
- Toast UI Editor 적용
- 이메일 인증 기능
- 관리자 권한 분리
- Git Branch 기반 협업

---

## Trouble Shooting

### Base64 이미지 저장 문제

Toast UI Editor에서 이미지를 Base64로 저장하면서 DB 용량 증가와 페이지 로딩 속도 저하 문제가 발생했습니다.

→ Editor Hook을 이용하여 이미지를 서버에 업로드한 후 URL만 저장하도록 변경하여 성능을 개선했습니다.

---

### CLOB GROUP BY 오류

Oracle에서 CLOB 컬럼을 GROUP BY 하면서 ORA-00932 오류가 발생했습니다.

→ TO_CHAR()를 이용하여 문자열로 변환 후 처리하도록 수정했습니다.

---

### FullCalendar 상세조회 오류

JavaScript 변수 참조 오류(value is not defined)로 상세조회가 실패했습니다.

→ 파라미터와 변수명을 정리하고 null 체크를 추가하여 해결했습니다.

---

### 캐시 보안 문제

로그아웃 후 브라우저 뒤로가기로 이전 페이지 접근이 가능했습니다.

→ Cache-Control 헤더와 세션 검증을 적용하여 해결했습니다.

---

## 프로젝트를 통해 배운 점

- Spring MVC 기반 웹 애플리케이션 개발 경험
- Oracle DB와 JDBC를 활용한 데이터 처리
- FullCalendar와 Toast UI Editor 등 외부 라이브러리 활용
- Git Branch 전략을 이용한 협업 경험
- 실제 서비스 수준의 화면 구성과 데이터 흐름 설계 경험
