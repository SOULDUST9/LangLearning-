const checkbox = document.getElementById("dark-mode");
  checkbox.addEventListener("change", function () {
    if (this.checked) {
      document.body.style.backgroundColor = "black";
      document.body.style.color = "white";
    } else {
      document.body.style.backgroundColor = "white";
      document.body.style.color = "black";
    }
  });