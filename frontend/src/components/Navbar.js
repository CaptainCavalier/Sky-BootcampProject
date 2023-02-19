import { Link } from 'react-router-dom' ;

const Navbar = () => {
    return ( 
        <nav className="navbar">
            <h1>GetYourWay</h1>
            <div className="links">
{/* 'Link' replaces '<a>' tags and 'to' replaces 'href' tages. when inspecting the page '<a>' & 'href' will still be shown' */}
                <Link to="/">Home</Link>
                <Link to="/login" style={{
                    color:'white',
                    backgroundColor: '#03C1C1',
                    borderRadius: '8px'
                    }}>Login/Signup</Link>
            </div>
        </nav>
     );
}
 
export default Navbar;