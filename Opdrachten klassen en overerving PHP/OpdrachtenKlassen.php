<?php


class Person
{
    var $gender = "Man";
    var $firstName = "Mik";
    var $lastName = "Wijnen";
    var $birthdateYear = "2002";
    var $nationaliteit = "Nederlands";

    function setText()
    {
        $text =  $this->firstName. " ". $this->lastName. " geboren in ". $this->birthdateYear. " heeft dit geslacht: ". $this->gender. " Deze persoon is ". $this->leeftijdBerekenen(). " oud. en de nationaliteit is: ". $this->nationaliteit;
        return $text;
    }

    function leeftijdBerekenen()
    {
        $year = date("Y");

        $leeftijd= $year-$this->birthdateYear;
        return $leeftijd;
    }



}

class Spanjaard extends Person
{
    var $gender = "Vrouw";
    var $firstName = "Mik";
    var $lastName = "Wijnico";
    var $birthdateYear = "1990";
    var $nationaliteit = "Spanjaard";
    function setText()
    {
        $text =  $this->firstName. " ". $this->lastName. " geboren in ". $this->birthdateYear. " heeft dit geslacht: ". $this->gender. " Deze persoon is ". $this->leeftijdBerekenen(). " oud. en de nationaliteit is: ". $this->nationaliteit;
        return $text;
    }
}

$person = new Person();
echo $person->setText();

echo "<br>";

$spanjaard = new Spanjaard();
echo $spanjaard->setText();