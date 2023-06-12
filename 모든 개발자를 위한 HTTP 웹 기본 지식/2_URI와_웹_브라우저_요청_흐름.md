# 2. URI와 웹 브라우저 요청 흐름
### 2.1. URI
- URI(Uniform Resource Identifier) : URL + URL  
- URL(Uniform Resource Locator) : 리소스가 있는 위치를 지정   
- URN(Uniform Resource Identifier) : 리소스에 이름을 부여  
![uri.png](img/uri.png)

URI 구성 요소  
https://www.google.com:443/search?q=hello&hl=ko 를 예로 들면  
- scheme : https
- host : www.google.com
- port : 443
- path : /search
- query : ?q=hello&hl=ko
- fragment : html 내부 북마크 등에 사용되고 서버에 전송하는 정보는 아니다. 

### 2.2. 웹 브라우저 요청 흐름
- HTTP 메시지를 TCP/IP 패킷으로 감싸고 보낸다.
- 서버에서 패킷을 까고 요청을 다시 전달한다.
- 클라이언트에서 패킷을 까고 확인한다.
