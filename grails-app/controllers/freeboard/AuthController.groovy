package freeboard

import javax.servlet.http.HttpSession

class AuthController {

    /**
     *  /auth/login handler
     *
     */
    def login() {
        if (request.method == "GET" || request.method == "POST") {
            def username = params.username

            HttpSession session = request.getSession()
            session.setAttribute("name", username)
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
