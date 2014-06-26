<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Login</title>
		<style type="text/css" media="screen">
			#status {
			label{
			    width: 65px;
				float: left;
			
			}
				
		 </style>
		 </head>
	<body>
	<g:if test ="${flash.message}">
	<div class ="message">
		${flash.message}
		</div>
		</g:if>
	<g:if test="${session.user}" style = "padding-left:200px">
	<br/>
	    <g:form style = "padding-left:200px">
        <div style ="width:220px">
		   <h2>Меню:</h2>
				<ul>
					<li class="controller"><a href="/MYAPA/book/index">Список книг</a></li>
					<li class="controller"><a href="/MYAPA/person/index">Список авторов</a></li>
				</ul>
		</div>
		
	    <br>
	Login as : ${session.user} | <g:link controller = "user"  action="logout">Logout</g:link></g:form>
	
	</g:if>
	<g:else>
	
	<g:form controller = "user" action="login" style = "padding-left:200px">
		<div style ="width:220px">
		  	   <b> Вас приветствует Помощник библиотекаря.</b><br/>
		    Для дальнейшей работы вам нужно ввести ваши Login и Password.
		    		    <br/> <br/> 
		    <label>Login:</label><input type = "text" name="username"/>
		    <label>Password:</label><input type = "password" name="password"/>
		    <label>&nbsp;</label><input type = "submit" value="Login"/>
	    </div>
	    </g:form>
	</g:else>
	    	</body>
</html>
