import React from 'react';
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import {Link} from 'react-router-dom'

export default function NavigationBar() {
    return (
        <div>
            <Navbar collapseOnSelect expand="lg" bg="light" variant="dark">
                <Container>
                    <Link to="/" className='navbar-brand'>Patient Management System</Link>
                    <Navbar.Toggle aria-controls="responsive-navbar-nav" />
                    <Navbar.Collapse id="responsive-navbar-nav">
                        <Nav className="me-auto">
                            <Link to="/addpatient" className="nav-link">Add Patient</Link>
                            <Link to="/patient" className="nav-link">View Patient</Link>
                        </Nav>
                    </Navbar.Collapse>
                </Container>
            </Navbar>
        </div>
    )
}