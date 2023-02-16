import React from 'react';
import './App.css';
import {BrowserRouter, Route, Switch} from 'react-router-dom';
import Dashboard from './Components/Dashboard';
import Preferences from './Components/Preferences';
import Login from './containers/Login';


function App() {
  return (
    <div className="Container">
      <Dashboard />
      <Login />
    </div>
    )
};

export default App;
