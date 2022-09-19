import './App.css';
import NavigationBar from "./component/NavigationBar"
import Footer from "./component/Footer";
import Regform from './component/Regform';
function App() {
  return (
    <div className="App">
        <NavigationBar/>
        <Regform/>
        <Footer />
    </div>
  );
}

export default App;
