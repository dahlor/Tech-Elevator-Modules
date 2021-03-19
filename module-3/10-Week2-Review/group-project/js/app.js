/* Define any shared data required by the app 
    Score
     Set of problems
        Each problem has:
                                       Left-side number for the multiple
                  Right-side number
                                       Current answer
                 Set of answers
*/

let score = 0;
let setOfProblems = [];
let currentProblem = 0;

/* let problem = {
    left: '',
    right: '',
    correctAnswer: '',
    setOfAnswers: []
}
*/
/* Generate a problem set containing 10 problems       */

function generateProblemSet() {
    for(let i=0; i < 10; i++) {
        let problem = {
            left: getRandomNumber(9),
            right: getRandomNumber(9),
            correctAnswer: null
            }
        
        problem.correctAnswer = problem.left * problem.right;
        
        /* the set of answers needs to have the correct answer and 3 random other answers */
        /* we are not worried if the correct answer happens to be one of the randomly generated ones */
    
        let setOfAnswers = 
            shuffleArray([problem.correctAnswer, getRandomNumber(81), getRandomNumber(81), getRandomNumber(81)])
        
        setOfProblems.push({problem, setOfAnswers})
    }
}

/* Show the problem to the user */

function displayProblem() { // Add a single problem to the DOM so it displays
    const theProblem = document.getElementById('problem') // Get a reference to where expression is going the DOM
    const problemExpression = `${setOfProblems[currentProblem].problem.left} * ${setOfProblems[currentProblem].problem.right}`  ; // left-side * right-side
    theProblem.querySelector('div.expression').innerText = problemExpression;
}

function displayAnswers() {
    const theAnswers = document.getElementById('answers')
    const listOfAnswers = theAnswers.querySelector('ul')
    const allAnswers = listOfAnswers.querySelectorAll('li')
}


/* Show the answer choices to the user. */

/* Show four randomly generated answers to the problem in a list across the page */

/* determine the correct answer to the problem */

/* include the correct in the four answers displayed to the user */

/* allow user to click on one of the answers displayed */

/* Update the problem count when the user selects an answer */

/* Determine if the answer chosen was correct */

/* update score if answer was correct */

/* Move/change to the next problem when user chooses and answer */

/* Reset when the user wants to start over   */

/* Have a utility function to generate random numbers for the problem and answers */

/* Have a utility function to randomize/sort the possible answers    */

/**
 * Utility function to generate a random number based on max
 * @param {number} max
 */
 function getRandomNumber(max) {
    return Math.floor(Math.random() * Math.floor(max));
  }
  
  /**
   * Utility function to shuffle the items in an array
   * @param {object} arr
   */
  function shuffleArray(arr) {
    return arr.sort(function (a, b) { return Math.random() - 0.5 })
  }

  /*
  After the DOM has been fully loaded, we want to start displaying and setup our app
  */

  document.addEventListener('DOMContentLoaded', () =>{
    generateProblemSet();
    displayProblem();
  })