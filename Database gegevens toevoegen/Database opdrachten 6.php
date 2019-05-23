<html>
<form action="" method="post">
    voornaam: <input type="text" name="voornaam" /><br>
    achternaam: <input type="text" name="achternaam" /><br>
    email: <input type="text" name="email" /><br>
    telefoonnummer: <input type="text" name="telefoonnummer" /><br>
    <input type="submit" value="Verzenden" />
</form>
</html>
<?php
//Database gegevens
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "lessenphp";

//Connectie maken met de database
$conn = new mysqli($servername, $username, $password, $dbname);

//Conectie checken
if ($conn->connect_error)
{
    die("Connection failed: " . $conn->connect_error);
}

//Gegevens overzetten naar de database
if(isset($_POST["voornaam"]) )
{


    $sql = "INSERT INTO inloggen(voornaam, achternaam, telefoonnummer, email) VALUES ('".$_POST["voornaam"]."','".$_POST["achternaam"]."','".$_POST["telefoonnummer"]."','".$_POST["email"]."')";


    if ($conn->query($sql) === TRUE) {
        echo "Gegevens zijn overgezet naar de Database";
    } else {
        echo "Error: " . $sql . "<br>" . $conn->error;
    }

    $conn->close();
}
?>
