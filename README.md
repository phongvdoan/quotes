# Generate One Random Quote

## Collaborators: Crystal, Phong

### Problem Domain

Use the file recentquotes.json to show random popular book quotes. Your program should use GSON to parse the .json file. The app needs no functionality other than showing the quote and the author when it is run. The app should choose one quote each time it is run.

### Solution

Takes the recentquotes.json and swish it down to one line. Pass the line to GSON to parse it to the Quote Class.  Get a random number between 0 and length of array of the quote class. Then use the random number to find the array at that index.

