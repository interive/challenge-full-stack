var APIget = "http://localhost:8080/chat";
var APIpost = "http://localhost:8080/chat";

function fetchMessage(){
    fetch(APIget)
        .then(response => response.text())
        .then(text => appendToChat(text))
}

function postTextMessage(text){
        fetch(APIpost, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(text),
        })
            .then(response => response.text())
}

function appendToChat(text){

    if (text) {
        chatMessage = '<div class="panel panel-default"><div class="panel-footer">' +
            '' + text + '' +
            '</div>' +
            '</div>';
        $("#chat").append(chatMessage);
    }
}