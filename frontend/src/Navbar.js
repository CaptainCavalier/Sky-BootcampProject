const Navbar = () => {
    return ( 
        <nav className="navbar">
            <h1>GetYourWay</h1>
            <div className="links">
                <a href="/">Home</a>
                <a href="/create" style={{
                    color:'white',
                    backgroundColor: '#03C1C1',
                    borderRadius: '8px'


                }}>Login/Signout</a>
            </div>
        </nav>
     );
}
 
export default Navbar;