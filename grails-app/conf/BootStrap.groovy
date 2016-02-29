import freeboard.Board
import freeboard.User

class BootStrap {

    def init = { servletContext ->
        def user = new User(username: "testjays", password: "1234").save()
        new Board(title: "임시글", content: "내용이당", user: user).save()
        new Board(title: "임시글2", content: "내용이??당2", user: user).save()
    }
    def destroy = {
        //this do not guarantee always run
    }
}
