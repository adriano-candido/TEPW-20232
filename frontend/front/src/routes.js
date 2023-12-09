import React from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';

import Login from './pages/Login';
import User from './pages/User';
import UserNew from './pages/NewUser';

export default function RoutesApp(){
    return(

        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Login />} />
                <Route path="/user" element={<User />} />
                <Route path="/user/new/:userId" element={<UserNew />} />
            </Routes>
        </BrowserRouter>
    );
}