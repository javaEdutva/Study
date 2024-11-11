import "../App.css";

// eslint-disable-next-line react/prop-types
export default function Header({ category, setProductType }) {
  return (
    <header className="header">
      <h1 onClick={() => setProductType("")} className="logo">
        LOGO
      </h1>
      <ul className="header-items">
        {category.map((value, index) => (
          <li
            onClick={() => setProductType(value)}
            key={index}
            className="header-item"
          >
            {value}
          </li>
        ))}
      </ul>
    </header>
  );
}
