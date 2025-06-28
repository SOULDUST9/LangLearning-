# CSS Folder

This folder contains all the stylesheet files used to style the website. It includes base styles, layout rules, component-specific styles, and optional theme or utility files.

## 📄 Files

- `style.css` – Main stylesheet for the site. Includes general layout, colors, and typography.
- `reset.css` – CSS reset to ensure consistency across browsers.
- `components.css` – Styles for individual UI components like buttons, cards, navbars, etc.
- `responsive.css` – Media queries and responsive design rules for different screen sizes.

## 🛠 Usage

Make sure to link the CSS files in the correct order in your HTML for proper styling:
```html
<link rel="stylesheet" href="css/reset.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/components.css">
<link rel="stylesheet" href="css/responsive.css">