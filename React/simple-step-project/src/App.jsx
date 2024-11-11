import Step from "./components/Step";
import "./App.css";
import TableComponent from "./components/TableComponent";
import { useState } from "react";

const data = [
  {
    id: 1,
    name: "ABC",
    classType: "Java",
  },
  {
    id: 2,
    name: "XYZ",
    classType: "React",
  },
  {
    id: 3,
    name: "MNB",
    classType: "Java",
  },
];

function App() {
  const [color, setColor] = useState("red");

  function changeColor() {
    setColor(color === "blue" ? "red" : "blue");
  }

  return (
    <div className="app">
      {/* <Step /> */}
      <TableComponent color={color} onChangeColor={changeColor} data={data} />
      <TableComponent color={color} onChangeColor={changeColor} data={data} />
    </div>
  );
}

export default App;
