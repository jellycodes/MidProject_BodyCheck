import logo from './logo.svg';
import './App.css';
import { useState, useEffect } from 'react';
import './index.css';

function App() {
  const [message, setMessage] = useState("");

  useEffect(() => {
    fetch('/api/hello')
      .then(response => response.text())
      .then(message => {
        setMessage(message);
      });
  }, [])
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <h1 className="App-title">{message}</h1>
      </header>
      <p className="App-intro">
        Edit <code>src/App.js</code> and save to reload.
      </p>
    </div>
  );
}

export default App;
