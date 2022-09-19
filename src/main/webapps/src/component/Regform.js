import React from 'react'
import Form from 'react-bootstrap/Form';
import {Container} from "react-bootstrap";
import Button from 'react-bootstrap/Button';

export default function Regform() {
  return (
    <div> <Container>
    <Form>
    <Form.Label>Name</Form.Label>
   <Form.Control type="text" placeholder="Enter name" />

   <Form.Label>Email</Form.Label>
   <Form.Control type="email" placeholder="Enter email" />

   <Form.Label>Password</Form.Label>
   <Form.Control type="password" placeholder="Enter password" />
   
   <Form.Label>Confirm Password</Form.Label>
   <Form.Control type="password" placeholder="Enter again password" />
<br></br>
 <Button variant="primary" type="submit">
   Submit
 </Button>
</Form>
</Container></div>
    
  )
}

