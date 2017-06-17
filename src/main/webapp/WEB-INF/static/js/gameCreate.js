var stompClient = null;

function connect() {
    var socket = new SockJS('/wonder-socket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        stompClient.subscribe('/topic/playerList', function (players) {

            //this will be called when player list will be updated
        });
    });
}
