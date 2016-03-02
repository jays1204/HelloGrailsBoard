package freeboard

import javax.servlet.http.HttpSession

class BoardController {
    def boardService

    def index() {}

    def write() {
        def session = request.getSession()
        def username = session.getAttribute("username")

        def title = params.title
        def content = params.content

        boardService.writeContent(username, title, content)

        redirect(controller: "welcome", action: "index")
    }

    def writepage() {
        render(view: 'writeform')
    }
}
