import { useState } from "react";
import "./App.css";
import Header from "./components/Header";
import MainSection from "./components/MainSection";
import useCustomHooks from "./hooks/useCustomHooks";

export default function App() {
  const [category, setCategory] = useState([]);
  const [productType, setProductType] = useState("");

  useCustomHooks(
    "https://fakestoreapi.com/products/categories",
    setCategory,
    productType
  );

  // useEffect(() => {
  //   // https://fakestoreapi.com/products/categories
  //   fetch("https://fakestoreapi.com/products/categories")
  //     .then((res) => res.json())
  //     .then((json) => setCategory(json));
  // }, []);

  return (
    <div className="App">
      <Header category={category} setProductType={setProductType} />
      <MainSection productType={productType} />
    </div>
  );
}
