import NotFound from './NotFound';
import Navbar from './Navbar';
import Home from '../Pages/Dashboard';
import Login from '../Pages/Login'
import { BrowserRouter as Router, Route, Routes} from 'react-router-dom';
import '../index.css';

const Pathway = () => {
  return (
    <Router>
      <div className="app">
        <Navbar />
        <div className="content">
          <Routes>
            <Route exact path='/' element={<Home />}>
            </Route>
            <Route exact path='/login' element={<Login />}>
            </Route>
            {/* ''*'' to catch any other route. this is at the bottom so the above routes can function properly.
            if the user enters a wrong path on the website this should show an error page to re-route them back--
            -- to the homepage.  */}
            <Route exact path="*" element={<NotFound />}></Route> 
          </Routes>
        </div>
      </div>
    </Router>
  )
}

export default Pathway;