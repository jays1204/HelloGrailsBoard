package freeboard

import grails.transaction.Transactional

@Transactional
class BoardService {
    def getList() {
        Board.findAll()
    }

    def serviceMethod() {

    }
}
