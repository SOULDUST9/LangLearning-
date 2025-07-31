function randomNumberPromise() {
    return new Promise((resolve, reject) => {
        const randomNumber = Math.floor(Math.random() * 10) + 1; 
        if (randomNumber < 5) {
            resolve(); 
        } else {
            reject("Rejected"); 
        }
    });
}

const generateBtn = document.getElementById("generateButton");

generateBtn.addEventListener("click", randomNumberPromise);
