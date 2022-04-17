import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

const name = "Learner";
const element = <h1>Hello Mr. {name}.
Welcome to learning.</h1>
const element1 = <div>
<h1> For Heading 1</h1>
<h2> FOr Heading 2</h2>
<h3> For Heading 3</h3>
</div>
ReactDOM.render(
  // <React.StrictMode>
  //   <App />
  // </React.StrictMode>,
  // element,
  element1,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
