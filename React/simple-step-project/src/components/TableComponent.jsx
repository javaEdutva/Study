import { useState } from "react";
import "./TableComponent.css";

function TableComponent({ data, color, onChangeColor }) {
  console.log(data);
  //   const [localColor, setLocalColor] = useState(color);
  return (
    <div className="table" style={{ backgroundColor: color }}>
      {data.length === 0 ? (
        <h1>No Data</h1>
      ) : (
        data.map((obj, index) => (
          <div className="box" key={index}>
            <p className="text">{obj.id}</p>
            <p className="text">{obj.name}</p>
            <p className="text">{obj.classType}</p>
          </div>
        ))
      )}
      <div className="btn">
        <button className="btn-step" onClick={onChangeColor}>
          Click me
        </button>
      </div>
    </div>
  );
}

export default TableComponent;
