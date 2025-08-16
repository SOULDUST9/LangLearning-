import logo from './logo.svg';
import './App.css';

function App() {

  const randNum = Math.floor(Math.random * 2);

  const PassFail = (score) => {
    if (score == 0){
      return "Congrats you Passed!";
    }else{
      return "Sorry you failed!";
    }
  }
  return (
    <p>{PassFail(randNum)}</p>
  );
}

export default App;
