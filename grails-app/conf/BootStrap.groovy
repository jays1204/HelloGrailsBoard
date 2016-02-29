import freeboard.User

class BootStrap {

    def init = { servletContext ->
        new User(username: "testjays", password: "1234").save()
    }
    def destroy = {
        //this do not guarantee always run
    }
}
