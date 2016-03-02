package freeboard

import grails.transaction.Transactional

@Transactional
class BoardService {
    def getList() {
        Board.findAll()
    }

    /**
     * 로그인한 사용자가 글을 쓴다 글을 한 번 쓸때마다 50포인트씩 차감된다.
     */
    def writeContent(username, title, content) {
        def writer = User.findByUsername(username)

        println "name: ${writer.getUsername()}, points: ${writer.getPoints()}"
        if (!writer) redirect(controller: "welcome", action: "index")
        if (writer.points < 50) {
            throw new Exception("Not Enough Points")
        }

        //transaction
        def item = new Board(title: title, content: content, create_date: new Date(), user: writer)
        item.save()

        //decrease users points
        writer.points = writer.points - 50
        writer.save()

        //insert history
        def history = new PointHistory(points: 50, description: 'write', create_date: new Date())
        history.save()
    }

    def serviceMethod() {

    }
}
