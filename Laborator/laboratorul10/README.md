# Cerinte

1. Compulsory:

* Create the project ServerApplication. This will contain (at least) the classes: GameServer and ClientThread.

* Create the class GameServer. An instance of this class will create a ServerSocket running at a specified port. The server will receive requests (commands) from clients and it will execute them.

* Create the class ClientThread. An instance of this class will be responsible with communicating with a client Socket. If the server receives the command stop it will stop and will return to the client the respons "Server stopped", otherwise it return: "Server received the request ... ".

* Create the project ClientApplication. This will contain (at least) the class: GameClient.

* Create the class GameClient. An instance of this class will read commands from the keyboard and it will send them to the server. The client stops when it reads from the keyboard the string "exit".

2. Homework:

* Implement functionalities of the game, using the classes Game, Board, Player, etc.

* The clients will send to the server commands such as: create game, join game, submit move, etc.

* The server is responsible with the game management and mediating the players.

* The games will be played under time control (blitz) with each player having the same amount of time at the beginning of the game. If a player's time runs out, the game is lost.
