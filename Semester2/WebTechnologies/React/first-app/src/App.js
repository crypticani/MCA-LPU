import './App.css';
import React, { Component } from "react";
class App extends React.Component {
  render() {
    return (
      <div>
        <First />
        <Second />
      </div>
    );
  }
}
class First extends React.Component {
  render() {
    return (
      <div>
        <h1>
          WELCOME TO FIRST TRY PROGRAM
        </h1>
      </div>
    );
  }
}
class Second extends React.Component {
  render() {
    return (
      <div>
        <h2>KEEP LEARNING</h2>
        <p> THIS IS NICE TIME TO START LEARNING.</p>
      </div>
    );
  }

}
export default App;