function addStudent() {
    const firstName = document.getElementById("fname").value;
    const lastName = document.getElementById("lname").value;
    const city = document.getElementById("city").value;
    const password = document.getElementById("pwd").value;

    const url = "http://localhost:8080/student";


//    fetch(ulr, {})
    fetch(url, 
          { method: "POST", 
            headers: { "Content-Type": "application/json"
                     }, 
            body: JSON.stringify({firstName: firstName, lastName: lastName,city: city,password:password}) 
         }
    ).then((response) => {
        return response.json();
    }).then((data) => {
        console.log(data);
    }).catch(function (params) {
        
    })
}

function getStudent() {
    const rollNumb = document.getElementById("rollNo").value;
    

    const url = "http://localhost:8080/student/"+rollNumb;


//    fetch(ulr, {})
    fetch(url, 
          { method: "GET" }
    ).then((response) => {
        return response.json();
    }).then((data) => {
        console.log(data);

        document.getElementById("stdData").innerHTML = data.firstName;
    }).catch(function (params) {
        
    })
}