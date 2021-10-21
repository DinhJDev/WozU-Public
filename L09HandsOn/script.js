function loadEinstein() {
    const xhttp = new XMLHttpRequest();
    xhttp.open('GET', 'einstein.json', true);

    xhttp.onload = function(){
        if(this.status == 200) {
            var einstein = JSON.parse(this.responseText);
            document.getElementById("example").innerHTML = einstein.name + " was born on "+ einstein.birthday;
        }
    }

    xhttp.send();
}

function loadBio() {
    const xhttp = new XMLHttpRequest();
    xhttp.open('GET', 'einstein.json', true);

    xhttp.onload = function(){
        if(this.status == 200) {
            var einstein = JSON.parse(this.responseText);
            document.getElementById("bio").innerHTML = einstein.bio;
        }
    }

    xhttp.send();
}

loadEinstein();
