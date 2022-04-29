import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import Props from './Components/Props';
// import Stateful from './Components/Stateful';
// import ToggleDisplay from './Components/ToggleDisplay';
// import Car from './Components/Car';
import reportWebVitals from './reportWebVitals';

ReactDOM.render(
  <React.StrictMode>
    <App />
    <Props/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
