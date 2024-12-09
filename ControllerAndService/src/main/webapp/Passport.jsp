
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Passport Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            margin: 20px;
        }
        .form-container {
            max-width: 600px;
            margin: 20px auto;
            background: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
        }
        label {
            display: block;
            margin-top: 10px;
            font-weight: bold;
        }
        input, select, button {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        button {
            background-color: #007bff;
            color: white;
            border: none;
            margin-top: 15px;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h1>Passport Registration</h1>
        <form action="passport" method="post">
            <label>Register to apply at</label>
            <input type="radio" name="register" value="CPV Delhi"> CPV Delhi
            <input type="radio" name="register" value="Passport Office" checked> Passport Office

            <label for="passport_office">Passport Office</label>
            <select id="passport_office" name="passportOffice" required>
                <option value="" disabled selected>-- Select --</option>
                <option value="office1">Bangalore</option>
                <option value="office2">Belagavi</option>
            </select>

            <label for="given_name">Given Name</label>
            <input type="text" id="given_name" name="given_name" required>

            <label for="surname">Surname</label>
            <input type="text" id="surname" name="surname" required>

            <label for="dob">Date of Birth</label>
            <input type="date" id="dob" name="dob" required>

            <label for="email">Email</label>
            <input type="email" id="email" name="email" required>

            <label for="login_id">Login ID</label>
            <input type="text" id="login_id" name="loginId" required>

            <label for="password">Password</label>
            <input type="password" id="password" name="password" required>

            <label for="confirm_password">Confirm Password</label>
            <input type="password" id="confirm_password" name="confirmPassword" required>

            <label for="hint_question">Hint Question</label>
            <select id="hint_question" name="hintQuestion" required>
                <option value="" disabled selected>-- Select --</option>
                <option value="pet_name">What is your pet's name?</option>
                <option value="school_name">What is your first school name?</option>
            </select>

            <label for="hint_answer">Hint Answer</label>
            <input type="text" id="hint_answer" name="hint_answer" required>

            <button type="submit">Register</button>
            <button type="reset">Clear</button>
        </form>
    </div>
</body>
</html>
