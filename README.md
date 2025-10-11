# 1.2.10-madlibs

## Project Overview
This Java program creates an interactive Mad Libs game that prompts users for nouns, verbs, and adjectives, then inserts them into a story template to create a humorous final story.

## Approach & Implementation

### Milestones

#### Milestone 1: Story Template Setup
- Created a premade story template with 15 placeholders
- Used `<noun>`, `<verb>`, and `<adjective>` as placeholder format
- Added test cases for validation

#### Milestone 2: User Input Processing
- Implemented menu system for story selection (premade vs custom)
- Used `Scanner` to collect user input
- Added input validation to check for placeholders

#### Milestone 3: String Parsing Algorithm
- Developed algorithm using `indexOf()` to locate placeholders
- Used `substring()` methods to extract word types
- Implemented loop to process all placeholders sequentially

#### Milestone 4: Story Reconstruction
- Built algorithm to replace placeholders with user input
- Reconstructed story using string concatenation
- Preserved original story structure while inserting user words

#### Milestone 5: Testing & Refinement
- Tested with multiple story templates
- Added error handling for edge cases
- Finalized user prompts and output formatting

## Test Cases (3)
