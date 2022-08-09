# mreview

## 요구조건

- 한 편의 영화는 여러 회원의 평가가 행해질 수 있다.
- 한 명의 회원은 여러 영화에 대해서 평점을 줄 수 있다.
- 영화 데이터에 파일 업로드를 이용해서 영화의 이미지 파일 등을 업로드 할 수 있을것
- 목록 화면에서 영화의 제목과 이미지 하나, 영화 리뷰의 평점/리뷰 개수를 출력
- 영화 조회 화면에서 영화와 영화의 이미지들, 리뷰의 평균점수/리뷰 개수를 같이 출력
- 리뷰에 대한 정보에는 회원의 이메일이나 닉네임과 같은 정보를 같이 출력
- 조회 화면에서 영화 리뷰를 조회
- 리뷰 등록하거나 수정/삭제가 가능
- 영화의 등록과 수정에는 파일 업로드 기능을 활용해서 영화 포스터 등을 등록할 수 있도록 구성
- 회원은 기존 회원들이 존재한다고 가정하고 데이터베이스에 존재하는 회원들을 이용
- 회원은 특정한 영화 조회 페이지에서 평점과 자신의 감상을 리뷰로 기록
- 조회 화면에서 회원은 자신이 기록한 리뷰의 내용을 수정/삭제할 수 있음
- 리뷰 생성 모달창에 회원의 아이디와 리뷰점수 내용을 입력
- 섬네일을 클릭하면 원본사진이 출력

## 만드는 순서

1. 엔티티 클래스를 만듦(매핑 테이블을 제일 늦게 만듦)
    1. 영화 엔티티
    2. 회원 엔티티
    3. 리뷰 엔티티(매핑테이블)
2. 레포지토리 만들기
    1. 영화 레포지토리 및 더미데이터
    2. 회원 레포지토리 및 더미데이터
    3. 리뷰 레포지토리 및 더미데이터
3. 페이지 데이터 처리
    1. 목록 화면에서 나오는 데이터처리
        1. 영화
        2. 영화이미지
        3. 리뷰의 수
        4. 평점 평균
    2. 조회 화면에서 리뷰 처리
        1. 리뷰 조회
        2. 리뷰 등록
        3. 리뷰 삭제
        4. 리뷰 수정
4. 업로드
    1. 업로드 라이브러리 추가
    2. 업로드 테스트
    3. 업로드 파일 저장
5. 업로드 파일 삭제
    1. 버튼 만들기
    2. 삭제 기능 만들기
6. 등록 페이지 만들기
    1. 업로드를 위한 DTO,서비스계층 제작
    2. 등록 페이지 작성
    3. 사진 삭제 버튼
    4. Submit
        - 목록화면이 안만들어져서 주석
7. 목록 페이지 만들기
    1. DTO, 서비스 계층 제작
    2. 컨트롤러 처리
    3. 내용 출력 처리
    4. 페이지 처리
8. 조회 페이지
    1. 조회페이지 구성
    2. 리뷰 등록
    3. 리뷰 목록
    4. 리뷰 수정/삭제
9. 섬네일 만들면 원본 보이기

## API

![Untitled (1)](https://user-images.githubusercontent.com/97961558/183564163-718c57eb-9cb4-4449-8563-93587337b76c.png)
![Untitled (2)](https://user-images.githubusercontent.com/97961558/183564172-7f5c9cfb-1296-4ae4-bd43-b4101de9d08f.png)

## 깃플로우

- master
- develop
- feature/repository
    - 멤버 레포지토리 생성
    - 영화 레포지토리 생성
    - 리뷰 레포지토리 생성(매핑 테이블)
    - 목록 페이지를 만들어 연결이 잘되있는지 확인
- feature/memberDelete
    - 멤버를 삭제하면 리뷰도 삭제가 되도록 처리
- feature/uploadSetting
    - 파일 업로드 세팅
    - 브라우저에서 업로드
- feature/register
    - 등록화면 만들기
- feature/listPage
    - 목록화면 만들기
- feature/readPage
    - 조회화면 만들기
    - 섬네일누르면 원본파일 출력

![Untitled](https://user-images.githubusercontent.com/97961558/183564114-937f831b-0bf0-4839-b2a2-fc3ba4705420.png)

## 사이드바 변경
![캡처](https://user-images.githubusercontent.com/97961558/183622028-093a953f-9fcf-4818-88cb-e4fde92532a7.PNG)

<pre>
<code>
```
<a onclick="location.href='http://localhost:8080/movie/list' " class="list-group-item list-group-item-action bg-light">Movie List</a>
<a onclick="location.href='http://localhost:8080/movie/register' " class="list-group-item list-group-item-action bg-light">Movie Register</a>
```
</code>
</pre>
-위처럼 코드를 바꿔 링크를 연결시켜줌
