<?php
    $random = rand(0, 100);
    $i = 0;
    $input = readline("Entrer un nombre entre 0 à 100 = ");
    while ($input < 0 || $input>100) {
        if($input < 0) 
            echo "le nombre que vous avez choisi est trop petit\n"; 
        else
            echo "le nombre que vous avez choisi est tres grand\n";
    }
    echo "Bravooo!!! vous avez trouvé le resultat\n";
?>