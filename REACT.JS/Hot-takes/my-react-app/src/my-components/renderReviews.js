import Reviews from "./Reviews.js";

function RenderedReviews() {
  const reviews = [];

  for (let i = 0; i < 4; i++) {
    reviews.push(<Reviews key={i} />);
  }

  return reviews; // React will render all 10 components
}

export default RenderedReviews;