var APIget = "http://localhost:8080";

function fetchFromAPI(){
    fetch(APIget)
        .then(response => response.json())
        .then(json => appendToChat(json.message))
}

function appendToChat(text){
}