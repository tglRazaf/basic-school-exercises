<?php
    $word = readline("Entrer un caractere : ");
    $crypted = '';
    $cle = readline("Entrer la clé : ");
    //echo "la caractere de la chiffre 97 : ".chr(97)."\n";
    echo "Le mot initial est : $word\n";
    echo "Le mot après cryptage avec un clé de $cle : ";
    for ($i=0; $i < strlen($word); $i++) { 
        if(ord($word[$i])>=ord('A') && ord($word[$i])<=ord('Z'))
            $crypted[$i]= chr((ord($word[$i])-ord('A')+$cle) % 26 + ord('A'));
        elseif (ord($word[$i])>=ord('a') && ord($word[$i])<=ord('z'))
            $crypted[$i]= chr((ord($word[$i])-ord('a')+$cle) % 26 + ord('a'));
    }

    // decryptage cesar
    $donah = readline("Entrer un mot ");
    echo "$crypted\n";
?>