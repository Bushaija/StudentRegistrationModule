<head>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            color: #595757;
            font-weight: 600;
            background: #fff;
            height: 100vh;

            display: flex;
            justify-content: center;
            align-items: center;
        }

        article {
            background: #f8f8f8;
            border-radius: 12px;
            width: 420px;
            border: 2px solid #eeecec;

            display: flex;
            flex-direction: column;
            justify-content: center;
        }

        article ul {
            list-style: none;
            display: flex;
            justify-content: space-between;
            align-items: center;
            gap: .7rem;
        }

        /* article ul .key {

        } */

        article ul .value {
            font-size: 1.15rem;
            margin-right: 1rem;
            color: #5ba05b;
        }

        /* article .course {
            position: relative;
        } */

        /* article ul .courses {
            display: flex;
            position: absolute;
            top: .05rem;
            left: 1rem;

        } */

        h3 {
            text-align: center;
            color: #48c148;
        }

        a {
            text-decoration: none;
            color: white;
            margin-left: 1rem;
            border-radius: 5px;
            padding: 8px 12px;
            background-color: #51dd51;
            width: 70px;
            margin-left: 2.75rem;
            margin-bottom: 1rem;
        }

        a:hover {
            opacity: .85;
        }
    </style>
</head>
<body>

    <body>
    <article>
        <h3>Student Details</h3>
        <ul>
            <li class="key">Student ID</li>
            <li class="value"><%= request.getAttribute("studentId") %></li>
        </ul>
       	<ul>
            <li class="key">Semester</li>
            <li class="value">3</li>
        </ul>
        <ul>
            <li class="key">First Name</li>
            <li class="value"><%= request.getAttribute("firstName") %></li>
        </ul>
                <ul>
            <li class="key">Last Name</li>
            <li class="value"><%= request.getAttribute("lastName") %></li>
        </ul>
        <ul>
            <li class="key">Faculty</li>
            <li class="value">IT (Information Technology)</li>
        </ul>
        <ul>
            <li class="key">Department</li>
            <li class="value">Software Engineering</li>
        </ul>
       <%--  <ul>
            <li class="key">Program</li>
            <li class="value"><%= request.getAttribute("programme") %></li>
        </ul> --%>
        <ul class="course">
            <li class="key">Courses(completed)</li>
            <li class="value"><%= request.getAttribute("courses") %></li>
            <li class="value">
               <%--  <ul class="courses">
                    <% String courses = (String)request.getAttribute("courses");
                       String[] courseArray = courses.split(", ");
                       for (String course : courseArray) { %>
                        <li><%= course %></li>
                    <% } %>
                </ul> --%>
            </li>
        </ul>
        <a href="./AddCourse.jsp">Continue</a>
    </article>
</body>