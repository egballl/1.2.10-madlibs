# 1.2.10-madlibs

## Project Overview
This Java program creates an interactive Mad Libs creator that prompts users for nouns, verbs, and adjectives, then inserts them into a story template to create a final story.

## Approach & Implementation

### Milestones

#### Milestone 1: Story Template
- Created a premade story template with 15 placeholders
- Used `<noun>`, `<verb>`, and `<adjective>` as placeholder format
- Added predefined test cases from the assignment for validation

#### Milestone 2: User Input
- Implemented menu system for story selection (premade vs custom)
- Used `Scanner` to collect user input
- Added input validation to check for placeholders

#### Milestone 3: String Parsing
- Used `indexOf()` to locate placeholders
- Used `substring()` methods to extract word types
- Implemented loop to process placeholders

#### Milestone 4: Story Reconstruction
- Built an algorithm to replace placeholders with user input
- Reconstructed story using string concatenation
- Preserved original story structure while inserting the users input

#### Milestone 5: Refinement
- Tested with multiple story templates
- Added basic error handling
- Finalized user prompts and output formatting

## Code Logic and Approach
The program's core functionality is built around iteration that finds placeholder text (ex: \<noun>) and replaces it with user input using Java's built-in String methods such as indexOf(), substring(), and string concatenation.
### Code Snippet
<img width="789" height="342" alt="image" src="https://github.com/user-attachments/assets/cce7d432-8a40-41d1-b54a-15339db83113" />

## Test Cases - Screenshots
### Screenshot 1: Given Assignment Test Case: 
##### The \<noun> \<verb> across the \<adjective> pond
<img width="1523" height="747" alt="Screenshot_923" src="https://github.com/user-attachments/assets/968dd2d9-985b-4ff0-8086-579ff5b2be22" />

### Screenshot 2: Given Assignment Test Case: 
##### I went to the zoo to see a \<noun>. There were people \<verb> around the enclosure which made the \<adjective> apes go bananas.
<img width="1534" height="849" alt="Screenshot_924" src="https://github.com/user-attachments/assets/5ad7afe7-9612-4074-9194-795e17d32156" />

### Screenshot 3: Premade (Custom) Test Case: 
##### Hello, my name is \<noun>. Today, I \<verb> to the \<adjective> store and bought a \<adjective> \<noun>. On the way home, I saw a \<adjective> \<noun> that was \<verb> by the \<noun>. Later, I \<verb> with my \<adjective> \<noun> until the \<noun> started to \<verb>. It was the most \<adjective> day ever!
<img width="1578" height="636" alt="Screenshot_925" src="https://github.com/user-attachments/assets/e02897a4-2e1a-4cc9-8310-2eca0dccdfb1" />

## Requirements Met:
#### Program Code
- Display the original story, prompt for user input, modify final story based on input

- Implements algorithm(s) that process user input

- Implements algorithm(s) with String methods to parse for the parts of speech to replace

- Implements algorithm(s) with String methods to parse for sections to include

- Prompts to keep the user on track

- Displays the final modified Mad Lib

#### Documentation
- Provide a program reader with the information about the program

- Comments indicate where program requirements are met

- Supply the program with values for testing

- Use camelCase when appropriate

- Variables for Mad Libs and user input

