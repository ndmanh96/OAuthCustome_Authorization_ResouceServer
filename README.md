# OAuthCustome_Authorization_ResouceServer
1: get oauth token -> post: http://localhost:8080/oauth/token (username: myclientapp, password:9999) vaof authentication
body can username va password trong database , grant_type :password, scopes: read write
	
2: sau khi lay duoc token su dung de truy cap vao ung dung 
	/*
	 * "access_token": "SzbSGJbkyduO8vIK9jgOsqKxajk",
    "token_type": "bearer",
    "refresh_token": "cq9aVPPuhIyBas_Idqi2VulKFOU",
    "expires_in": 43199,
    "scope": "read write"
	 * */
 3: Add header: Authorization: bearer SzbSGJbkyduO8vIK9jgOsqKxajk
