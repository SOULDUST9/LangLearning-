import './App.css';

function App() {

  const barcelonaImage = "https://i.imgur.com/qaQNzqi.png";
  const tokyoImage = "https://i.imgur.com/OAx1wzO.png";
  const ohioImage = "https://i.imgur.com/CxJjltu.png";

  return (
    <>
      <h2>Select a Place</h2>

      <div id="image-wrapper">
        <img  src={barcelonaImage} alt="barcelonaImage"/>
        <img src={tokyoImage} alt="barcelonaImage"/>
        <img src={ohioImage} alt="barcelonaImage"/>
      </div>
    </>
    
  );
}

export default App;
