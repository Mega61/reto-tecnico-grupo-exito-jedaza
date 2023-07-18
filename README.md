
# Pokemon Moves Viewer

This Python script retrieves and prints information about Pokemon moves using the PokeAPI. It makes use of concurrent processing to fetch data for multiple moves simultaneously, improving the efficiency of the process.

## Installation

1.  Clone this repository to your local machine.
2.  Install the required Python packages using pip:


`pip install requests openpyxl` 

## Usage

Simply run the Python script to start fetching and printing the names of all 900 Pokemon moves. The script will use 10 concurrent processes to speed up the process.


`python pokemon_moves_viewer.py` 

The script will display the names of moves in batches of 20, followed by a horizontal line to separate the batches.

## Functionality

The script includes the following main functions:

1.  `obtener_nombre_movimiento(move_id)`: Retrieves the name of a Pokemon move by its ID using the PokeAPI.
    
2.  `obtener_nombres_movimientos(start_id, end_id)`: Retrieves the names of Pokemon moves within a specified range of IDs. It uses the `obtener_nombre_movimiento` function and returns a list of move names.
    
3.  `imprimir_salto_linea(moves)`: Prints the names of Pokemon moves in the provided list with a line break after each move.
    
4.  `imprimir_nombres_movimientos()`: Initiates the concurrent fetching of move names using 10 threads, divided into batches of 20 moves each.
    
5.  `guardar_movimientos(moveset)`: Saves the names of Pokemon moves into an Excel file named "Moveset.xlsx."