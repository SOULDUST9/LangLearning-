const memeArray = [
    "https://i.imgur.com/bSi4xLb.png",
    "https://i.imgur.com/6y0G7N0.png",
    "https://i.imgur.com/LXnRao1.png",
    "https://i.imgur.com/Qqoxh1N.png"
  ];
  
  const captionsArray = [//20
    "Zoomed in, but still out of focus 😵‍💫",
    "Caught mid-glitch. Rebooting personality…",
    "Serving looks, not logic 🤖✨",
    "100% organic chaos 🍃🔥",
    "Confidence level: Selfie with no filter 📸",
    "Slightly overcooked, but still a snack 😋",
    "Too glam to give a damn 💅",
    "Somewhere between ‘ugh’ and ‘idc’ 🙃",
    "Making it up as I go 💭➡️🚀",
    "Not pictured: me running late 🏃‍♂️⏰",
    "Mood: buffered but unbothered 🌀",
    "When life gives you pixels, make art 🎨",
    "Your algorithm’s favorite mistake 🧠💔",
    "Just here to confuse your feed 👻",
    "If found, return to the WiFi 🌐",
    "Not a phase. A full reboot 🔁",
    "Out of office, out of order 💼🛠️",
    "98% caffeine, 2% talent ☕️🧠",
    "Eyes say ‘focus’, brain says ‘nap’ 💤",
    "Updating… please don’t unplug ⚡",
  ];
  
  let randomMeme = document.getElementById("random-meme");
  let randomCaption = document.getElementById("random-caption");
  let generatorButton = document.getElementById("generator-button");
  
  generatorButton.addEventListener("click", function(){
    let randomIndex1 = Math.floor(Math.random() * memeArray.length);
    let randomIndex2 = Math.floor(Math.random() * captionsArray.length);
  
    randomMeme.src = memeArray[randomIndex1];
    randomCaption.innerText = captionsArray[randomIndex2];
  });