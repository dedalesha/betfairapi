# betfairapi
BetFair API Playground

The purpose is to investigate Betfair API and to place some bets according to some rules.

Before use, run InitKeyStore to save Betfair authentication information. It will ask for <keystore password> <betfair username> <betfair password> <betfair app key>. The information will be encrypted in a file betfairauth.jceks. Other uses of API can then
be run, given the betfairauth.jceks is in working directory and betfair.keystore.password system property contains the <keystore password> 

The plan so far is to:

 - Use Jersey to access RESTful Betfair endpoint
 - Use drools for betting rules  

- [X] F1: Can log-in
- [X] F2: Can list markets
- [X] F3: Choose and integrate a logging API: log4j 2 or logback
- [X] F4: Introduce Java entities
- [X] F5: Introduce dependency injection: Spring or Guice
- [X] F6: Can auto-generate enumerations
- [X] F7: Can auto-generate data types 
- [X] F8: Can auto-generate betting API interface
- [X] F9: Proxy the interface with Rest call implementation
- [X] F10: Handle API error codes
- [X] F11: Use keystore for username, password, api key
- [X] F12: Add Drools
- [X] F13: Run a single dRule against a real Betfair entity
- [X] R6: Split into maven submodules: api, api-generators, drools ...
- [ ] R7: Do not log login call, but somehow still reuse the jax-rs client, if possible
- [ ] R8: Decouple Login logic from the KeyStore authentication
- [ ] F14: Find an in-play market and trace it till it's complete, log all Betfair responses for future tests
- [X] F15: Use global services facade in the rules
- [ ] R9: Rename rules file, decide on package of the rules file: entities or events, refactor session: move out of test, how to set globals 