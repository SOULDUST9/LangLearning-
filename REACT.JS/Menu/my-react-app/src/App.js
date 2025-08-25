import "./App.css";
import Heading from "./components/Heading.js";
import ItemContainer from "./components/ItemsContainer.js";

function App() {
  let itemList = [

  ];
  let ImageList = [

  ];
  let dispList = [

  ];


  return (
    <div id="App-Wrapper">
      <img width = "500" src="https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/Brooklyn_Bridge_Manhattan.jpg/250px-Brooklyn_Bridge_Manhattan.jpg" alt="our food plate"/>
      <Heading/>
      <div class="grid-container">

        <ItemContainer/>
      </div>
    </div>
  );
}

export default App;
