import useFetch from "../components/useFetch";


const Home = () => {
// custom hook is passed into the file, data prop is renamed, json server url is passed in, in place of the url prop
// remember to import 'useFetch' if using this.
    const {data, isLoading, error} = useFetch('http://localhost:8000/logindata');



    return ( 
        <div className='home'>
            <h1>Welcome Home</h1>
        </div>
     );
}
 
export default Home;