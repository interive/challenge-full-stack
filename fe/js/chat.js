var APIget = "http://localhost:8080";
var APIpost = "http://localhost:8080/chat";

function fetchMessage(){
    fetch(APIget)
        .then(response => response.text())
        .then(text => appendToChat(text))
}

function postTextMessage(){
    function postText(text){
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
}

function appendToChat(text){

    chatMessage = '<li style="width:100%;">' +
        '<div class="">' +
        '<p>'+text+'</p>' +
        '</div>' +
        '</li>';
    $("ul").append(chatMessage);
}