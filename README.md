# 개발, 빌드환경 (Window 10 Home 기반)

## JDK 13.0.2 다운로드
- https://www.oracle.com/java/technologies/javase-jdk13-downloads.html
- JDK_PATH 시스템 환경변수 지정

## Spring Tools 다운로드
- https://spring.io/tools

## 빌드
- Spring Tool Suit 내의 File -> import -> General -> Existing Projects into Workspace -> Select archive file 로 첨부 Rest.zip 파일 선택, 프로젝트 선택 후 finish
- 프로젝트 우클릭 -> Export  -> WAR file -> 파일 생성 (파일명:ROOT.war)

</br>

# 실행환경

## Docker Toolbox 다운로드 및 설치 
- https://docs.docker.com/toolbox/overview/
- 모든 구성요소를 설치한다.
- Docker Toolbox 설치 폴더 내 첨부된 war파일을 복사해둔다.

## Docker Terminal 실행
- Docker Quickstart Terminal 을 실행. 혹시나 bash를 찾거든 git bash 설치 경로를 지정.
이후 입력은 터미널에서 수행.

## 이미지 다운로드
$ docker pull tomcat:8

## 컨테이너 생성 및 실행 
$ docker run -d -it -p 8080:8080 --name nice tomcat:8

## WAR파일 전송
$ docker cp ROOT.war nice:/usr/local/tomcat/webapps/

</br>

# 테스트

## 프론트 화면으로 테스트

### WAR파일 전송 20초 정도 후에 브라우저에서 localhost:8080 접속
- 여기서 접속이 안되면 일단 포트포워딩 설정을 한다. 
Oracle VM VirtualBox 실행 -> 설정 -> 네트워크 -> 고급 -> 포트포워딩의 새로운 규칙에 '호스트포트'와 '게스트포트' 에 8080 을 입력하고 IP는 비운 후 확인
- 그래도 안되면 방화벽 설정을 한다.
윈도우 설정-> 시스템 및 보안 -> Windows Defender 방화벽 -> 고급설정 -> 인바운드 규칙, 아웃바운드 규칙 각각 새규칙으로 8080포트를 등록한다.

### 시나리오
1. 셀렉터에서 auth 를 선택하여 execute 하여 JWT token 값 받아옴
2. 데이터를 적재하기 위해 셀렉터에서 load data로 이동후, (1) 에서 받아온 token 값을 복사하여 Input token 텍스트 영역에 붙여넣고, 건축데이터 민간개방 시스템 다운로드.json 의 내용을 아래 텍스트 영역에 붙여넣은 후 execute.
3. (2) 에서 로드한 데이터들을 조회하기 위해 셀렉터에서 get dat로 이동후, (1)에서 받아온 token 값을 복사하여 Input token 텍스트 영역에 붙여넣고 execute.


## 배치 파일로 테스트
- Docker Toolbox 설치 폴더 내 첨부된 Json data파일(파일명을 data.json으로 변경), 배치파일, setenv 복사.
- Docker Quickstart Terminal 을 실행.

### 시나리오
1. 인증 배치파일 수행 </br>
$ ./authBatch.sh </br>
$ cat token.json

2. 적재 배치파일 수행 </br>
$ ./loadBatch.sh </br>
$ cat loadResult.json </br>
  혹시나 Heap memory 에러가 발생하면 jvm 옵션을 수정하기 위해 아래 구문 수행</br>
$ docker cp setenv.sh nice:/usr/local/tomcat/bin/setenv.sh

3. 불러오기 배치파일 수행 </br>
$ ./getBatch.sh </br>
$ cat getResult.json