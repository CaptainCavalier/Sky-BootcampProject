import { Link } from "react-router-dom";
import './ErrorNotFound.css'

//if the users enters a variation of our page that does not exit they will see this error page
//a link back to the homepage is included to get them back on track

const NotFound = () => {
    return ( 
        <div className="not-found">
            <h2>Sorry</h2>
            <p>That page cannot be found</p>
            <Link to="/">Back to the Dashboard...</Link>
        </div>
     );
}
 
export default NotFound;