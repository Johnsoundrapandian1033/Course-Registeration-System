function showEnrolled(){
        fetch("http://localhost:8080/courses/enrolled")
    .then((response)=> response.json())
    .then((enrolls) => {
        const data = document.getElementById("enrolled");
        enrolls.forEach(enroll =>{
            var row = `<tr>
            <td>${enroll.name}</td>
            <td>${enroll.emailId}</td>
            <td>${enroll.courseName}</td>
            <tr>`;
            data.innerHTML += row; 

        });
    })
}