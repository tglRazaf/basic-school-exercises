program cesar;
uses crt;
var crypt : string;
		texte : string;

		clair   : string;
		k, j, l	: Integer;
		rep 	  : char;
{
	Cryptographie de César, décalage de l'alphabet par 3:
	A -> D
	B -> E
	C -> F
	...
	W -> Z
	X -> A
	Y -> B
	Z -> C
}

{
	x:=a mod d
	 -> x reste de la division de a par d
	 -> 0 <= x < d
	 -> x=a si a <d
}

{
  'A'..'Z' -> 65..90
	('A'..'Z') +3 -> 68..93 tsy mety

	('A'..'Z')-'A' -> (65..90)-65 -> 0..25
  ('A'..'Z')-'A'+ 3 -> 3..28 -> 3,4,5,6,7,8,...,23,24,25,26,27,28
	(('A'..'Z')-'A'+ 3) mod 26 -> 0..25 -> 3,4,5,6,7,8,...,23,24,25,0,1,2
  (('A'..'Z')-'A'+ 3) mod 26 +'A' -> 65..90

	'A'..'Z' -> 65..90
	('A'..'Z') -'A' -> 0..25 -> 0,1,2,3,...,23,24,25
	('A'..'Z') -'A'+26 -> 26..51 -> 26,27,28,...,48,49,50,51
	('A'..'Z') -'A'+26-3 -> 23..48 -> 23,24,25,26,27,...,46,47,48
	('A'..'Z') -'A'+26-3 mod 26 -> 23,24,25,0,1,...,20,21,22
	('A'..'Z') -'A'+26-3 mod 26 +'A' -> 88,89,90,65,66,...,85,86,87
}

function decrypt(crypte: string;cle : Integer):string;
var tmp : string;
		i : integer;
Begin
			tmp:=crypte;
			k:=k mod 26;
			for i:=1 to Length(tmp) Do
				if (tmp[i]>='A') AND (tmp[i]<='Z') Then
					tmp[i]:=chr((ord(tmp[i])-ord('A')+26-k) mod 26 + ord('A'))
				else
						 if (tmp[i]>='a') AND (tmp[i]<='z') Then
									tmp[i]:=chr((ord(tmp[i])-ord('a')+26-k) mod 26 + ord('a'));
		decrypt := tmp;
end;
var
	i 	  : Integer;
	copie : string;
Begin
	repeat {avadika While}
		clrscr;
		writeln('Appuyez sur C pour Crypter');
		writeln('Appuyez sur D pour Décrypter');
		writeln('Appuyez sur K pour CraKer');
		writeln('Appuyez sur Q ou [ECHAP] pour quitter');
		write('votre choix :');
		rep := Upcase(ReadKey);  { Mettre en Majuscule }
		WriteLn;
		case rep Of
			'C': Begin
							write('entrer le texte : '); ReadLn(texte);
							write('entrer la clé : '); readln(k);
							k:=k mod 26;
							writeln('la vraie clé : ',k);
							for i:=1 to Length(texte) Do
								 {texte[i]:=chr(ord(texte[i])+3);}
								 if (texte[i]>='A') AND (texte[i]<='Z') Then
										texte[i]:=chr((ord(texte[i])-ord('A')+k) mod 26 + ord('A'))
								 else
								 if (texte[i]>='a') AND (texte[i]<='z') Then
										texte[i]:=chr((ord(texte[i])-ord('a')+k) mod 26 + ord('a'));
							Writeln;
							writeln('texte crypté: ',texte);
					 end;
			'D':Begin
						{décryptage}
						{	('A'..'Z') -'A'+26-3 mod 26 +'A' -> 88,89,90,65,66,...,85,86,87}
						write('entrer le crypté : '); ReadLn(texte);
						write('entrer la clé : '); readln(k);
						WriteLn('texte clair : ',decrypt(texte,k));
  				end;
			 'K':Begin
						{on ne connait pas la clé.}
						{on a le texte crypté}
						{on connait une partie du texte clair}
						{on donne la ou les clé(s) probable(s) }
						{Brute Force - Backtracking}
						write('entrer le crypté : '); ReadLn(crypt);
						write('partie du texte clair : '); readln(clair);
						l:= Length(crypt) - Length(clair);
						for k :=0 to 25 do
							begin
								texte := decrypt(crypt,k);
								writeln('k=',k,'- ',texte);
								copie := texte;
								copie[0] := chr(Length(clair));
								i:=0;
								while((copie<>clair) and (i<l)) Do
								Begin
									write(copie,',');
									for j:= 1 to Length(crypt)-1 Do
										copie[j] := copie [j+1];
									i:= i+1;
								end;
								write(copie); WriteLn;
								if (copie=clair) then
								begin
										writeln('texte clair décrypté, pour k=',k,' :',decrypt(crypt,k));
										break;
								end;
								readKey;
							end;
						// texte crypté : gdkhgfdkfsjhgsdkfhgsdlkfhgkjsmfdh
						// partie du texte clair : bonjour
			 		 end;
			end;
		if (Not((rep='Q')) AND NOT((ord(rep)=27))) Then Begin
			 WriteLn('Appuyez sur une touche pour continuer...');
			 ReadKey;
		end;
	Until (rep='Q') or (ord(rep)=27);
end.