function showCourses() {
    fetch("http://localhost:8080/courses") // API endpoint
    .then((response) => response.json())
    .then((courses) => {
        const data = document.getElementById("courseTable");
        courses.forEach(course => {
            let row = `
            <tr>
                <td>${course.courseId}</td>
                <td>${course.courseName}</td>
                <td>${course.durationId}</td>
                <td>${course.trainer}</td>
            </tr>`;
            
            data.innerHTML += row;
        });
    })
    //.catch(error => console.error("Error fetching courses:", error));

}