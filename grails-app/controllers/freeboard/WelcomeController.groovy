package freeboard

import javax.servlet.http.HttpSession

class WelcomeController {
    def boardService

    /**
     * welcome page
     */
    def index() {
        HttpSession session = request.getSession(false);

        if (session != null) {
            def list = boardService.getList()

            render(view: "boardList", model: [boardItemList: list])
        }
    }
}
