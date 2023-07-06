 var stompClient = null;

        function setConnected(connected) {
            $("#connect").prop("disabled", connected);
            $("#disconnect").prop("disabled", !connected);
            if (connected) {
                $("#conversation").show();
            } else {
                $("#conversation").hide();
            }
            $("#userInfo").html("");
        }

        function connect() {
            var socket = new SockJS('/chat');
            stompClient = Stomp.over(socket);
            stompClient.connect({}, function (frame) {
                setConnected(true);
                console.log('Connected: ' + frame);
                stompClient.subscribe('/topic/user', function (user) {
                    showUser(JSON.parse(user.body).content);
                });
            });
        }

        function disconnect() {
            if (stompClient != null) {
                stompClient.disconnect();
            }
            setConnected(false);
            console.log("Disconnected");
        }

        function sendName() {
            stompClient.send("/app/user", {}, JSON.stringify({'name': $("#name").val()}));
        }

        function showUser(msg) {
            $("#userInfo").append("<tr><td>" + msg + "</td></tr>");
        }

        $(document).ready(function () {
            $("form").on('submit', function (e) {
                e.preventDefault();
            });
            $("#connect").click(function () { connect(); });
            $("#disconnect").click(function () { disconnect(); });
            $("#send").click(function () { sendName(); });
        });