export default function ProductCard({ data }) {
  console.log(data);

  return (
    <div className="products">
      <div className="product">
        <img src={data.image} />
        <h1 className="title">{data.title}</h1>
        <h1 className="">$ {data.price}</h1>
      </div>
    </div>
  );
}
