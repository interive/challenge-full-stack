var APIget = "http://localhost:80";

function fetchMock(){
    fetch(APIget)
        .then(response => response.json())
        .then(json => appendToChat(json.message))
}

function appendToChat(text){
}