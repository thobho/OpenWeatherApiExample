# Zadania
1. Użyj klienta HTTP np. Postman do eksplorowania przykładowego API https://reqres.in/
* Pobierz wszystkich użytkowników
* Pobiesz wszystkich użytkowników ze strony 3
* Pobierz użytkownika z id: 4
* "Stwórz" nowego użytkownika
* "Zmodyfikuj użytkownika"
* "Usuń użytkownika"

2. Wejdź na stronę jakiejś małej gminy w Polsce. https://pl.wikipedia.org/wiki/Lista_gmin_w_Polsce
* Użyj nażędzia ping, żeby zobaczyć czy serwer na którym jest umieszczona strona odpowiada. Jaki jest adres IP serwera.
* Użyj internetowego narzędzia IP Location, żeby zobaczyć gdzie jest zarejestrowany publczny adres IP. https://iplocation.com/
* Użyj narzędzia traceroute (TRACERT), żeby prześledzieć drogę pakietów przez Internet.
* Czy strona tej gminy jest szyfrowana przez https? Jeżeli nie, to znajdź taką. Użyj narzędzia Wireshark, żeby zobaczyć tekst swoich danych wysyłanych na serwer wybranej gminy.
* Użyj narzędzi deweoperskich przeglądarki, żeby odpowiedzieć na pytania:
	* Ile skryptów JS ściąga strona w trakcie ładowania?
	* Czy skrypty JS wykonują się poprawnie? Czy może w konsoli pojawiają się jakieś błędy?
	* Czy w zakładce network widzisz jakeiś Requesty, które nie kończą się sukcesem?
	* Czy strona używa przekierowań (Response codes: 3XX)
	* Przeglądnij nagłówki Responsów. Czy strona używa cacheowania?
	* Co jeszcze ciekawego możesz powiedzieć na temat tej strony na podstawie jej nagłówków?
	* Czy strona zapisuje ciasteczka?
	


3. Zarejestruj się na koncie https://openweathermap.org/api. 
* Zapoznaj się z dokumentacją API, eksploruj API za pomocą Postmana, zbadać strukturę API.
* Stwórz w Javie konsolową aplikację, która korzystając z OpenWeather API wyświetla prognozę pogody. Skorzystaj z wbudowanego klienta HTTP i biblioteki GSON.


4. Znajdź REST API, z obszaru, który Cię interesuje. Skorzystaj z Postmana, żeby sprawdzić jak działa. Wymyśl ciekawe zastosowanie dla Towjego API.
Napisz prototyp aplikacji, która wykorzystuje dane. Może to być aplikacja konsolowa lub wykorzystująca bibliotekę Java FX.

* https://www.reddit.com/r/webdev/comments/3wrswc/what_are_some_fun_apis_to_play_with/
* https://medium.com/@vicbergquist/18-fun-apis-for-your-next-project-8008841c7be9
* https://apilist.fun/