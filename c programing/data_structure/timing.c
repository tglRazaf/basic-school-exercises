#include <time.h>
int main(void)
{
  int h, min, s, day, mois, an;
  time_t now;
    
  // Renvoie l'heure actuelle
  time(&now);
  // Convertir au format heure locale
  printf("Aujourd'hui est : %s", ctime(&now));
  /*struct tm *local = localtime(&now);
  h = local->tm_hour;        
  min = local->tm_min;       
  s = local->tm_sec;       
  day = local->tm_mday;          
  mois = local->tm_mon + 1;     
  an = local->tm_year + 1900;  
  printf("L'heure : %02d:%02d:%02d\n", h, min, s);
  // Afficher la date courante
  printf("La date : %02d/%02d/%d\n", day, mois, an);*/
  return 0;
}