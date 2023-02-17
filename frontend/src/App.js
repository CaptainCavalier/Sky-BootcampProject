import Navbar from './Navbar';
import Home from './Home';
import './index.css';


function App() {
  return (
    <div className="app">
      <Navbar />
      <div className="content">
      <Home />
      </div>
    </div>
    )
};

export default App;
