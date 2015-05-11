# betfairapi
BetFair API Playground

The purpose is to investigate Betfair API and to place some bets according to some rules.

Before use, run InitKeyStore to save Betfair authentication information. 

The plan so far is to:

 - Use Jersey to access RESTful Betfair endpoint
 - Use drools for betting rules  

- [X] F1: Can log-in
- [X] F2: Can list markets
- [ ] F3: Choose and integrate a logging API: log4j 2 or logback
- [X] F4: Introduce Java entities
- [ ] F5: Introduce dependency injection: Spring or Guice
- [X] F6: Can auto-generate enumerations
- [X] F7: Can auto-generate data types 
- [X] F8: Can auto-generate betting API interface
- [X] F9: Proxy the interface with Rest call implementation
- [ ] F10: Handle API error codes
- [X] F11: Use keystore for username, password, api key
- [ ] R2: Add error handling to API interface invocation handler
- [ ] R3: Refactor Login class to represent a session