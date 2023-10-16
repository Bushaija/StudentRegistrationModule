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
    color: #6e6e6e;
    font-weight: 600;
    background: #fff;
    height: 100vh;

    display: flex;
    justify-content: center;
    align-items: center;
}

main {
    display: flex;
    flex-direction: column;
    align-items: center;
    gap: 3rem;
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

h2 {
    text-align: center;
    color: #4bd14b;
    margin: 0;
    padding: 0;
    font-weight: 600;
}

p {
    font-weight: 400;
    font-style: italic;
    margin: 0;
    text-align: center;
    color: orangered;

}

/* table design */

.table {
            display: flex;
            flex-direction: column;
            gap: 1rem;
        	width: 800px;
            border: 2px solid #3ec965;
        }

        .table-header {
           background-color: #3ec965;
        }
        
        .table-header {
           display: flex;
           justify-content: start;
           gap: 1rem;
           width: 800px;

        }

        .table-column {
            color: white;
            width: 350px;
            text-align: center;
            padding-inline: .5rem;
        }

        .table-content .row div,
        .table-column {
            font-size: 1rem;
        }

        .table-content .row {
           display: flex;
           justify-content: start;
           gap: 2rem;
           width: 800px;
        }

        .table-content .row div {
            width: 350px;
            font-size: .8rem;
            text-align: center;
            padding-block: 1rem;
        }


</style>
<body>
    <main>
    <article class="table">
        <div class="table-header">
            <div class="table-column">Course Code</div>
            <div class="table-column">Course Description</div>
            <div class="table-column">Credits</div>
        </div>
        <div class="table-content">
            <div class="row">
                <div>INSY 123</div>
                <div>Software Engineering</div>
                <div>4</div>
            </div>
        </div>
    </article>
    <article>
        <form action="register">
            <h2>Add Course</h2>
            <label for="">Course Code</label>
            <input 
                required
                class="input" type="text" placeholder="Enter course code">
            <input class="submit" type="submit" value="Add">
            <!-- <p>The course has already been completed</p> -->
        </form>
    </article>
    </main>
</body>
</html>