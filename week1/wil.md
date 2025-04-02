#웹
여러 컴퓨터가 거미줄처럼 서로 연결되어 있다.웹 안에서 여러 컴퓨터(서버 , 클라이언트) 가 주거니받거니~ 하는.

## **프로토콜 과 HTTP**
컴퓨터는 정해진 규칙에 따라 데이터를 전송하는데 그 규칙이 바로 프로토콜임.
HTTP를 통해 요청을 보낼 땐 HTTP Method, URL이 필요하다.

HTTP Method :데이터를 다루는 방법 HOW
URL:다룰 데이터의 위치 WHERE

자주 사용하는 HTTP Method
• GET : 데이터를 가져온다. (조회)
• POST : 데이터를 게시한다. (생성)
• PUT : 데이터를 교체한다. (수정)
• PATCH : 데이터를 수정한다. (수정)
• DELETE : 데이터를 삭제한다. (삭제)

### **URL 구조 ** 
https://www.naver.com/news/어쩌구저쩌구
프로토콜 /서버 주소       /서버 속의 데이터 위치.

HTTP 헤더: 통신에 대한 정보 (언제, 누가 ,http 종류)

HTTP바디: 주고 받으려는 데이터 자체(보통 json임)

헤더에 상태코드를 삽입해 요청에 대한 처리결과를 같이 알려줌.

프론트는 화면에 채울 컨텐츠 데이터를 백엔드에게 요청
백엔드는 DB에서 가져온 컨텐츠 데이터를 프론트에게 응답
HTTP를 통해서 주고받음

#### **API**
API: 어플리케이션에서 원하는 기능을 수행하기 위해
어플리케이션과 소통하는 방법(창구)을 정의한 것


=========================================
##### **<API 과제 >**
예시)• 할 일 전체 조회 : GET /todo/list
• 할 일 생성 : POST /todo
• 할 일 수정 : PATCH /todo/{todo_id}
• 할 일 삭제 : DELETE /todo/{todo_id}
• 할 일 체크 : POST /todo/{todo_id}/check
• 할 일 체크해제 : POST /todo/{todo_id}/uncheck

회원가입: POST /user/signin/{user_id}
로그인: POST /user/login
친구 검색: GET /user/search/{user_id}
팔로우: POST /user/{user_id}/follow
언팔: DELETE /user/{user_id}/follow
팔로우 리스트 조회: GET /user/friend_list
친구 할일 조회: GET /user/{user_id}/todos
