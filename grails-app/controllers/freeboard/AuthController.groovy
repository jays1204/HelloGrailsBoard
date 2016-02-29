package freeboard

import javax.servlet.http.HttpSession

class AuthController {
    def authService;

    /**
     *  /auth/login handler
     *
     */
    def login() {
        if (request.method == "GET" || request.method == "POST") {
            def username = params.username
            def password = params.password

            def validateUser = authService.validateUserPwdInfo(username, password)

            HttpSession session = request.getSession()
            session.setAttribute("name", validateUser.getUsername())
            redirect(controller: "Welcome", action: "index")
        } else {
            redirect(action: "/404")
        }
    }

    def logout() {
        HttpSession session = request.getSession()
        session.invalidate()
        println "logout!"
        redirect(controller: "Welcome", action: "index")
    }

    def index() {}
}
