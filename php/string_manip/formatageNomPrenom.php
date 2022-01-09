<?php


    $nom = readline("Entrer votre nom : ");
    $prenom = readline("Entre votre prenom : ");
    $formated;
    $nomCompletFormate = strtoupper($nom)." ".strtoupper($prenom[0])."".strtolower(substr($prenom, 1, strlen($prenom)));

    explode($formated, $prenom, 20);

    echo "voici le nom complet avant formatage : $nom $prenom\n";
    echo "Voici le nom complet après formatage : $nomCompletFormate\n";
    echo "prenom formaté : $formated\n";

?>