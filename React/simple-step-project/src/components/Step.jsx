import { useState } from "react";
import "./Step.css";

const message = [
  "Start Leaning React😍",
  "Do Practice 💯",
  "You are master in react💪",
];

function Step() {
  const [step, setStep] = useState(1);

  function stepIncre() {
    if (step < 3) setStep(step + 1);
  }

  function stepDecre() {
    if (step > 1) setStep(step - 1);
  }

  return (
    <div className="step">
      <div className="step-count">
        <button
          className="btn-step"
          style={{ backgroundColor: `${step >= 1 ? "#f29625" : ""}` }}
        >
          1
        </button>
        <button
          className="btn-step"
          style={{ backgroundColor: `${step >= 2 ? "#f29625" : ""}` }}
        >
          2
        </button>
        <button
          className="btn-step"
          style={{ backgroundColor: `${step >= 3 ? "#f29625" : ""}` }}
        >
          3
        </button>
      </div>
      <h1>{message[step - 1]}</h1>
      <div className="main-btn">
        <button className="btn" onClick={stepDecre}>
          Prev
        </button>
        <button className="btn" onClick={stepIncre}>
          Next
        </button>
      </div>
    </div>
  );
}

export default Step;
