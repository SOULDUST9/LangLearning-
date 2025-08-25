import "./stylings/Heading.css";

function Heading() {
  return (
    <header class="site-header">
        <div class="brand">My Restaurant</div>
        <nav>
            <ul class="nav">
            <li><a href="#menu">Menu</a></li>
            <li><a href="#order-form">Order Form</a></li>
            </ul>
        </nav>
    </header>

  );
}

export default Heading;
