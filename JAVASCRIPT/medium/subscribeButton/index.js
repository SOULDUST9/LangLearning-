const subscribeBtn = document.getElementById("subscribeBtn");
const message = document.getElementById("message");

subscribeBtn.addEventListener("click", () => {
  subscribeBtn.innerText = "Subscribed";
  message.classList.remove("hidden");
  setTimeout(() => alert("Subscribed!"), 3000);
});
