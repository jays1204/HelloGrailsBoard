package freeboard

import grails.transaction.Transactional

@Transactional
class AuthService {

    def validateUserPwdInfo(username, password) {
        def user = User.findByUsernameAndPassword(username, password)

        if (user == null) {
            throw new Exception("No Match UserInfo")
        } else {
            return user
        }
    }

    def serviceMethod() {

    }
}
