<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration</title>
</head>
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

form {
    display: flex;
    gap: 1rem;
    flex-direction: column;
    padding: 3rem 1rem;
    border-radius: 12px;
    width: 350px;
    border: 2px solid #eeecec;
}

form label {
    font-size: 1.2rem;
    font-weight: 550;
}

form .input {
    width: 92%;
    padding: 10px ;
    outline: none;
    border: 2px solid #e8e5e5;
    border-radius: 4px;
    color: #393b3c;
    background-color: white;
    font-size: 1rem;
}

.submit {
    width: 100%;
    margin-top: 1.2rem;
    padding: 13px;
    border: none;
    border-radius: 5px;
    font-size: 1.2rem;
    font-weight: 500;
    background-color: #51dd51;
    color: white;
    cursor: pointer;
    opacity: 1;
    transition: ease-in-out 250ms;
}

.submit:hover,
.submit:focus {
    opacity: .75;
}
</style>
<body>
    <form action="verifyStudentId" method="post">
        <label for="">Student ID</label>
        <input 
            required
            class="input" type="text" name="studentId" placeholder="Enter student ID">
        <input class="submit" type="submit" value="Send">
    </form>
</body>
</html>