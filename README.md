# 1.2.10-madlibs

## Project Overview
This Java program creates an interactive Mad Libs creator that prompts users for nouns, verbs, and adjectives, then inserts them into a story template to create a final story.

## Approach & Implementation

### Milestones

#### Milestone 1: Story Template Setup
- Created a premade story template with 15 placeholders
- Used `<noun>`, `<verb>`, and `<adjective>` as placeholder format
- Added predefined test cases from the assignment for validation

#### Milestone 2: User Input Processing
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

## Test Cases - Screenshots
### Screenshot 1: Assignment Test Case: 
##### The \<noun> \<verb> across the \<adjective> pond
<img width="1523" height="747" alt="Screenshot_923" src="https://github.com/user-attachments/assets/968dd2d9-985b-4ff0-8086-579ff5b2be22" />

