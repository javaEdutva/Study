import ProductCard from "./ProductCard";
import "../App.css";
import { useState } from "react";
import useCustomHooks from "../hooks/useCustomHooks";

export default function MainSection({ productType }) {
  const [product, setProduct] = useState([]);

  if (!productType) {
    useCustomHooks("https://fakestoreapi.com/products", setProduct);
  } else {
    useCustomHooks(
      `https://fakestoreapi.com/products/category/${productType}`,
      setProduct,
      productType
    );
  }

  // useEffect(() => {
  //   if (!productType) {
  //     // https://fakestoreapi.com/products
  //     fetch("https://fakestoreapi.com/products")
  //       .then((res) => res.json())
  //       .then((json) => setProduct(json));
  //   } else {
  //     fetch(`https://fakestoreapi.com/products/category/${productType}`)
  //       .then((res) => res.json())
  //       .then((json) => setProduct(json));
  //   }
  // }, [productType]);

  return (
    <div className="product-card">
      {product.map((data, index) => (
        <ProductCard key={index} data={data} />
      ))}
    </div>
  );
}
