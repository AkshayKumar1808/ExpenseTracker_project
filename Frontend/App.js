import { Link } from "react-router-dom";
import { Container } from "react-bootstrap";
import { Nav } from "react-bootstrap";
import { Navbar } from "react-bootstrap";
import { NavDropdown } from "react-bootstrap";
import './App.css'
function App() {
  const linkstyle={
    color:'white'
  };
  return (
    <div>
       <Navbar className="bg-body-tertiary">
      <Container>
      <Nav className="ms-auto"/>
        <Navbar.Brand>Expense Tracker</Navbar.Brand>
        <Nav.Link href="/login" style={{color:'whitle'}}>Login</Nav.Link>
      </Container>
    </Navbar>
    </div>
  );
}

export default App;
