import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Login from './component/Login';
import Signup from './component/Signuppage';
import Home from './component/Home';
import AddExpense from './component/AddExpense';
import ViewExpense from './component/ViewExpense';
import Update from './component/Update';
import Delete from './component/Delete';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
 <BrowserRouter>
  <Routes>
    <Route path="/" element={<App/>}/>
    <Route path="/login" element={<Login/>}/>
    <Route path="/signup" element={<Signup/>}/>
    <Route path="/admin" element={<Home/>}/>
    <Route path="/add" element={<AddExpense/>}/>
    <Route path="/get" element={<ViewExpense/>}/>
    <Route path='/exup/:id' element={<Update/>}/>
    <Route path="/exdel/:id" element={<Delete/>}/>
  </Routes>
 </BrowserRouter>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
