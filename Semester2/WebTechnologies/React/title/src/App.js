import './App.css';

const date = new Date().toDateString();
document.getElementsByTagName("h3")[0].innerHTML="This page was created on: " +document.title;
function App() {
  return (
    document.title = date,
    <div className="App">
      <header className="App-header">
        <h2>When was this WebPage Created?</h2>
        <h3></h3>
      </header>
    </div>
  );
}

export default App;
