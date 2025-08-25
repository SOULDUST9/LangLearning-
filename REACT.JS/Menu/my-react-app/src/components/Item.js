import "./stylings/Item.css";

function Item(image, title, desc) {
  return (
    <>
    <p>
        {image}, {title}, {desc}
    </p>
    </>
  );
}

export default Item;