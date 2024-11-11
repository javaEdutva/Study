import "./ProductView.css";

// eslint-disable-next-line react/prop-types
function ProductView({ productObj }) {
  return (
    <div className="card">
      <div className="text-container">
        <h1 className="text">{productObj.category}</h1>
        <h1 className="text">{productObj.description}</h1>
        <h1 className="text">{productObj.price}</h1>
        <h1 className="text">{productObj.title}</h1>
      </div>
      <div className="image-container">
        <img className="img" height={300} width={250} src={productObj.image} />
      </div>
    </div>
  );
}

export default ProductView;
