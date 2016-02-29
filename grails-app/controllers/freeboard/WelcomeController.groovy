package freeboard

import javax.servlet.http.HttpSession

class WelcomeController {

    /**
     * welcome page
     */
    def index() {
        HttpSession session = request.getSession(false);

        if (session != null) {
            render "Welcome to GreeBoard! You are auth user!"
        }
    }
}
