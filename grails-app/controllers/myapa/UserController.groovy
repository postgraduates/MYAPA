package myapa

class UserController {

    def index() { }
	def login ={
		if(params.username == "admin" && params.password =="123"){
		    flash.message = "login succeed"
			session.user = "admin"
			//render "login succeed"
			}
		else{
			flash.message = "login failed"
			//render "login failed"
		}
	    redirect(action:'index')
	}
	def logout ={
		session.user = null
		redirect(action:'index')
	}
}
