import { useState } from "react";
import { useNavigate } from 'react-router-dom';

const Login = () => {
    
    const [username, setUsername] = useState(''); //username and password is set to an empty string as it will be entered--
    const [password, setPassword] = useState(''); //--further down in the function.
    const [isPending, setIsPending] = useState(false); //set to false as we are only making the request when the form is submitted
    const navigate = useNavigate();


    const handleSubmit = (e) => {
        e.preventDefault(); //prevents page from refreshing when data is submitted
        const submit = { username, password };

        setIsPending(true);
        
        fetch('http://localhost:8000/loginData', {
            method: 'POST',
            headers: { "content-type": "application/json" },
            body: JSON.stringify(submit) //fetches the current data from the JSON file. when the new data is submitted it will,
                                        //Stringify the data and POST it back to JSON
        }).then(() => {
            console.log('new user added');
            setIsPending(false);
            navigate('/'); //once the user logs in this should re-route them back to the home page and log to the console,
                           // that a new user has been added.
        })

        
    }

    return ( 
        <div className='login'>
            <h2>Login</h2>
            {/* below will enact the function crated earlier with the same name */}
            <form onSubmit={handleSubmit}> 
                <label>Please enter your username: </label>
                <input 
                  type="text"
                  placeholder="username"
                  required 
                  value={username}
                    // when the username field is typed into, 
                    //it should trigger the below code and update the State of the username to match what was typed in
                  onChange={(e) => setUsername(e.target.value)}
                  />
                  <br />
                  <label>Please enter your password: </label>
                <input 
                  type="text"
                  placeholder="password"
                  required
                  value={password}
                  onChange={(e) => setPassword(e.target.value)}
                  />
                  <br />

                  {/* the button will show submit until the button is clicked. 
                  it will then change to 'logging in' as the page processes the login request.
                  second button is disabled as we dont want the user to be able to click it. */}
                  { !isPending && <button>Submit</button> } 
                  { isPending && <button disabled>Logging in</button> }

                  {/* Displays a welcome message to the user as they type in their username */}
                  <p> Welcome { username }! </p>
            </form>
        </div>
     );
}
 
export default Login;