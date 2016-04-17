<?php
    $con=mysqli_connect("localhost","jadiibuc_jadiibu","wtfwithdb1","jadiibuc_jadiibu");
    
    $name = $_POST["name"];
    $username = $_POST["username"];
    $password = $_POST["password"];
    $email = $_POST["email"];
    
    $statement = mysqli_prepare($con, "INSERT INTO User (name, email, username, password) VALUES (?, ?, ?, ?)");
    mysqli_stmt_bind_param($statement, "siss", $name, $email, $username, $password);
    mysqli_stmt_execute($statement);
    
    mysqli_stmt_close($statement);
    
    mysqli_close($con); 
?>