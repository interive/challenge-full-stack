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
            .then(text => appendToChat(text))
}

function appendToChat(text){

    chatMessage = '<li style="width:100%;">' +
        '<div class="">' +
        '<p>'+text+'</p>' +
        '</div>' +
        '</li>';
    $("ul").append(chatMessage);
}