import { useEffect } from "react";

export default function useCustomHooks(url, setProperties, productType) {
  useEffect(() => {
    fetch(url)
      .then((res) => res.json())
      .then((json) => setProperties(json));
  }, [productType]);
}
