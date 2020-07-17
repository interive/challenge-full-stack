var APIget = "http://localhost:8080";

function fetchMessage(){
    fetch(APIget)
        .then(response => response.json())
        .then(json => appendToChat(json.message))
}

function postMessage(){
}

function appendToChat(text){
}