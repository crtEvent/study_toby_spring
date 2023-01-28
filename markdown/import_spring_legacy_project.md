# STS에서 만든 스프링 레거시 프로젝트 IntelliJ에 import 하기

## 1. STS에서 Spring legacy project export 하기
- Archive File로 export 한다
<img src="https://user-images.githubusercontent.com/86359180/215252277-b3e5b054-f3dd-4ae6-8f78-68cb8ea3044a.png"/><br>

## 2. IntelliJ 프로젝트 경로에 압축 풀기
- 기본 경로는 `C:\Users\{유저명}\IdeaProjects`
<img src="https://user-images.githubusercontent.com/86359180/215252281-0da82c8b-a84f-41fb-af10-f37d7a1555ee.png"/><br>

## 3. IntelliJ에서 import 하기
<img src="https://user-images.githubusercontent.com/86359180/215252283-82a66e1c-430c-4e09-a959-16beaf60de06.png"/><br>


## 4. Tomcat 추가하기 1 - Add Configurations
<img src="https://user-images.githubusercontent.com/86359180/215252284-223112ee-c5db-4024-97bc-da80df23bc05.png"/><br>

## 5. Tomcat 추가하기 2 - Deploy at the server setup
<img src="https://user-images.githubusercontent.com/86359180/215252285-6d655ba2-6aaa-42fb-ba19-9002a9a79835.png"/><br>

## 6. Tomcat 추가하기 3 - Add Tomcat Library 
<img src="https://user-images.githubusercontent.com/86359180/215252287-50284a1d-67e6-4f58-9ff8-27fd85741514.png"/><br>

## 7. 프로젝트 실행
- 프로젝트 빌드
- Run Configurations -> Tomcat 선택
- 실행
<img src="https://user-images.githubusercontent.com/86359180/215252288-6661910b-b5ef-4eec-a199-e2b383f6c8f6.png"/><br>

## Spring Web Page 한글 인코딩
- web.xml에 encodingFilter 추가
```xml
    <filter>
		<filter-name>encodingFilter</filter-name>
		<filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
		<init-param>
			<param-name>encoding</param-name>
			<param-value>UTF-8</param-value>
		</init-param>
		<init-param>
			<param-name>forceEncoding</param-name>
			<param-value>true</param-value>
		</init-param>
	</filter>

	<filter-mapping>
		<filter-name>encodingFilter</filter-name>
		<url-pattern>/*</url-pattern>
	</filter-mapping>
```

## Tomcat 한글 인코딩
- [IntelliJ 톰캣 로그 한글 깨짐을 해결하는 2가지 방법 by 버터필드](https://atoz-develop.tistory.com/entry/IntelliJ-%ED%86%B0%EC%BA%A3-%EC%84%9C%EB%B2%84-%EB%A1%9C%EA%B7%B8-%ED%95%9C%EA%B8%80-%EA%B9%A8%EC%A7%90%EC%9D%84-%ED%95%B4%EA%B2%B0%ED%95%98%EB%8A%94-2%EA%B0%80%EC%A7%80-%EB%B0%A9%EB%B2%95)
- [[IntelliJ] 한글깨짐 해결 UTF-8 Encoding 설정 by HoZang](https://baejangho.com/entry/IntelliJ-resolve-garbled-korean-problem)