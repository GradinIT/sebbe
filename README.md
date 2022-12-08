# Ett repository där alla övningar finns som facit

---

1. Klassen Main kör alla övningar
2. Alla övnongar ligger i en egen klass 
3. Alla övningar har metoden run som mainklassen kör
4. Övningarna ligger i en lista
5. Mainklassen kör varje övning i den ordning man lagt in dom 
```java
public class Main {
    public static void main(String[] args) {
        List<Exercise> exercises = Arrays.asList(new Exercise20());
        exercises.forEach(Exercise::run);
    }
}
```
### Övningar 

1. Skriv ett program som skriver ut JAG ÄLSKAR JAVA på skärmen

2. Skriv minsta möjliga program som kan kompileras och köras

3. Ja? Vad är det som är fel med programmet? Lös felet och kör programmet.

![exercise3.png](images%2Fexercise3.png)
4. Vad är det för skillnad på int, som är en heltalsvariabel, och double, som är en flyttalsvariabel?

5. Vad kännetecknar ett bra variabelnamn?

6. Nämn en datatyp som är lämplig för att innehålla en persons ålder

7. Nämn en datatyp som är lämplig för att innehålla en persons vikt

8. String och char kan båda innehålla valfria tecken. Vad är det för skillnad på dem?

9. Vad är skillnaden på a = 5 och a == 5?

10. Skriv en if-sats som kontrollerar värdet på två heltal. Har de samma värde så ska det skrivas ut i konsolen. Om de inte har samma värde så ska båda variablernas värde ändras till 0. Skriv sedan utför att kontrollera att värdena har ändrats.

11. Vad är fel med följande metod? Skriv om den så programmet går att köra.
![exercise11.png](images%2Fexercise11.png)
 
12. Skriv ett program som frågar–Vad heter du? 
    Användaren får sedan skriva in sitt namn och programmet ska då skrivaut 
    -Hej (användarens namn).Välkommen hit!

13. Modifiera programmet så att användaren får skriva in förnamn, efternamn och adress. 
  Skriv sedan ut dessa på skärmen på varsin rad 

14. Skriv ett program som frågar användaren efter två heltal. Skapa en metod som adderar de två talen och skriver ut resultatet på skärmen

15. Skriv ett program som frågar användaren efter en summa i svenska kronor och returnerar hur mycket det motsvarar i euro (1 svensk krona = 0,094 Euro när uppgiften skapades)

16. Skriv ett program som skriver ut alla jämna tal mellan 0 och 20

17. Modifieraprogrammetså det skriver ut alla udda tal mellan 0 och 20

18. Skriv ett program som skriver ut alfabetet (ej Å Ä Ö)iordning (A -Z)

19. Modifiera programmet så det skriver ut alfabetet i omvänd ordning (Z –A)

20. Skriv ett program som låter användaren mata in ett heltal och skriver ut om det är ett udda eller jämnt tal. Om användaren matar in en nolla så ska programmet avslutas

21. Skriv ett program somlåter användaren mata in ett tal och returnerar det inmatade talet i kvadrat. Om användaren matar in en nolla ska programmet avslutas

22. Skriv ett programsom heter ”20 frågor”. Programmet ska slumpa fram ett tal mellan 1 – 1000000. Användaren ska på högst 20 försök gissa vilket tal som har slumpats fram. För varje gissning ska programmet svara om gissningenär rätt, för hög eller för låg.

23. Skriv koden som genererar följande utskriftAnvänd en nästlad for loop.

----

Extra övningar och läsning
https://www.w3schools.com/java/default.asp