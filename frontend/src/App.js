import React from 'react';
import './App.css';
import {BrowserRouter, Route, Switch} from 'react-router-dom';
import Dashboard from './Components/Dashboard';
import Preferences from './Components/Preferences';
import Login from './containers/Login';
import Navbar from './Components/Navbar';

function App() {
  return (
    <div className="App">
      <Navbar />
      <div className="Content">
        <Dashboard />
        <Login />
      </div>
    </div>
    )
};

export default App;
