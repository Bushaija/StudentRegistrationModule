<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <style>
        body {
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    background: #fcf8f8;
    height: 100vh;
}

header {
    display: flex;
    justify-content: space-between;
    align-items: center;

    font-size: 1rem;
    color: #414141;
    padding: 1rem;
    margin-inline: 3rem;
}

.logo {
    color: #225a22;
    font-weight: 600;
}

nav ul {
    list-style: none;
    display: flex;
    align-items: center;
}

nav ul li {
    margin-left: 1rem;
    border: 2px solid #51dd51;
    border-radius: 5px;
    padding: 8px 12px;
}

nav ul li:nth-child(2) {
    background: #6fff6f;
}

nav ul li:nth-child(2) a {
    transition: opacity ease-in-out 250ms;
    color: #225a22;
}

nav ul li:nth-child(2):hover {
    opacity: .75;
}


nav ul li a {
    color: #225a22;
    text-decoration: none;
    font-weight: 600;
    
}


    </style>
</head>
<body>
    <header>
        <div class="logo">AUCA Student Registration</div>
        <nav>
            <ul>
                <li><a href="#dashboard.html">Dashboard</a></li>
                <li><a href="./verifyStudentId.jsp">Register</a></li>
            </ul>
        </nav>
    </header>
</body>
</html>