import logo from "./logo.svg";
import "./App.css";
import DisplayCount from "./component/DisplayCount";
import IncrementCount from "./component/IncrementCount";
import DecrementCount from "./component/DecrementCount";
import { Provider } from "react-redux";
import store from "./redux/store";
import ResetCount from "./component/ResetCount";

function App() {
  return (
    <div>
      <Provider store={store}>
        <DisplayCount />
        <br />
        <IncrementCount />
          <br/>
        <DecrementCount />
        <br/>
        <ResetCount />
      </Provider>
    </div>
  );
}

export default App;
